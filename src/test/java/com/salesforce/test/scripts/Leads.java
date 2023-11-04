package com.salesforce.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salesforce.tests.Base.Basetest;

public class Leads extends Basetest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	login_to_SalesForce();
	Thread.sleep(5000);
	System.out.println("********Leads script Started***********");
	//display leads
	WebElement LeadsTab = driver.findElement(By.id("Lead_Tab"));
	clickElement(LeadsTab,"Leads Tab");
	System.out.println("LeadsPage is displayed:TestCase 20 Passed");
	Thread.sleep(2000);
	WebElement ViewDropdownlistClick = driver.findElement(By.id("fcf"));
	clickElement(ViewDropdownlistClick,"Viewlink Button");
	System.out.println("Viewdropdown menu displayed:TestCase 21 Passed");
	Thread.sleep(2000);
	selectDropdownOption(ViewDropdownlistClick,"My Unread Leads");
	Thread.sleep(2000);
	selectDropdownOption(ViewDropdownlistClick,"Today's Leads");
	Thread.sleep(2000);
	WebElement menubutton = driver.findElement(By.cssSelector("#userNavLabel"));
	clickElement(menubutton,"UserMenu Button");
	Thread.sleep(2000);
	WebElement clickLogout= driver.findElement(By.cssSelector("#userNav-menuItems > a:nth-child(5)"));
	clickElement(clickLogout,"Logout Button");
	System.out.println("Logged out of Application");
	Thread.sleep(5000);
	login_to_SalesForce();
	Thread.sleep(5000);
	WebElement LeadsTab1 = driver.findElement(By.id("Lead_Tab"));
	clickElement(LeadsTab1,"Leads Tab");
	WebElement GoButton = driver.findElement(By.cssSelector("input.btn:nth-child(2)"));
	clickElement(GoButton,"Tab");
	Thread.sleep(5000);
	System.out.println("Todays leads view is displayed:TestCase 22 Passed");
	WebElement LeadsTab2 = driver.findElement(By.id("Lead_Tab"));
	clickElement(LeadsTab2,"Leads Tab");
	WebElement ViewDropdownlistClick1 = driver.findElement(By.id("fcf"));
	clickElement(ViewDropdownlistClick1,"Viewlink Button");
	selectDropdownOption(ViewDropdownlistClick,"Today's Leads");
	Thread.sleep(2000);
	System.out.println("Todays leads view is displayed:TestCase 23 Passed");
	WebElement LeadsTab3 = driver.findElement(By.id("Lead_Tab"));
	clickElement(LeadsTab3,"Leads Tab");
	Thread.sleep(2000);
	WebElement NewButton = driver.findElement(By.cssSelector(".pbButton > input:nth-child(1)"));
	clickElement(NewButton,"New");
	WebElement lastName= driver.findElement(By.id("name_lastlea2"));
    enterText(lastName,"ABCD","lastname");
    Thread.sleep(2000);
    WebElement CompanyName= driver.findElement(By.id("lea3"));
    enterText(CompanyName,"ABCD","CompanyName");
    Thread.sleep(2000);
	WebElement SaveButton = driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(1)"));
	clickElement(SaveButton,"Save");
	Thread.sleep(2000);
	System.out.println("New Changes page is displayed:TestCase 24 Passed");
	
	quitBrowser();
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
	


