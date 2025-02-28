package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//features = {"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"},

@CucumberOptions(features = {"src/test/java/features"},
				 glue = {"stepDefinition"},
				 publish = true,
				 monochrome = true,
				 tags = "@regression and not @positive")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}