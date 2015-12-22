package com.epam.calctest.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static java.lang.Math.round;
import static org.testng.Assert.assertEquals;

/**
 * Created by Yahor_Faliazhynski on 12/15/2015.
 */
public class TrigonometryTest extends BaseCalculatorTest {

    private double round(double value) {
        return Math.round(value * 10000d) / 10000d;
    }

    @Test(groups = "sinSimple")
    public void sin30() {
        double result = round(calculator.sin(Math.PI / 6));
        assertEquals(result, 0.5d, "Invalid result of operation");
    }

    @Test(groups = "sin", dataProvider = "sinDp", priority = 0)
    public void sinCheck(double a, double expected) {
        double result = round(calculator.sin(a));
        assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "sinDp")
    public Object[][] valuesForSin() {
        return new Object[][] {
                {0, 0d},
                {Math.PI / 6, 0.5d},
                {Math.PI / 4, 0.7071d},
                {Math.PI / 3, 0.866d},
                {Math.PI / 2, 1d}
        };
    }

    @Test(groups = "cos", dataProvider = "cosDp", priority = 1)
    public void cosCheck(double a, double expected) {
        double result = round(calculator.cos(a));
        assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "cosDp")
    public Object[][] valuesForCos() {
        return new Object[][] {
                {0, 1d},
                {Math.PI / 6, 0.866d},
                {Math.PI / 4, 0.7071d},
                {Math.PI / 3, 0.5d},
                {Math.PI / 2, 0d}
        };
    }

    @Test(groups = "tg", dataProvider = "tgDp", priority = 2)
    public void tgCheck(double a, double expected) {
        double result = round(calculator.tg(a));
        assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "tgDp")
    public Object[][] valuesForTg() {
        return new Object[][] {
                {0, 0d},
                {Math.PI / 6, 0.5774d},
                {Math.PI / 4, 1d},
                {Math.PI / 3, 1.7321d}
        };
    }

    @Test(groups = "ctg", dataProvider = "ctgDp", priority = 3)
    public void ctgCheck(double a, double expected) {
        double result = round(calculator.tg(a));
        assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "ctgDp")
    public Object[][] valuesForCtg() {
        return new Object[][] {
                {Math.PI / 6, 1.7321d},
                {Math.PI / 4, 1d},
                {Math.PI / 3, 0.5774d},
                {0, 0d}
        };
    }
}
