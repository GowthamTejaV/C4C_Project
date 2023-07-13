package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class MyFailedRunner {
	
	//@RunWith(Cucumber.class)
	@CucumberOptions(features = { "@target/rerun.txt" }, glue = { "stepdefinitions", "AppHooks",
			"stepdefinitions_C", "idpWebsiteSteps", "stepdefinition_DocumentManagement" }, plugin = { "pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	
	public class MyTestRunner extends AbstractTestNGCucumberTests { 

		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
		}

	}
}

