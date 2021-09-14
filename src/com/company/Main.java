package com.company;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        char letter = input.nextChar();

        if (letter == "C") {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = input.nextInt();
            int fin_temp;
            fin_temp = (temp - 32) * 5 / 9;

            System.out.printf("The temperature in Celsius is %d.", fin_temp);
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp2 = input.nextInt();
            int fin_temp2;
            fin_temp2 = (temp2 * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %d.", fin_temp2);
        }
    }
}