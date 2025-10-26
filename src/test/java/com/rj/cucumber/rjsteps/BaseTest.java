package com.rj.cucumber.rjsteps;


import utils.DriverInitializer;
import utils.ExtentManager;
import utils.ExtentTestManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;

public class BaseTest {
    private static ExtentReports reports = ExtentManager.getInstance();
    @Before
    public void setUp(Scenario scenarioName){
        ExtentTest test = reports.createTest(scenarioName.getName());
        ExtentTestManager.setTest(test);
        System.out.println("Scenario name is printed is :" + scenarioName.getName());
        DriverInitializer.initializeDriver();
    }

    @AfterStep
    public void afterScenario(Scenario scenario){
        if (scenario.isFailed()){
            ExtentTestManager.getTest().fail(scenario + " is failed");
        }
        else{
            ExtentTestManager.getTest().pass( scenario +  " is passed");
        }
        ExtentTestManager.removeTest();
    }

    @After
    public void tearDown(Scenario scenario){
        DriverInitializer.tearDown();
    }

    @AfterAll
    public static void afterAll(){
        reports.flush();
    }


}
