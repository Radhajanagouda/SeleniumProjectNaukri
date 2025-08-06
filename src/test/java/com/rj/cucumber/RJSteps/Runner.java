package com.rj.cucumber.RJSteps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/naukriUploads.feature",
        glue = {"com.rj.cucumber.RJSteps", "com.rj.cucumber.RJSteps.BaseTest.java"},
        plugin = {
                "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        tags = "@smoke"
)

public class Runner {
}
