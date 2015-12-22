package com.epam.calctest.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Yahor_Faliazhynski on 12/16/2015.
 */
public class PowSqrtTest extends BaseCalculatorTest {

    private double round(double value) {
        return Math.round(value * 10000d) / 10000d;
    }

    @Test(groups = "pow", dataProvider = "powDp")
    public void powBaseByExponent(double a, double b, double expected) {
        double result = round(calculator.pow(a, b));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "powDp")
    public Object[][] valuesForPow() {
        return new Object[][] {
                {3d, 4d, 81d},
                {5.12d, 6.34d, 31388.5716d},
                {0d, 2.13d, 0d},
                {2.13d, 0d, 1d},
                {3.45d, 1d, 3.45d},
                {1d, 3.45d, 1d},
                {-2d, 3d, -8d},
                {2d, -3d, 0.125d}
        };
    }

    @Test(groups = "pow", expectedExceptions = NumberFormatException.class)
    public void checkPowByNegativeArgumentsThrowsException() {
        double result = calculator.pow(-4, -3);
    }

    @Test(groups = "sqrt", dataProvider = "sqrtDp")
    public void sqrtByArgument(double a, double expected) {
        double result = round(calculator.sqrt(a));
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "sqrtDp")
    public Object[][] valuesForSqrt() {
        return new Object[][] {
                {4d, 2d},
                {2519695.896025d, 1587.355d},
                {-81d, 9d},
                {1d, 1d},
                {0d, 0d}
        };
    }


}
