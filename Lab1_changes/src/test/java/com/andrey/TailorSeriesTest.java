package com.andrey;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailorSeriesTest {


    @org.junit.jupiter.api.Test
    void tailorSum() {
        double eps = Math.pow(10, -10);
        for (int i = 0; i < 1000; i++) {
            double x = Math.random() - 0.5;
            assertEquals(TailorSeries.calculateActualValue(x), TailorSeries.tailorSum(x, eps), 10E-6);
        }
    }
}