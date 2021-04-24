package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.DashboardPageActions;
import pages.actions.LoginPageActions;
import utilities.BaseClass;
import utilities.SeleniumDriver;

public class GenricFeatureSteps extends BaseClass{

	LoginPageActions loginPageActions = new LoginPageActions();
	DashboardPageActions dashboardPageActions=new DashboardPageActions();

	@Given("^I am on login page url \"([^\"]*)\" of JAM tool$")
	public void i_am_on_login_page_url_of_JAM_tool(String url) throws Throwable {

		SeleniumDriver.openPage(url);

	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String userID, String password) throws Throwable {
		loginPageActions.setUserID(userID);
		logger.info("user name entered");
		loginPageActions.setPassword(password);
		logger.info("password entered");

	}

	@When("^click on Sigin button$")
	public void click_on_Sigin_button() throws Throwable {
		loginPageActions.clickSigin();
		logger.info("sigin button clicked");

	}

	@Then("^I moved to dashboard$")
	public void i_moved_to_dashboard() throws Throwable {
        Assert.assertEquals(dashboardPageActions.validateDashboard(), true,"something went wrong in login");
        logger.info("moved to dashboard");
	}

	@Then("^clicked on Logout button$")
	public void clicked_on_Logout_button() throws Throwable {
		dashboardPageActions.clickLogout();
	}

	@Then("^I moved to login page$")
	public void i_moved_to_login_page() throws Throwable {
       Assert.assertEquals(loginPageActions.validateLogout(), true);
      // Thread.sleep(10000);
	}

}
