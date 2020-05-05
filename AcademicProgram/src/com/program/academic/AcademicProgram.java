package com.program.academic;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AcademicProgram {

    public static String getSchedule(List<String> input) {

        List<List<String>> program = new ArrayList<>();

        for(String s: input) {
            program.add(Arrays.asList(s.split(" ")));
        }

        Set<Integer> schedule = new TreeSet<>();
        List<Integer> rowInt = new ArrayList<>();
        List<String> rowStr;

        for (int i = 1; i < program.size(); i++) {
            //starting at index 1 rather than 0 as first row of input is the number of Courses in the program
            //get the current row List
            rowStr = program.get(i);

            for(String s:rowStr) {
                rowInt.add(Integer.parseInt(s));
            }

            for (int j = 0; j < rowInt.size(); j++) {
                schedule.add(rowInt.get(j));
            }
        }

        String output = "";

        for(Integer i: schedule) {
            output = output + i + " ";
        }
        return output.trim();

    }

    public static void main(String[] args)  {

        List<String> result = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader("C:\\AcademicProgram\\courses.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String output = getSchedule(result);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AcademicProgram\\schedule.txt"));) {
            writer.write(output);
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
