package com.salesforce.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class CreateAccounts extends Basetest{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login_to_SalesForce();
		Thread.sleep(5000);
		//create new Account
		WebElement AccountsTab = driver.findElement(By.cssSelector("#Account_Tab > a:nth-child(1)"));
		clickElement(AccountsTab,"Accounts Tab");
		System.out.println("Clicked on Accounts Tab");
		WebElement New = driver.findElement(By.xpath("//input[@name='new']"));
		clickElement(New,"New Button");
		System.out.println("Clicked on new Tab");
		
		WebElement AccountNameEle= driver.findElement(By.id("acc2"));
		enterText(AccountNameEle,"Kamala","Account Name");
		WebElement dropdowntypeEle= driver.findElement(By.id("acc6"));
		clickElement(dropdowntypeEle,"Type dropdown");
        Thread.sleep(5000);
        System.out.println("Test Case Passed-Dropdown Menu is displayed");
    //Testcase-10
        selectDropdownOption(dropdowntypeEle,"Technology Partner");
		WebElement custPriority= driver.findElement(By.id("00NHs00000S6Gtr"));
		clickElement(custPriority,"Priority");
		selectDropdownOption(custPriority,"High");
		WebElement SaveBtn=driver.findElement(By.cssSelector("#bottomButtonRow > input:nth-child(1)"));
		clickElement(SaveBtn,"Save");
		System.out.println("New Account is created: TestCase-10 Passed");
		driver.switchTo().defaultContent();
		//CreateNewViewlink();//testcase-11
		
		//EditView();//testcase-12
		//Merge_Accounts();testcase-13
		//Create_Acc_Reports();//testcase-14
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
	
	

}