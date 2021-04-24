package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.DashboardPageLocators;
import utilities.SeleniumDriver;
import utilities.Utils;


public class DashboardPageActions {
	
	DashboardPageLocators dashboardPageLocators=null;
	
	
	public DashboardPageActions()
	{
		this.dashboardPageLocators=new DashboardPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), dashboardPageLocators);
	}
	
	
	public boolean validateDashboard() {
		
		Utils.explictWait(SeleniumDriver.getDriver(), dashboardPageLocators.labelDashboard);
		return dashboardPageLocators.labelDashboard.isDisplayed();
		
		
	}
	
	public void clickLogout()
	{
		dashboardPageLocators.imgLogout.click();
		Utils.explictWait(SeleniumDriver.getDriver(), dashboardPageLocators.btnLogoutContinue);
		dashboardPageLocators.btnLogoutContinue.click();
		
	}
	
	public void clickCreateAllocationButton() throws InterruptedException
	{
		Thread.sleep(5000);
		dashboardPageLocators.btnCreateAllocationButton.click();
	}
	
	

}
