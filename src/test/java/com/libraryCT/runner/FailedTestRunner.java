package com.libraryCT.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// This Test Runner has only one purpose
// to run failed scenario that stored inside rerun.txt
// IT DOES NOTHING ELSE !
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"
//                   ,  tags = "@ui"
)
public class FailedTestRunner {
}