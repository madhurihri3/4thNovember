package com.salesforce.tests.Base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.tests.utilities.PropertiesUtility;

//import com.automation.tests.utilities.PropertiesUtility;

public class Basetest {
	 protected static WebDriver driver=null;
	   static WebDriverWait wait=null;
	   
	   
		
		/*@Parameters("browsername")
		public static void setUpBeforeTestMethod(@Optional("firefox") String browser_name) {
			PropertiesUtility pro=new PropertiesUtility();
			Properties applicationProFile=pro.loadFile("applicationData.properties");
			String url=applicationProFile.getProperty("url");
			launchBrowser(browser_name);
			maximiseBrowser();
			goToUrl(url);
		}*/
		@AfterMethod
		public void tearDownAfterTestMethod() {
			closeBrowser();
			System.out.println("******login_to_firebase automation script ended***********");
		}
		
		public static void launchBrowser(String browserName) {
			switch(browserName) {
			case "firefox":driver=new FirefoxDriver();
							System.out.println("firefox browser launched");
							break;
			case "chrome":driver=new ChromeDriver();
							System.out.println("chrome browser launched");
							break;
			default: System.out.println("you have not entrered the correct browser");
					
			}
		}
		
	    		public static void goToUrl(String url) {
	    			driver.get(url);
	    			System.out.println(url+ "is entered");
	    		}

	    		public static void maximiseBrowser() {
	    			driver.manage().window().maximize();
	    			System.out.println("browser window has maximized");
	    		}
	    		public static String getPageTitle() {
	    			return driver.getTitle();
	    		}

	    		public static void refreshPage() {
	    			driver.navigate().refresh();

	    		}
	    		
	    		public static String getTextFromElement(WebElement ele,String objectName) {
	    			String data=ele.getText();
	    			System.out.println("extracted the text from"+objectName);
	    			return data;
	    		}
	    		
	    		public static void closeBrowser() {
	    			driver.close();
	    			System.out.println("browser closed");
	    			//System.out.println("******invalid_login_to_Salesforce automation script ended***********");
	    		}
	    		// Teardown method
	    	  
	    	   public static void teardown()
	    	   {
	       	        if (driver != null) {
	    	            driver.quit();
	    	        }
	    	   }
	    	    		
	    		public static void enterText(WebElement ele,String data,String ObjectName) {
	    			if (ele.isDisplayed()) {
	    				clearElement(ele, ObjectName);
	    				ele.sendKeys(data);
	    				System.out.println("data is entered in the "+ObjectName);
	    			} else {
	    				System.out.println(ObjectName+" element is not displayed");
	    			}
	    		}
	    		public static void clearElement(WebElement ele,String ObjectName) {
	    			if (ele.isDisplayed()) {
	    				ele.clear();
	    				System.out.println(ObjectName+" is cleared");
	    			}
	    			else {
	    				System.out.println(ObjectName+" element is not displayed");
	    			}
	    		}
	    		
	    		public static void clickElement(WebElement ele,String ObjectName) {
	    			if(ele.isEnabled()) {
	    				ele.click();
	    				System.out.println(ObjectName+"button is clicked");
	    				}
	    				else {
	    					System.out.println("button element is not enabled");
	    				}
	    		}
	    		
	    		public static void verifyText(WebElement element, String expected, String passMessage, String failMessage) {
	    		    String actual = element.getText().trim();
	    		    System.out.println("Actual messege is:"+
	    		    actual);
	    		    if (actual.equals(expected)) {
	    		        System.out.println("Pass: " + passMessage);
	    		    } else {
	    		        System.out.println("Fail: " + failMessage);
	    		    }
	    		}
	    		
	    		
	    		public static void waitForVisibility(WebElement ele,int time,String objectNam) {
	    			wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	    			wait.until(ExpectedConditions.visibilityOf(ele));
	    		}
	    		public static void checkCurrentUrlContains(String keyword, String passMessage, String failMessage) {
	    		    if (driver.getCurrentUrl().contains(keyword)) {
	    		        System.out.println("Test Case is passed: " + passMessage);
	    		    } else {
	    		        System.out.println("Test Case is failed: " + failMessage);
	    		    }
	    		}
	    		public static Alert switchToAlert() {
	    			Alert alert=driver.switchTo().alert();
	    			System.out.println("Switched to Alert");
	    			return alert;
	    			}
	    		
