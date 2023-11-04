package com.salesforce.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class Random_scenarios extends Basetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login_to_SalesForce();
		Thread.sleep(5000);
		System.out.println("********Random Scenarios script Started***********");
		
		WebElement HomeTab = driver.findElement(By.id("home_Tab"));
		clickElement(HomeTab,"HomeTab");
		Thread.sleep(2000);
		System.out.println("Home Page is displayed and First and Lastnames also displayed");
		WebElement UserNamebutton = driver.findElement(By.cssSelector("#userNavLabel"));
		clickElement(UserNamebutton,"UserName button");
		//Assert.assertTrue(driver.getPageSource().contains("User:FirstName LastName"), "Logged-in user not displayed");
		if (driver.getPageSource().contains("Madhuri MNM")) {
            System.out.println("Test Case 33 Passed");
        } else {
            System.out.println("Test Case 33 Failed");
        }
		 System.out.println("TestCase 33 Output");
        // Test Case 34: Verify the edited lastname is updated at various places
        clickElement(HomeTab, "Home Tab");
        
        //Assert.assertTrue(driver.getPa
          if (driver.getPageSource().contains("MNM")) {
            System.out.println("Lastname is displayed");
        } else {
            System.out.println("Lastname is not displayed");
        }
        System.out.println("TestCase 34 Output");
        // Test Case 35: Verify the tab customization
        clickElement(HomeTab, "Home Tab");
       // Assert.assertFalse(driver.getPageSource().contains("RemovedTab"), "Removed tab still displayed in the tab bar");
        if (!driver.getPageSource().contains("RemovedTab")) {
            System.out.println("Test Case 35 Passed");
        } else {
            System.out.println("Test Case 35 Failed");
        }
        System.out.println("TestCase 35 Output");
        // Test Case 36: Blocking an event in the calendar
        clickElement(HomeTab, "Home Tab");
       // Assert.assertTrue(driver.getPageSource().contains("Other"), "Blocked event not displayed in the calendar");
        if (driver.getPageSource().contains("Other")) {
            System.out.println("Test Case 36 Passed");
        } else {
            System.out.println("Test Case 36 Failed");
        }

        System.out.println("TestCase 36 Output");
        // Test Case 37: Blocking an event in the calendar with weekly recurrence
        clickElement(HomeTab, "Home Tab");
        //Assert.assertTrue(driver.getPageSource().contains("Other"), "Blocked weekly recurring event not displayed in the calendar");
        if (driver.getPageSource().contains("Other")) {
            System.out.println("Test Case 37 Passed");
        } else {
            System.out.println("Test Case 37 Failed");
        }
        System.out.println("TestCase 37 Output");
        System.out.println("********Random scenarios script Ended***********");
		driver.quit();
		}
	public static void login_to_SalesForce() throws InterruptedException {
		System.out.println("******login_to_SalesForce script started***********");
		String expected="SalesForce";
		launchBrowser("firefox");
		maximiseBrowser();
		goToUrl("https://login.salesforce.com/");
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, 2, "username textbox");
		enterText(usernameEle,"madhuri@tekarch.com","username textbox");
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"Cowdogcat56","password textbox");
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		System.out.println("Login Button is clicked..HomePage displayed");
    }

}



