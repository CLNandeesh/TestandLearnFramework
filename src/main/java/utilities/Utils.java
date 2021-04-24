package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static WebDriverWait wait;
	
	
	
	 public static  void clickElementWithRetry(WebElement element) {
			boolean elementFound = false;
			int counter = 0;
			while (!elementFound) {
				if (counter > 5) {
					break;
				}
				counter++;
				// System.out.println("Element counter:"+counter);
				try {
					element.click();
					elementFound = true;
				} catch (ElementClickInterceptedException ex) {
				} catch (ElementNotInteractableException ex) {
				}
			}

		}
	 
	 public static void explictWait(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(element), ExpectedConditions.elementToBeClickable(element)));
		}
		
		public static void explictWaitMoreTime(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,600);
			wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(element), ExpectedConditions.elementToBeClickable(element)));
		}
		
		
		public static void invisibilityWaitOfLoader(WebDriver driver,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.invisibilityOf(element));
			
		}
		
		public static void invisibilityWaitOfLoader(WebDriver driver,WebElement element,long time) {
			WebDriverWait wait=new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.invisibilityOf(element));
			
		}
		
		public static void clickElement(WebElement element) {
			element.click();
		}

		public void sendValue(WebDriver driver, WebElement element, String value) {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].value=" + value, element);

		}

		public void clickElement(WebDriver driver, WebElement element) {
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].click();", element);

		}
		
		public WebDriverWait getDriverWait(WebDriver driver) {
			return new WebDriverWait(driver, 40);
		}
		
		public boolean isElementDisplayed(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return findElement(SeleniumDriver.getDriver(), by).isDisplayed();
		}

		public boolean isElementDisplayed(WebDriver driver, By by) {
			getDriverWait(driver).until(ExpectedConditions.visibilityOfElementLocated(by));
			return findElement(driver, by).isDisplayed();
		}

		public boolean isElementDisplayed(WebDriver driver, WebElement element) {
			getDriverWait(driver).until(ExpectedConditions.elementToBeClickable(element));
			return element.isDisplayed();
		}
		
		public WebElement findElement(WebDriver driver, By by) {
			getDriverWait(driver).until(ExpectedConditions.visibilityOfElementLocated(by));
			return driver.findElement(by);
		}
		
		public WebElement elementIsElementDisplayed(WebElement element,String message) {
			wait.until(ExpectedConditions.visibilityOf(element));
			return element;
		    
			}
		
		 // function to generate a random string of length n 
	    public static String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "0123456789"
	                                    + "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
		
		
		
}
