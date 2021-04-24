package steps;




import cucumber.api.Scenario;
import cucumber.api.java.Before;
import utilities.BaseClass;
import utilities.SeleniumDriver;


public class BeforeActions extends BaseClass {

	@Before
    public static void setUp(Scenario scenario) {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
       //System.out.println("Before");
       
       SeleniumDriver.setUpDriver();
      logger.info(scenario.getName().toUpperCase()+" STARTED EXECUTION");
       //System.out.println("Before");
      
       
    }
}
