package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "pretty",//generates reports in the console as well
             "html:target/cucumber-reports.html",
             "json:target/json-reports/cucumber.json",
             "junit:target/xml-reports/cucumber.xml",
             "rerun:target/failedRerun.txt",
             "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,//makes the console reports more readable
        features = "./src/test/resources/features",//path of the features folder
        glue = {"stepdefinitions","hooks"},//path of the stepdefinitions folder
        dryRun = false, //generate the missing step definitions only. Do not run the existing step definitions
        tags = "@failed"
)
public class Runner {
}
/*
Runner class is used to run the feature files
And add some report plug ins
Runner class also connects the JAVA(step definitions) and NON-JAVA(feature files) parts
@RunWith(Cucumber.class) is used for making the class Runnable
@CucumberOptions is used for connecting features and step definitions. It is also used for configurations and cucumber report plugins
features is used for path of the features folder
glue is used to give the path of the step definitions folder
dryRun = true is used to generate missing step definitions. dryRun=false must be used for normal run.
tags = "@iphone" is used to run specific scenarios.
 */