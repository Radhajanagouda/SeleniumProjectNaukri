package com.rj.cucumber.rjsteps;


import Utils.DriverFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest {
//    ThreadLocal<ExtentTest> exTest = new ThreadLocal<>();

    @Before
    public void setUp(){
        DriverFactory.initializeDriver();
//        exTest.set();
    }

    @After
    public void tearDown(Scenario scenario){
        ExtentReports extentreports = new ExtentReports();
        ExtentSparkReporter sparkReport = new ExtentSparkReporter("report.html");
        extentreports.attachReporter(sparkReport);
        extentreports.createTest("ABC","seethis");
        //start
        //
        extentreports.flush();
        System.out.println("Scenario name:" +  scenario.getName());
        DriverFactory.tearDown();
    }


}
