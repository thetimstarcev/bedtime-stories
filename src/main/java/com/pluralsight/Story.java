package com.pluralsight;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] story = {1, 2, 3};
        System.out.println("""
                Bedtime Stories:
                1. Goldilocks
                2. Hansel and Gretel
                3. Mary and a Little Lamb
                
                Enter the name of a story:
                """);


        int answer = scanner.nextInt();



        String fileName ="";

        if (answer == 1) {
            fileName = "src/main/resources/goldilocks.txt";
        }
        else if (answer == 2) {
            fileName = "src/main/resources/hansel_and_gretel.txt";
        }
        else if (answer == 3) {
            fileName = "src/main/resources/mary_had_a_little_lamb.txt";
        }
        else {
            System.out.println("Please enter the valid number");
        }

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));

            // read until there's no more lines
            String line;
            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
