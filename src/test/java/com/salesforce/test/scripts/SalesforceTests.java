package com.salesforce.test.scripts;//Main method


import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.salesforce.tests.Base.Basetest;



public class SalesforceTests extends Basetest {
     
    //Login to SalesForce
    public static void login_to_SalesForce() throws InterruptedException {
		System.out.println("******login_to_SalesForce script started***********");
		String expected="SalesForce";
		launchBrowser("firefox");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
    }
    //Testcase-1-Empty password
    
	public static void Empty_Password() throws InterruptedException{
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"madhuri@tekarch.com","username textbox");
		//find the pwd field and clear
		WebElement passwordEle = driver.findElement(By.id("password"));
		clearElement(passwordEle,"password textbox");
		//find the login button and click it
		//enterText(passwordEle,"Cowdogcat56","password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		WebElement errorMessage= driver.findElement(By.id("error"));
		waitForVisibility(errorMessage, 5, "errorMessage");
		verifyText(errorMessage, "Please enter your password.", "Pass", "Fail");
		Thread.sleep(5000);
		closeBrowser();
		System.out.println("******login_to_Salesforce automation script ended***********");
	}
    
    //TestCase -2-Login with correct username and Pwd and Chk whether the homepage is displayed or not
    
  /*  public static void CheckHomePageDisplay() throws InterruptedException {
		
		//enter username
		WebElement usernameEle = driver.findElement(By.id("username"));
		//waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"madhuri@tekarch.com","username textbox");
		//enter password
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"Cowdogcat56","password textbox");
		//find the login button and click it
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		//Chk homepage displayed or not
		checkCurrentUrlContains("salesforce.com", "Home page is displayed", "Home page is not displayed");
		Thread.sleep(5000);
		closeBrowser();
		System.out.println("******login_to_Salesforce automation script ended***********");
	}*/
    
    //TestCase-3-Check RememberMe
    
      public static void CheckRememberMe() throws InterruptedException {
 		
 		//enter username
 		WebElement usernameEle = driver.findElement(By.id("username"));
 		//waitForVisibility(usernameEle, 5, 2, "username textbox");
 		enterText(usernameEle,"madhuri@tekarch.com","username textbox");
 		//enter password
 		WebElement passwordEle = driver.findElement(By.id("password"));
 		enterText(passwordEle,"Cowdogcat56","password textbox");
 		//Click on Rememberme chkbox
 		//clickCheckboxById("rememberUn", "RememberMe checkbox");
  		//find the login button and click it
 		WebElement buttonEle=driver.findElement(By.id("Login"));
 		clickElement(buttonEle,"login button");
 		//Chk homepage displayed or not
 		checkCurrentUrlContains("salesforce.com", "Home page is displayed", "Home page is not displayed");
 		//click on username label
 		//moveToElementByCssSelector("#userNavLabel", "UserNavLabel");
        //click on menubutton
 		WebElement buttonEle1=driver.findElement(By.id("userNavButton"));
 		clickElement(buttonEle1,"menu button");
  		closeBrowser();
 		System.out.println("******login_to_Salesforce automation script ended***********");
 	}
     
     //Testcase-4a-
     //4a.click on forgot password..and enter username and wait and then forgot pwd page shud appear
    
  		//forgot pwd
     public static void Forgot_Password() throws InterruptedException {
   		
 		clickLinkByText(driver, "Forgot Your Password?", "Forgot pwd link displayed");
        Thread.sleep(5000);
  		//enter username
 		WebElement usernameEle = driver.findElement(By.id("username"));
 		waitForVisibility(usernameEle, 5, 2, "username textbox");
 		enterText(usernameEle,"madhuri@tekarch.com","username textbox");
 		Thread.sleep(5000);
  		//find the continue button and click it
  		WebElement buttonEle=driver.findElement(By.id("continue"));
 		clickElement(buttonEle,"Continue button");
  		//check if the password reser message page is displayed
 		checkCurrentUrlContains("forgotpassword","PassWord reset message page is displayed.", "Password reset message page is not displayed");
  		closeBrowser();
 		System.out.println("******login_to_Salesforce automation script ended***********");
 	}
     //Testcase-4b-enter wrong username and password
     
    public static void WrongUsername_Pwd() throws InterruptedException {
  		
  		WebElement usernameEle = driver.findElement(By.id("username"));
  		//waitForVisibility(usernameEle, 5, 2, "username textbox");
  		enterText(usernameEle,"123","username textbox");
  		Thread.sleep(5000);
  		//enter wrong pwd
  		WebElement passwordEle = driver.findElement(By.id("password"));
 		enterText(passwordEle,"22131","password textbox");
 		//find the login button and click it
 		WebElement buttonEle=driver.findElement(By.id("Login"));
 		clickElement(buttonEle,"login button");
 		Thread.sleep(5000);
 		//check for the errormessage
 		WebElement errorMessage= driver.findElement(By.id("error"));
		//waitForVisibility(errorMessage, 5, "errorMessage");
 		Thread.sleep(5000);
		verifyText(errorMessage, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.", "Pass", "Fail");   		  		closeBrowser();
  		closeBrowser();
		System.out.println("******login_to_Salesforce automation script ended***********");
  	}
     
        
    public static void main(String orgs[]) throws InterruptedException {
    	        login_to_SalesForce();
    	        //Empty_Password(); 
    	       // CheckHomePageDisplay();
    	        //CheckRememberMe();
     	       // Forgot_Password();
     	        //WrongUsername_Pwd();
    }    	    
}
