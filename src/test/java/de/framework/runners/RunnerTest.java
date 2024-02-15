package de.framework.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "de.framework.stepdefinitions","de.framework.pages",
    "de.framework.hooks", "de.framework.utils" }, plugin = { "pretty", "html:target/report/htmlReport.html",
        "json:target/report/jsonReport.json" },tags="@popup")

public class RunnerTest { 

}
