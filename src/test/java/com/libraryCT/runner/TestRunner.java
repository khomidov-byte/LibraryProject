package com.libraryCT.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  features = "src/test/resources/features" , //alternatively "classpath:features"
        glue = "com/libraryCT/step_definitions" ,
        publish = true, // it will give you public link of your local html report
        plugin = {"pretty", "html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,  // store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target"  // fancy report
        } ,
        dryRun = false
      //, tags = "@db"
)
public class TestRunner {
}