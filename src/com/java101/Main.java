package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type year info :");
        year = input.nextInt();
        String leapYearResult = year + " is not leap year !";
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leapYearResult = year + " is leap year !";
            }
        } else {
            if (year % 4 == 0) {
                leapYearResult = year + " is leap year !";
            }
        }

        System.out.print(leapYearResult);
    }
}
