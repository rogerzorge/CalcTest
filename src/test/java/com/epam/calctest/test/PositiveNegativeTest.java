package com.epam.calctest.test;

import org.testng.annotations.Test;

import static com.epam.tat.module4.Timeout.sleep;
import static org.testng.Assert.assertTrue;

/**
 * Created by Yahor_Faliazhynski on 12/15/2015.
 */
public class PositiveNegativeTest extends BaseCalculatorTest {

    private long value;
    private boolean expectedToBePositive;
    private boolean expectedToBeNegative;

    public PositiveNegativeTest(long value, boolean expectedToBePositive, boolean expectedToBeNegative) {
        this.value = value;
        this.expectedToBePositive = expectedToBePositive;
        this.expectedToBeNegative = expectedToBeNegative;
    }

    @Test
    public void checkValuePositive() {
        sleep(1);
        checkTime();
        assertTrue(calculator.isPositive(value) == expectedToBePositive);
    }

    @Test
    public void checkValueNegative() {
        sleep(1);
        checkTime();
        assertTrue(calculator.isNegative(value) == expectedToBeNegative);
    }

}
