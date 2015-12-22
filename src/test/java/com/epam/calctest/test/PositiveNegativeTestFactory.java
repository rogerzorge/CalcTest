package com.epam.calctest.test;

import org.testng.annotations.Factory;

/**
 * Created by Yahor_Faliazhynski on 12/15/2015.
 */
public class PositiveNegativeTestFactory {

    @Factory
    public Object[] getTests() {
        return new Object[] {
                new PositiveNegativeTest(10, true, false),
                new PositiveNegativeTest(-10, false, true),
                new PositiveNegativeTest(0, false, false)
        };
    }

}
