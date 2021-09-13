/*
    UCF COP3330 Fall 2021 Assignment 15 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {

        //Variables
        String pw = "abc$123";
        String input;
        Scanner inputReader = new Scanner(System.in);

        // Prompt
        System.out.print("What is the password? ");
        input = inputReader.nextLine();

        // Result
        if (pw.equals(input))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");
    }
}
