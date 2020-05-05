package com.program.academic;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AcademicProgramTest {

    @Test
    public void test1() {
        AcademicProgram program = new AcademicProgram();

        List<String> result = new ArrayList<>();
        try (Scanner s = new Scanner(new FileReader("C:\\AcademicProgram\\courses1.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String output = program.getSchedule(result);

        assertNotNull(output);
        assertEquals("0 1 2 3", output);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AcademicProgram\\schedule1.txt"));) {
            writer.write(output);
            //System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() {
        AcademicProgram program = new AcademicProgram();

        List<String> result = new ArrayList<>();
        try (Scanner s = new Scanner(new FileReader("C:\\AcademicProgram\\courses2.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String output = program.getSchedule(result);

        assertNotNull(output);
        assertEquals("0 1 2 3 4 5 6", output);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AcademicProgram\\schedule2.txt"));) {
            writer.write(output);
            //System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        AcademicProgram program = new AcademicProgram();

        List<String> result = new ArrayList<>();
        try (Scanner s = new Scanner(new FileReader("C:\\AcademicProgram\\courses3.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String output = program.getSchedule(result);

        assertNotNull(output);
        assertEquals("0 1 2 3 4 5 6", output);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AcademicProgram\\schedule3.txt"));) {
            writer.write(output);
            //System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4() {
        AcademicProgram program = new AcademicProgram();

        List<String> result = new ArrayList<>();
        try (Scanner s = new Scanner(new FileReader("C:\\AcademicProgram\\courses4.txt"))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String output = program.getSchedule(result);

        assertNotNull(output);
        assertEquals("1 2 0 3", output);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\AcademicProgram\\schedule4.txt"));) {
            writer.write(output);
            //System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}