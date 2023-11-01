package com.salesforce.test.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class CreateOpportunities extends Basetest{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login_to_SalesForce();
		
		closeBrowser();
		System.out.println("********UserMenu automation script ended***********");


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
	
	//Testcase-15
	public static void Opportunities_dropdown() throws InterruptedException {
	
	}
	//Testcase-16
	public static void Create_NewOpty() throws InterruptedException {
		
		}
		
		//Testcase-15
	public static void TestOpty_PipelineReports() throws InterruptedException {
		
		}
	//Testcase-15
	public static void TestStuckOPty_Reports() throws InterruptedException {
		
		}
		//Testcase-15
	public static void TestQuarterly_Reports() throws InterruptedException {
		
		}
	
	
	
}
