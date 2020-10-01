package com.andrey;

import com.andrey.TailorSeries;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input k here, please: ");
            int k;
            if (scanner.hasNextInt()) {
                k = scanner.nextInt();
                if (k < 0) {
                    throw new NumberFormatException("k must be a natural number!");
                }
            } else {
                throw new IllegalArgumentException("k must be an int");
            }

            System.out.print("Input x. X must be in range (-1,1) :");
            double x;
            int MAX_ABS = 1;
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                if (Math.abs(x) >= MAX_ABS) {
                    throw new NumberFormatException("X must be in range (-1,1). Try again...");
                }
            } else {
                throw new IllegalArgumentException("x must be a double");
            }

            double eps = Math.pow(10, -k);
            double calculatedValue = TailorSeries.tailorSum(x, eps);
            double actualValue = TailorSeries.calculateActualValue(x);
            System.out.printf("Actual result = %.3f\n", actualValue);
            System.out.printf("Calculated result = %.3f\n", calculatedValue);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }
}
