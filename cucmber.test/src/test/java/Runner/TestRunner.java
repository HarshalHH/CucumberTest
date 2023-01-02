package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"E:\\CRMTest\\cucmber.test\\src\\test\\java\\Feature\\Creditlogin.feature"},
			
	plugin = { "pretty","json:target/cucumber/report.json"},

		glue ="stepdefinations")

public class TestRunner {

}
