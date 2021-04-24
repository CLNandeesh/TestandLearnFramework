package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	    // User id field
		@FindBy(xpath = "//input[@placeholder='Username']")
		@CacheLookup
		public WebElement txtUserID;

		// Password field
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		@CacheLookup
		public WebElement txtPassword;

		// Login button
		@FindBy(xpath = "//span[text()='Login']")
		@CacheLookup
		public WebElement btnLogin;
		
		
		// Login page text
		@FindBy(xpath = "//img[@src='/img/Allocate$mart.4da7df3c.png']")
		@CacheLookup
		public WebElement txtLoginPage;

}
