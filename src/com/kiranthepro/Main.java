package com.kiranthepro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Chickens produce between 26 and 30 eggs/month, how many per year?
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Chickens do you have?");
        int chickenCount = scanner.nextInt();

        int eggsPerMonthLower = 26;
        int eggsPerMonthUpper = 30;

        int eggsPerYearLower = eggsPerMonthLower*12*chickenCount;
        int eggsPerYearUpper = eggsPerMonthUpper*12*chickenCount;

        System.out.println("Your chickens will produce between " + eggsPerYearLower + " and " + eggsPerYearUpper + " eggs per year");
    }
}
