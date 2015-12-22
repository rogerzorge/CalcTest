package com.epam.calctest.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * Created by Yahor_Faliazhynski on 12/14/2015.
 */
public class SumAndSubCalculatorTest extends BaseCalculatorTest {

    @Test(groups = "sumLong")
    public void onePlusTwoEqualsThreeLong() {
        long result = calculator.sum(1, 2);
        assertEquals(result, 3, "Invalid result of sum_long operation");
    }

    @Test(groups = "subLong")
    public void tenMinusHundredLong() {
        long result = calculator.sub(10, 100);
        assertEquals(result, -90, "Invalid result of sub_long operation");
    }

    @Test(groups = "sumDouble")
    public void onePlusTwoEqualsThreeDouble() {
        double result = calculator.sum(1.0d, 2.0d);
        assertEquals(result, 3.0d, "Invalid result of sum_double operation");
    }

    @Test(groups = "subDouble")
    public void tenMinusHundredDouble() {
        double result = calculator.sub(10.0d, 100.0d);
        assertEquals(result, -90.0d, "Invalid result of sub_double operation");
    }

    @Test(groups = "sumLong", dataProvider = "sumDpLong")
    public void oneValuePlusAnotherLong(long a, long b, long expected) {
        long result = calculator.sum(a, b);
        assertEquals(result, expected, "Invalid result of sum_long operation");
    }

    @Test(groups = "subLong", dataProvider = "subDpLong", priority = 2)
    public void oneValueSubAnotherLong(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        assertEquals(result, expected, "Invalid result of sub_long operation");
    }

    @Test(groups = "sumDouble", dataProvider = "sumDpDouble", priority = 1)
    public void oneValuePlusAnotherDouble(double a, double b, double expected) {
        double result = calculator.sum(a, b);
        assertEquals(result, expected, "Invalid result of sum_double operation");
    }

    @Test(groups = "subDouble", dataProvider = "subDpDouble", priority = 3)
    public void oneValueSubAnotherDouble(double a, double b, double expected) {
        double result = calculator.sub(a, b);
        assertEquals(result, expected, "Invalid result of sub_double operation");
    }

    @DataProvider(name = "sumDpLong")
    public Object[][] valuesForSumLong() {
        return new Object[][] {
                {20, 15, 35},
                {1, -10, -9},
                {0, -2, -2},
                {-42, 42, 0},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "subDpLong")
    public Object[][] valuesForSubLong() {
        return new Object[][] {
                {20, 15, 5},
                {1, -10, 11},
                {0, -2, 2},
                {-42, 42, -84},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "sumDpDouble")
    public Object[][] valuesForSumDouble() {
        return new Object[][] {
                {20.0d, 15.0d, 35.0d},
                {1.0d, -10.0d, -9.0d},
                {0.0d, -2.0d, -2.0d},
                {-42.0d, 42.0d, 0.0d},
                {0.0d, 0.0d, 0.0d}
        };
    }

    @DataProvider(name = "subDpDouble")
    public Object[][] valuesForSubDouble() {
        return new Object[][] {
                {20.0d, 15.0d, 5.0d},
                {1.0d, -10.0d, 11.0d},
                {0.0d, -2.0d, 2.0d},
                {-42.0d, 42.0d, -84.0d},
                {0.0d, 0.0d, 0.0d}
        };
    }


}
