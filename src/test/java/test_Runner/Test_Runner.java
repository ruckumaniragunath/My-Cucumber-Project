package test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    // @RUNWith annotation tells junit that test should run using Cucumber class which is present in io.cucumber.junit.Cucumber
@CucumberOptions(           // @CucumberOptions = settings for Cucumber files. 

		features = "src/test/resources/Feature/Stackoverflow.feature" , glue = "stepDef" ,
		tags = "@smoke",

		plugin = {
				"pretty",
				"json:target/cucumber-report/cucumber.json",
		"html:target/cucumber-report/cucumber.html"}


		)


public class Test_Runner {

}
