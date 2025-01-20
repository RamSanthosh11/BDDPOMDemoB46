package stepDefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@BeforeAll
	public static void SetupDriver() {
		TestBase.initDriver();
	}
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) TestBase.getDriver();;
			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
//taking screenshot and storing as bytyes in byte array to attch to hyml file
			scenario.attach(img, "image/png", "Screenshot");
		
	}
	

}
}
