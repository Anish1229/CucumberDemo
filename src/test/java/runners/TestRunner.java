package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/login.feature",
		glue ="stepDefinations",
		
		plugin = {"pretty","json:target/cucumber-report.json","html:target/cucumber.html"
				}
		)
		
public class TestRunner {

}	