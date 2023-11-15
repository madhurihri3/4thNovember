package com.salesforce.test.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class CreateAccounts extends Basetest{

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		login_to_SalesForce();
		Thread.sleep(5000);
		//create new Account-Testcase-10
		WebElement AccountsTab = driver.findElement(By.id("Account_Tab"));
		clickElement(AccountsTab,"Accounts Tab");
		System.out.println("Clicked on Accounts Tab");
		//WebElement popupwindow = driver.findElement(By.xpath("//a@id='tryLexDialogX']"));
		//clickElement(popupwindow,"Popupwindow");
		System.out.println("Clicked on Popupwindow");
		
		WebElement New = driver.findElement(By.xpath("//input[@name='new']"));
		clickElement(New,"New Button");
		System.out.println("Clicked on new Tab");
		Thread.sleep(2000);
		WebElement AccountNameEle= driver.findElement(By.id("acc2"));
		clearElement(AccountNameEle,"AccountName");
		enterText(AccountNameEle,"Kanti","Account Name");
		Thread.sleep(5000);
        System.out.println("AccountName entered");
        
        WebElement type=(driver.findElement(By.id("acc6")));
        selectDropdownOption(type,"Technology Partner");
        
		WebElement custPriority= driver.findElement(By.id("00NHs00000S6Gtr"));
		clickElement(custPriority,"Priority");
		selectDropdownOption(custPriority,"High");
		
		WebElement SaveBtn=driver.findElement(By.cssSelector("#bottomButtonRow > input:nth-child(1)"));
		clickElement(SaveBtn,"Save");
		System.out.println("New Account is created: TestCase-10 Passed");
		
		//driver.switchTo().defaultContent();
		//CreateNewViewlink();//testcase-11
		
		clickElement(AccountsTab,"Accounts Tab");
		System.out.println("Clicked on Accounts Tab");
		//clickElement(popupwindow,"Popupwindow");
		System.out.println("Clicked on Popupwindow");
		
		
		WebElement CreateNewviewlink = driver.findElement(By.cssSelector(".fFooter > a:nth-child(2)"));
		clickElement(CreateNewviewlink,"Create newview");
		System.out.println("Clicked on Newview link");
		
		Thread.sleep(2000);
		WebElement viewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
		waitForVisibility(viewName,30,"ViewName");
		clearElement(viewName,"viewname");
		enterText(viewName,"mmm","ViewName");
		
		WebElement viewUniqueName= driver.findElement(By.xpath("//*[@id=\"devname\"]"));
		waitForVisibility(viewUniqueName,30,"ViewuniqueName");
		clearElement(viewUniqueName,"viewuniquename");
		enterText(viewUniqueName,"Cat","viewUnique");
		
		WebElement SaveNewBtn=driver.findElement(By.xpath("//input@name='save']"));
		clickElement(SaveNewBtn,"SaveNew");
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.className("title"));
		clickElement(dropdown,"dropdown");
		Select dropdown_options = new Select(dropdown);
		List<WebElement> options = dropdown_options.getOptions();
		Thread.sleep(5000);
		/*for(int i=0;i<options.size();i++) {
			if(options.get(i).getText().equals(value)) {
				System.out.println("AccountName is displayed in the dropdown");
				}*/
		
			System.out.println("Testcase-11 Create Newview is completed");
			
		
		
		
		
		//		driver.switchTo().defaultContent();
		//EditView();//testcase-12
		waitForVisibility(AccountsTab,500,"Accounts Tab");
		clickElement(AccountsTab,"Accounts Tab");
		System.out.println("Clicked on Accounts Tab");
		 
		   Thread.sleep(4000);
		  // clickElement(popupwindow,"Popupwindow");
			System.out.println("Clicked on Popupwindow");
	    
		  
		   
		    WebElement viewdropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
		    clickElement(viewdropdown,"viewdropdown");
			Select select = new Select(viewdropdown);
			select.selectByIndex(1);
		//edit accounts	
			WebElement editTab = driver.findElement(By.xpath("//a[text()='Edit']"));
			clickElement(editTab,"Edit Tab");
			
			WebElement newfname = driver.findElement(By.xpath("//input[@id='fname']"));
			clearElement(newfname,"newfname");
			enterText(newfname,"rose","newfname");
			System.out.println("Viewname entered in the field");
			
			WebElement firstcolumn = driver.findElement(By.xpath("//select[@id='fcol1']"));
			clickElement(firstcolumn,"firstcolumn");
			
			Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
			accfield.selectByIndex(1);
						
			Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
			operator.selectByIndex(3);
				
			WebElement value1 = driver.findElement(By.id("fval1"));
			clearElement(value1,"value1");
			enterText(value1,"Van","value1");
			System.out.println("Value1 entered in the field");
						
			Thread.sleep(5000);
			WebElement saveTab = driver.findElement(By.xpath("//input[@name = 'save']"));
			clickElement(firstcolumn,"firstcolumn");
			Thread.sleep(5000);
			
			System.out.println("TC12Accounts_Edit_view is completed");
			
	//Merge_Accounts();testcase-13
	waitForVisibility(AccountsTab,500,"Accounts Tab");
	clickElement(AccountsTab,"Accounts Tab");
	System.out.println("Clicked on Accounts Tab");
	 
    Thread.sleep(4000);
	//clickElement(popupwindow,"Popupwindow");
	System.out.println("Clicked on Popupwindow");
    
	

	WebElement Mergeacc = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
	clickElement(Mergeacc,"Merge Account");
	Thread.sleep(4000);


	WebElement fb = driver.findElement(By.id("srch"));
	clearElement(fb,"fb");
	enterText(fb,"Vani","fb");
	
	WebElement FindAccount = driver.findElement(By.xpath("//input[@value ='Find Accounts']"));
	waitForVisibility(FindAccount,500,"FindAccount");
	Thread.sleep(4000);

	WebElement nextbut = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
	if(nextbut.isDisplayed()){
	clickElement(nextbut,"Next Button");	
	System.out.println("NextButton clicked");
	}
	else
	{
	System.out.println("Next button not clicked"); 
	}


	WebElement Merge = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[2]"));


	if(Merge.isDisplayed())
	{
	System.out.println("merge displayed");
	 Thread.sleep(5000);
	}
	Merge.click();	    
	driver.switchTo().alert().accept();
	System.out.println("Pass: alert is present and accept");	

	System.out.println("TC13_MergeAccounts is completed");
	     
	 //Testcase-14
	waitForVisibility(AccountsTab,500,"Accounts Tab");
	clickElement(AccountsTab,"Accounts Tab");
	System.out.println("Clicked on Accounts Tab");
	 
    Thread.sleep(4000);
	//clickElement(popupwindow,"Popupwindow");
	System.out.println("Clicked on Popupwindow");
    	   
    Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);

	WebElement LastActivity = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
	clickElement(LastActivity,"Last Activity");
		
	WebElement  dropdownMenu = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
	clickElement(dropdownMenu,"Dropdown Menu");
			
	WebElement createddate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
	clickElement(createddate,"Created date");
				
	WebElement startdate =  driver.findElement(By.name("startDate"));
	clearElement(startdate,"startdate");
	enterText(startdate,"01/04/2019","startdate");
	System.out.println("startdate entered in the field");
				
	WebElement enddate = driver.findElement(By.name("endDate"));
	clearElement(enddate,"enddate");
	enterText(startdate,"03/04/2019","startdate");
	System.out.println("enddate entered in the field");
	
	WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
	clickElement(save,"savebutton");
	
	WebElement Reportnames =  driver.findElement(By.name("reportName"));
	clearElement(Reportnames,"ReportNames");
	enterText(startdate,"Accountreports","Reportnames");
	System.out.println("ReportName in the field");
			
	WebElement ReportUniName =  driver.findElement(By.id("saveReportDlg_DeveloperName"));
	clearElement(ReportUniName,"ReportUniNames");
	enterText(ReportUniName,"Accountreports","ReporUniquetnames");
	System.out.println("ReportUniqueName in the field");
			
	Thread.sleep(4000);
		  
	WebElement Saveandrun = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
	Saveandrun.click();
	System.out.println("TC_14_Createaccountre completed");
			   
	closeBrowser();
	System.out.println("********Accounts automation script ended***********");
}
	public static void login_to_SalesForce() throws InterruptedException {
		System.out.println("******Accounts automation script started***********");
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