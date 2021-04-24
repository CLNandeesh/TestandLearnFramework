package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.LoginPageLocators;
import utilities.SeleniumDriver;
import utilities.Utils;

public class LoginPageActions  {
	
	LoginPageLocators loginPageLocators=null;
	
	
	public LoginPageActions()
	{
		this.loginPageLocators=new LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
	}
	
	// Set Email
		public void setUserID(String userID) throws InterruptedException {
			loginPageLocators.txtUserID.clear();
			loginPageLocators.txtUserID.sendKeys(userID);
		}
		
		// Set Password
		public void setPassword(String password) throws InterruptedException {
			loginPageLocators.txtPassword.clear();
			loginPageLocators.txtPassword.sendKeys(password);
		}
		
		//CLick on SignIn button
		public void clickSigin() throws InterruptedException {
			//CommonUtils.explictWait(this.webDriver, btnLogin);
			Utils.clickElementWithRetry(loginPageLocators.btnLogin);
			
		}
		
		public boolean validateLogout() {
			
			Utils.explictWait(SeleniumDriver.getDriver(),loginPageLocators.txtLoginPage );
			return loginPageLocators.txtLoginPage.isDisplayed();
			
			
		}

}
