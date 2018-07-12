package selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = "src/test/java/resources/",
        glue = "stepdefs",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                    
                } 
        

        )
public class RunTest extends AbstractTestNGCucumberTests {
	
}
