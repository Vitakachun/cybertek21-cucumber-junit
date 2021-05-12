package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                // telling which line is failed
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features", // path from content root
        glue = "com/cybertek/step_definitions", // path from source root
        dryRun = false,
        /*
        dryRun option can either set as true or false. If it is set as true,
        it means that Cucumber will only checks that every Step mentioned in the Feature File
        have corresponding code written in Step Definition file or not.
         */
        tags = "@wip"
)
public class CukesRunner {
}
