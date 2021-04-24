package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utilities.BaseClass;
import utilities.SeleniumDriver;


public class AfterActions extends BaseClass {

    @After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=SeleniumDriver.getDriver();
    	//System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
    	 
    	logger.info(scenario.getName().toUpperCase()+" FINISHED EXECUTION");
    	logger.info(scenario.getName().toUpperCase()+" STATUS IS "+scenario.getStatus().toUpperCase());
    	 
    	 
    	 
    SeleniumDriver.tearDown();
    }
}
