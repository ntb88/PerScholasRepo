package org.example;

import java.util.Scanner;

public class BreakdownMoney {
    public static void main(String[] args) {
        /*
        Write a program that lets the user enter decimal dollars and centas and outputs the monetary equivalent in single dollars, quarters, dimes, nickels and pennies.
        ex:
        Input: 3.87
        Output:
        3 dollars
        3 quarters
        1 dime
        0 nickels
        2 pennies
         */

        final int DOLLARS = 1;
        final double QUARTERS= .25;
        final double DIME = .10;
        final double NICKELS = .05;
        final double PENNIES = .01;



        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a decimal amount you would like to deposit: ");
        double amount = scan.nextDouble();
        System.out.println("You've entered " + amount + " decimal amount");

       // double amount = 3.87;

        int dollar = (int) (amount/DOLLARS);
        System.out.printf("%d dollars%n",dollar);


        //dollars
        double change = amount - dollar;
        int quarters = (int) (change/QUARTERS);
        System.out.printf("%d quarters%n", quarters);

        //dime
        change = change % QUARTERS;
        int dimes = (int) (change/DIME);
        System.out.printf("%d dimes%n", dimes);

        //nickel
        change = change % DIME;
        int nickel = (int) (change/NICKELS);
        System.out.printf("%d nickels\n", nickel);

        //pennies
        int pennies = (int) (change/PENNIES);
        System.out.printf("%d pennies\n", pennies);

    }
}
