package com.quedacoder;

import java.util.Scanner;

public class Main {

    private static String USER_PROMPT_TEXT = "Enter number #%d: ";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will ask for 10 Integer values and sum them together!!");
        int validUserInput = 1;
        int textCounter = 1;
        int sumOfValuesEntered = 0;

        do {

            System.out.println(String.format(USER_PROMPT_TEXT, textCounter));
            boolean isValidNumber = scanner.hasNextInt();

            if (isValidNumber) {
                validUserInput++;
                textCounter++;
                int number = scanner.nextInt();
                sumOfValuesEntered += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        while (validUserInput <= 10);

        System.out.println("sum = " + sumOfValuesEntered);

        scanner.close();
    }
}
