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
		WebElement AccountsTab = driver.findElement(By.id("Account_Tab"));
		clickElement(AccountsTab,"Accounts Tab");
		System.out.println("Clicked on Accounts Tab");
		WebElement New = driver.findElement(By.xpath("//input[@name='new']"));
		clickElement(New,"New Button");
		System.out.println("Clicked on new Tab");
		Thread.sleep(2000);
		WebElement AccountNameEle= driver.findElement(By.id(""));
		enterText(AccountNameEle,"Radha","Account Name");
		Thread.sleep(5000);
        System.out.println("Test Case Passed-Dropdown Menu is displayed");
        WebElement type=(driver.findElement(By.id("acc6")));
        selectDropdownOption(type,"Technology Partner");
		WebElement custPriority= driver.findElement(By.id("00NHs00000S6Gtr"));
		clickElement(custPriority,"Priority");
		selectDropdownOption(custPriority,"High");
		WebElement SaveBtn=driver.findElement(By.cssSelector("#bottomButtonRow > input:nth-child(1)"));
		clickElement(SaveBtn,"Save");
		System.out.println("New Account is created: TestCase-10 Passed");
		driver.switchTo().defaultContent();
		//CreateNewViewlink();//testcase-11
		WebElement CreateNewviewlink = driver.findElement(By.cssSelector(".fFooter > a:nth-child(2)"));
		clickElement(CreateNewviewlink,"Accounts Tab");
		System.out.println("Clicked on Newview link");
		Thread.sleep(2000);
		WebElement viewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		enterText(viewName,"Parrot","ViewName");
		WebElement viewUniqueName= driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		enterText(viewUniqueName,"Bird","viewUnique");
		WebElement SaveNewBtn=driver.findElement(By.cssSelector(""
				+ ""));
		clickElement(SaveNewBtn,"SaveNew");
		Thread.sleep(2000);
		System.out.println("New ViewAccount is created: TestCase-11 Passed");
		driver.switchTo().defaultContent();
		//EditView();//testcase-12
		
		//Merge_Accounts();testcase-13
		//Create_Acc_Reports();//testcase-14
		WebElement AccLastActivity = driver.findElement(By.cssSelector(".hover > a:nth-child(1)"));
		clickElement(AccLastActivity,"Account last activity<");
		System.out.println("Clicked on Accounts last activity link");
		Thread.sleep(2000);
		WebElement popUpFrameEle = driver.findElement(By.cssSelector("#ext-gen187"));
    	waitForVisibility(popUpFrameEle,5,2,"popup Frame");
        switchToFrame(driver,popUpFrameEle,"PopupFrame");
    	WebElement NoThksBtn = driver.findElement(By.id("ext-comp-1107"));
    	clickElement(NoThksBtn,"No Thanks Button");
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