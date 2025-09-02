package com.rj.cucumber.rjsteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.rj.cucumber.rjsteps.stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        tags = "@smoke"
)

public class Runner {
}
