package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//",
                 glue = {"stepDefs"},
                 monochrome = true,
                 dryRun=false,
                		 plugin = {"pretty",
                				 "html:target/reports/HTMLReport.html",
                				 //"rerun:target/failedScenarios.txt"
                				 //"usage:target/reports/UsageRepor",
                				 //"json:target/reports/JsonReport.json",
                				 //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		 }

)

public class MyTestRunner extends AbstractTestNGCucumberTests{
	
	//The TestRunner class extends AbstractTestNGCucumberTests, which enables it to run Cucumber scenarios as TestNG tests.
	
  
}
