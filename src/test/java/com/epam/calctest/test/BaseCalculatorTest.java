package com.epam.calctest.test;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.testng.annotations.*;

import java.sql.Date;

/**
 * Created by Yahor_Faliazhynski on 12/14/2015.
 */
public class BaseCalculatorTest {

    protected Calculator calculator;

    protected void checkTime() {
        System.out.println("Current time: " + new java.util.Date());
    }

    @BeforeSuite(groups = "suite")
    public void suiteSetUp() {
        System.out.println("Test SUITE work was started!");
    }

    @BeforeClass(groups = "base")
    public void classSetUp() {
        calculator = new Calculator();
        System.out.println("Test CLASS work was started!");
    }

    @BeforeGroups(groups = "group")
    public void groupSetUp() {
        System.out.println("Test GROUP work was started!");
    }

    @BeforeMethod(groups = "method")
    public void methodSetUp() {
        System.out.println("Test METHOD work was started!");
    }

    @AfterMethod(groups = "method")
    public void methodEnd() {
        System.out.println("Test METHOD work was done!");
    }

    @AfterGroups(groups = "group")
    public void groupEnd() {
        System.out.println("Test GROUP work was done!");
    }

    @AfterClass(groups = "base")
    public void classEnd() {
        System.out.println("Test CLASS work was done!");
    }

    @AfterSuite(groups = "suite")
    public void suiteEnd() {
        System.out.println("Test SUITE work was done!");
    }

}
