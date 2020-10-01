
package com.andrey;

public class TailorSeries {
    public static double tailorSum(double x, double eps) {
        double sum = 0;
        int i = 1;
        double nextMemberSequence = memberSequence(i, x);
        while (Math.abs(nextMemberSequence) >= eps) {
            sum += nextMemberSequence;
            i++;
            nextMemberSequence = memberSequence(i, x);
        }
        return sum;
    }

    public static double calculateActualValue(double x) {
        return Math.atan(x);
    }

    private static double memberSequence(int n, double x) {
        return Math.pow(-1, n - 1) * Math.pow(x, 2 * n - 1) / (2 * n - 1);
    }
}