	    		public static void AcceptAlert(Alert alert) {
	    			System.out.println("Alert accepted");
	    			alert.accept();
	    			}
	    		public static String getAlertText(Alert alert,String objName) {
	    			System.out.println("etracting text in the " +objName+ "alert");
	    			String text=alert.getText();
	    			return text;		
	    			}	
	    	    public static void dismissAlert() {
	    		Alert alert=switchToAlert();
	    		alert.dismiss();
	    		System.out.println("Alert dismissed");
	    		}
	    		public static void clickCheckboxById(String id, String elementName) {
	    		    WebElement element = driver.findElement(By.id(id));
	    		    if (element.isDisplayed()) {
	    		        if (!element.isSelected()) {
	    		            element.click();
	    		            System.out.println(elementName + " is checked");
	    		        } else {
	    		            System.out.println(elementName + " is already checked");
	    		        }
	    		    } else {
	    		        System.out.println(elementName + " is not displayed");
	    		    }
	    		}
	    		public static void switchToFrame(WebDriver driver, WebElement frameElement, String frameName) throws NoSuchFrameException {
	    			driver.switchTo().frame(frameElement);
	    	        System.out.println("Switched to frame: " + frameName);
	    	    }
	    		public static void switchToFrame2(WebElement frameEle, String frameName) throws NoSuchFrameException {
	    			if(frameEle.isDisplayed()) {
	   	    			driver.switchTo().frame(frameEle);
	    	        System.out.println("Switched to frame: " + frameName);
	    			}
	    			else {
	    				System.out.println("Frame not found");
	    			}
	    	    }
	    		public static void switchToDefaultFrame(WebDriver driver) throws NoSuchFrameException {
	    			driver.switchTo().defaultContent();
	    	        System.out.println("Switched to Default frame: " );
	    	    }
	    		public static void switchToFrameid(WebDriver driver,String ObjectName) throws NoSuchFrameException {
	    			driver.switchTo().frame(ObjectName);
	    	        System.out.println("Switched to frame: " + ObjectName);
	    	    }
	    		public static void mouseOver(WebDriver driver,WebElement ele) {
	    			if(ele.isDisplayed()) {
	    				Actions action=new Actions(driver);
	    				action.moveToElement(ele).build().perform();
	    				System.out.println("Is Present"+ele);
	    				}
	    				else {
	    					System.out.println("Is not Present"+ele);
	    				}
	    		}
	    		public static void selectByTextData(WebElement ele, String text,String objName) {
	    	        Select dropdown = new Select(ele);
	    	        dropdown.selectByVisibleText(text);
	    	        System.out.println(objName + " selected " +text);
	    	    }
	    		
	    		public static void selectByIndexData(WebElement ele, int index,String objName) {
	    	        Select dropdown = new Select(ele);
	    	        dropdown.selectByIndex(index);
	    	        System.out.println("Dropdown Element is selected "+ele);
	    	    }
	    		public static void selectByValueData(WebElement ele, String text,String objName) {
	    	        Select dropdown = new Select(ele);
	    	        dropdown.selectByValue(text);
	    	        System.out.println("Dropdown Element is selected "+ele);
	    	    }
	    		
	    			
	    		
	    		public static void selectDropdownOption(WebElement dropdownElement, String optionText) {
	    	        Select dropdown = new Select(dropdownElement);
	    	        dropdown.selectByVisibleText(optionText);
	    	    }
	    		public static void selectDropdownInt(WebElement ele, int index) {
	    	        Select dropdown = new Select(ele);
	    	        dropdown.selectByIndex(index);
	    	    }
	    		public static void selectDropdownArrayList(WebElement dropdownElement, String optionText) {
	    	        Select dropdown = new Select(dropdownElement);
	    	        dropdown.selectByVisibleText(optionText);
	    	        ArrayList<WebElement> list = (ArrayList<WebElement>)dropdown.getOptions();
	    	        for(WebElement ele1:list) {
	    	        	System.out.println(ele1.getText());
	    	        }
	    		}
	    		
	    		 public void performActionOnElement(WebDriver driver, WebElement ele, String message) {
	    		        Actions action = new Actions(driver);
	    		        action.moveToElement(ele).build().perform();
	    		        System.out.println(ele +"is displayed");
	    		    }
	    		 public static void waitForVisibility(WebElement ele,int time,int pollingtime,String objectName) {
	    				FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	    				wait.withTimeout(Duration.ofSeconds(time))
	    				.pollingEvery(Duration.ofSeconds(pollingtime))
	    				.ignoring(ElementNotInteractableException.class);
	    				
	    				wait.until(ExpectedConditions.visibilityOf(ele));
	    				System.out.println(objectName+" is waited for visibility using fluent wait");
	    			}
	    			
	    			public static void waitForVisibility1(WebElement ele,int time,String objectName) {
	    				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	    				wait.until(ExpectedConditions.visibilityOf(ele));
	    			}
	    			public static void waitUntilPresenceOfElementLocatedBy(By locator,String objName) {
	    				System.out.println("waiting for an web element "+objName+"for its visibility");
	    			    wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    			}
	    			public static void waitUntilElementClickable(By locator,String objName) {
	    				System.out.println("waiting for an web element "+objName+"to be clickable");
	    			    wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    				wait.until(ExpectedConditions.elementToBeClickable(locator));
	    			}
	    			public static void waitForAlertPresent(int time){
	    				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    				wait.until(ExpectedConditions.alertIsPresent());
	    			}
	    		
	    			
	    			public static void switchToWindowOpened(String mainWindowHandle){
	    				Set<String> allWindowHandles = driver.getWindowHandles();
	    				for(String handle:allWindowHandles) {
	    					if(!mainWindowHandle.equalsIgnoreCase(handle))
	    						driver.switchTo().window(handle);
	    				}
	    				System.out.println("Switched to new Window");
	    			}
	    			public static WebElement selectFromListUsingText(List<WebElement> list,String text){
	    				WebElement element = null;
	    				for(WebElement i:list) {
	    					if(i.getText().equalsIgnoreCase(text)) {
	    						System.out.println("Selected="+i.getText());
	    						element=i;
	    						break;
	    					}
	    				}
	    				return element;
	    			}

	    			
	    		// Method to find and click a link by its text
	    	    public static void clickLinkByText(WebDriver driver, String linkText, String message) {
	    	        WebElement link = driver.findElement(By.linkText(linkText));
	    	        link.click();
	    	        System.out.println(message);
	    	    }
	    	    
	    	    //Method to Logout
	    	    public static void performLogout(WebDriver driver, WebElement clickLogout) throws InterruptedException {
	        	        if (clickLogout.isDisplayed()) {
	    	            System.out.println("Logout drop down is displayed");
	    	            clickLogout.click();
	    	            System.out.println("Logout is clicked");
	    	        }
	        	       
	    	    }


	    	    

	} 		
	    		
	    		
	    		





