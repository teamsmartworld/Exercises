package com.teamsmartworld;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("A Series of Exercises to test my Knowledge on Introductory Java");
    }

    /**
     * Exercise One
     * Exercise 1: A Program that prints "Hello" on the first line and my name on the next line
     */
    public static void printHello() {
        System.out.println("Hello");
        System.out.println("Dave");
    }

    /**
     *
     * Exercise Two
     * Create a program that takes a year as input from user and print if it’s leap
     * year or not.
     */

    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");

        int year = scanner.nextInt();
        //User enters the year then we check

        if ((year % 4 == 0 && year % 100 !=0) ||(year % 400 ==0)) {
            System.out.println(year + "is a leap year");
        }  else {
            System.out.println("sorry" + year + "is not a leap year.");
        }
        }
    /**
     * Exercise Three
     * A Java Program that prints the sum, multiplication, division, and subtraction of two numbers.
     */

    public static void basicCalculation() {
        System.out.println("40 + 25 = " + (40 + 25));
        System.out.println("94 * 6 = " + (94 * 6));
        System.out.println("64 / 12 = " + (64 / 12));
        System.out.println("86 - 56 = " + (86 - 56));
    }

    /**
     * Exercise Four:
     * A Java program that checks the average of three numbers
     */
    public static void simpleAverage() {
        int number1 = 36, number2 = 23, number3 = 64;
        double average = (number1 + number2 + number3) /3.0;
        System.out.println("The average of " + "(" +number1 + "+" + number2 + "+" +number3 + ") /3 is" + average);

    }

    /**
     * Exercise Five
     * Creating a Program to say Hello to the user who inputs a name.
     */

    public static void greetUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name :");
        String name = scanner.nextLine();

        System.out.print("Hello " + name);

        scanner.close();

    }

    /**
     * This sample exercise calculates the sum
     * (as well as the subtraction, multiplication and division)
     * of two numbers as inputs from the user.
     */

    public static void simpleArithmetics() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please suggest a number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Please suggest another number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("The sum of your numbers is: " + numberOne + numberTwo);

    }

    /**
     * This exercise converts seconds into hours, minutes and seconds
     */

    public static void timConversion() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the seconds: ");
        int seconds = scanner.nextInt();

        int inSeconds = seconds % 60;  // Calculates divides the seconds by 60 and renders the remaining seconds
        int inHours = seconds / 60;  // This directly calculates the seconds to minutes by dividing by 60.
        int inMinutes = inHours % 60;         // Renders the rest of the remaining minutes
        inHours = inHours / 60;            // This Converts total minutes into hours

        //We now display the time as a concatenation of the above as follows:

        System.out.print(inHours + ":" + inMinutes + ":" + inSeconds);


    }


}
