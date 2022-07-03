package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {"html:target/Report/cucumber-html-report.html"},
        features = "D:\\Cucumer Project\\Automation\\src\\test\\java\\FeatureFile\\SauceDemo.feature",
        glue = "stepDefinations", 
        tags = "@Mobile or @WebTest "  ,
        stepNotifications= true ,
//        dryRun = true , 
        dryRun= false ,
        		plugin= {"pretty","html:target/Report/cucumber-html.html"} , 
        		monochrome = true 
        		
        
)

public class TestRunner {
}


