package com.salesforce.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class Contacts extends Basetest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login_to_SalesForce();
		Thread.sleep(5000);
		System.out.println("********Leads script Started***********");
		//display leads
		WebElement ContactsTab = driver.findElement(By.id("Contact_Tab"));
		clickElement(ContactsTab,"Contacts Tab");
		Thread.sleep(2000);
		WebElement NewButton = driver.findElement(By.cssSelector("input.btn:nth-child(1)"));
		clickElement(NewButton,"New");
		WebElement lastName= driver.findElement(By.id("name_lastcon2"));
	    enterText(lastName,"Cucumber","lastname");
	    Thread.sleep(2000);
	    WebElement AccountName= driver.findElement(By.id("con4"));
	    enterText(AccountName,"Palini","AccountName");
	    Thread.sleep(2000);
		WebElement SaveButton = driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(1)"));
		clickElement(SaveButton,"Save");
		WebElement lastName1= driver.findElement(By.id("name_lastcon2"));
	    enterText(lastName1,"Cucumber","lastname");
	    Thread.sleep(2000);
	    WebElement AccountName1= driver.findElement(By.id("con4"));
	    enterText(AccountName1,"Palini","AccountName");
	    Thread.sleep(2000);
		Thread.sleep(5000);
		System.out.println("New Contacts page is displayed:TestCase 25 Passed");
		clickElement(ContactsTab,"Contacts Tab");
		WebElement CreateNewviewlink = driver.findElement(By.cssSelector(".fFooter > a:nth-child(2)"));
		clickElement(CreateNewviewlink,"Contacts Tab");
		System.out.println("Clicked on Newview link");
		Thread.sleep(2000);
		WebElement viewName = driver.findElement(By.id("fname"));
		enterText(viewName,"Long","ViewName");
		WebElement viewUniqueName= driver.findElement(By.id("devname"));
		enterText(viewUniqueName,"Short","viewUnique");
		WebElement SaveBtn=driver.findElement(By.cssSelector(".pbHeader > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)"));
		clickElement(SaveBtn,"Save");
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Expected Title for Test Case 26"), "Test Case 26 failed");
		System.out.println("Contacts Homepage is opened...ViewAccount is created: TestCase-26 Passed");
		clickElement(ContactsTab,"Contacts Tab");
		WebElement RecCreatedDropdown = driver.findElement(By.id("hotlist_mode"));
		clickElement(RecCreatedDropdown,"Recently created");
		selectDropdownOption(RecCreatedDropdown,"Recently Created");
        Thread.sleep(2000);
		System.out.println("Recently Created Page is shown: TestCase-27 Passed");
		Thread.sleep(2000);
		clickElement(ContactsTab,"Contacts Tab");
		WebElement MyContactsDropdown = driver.findElement(By.id("fcf"));
		clickElement(MyContactsDropdown,"MyContacts Dropdown");
		selectDropdownOption(MyContactsDropdown,"My Contacts");
		System.out.println("MyContacts Page is shown: TestCase-28 Passed");
		Thread.sleep(2000);
		clickElement(ContactsTab,"Contacts Tab");
		WebElement ContactNamePalini = driver.findElement(By.linkText("Palini"));
		clickElement(ContactNamePalini,"contactname");
		Thread.sleep(2000);
		System.out.println("Palini Contact page is shown: TestCase-29 Passed");
		Thread.sleep(2000);
		clickElement(ContactsTab,"Contacts Tab");
		//WebElement CreateNewviewlink = driver.findElement(By.cssSelector(".fFooter > a:nth-child(2)"));
		clickElement(CreateNewviewlink,"Contacts Tab");
		System.out.println("Clicked on Newview link");
		Thread.sleep(2000);
		WebElement viewUniqueName1 = driver.findElement(By.id("devname"));
		enterText(viewUniqueName1,"EFGH","ViewUniqueName");
		WebElement SaveBtn1=driver.findElement(By.cssSelector(".pbHeader > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)"));
		clickElement(SaveBtn1,"Save");
		Thread.sleep(2000);
		System.out.println("Contacts Homepage is opened...Error message is displayed: TestCase-30 Passed");
		//clickElement(ContactsTab,"Contacts Tab");
		clickElement(ContactsTab,"Contacts Tab");
		clickElement(CreateNewviewlink,"Contacts Tab");
		System.out.println("Clicked on Newview link");
		Thread.sleep(2000);
		WebElement ViewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(ViewName,"ABCD","ViewName");
		enterText(viewUniqueName,"EFGH","ViewUniqueName");
		WebElement CancelBtn=driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[2]"));
		clickElement(CancelBtn,"Cancel");
		Thread.sleep(2000);
		System.out.println("Contacts Home page is displayed and the View ABCD should not be created: TestCase-31 Passed");
		clickElement(ContactsTab,"Contacts Tab");
		WebElement Newbtn=driver.findElement(By.cssSelector("input.btn:nth-child(1)"));
		clickElement(Newbtn,"New");
		//WebElement lastName1= driver.findElement(By.id("name_lastcon2"));
	    enterText(lastName,"Indian","lastname");
	    Thread.sleep(2000);
	   // WebElement AccountName= driver.findElement(By.id("con4"));
	    enterText(AccountName,"Global Media","AccountName");
	    clickElement(SaveButton,"Save");
	    Thread.sleep(2000);
	    clickElement(Newbtn,"New");
	    System.out.println("New contact is created. Contact Edit: New Contact Page is dispalyed: TestCase-32 Passed");
	    System.out.println("********Leads script Ended***********");
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
