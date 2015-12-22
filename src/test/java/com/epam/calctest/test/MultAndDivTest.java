package com.epam.calctest.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * Created by Yahor_Faliazhynski on 12/14/2015.
 */
public class MultAndDivTest extends BaseCalculatorTest {

    @Test(groups = "div", expectedExceptions = NumberFormatException.class)
    public void checkDivisionByZeroThrowsExceptionLong() {
        double result = calculator.div(4, 0);
    }

    @Test(groups = "div", expectedExceptions = NumberFormatException.class)
    public void checkDivisionByZeroThrowsExceptionDouble() {
        double result = calculator.div(4.56d, 0d);
    }

    @Test(groups = "mult", dataProvider = "multDpLong")
    public void multOneValueByAnotherLong(long a, long b, long expected) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "multDpLong")
    public Object[][] valuesForMultLong() {
        return new Object[][] {
                {3, 2, 6},
                {4, -5, -20},
                {-6, -7, 42},
                {0, 8, 0},
                {-9, 0, -0},
                {0, 0, 0}
        };
    }

    @Test(groups = "mult", dataProvider = "multDpDouble")
    public void multOneValueByAnotherDouble(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "multDpDouble")
    public Object[][] valuesForMultDouble() {
        return new Object[][] {
                {3d, 2d, 6d},
                {4d, -5d, -20d},
                {-6d, -7d, 42d},
                {0d, 8d, 0d},
                {-9d, 0d, -0d},
                {0d, 0d, 0d}
        };
    }

    @Test(groups = "div", dataProvider = "divDpLong")
    public void divOneValueByAnotherLong(long a, long b, double expected) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "divDpLong")
    public Object[][] valuesForDivLong() {
        return new Object[][] {
                {3, 2, 1.5d},
                {4, -5, -0.8d},
                {-6, -8, 0.75d},
                {0, 8, 0d},
        };
    }

    @Test(groups = "div", dataProvider = "divDpDouble")
    public void divOneValueByAnotherDouble(double a, double b, double expected) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @DataProvider(name = "divDpDouble")
    public Object[][] valuesForDivDouble() {
        return new Object[][] {
                {3, 2, 1.5d},
                {4, -5, -0.8d},
                {-6, -8, 0.75d},
                {0, 8, 0d},
        };
    }

}
