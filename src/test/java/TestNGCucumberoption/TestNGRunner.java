package TestNGCucumberoption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="D:\\Cucumer Project\\Automation\\src\\test\\java\\FeatureFile\\SauceDemo.feature", 
		glue="stepDefinations", 
		dryRun = false 
		)



public class TestNGRunner extends AbstractTestNGCucumberTests  {

}
	