package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/org/example/features",
        glue = "stepdefinitions",
        monochrome = true,
        plugin = {"pretty", "json:target/cucumber-report/report.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
