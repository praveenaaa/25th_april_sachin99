package com.jenkins_practice;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"},
		features = "Feature99"
		,glue={"step_definition"}
,tags = {"@Registration" }
		)
public class Testrunner {
	
}
