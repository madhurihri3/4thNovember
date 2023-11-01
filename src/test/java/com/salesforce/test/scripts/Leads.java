package com.salesforce.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salesforce.tests.Base.Basetest;

public class Leads extends Basetest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	login_to_SalesForce();
	AppLauchandLogout();
	LeadsSelectView();
	closeBrowser();
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
	//TestCase-20
	//Application launched and user logged in
	//User logged out and application closed

public static void AppLauchandLogout() throws InterruptedException {
		
		System.out.println("Login Button is clicked..HomePage displayed");
    }
public static void LeadsSelectView() throws InterruptedException {
	
	System.out.println("Login Button is clicked..HomePage displayed");
}

	
	}


