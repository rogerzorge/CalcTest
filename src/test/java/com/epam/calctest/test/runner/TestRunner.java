package com.epam.calctest.test.runner;

import com.epam.calctest.test.listeners.MyTestListener;
import java.util.*;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.lang.String;

/**
 * Created by Yahor_Faliazhynski on 12/17/2015.
 */
public class TestRunner {

    public static void main(String[] args) {
        TestListenerAdapter tla = new TestListenerAdapter();
        TestNG tng = new TestNG();
        tng.addListener(tla);
        tng.addListener(new MyTestListener());

        XmlSuite suite1 = new XmlSuite();
        suite1.setName("TempSuite_1");
        XmlSuite suite2 = new XmlSuite();
        suite2.setName("TempSuite_2");

        List<String> filesSuite1 = new ArrayList<>();
        filesSuite1.add("./src/test/resources/suites/calculator.xml");
        suite1.setSuiteFiles(filesSuite1);
        suite1.setParallel(XmlSuite.ParallelMode.METHODS);
        suite1.setThreadCount(4);

        List<String> filesSuite2 = new ArrayList<>();
        filesSuite2.add("./src/test/resources/suites/calculator_parallel.xml");
        suite2.setSuiteFiles(filesSuite2);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite1);
        suites.add(suite2);
        tng.setXmlSuites(suites);

        tng.run();
    }
}
