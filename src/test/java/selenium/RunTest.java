package selenium;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import stepdefs.LoginPage;


@CucumberOptions(
        features = "src/test/java/resources/Module1.feature",
        glue = "stepdefs",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class RunTest extends AbstractTestNGCucumberTests {
	
}
