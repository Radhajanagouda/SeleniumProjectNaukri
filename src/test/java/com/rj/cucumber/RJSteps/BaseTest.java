package com.rj.cucumber.RJSteps;


import Utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.sql.Driver;

public class BaseTest {
    @Before
    public void setUp(){
        DriverFactory.initializeDriver();
    }

    @After
    public void tearDown(){
        DriverFactory.tearDown();
    }
}
