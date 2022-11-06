package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features  = {".//src//test//java"},
		glue = "StepDefination",
		//tags="@Execute",
		dryRun = false,
		monochrome = true,
		plugin = {
				"pretty"
		}
		
		
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
