package com.rj.cucumber.RJSteps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/naukriUploads.feature",
        glue = {"com.rj.cucumber.RJSteps", "com.rj.cucumber.RJSteps.BaseTest.java"},
        plugin = {

        },
        tags = "@smoke"
)

public class Runner {
}
