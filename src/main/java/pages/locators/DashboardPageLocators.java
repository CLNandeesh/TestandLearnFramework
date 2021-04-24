package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPageLocators {

	// Dashboard text
	@FindBy(xpath = "//span[text()='Dashboard']")
	@CacheLookup
	public WebElement labelDashboard;

	// createAllocation Button
	@FindBy(xpath = "//button[@id='createAllocationButton']")
	@CacheLookup
	public WebElement btnCreateAllocationButton;
	
	// log out image
	@FindBy(xpath = "//i[@class='icon-power icons font-2xl d-block mt-2']")
	@CacheLookup
	public WebElement imgLogout;
	
	// log out continue button
	@FindBy(xpath = "//span[text()='Continue']")
	@CacheLookup
	public WebElement btnLogoutContinue;
	
	
	
	

}
