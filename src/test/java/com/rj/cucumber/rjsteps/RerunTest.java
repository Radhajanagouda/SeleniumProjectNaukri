package com.rj.cucumber.rjsteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",   // reruns only failed scenarios
        glue = {"com.rj.cucumber.rjsteps"},
        plugin = {"pretty", "html:target/rerun-report.html"}
)
public class RerunTest {
}