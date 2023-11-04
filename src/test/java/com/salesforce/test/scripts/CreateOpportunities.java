package com.salesforce.test.scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class CreateOpportunities extends Basetest{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login_to_SalesForce();
		//Opportunities dropdown
		Thread.sleep(2000);
		System.out.println("********Create Opportunities script Started***********");
		//display opportunities
		WebElement OpportunitiesTab = driver.findElement(By.cssSelector("#Opportunity_Tab > a:nth-child(1)"));
		clickElement(OpportunitiesTab,"Opportunities Tab");
		System.out.println("Clicked on Opportunities and dropdown is displayed");
		System.out.println("OpportunitiesPage is displayed:TestCase 15 Passed");
		WebElement New = driver.findElement(By.cssSelector(".pbButton > input:nth-child(1)"));
		clickElement(New,"New Button");
		System.out.println("Clicked on new Button");
		Thread.sleep(2000);
		WebElement OpportunityNameEle= driver.findElement(By.id("opp3"));
		enterText(OpportunityNameEle,"Golden","Opportunitity Name");
		WebElement AccountNameEle= driver.findElement(By.id("opp4"));
		enterText(AccountNameEle,"Ganga","Account Name");
        Thread.sleep(2000);
        //closedate
        WebElement ClickStage= driver.findElement(By.id("opp11"));
        clickElement(ClickStage,"Stage option");
        selectDropdownOption(ClickStage,"Qualification");
        Thread.sleep(2000);
        WebElement ProbabilityEle= driver.findElement(By.id("opp12"));
		enterText(ProbabilityEle,"5","Probability");
		Thread.sleep(2000);
        WebElement leadSource= driver.findElement(By.id("opp6"));
		clickElement(leadSource,"Priority");
		selectDropdownOption(leadSource,"Web");
		Thread.sleep(2000);
		WebElement PrimarycompaignEle= driver.findElement(By.id("opp17"));
		enterText(ProbabilityEle,"Internet","PrimarycompaignSource");
		Thread.sleep(2000);
		WebElement SaveButton= driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(1)"));
		clickElement(SaveButton,"save");
		Thread.sleep(2000);
        System.out.println("NewChanges are displayed:TestCase 16 Passed");
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        //WebElement OpportunitiesTab1 = driver.findElement(By.cssSelector("#Opportunity_Tab > a:nth-child(1)"));
		//clickElement(OpportunitiesTab1,"Opportunities Tab");
		WebElement OppPipeLineLink= driver.findElement(By.linkText("Opportunity Pipeline"));
		clickElement(OppPipeLineLink,"Pipelinelink");
		Thread.sleep(2000);
		System.out.println("ReportPage is displayed:TestCase 17 Passed");
		driver.switchTo().defaultContent();
        Thread.sleep(5000);
        //WebElement OpportunitiesTab2 = driver.findElement(By.cssSelector("#Opportunity_Tab > a:nth-child(1)"));
	    clickElement(OpportunitiesTab,"Opportunities Tab");
		WebElement StuckOppLink= driver.findElement(By.linkText("Stuck Opportunities"));
		clickElement(StuckOppLink,"StuckOpportunitieslink");
		Thread.sleep(2000);
		System.out.println("ReportPage is displayed:TestCase 18 Passed");
		driver.switchTo().defaultContent();
		
		WebElement IntervelLink= driver.findElement(By.id("quarter_q"));
		clickElement(IntervelLink,"Intervellink");
		Thread.sleep(2000);
		WebElement IncludeLink= driver.findElement(By.id("open"));
		clickElement(IncludeLink,"Includelink");
		Thread.sleep(2000);
		System.out.println("All the information is displayed:TestCase 19 Passed");
		quitBrowser();
		System.out.println("********Create Opportunities script ended***********");


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
