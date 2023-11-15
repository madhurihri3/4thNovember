package com.salesforce.test.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.salesforce.tests.Base.Basetest;

public class Usermenudropdown extends Basetest {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		System.out.println("********UserMenu automation script Started***********");
		login_to_SalesForce();
		Thread.sleep(5000);
    	WebElement menubutton = driver.findElement(By.cssSelector("#userNavLabel"));
    	Basetest base = new Basetest();
        base.performActionOnElement(driver, menubutton, "UserMenu button displayed");
        Thread.sleep(5000);
        clickElement(menubutton,"menu button");
        System.out.println("Test Case Passed-Dropdown Menu is displayed");
        
        WebElement profile = driver.findElement(By.linkText("My Profile"));
		waitForVisibility(profile,50,"My Profile");
		//Thread.sleep(5000);
        WebElement clickMyProfile= driver.findElement(By.cssSelector("#userNav-menuItems > a:nth-child(1)"));
        clickElement(clickMyProfile,"Profile button");
        System.out.println("My Profile Page is displayed");
        WebElement editButton= driver.findElement(By.cssSelector(".contactInfoLaunch > img:nth-child(1)"));
        waitForVisibility(editButton,50,"edit button");
        clickElement(editButton,"Edit button");
        Thread.sleep(2000);
        System.out.println("My Profile Page is displayed");
        driver.switchTo().frame("contactInfoContentId");
        WebElement aboutTab= driver.findElement(By.cssSelector("#aboutTab > a:nth-child(1)"));
        waitForVisibility(aboutTab,50,"About Tab");
        clickElement(aboutTab,"About Tab");
        WebElement lastName= driver.findElement(By.id("lastName"));
        enterText(lastName,"MNM","lastname");
        WebElement saveButton= driver.findElement(By.cssSelector("input.zen-btn:nth-child(1)"));
        waitForVisibility(saveButton,50,"save button");
        clickElement(saveButton,"save button");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement title= driver.findElement(By.xpath("//*[@id=\"tailBreadcrumbNode\"]"));
        String originalString=title.getText();
        String updatedString=originalString.replaceAll("\\s+$","");
        //Assert.assertEquals(login,updatedString);
        WebElement postButton= driver.findElement(By.cssSelector("#publisherAttachTextPost > span:nth-child(2)"));
        waitForVisibility(postButton,50,"post button");
        clickElement(postButton,"post button");
        Thread.sleep(3000);
       
        WebElement postframe= driver.findElement(By.cssSelector(".cke_wysiwyg_frame"));
        driver.switchTo().frame(postframe);
        WebElement textArea= driver.findElement(By.cssSelector("body"));
        Thread.sleep(3000);
        waitForVisibility(textArea,130,"Text Area");
        clickElement(textArea,"Text Area");
        textArea.sendKeys("I am entering some Text in Post Area");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement shareButton= driver.findElement(By.cssSelector("#publishersharebutton"));
        clickElement(shareButton,"Share Button");
        WebElement textEnter= driver.findElement(By.cssSelector("body"));
        Thread.sleep(2000);
        WebElement File = driver.findElement(By.cssSelector("#publisherAttachContentPost > span:nth-child(2)"));
        clickElement(File,"file");
        Thread.sleep(2000);
        WebElement Fileframe=driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/iframe"));
        driver.switchTo().frame(Fileframe);
        WebElement uploadFile = driver.findElement(By.cssSelector("#chatterUploadFileAction"));
        clickElement(uploadFile,"Upload file");
        //Navigatetopreviouspage
        //chooseFileToUpload(driver, "");

        uploadFile.sendKeys("C:\\Users\\cvnpr\\OneDrive\\Desktop\\Example.txt");
        Thread.sleep(5000);
       // WebElement uploadPicEle = driver.findElement(By.id("photoSection"));
       //	Basetest base1 = new Basetest();
        //base1.performActionOnElement(driver, uploadPicEle, "Upload pic link displayed");
       // Thread.sleep(5000);
    	//action.moveToElement(uploadPicEle).build().perform();
       //	WebElement updatePicEle = driver.findElement(By.id("uploadLink"));
    	//clickElement(updatePicEle,"update pic");
    	
    	Thread.sleep(2000);
    	
    	WebElement uploadProfilePhotoFrameEle = driver.findElement(By.xpath("//*[@id=\"uploadP"));
    	driver.switchTo().frame(uploadProfilePhotoFrameEle);
    	
    	Thread.sleep(2000);
    	//WebElement uploadPicLinkEle = driver.findElement(By.id("//*[@id=\"uploadP"));
    	WebElement uploadPicLinkEle = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
    	uploadPicLinkEle.sendKeys("C:\\Users\\cvnpr\\OneDrive\\Pictures\\Camera Roll\\20220715_215959.jpg");
    	
    	Thread.sleep(2000);
    	WebElement saveButtonEle1 = driver.findElement(By.id("j_id0:uploadFileForm:save"));
    	clickElement(saveButtonEle1,"upload File");
    	System.out.println("Profile Picture Updated");
    	driver.switchTo().defaultContent();
    	WebElement postLinkEle = driver.findElement(By.id("publisherAttachTextPost"));
    	clickElement(postLinkEle,"Post Link");
    	Thread.sleep(2000);
    	//WebElement postLinkFrameEle = driver.findElement());;
    	
        WebElement postLinkFrameEle = driver.findElement(By.xpath("/[@id=\"cke_43_contents\"]/iframe"));
    	waitForVisibility(postLinkFrameEle,5,2,"postlink Frame");
        switchToFrame(driver,postLinkFrameEle,"Post Link Frame");
    	WebElement postLinkTextEle = driver.findElement(By.cssSelector("body"));
    	clickElement(postLinkEle,"Post Link Text");
    	postLinkTextEle.sendKeys("How are you all");
    	
    	driver.switchTo().defaultContent();
    	
    	WebElement shareButtonEle = driver.findElement(By.name("publishersharebutton"));
    	clickElement(shareButtonEle,"Share Button");
    	
        //my settings
        Thread.sleep(5000);
        WebElement clickSettings= driver.findElement(By.cssSelector("#userNav-menuItems > a:nth-child(2)"));
        clickElement(clickSettings,"My Settings");
        System.out.println("My Settings Window is opened ");
        Thread.sleep(5000);

        WebElement clickPersonal= driver.findElement(By.cssSelector("#PersonalInfo_font"));
        clickElement(clickPersonal,"Personal");
        System.out.println("Personal link is clicked ");
        Thread.sleep(5000);
        WebElement clickLoginHistory= driver.findElement(By.id("LoginHistory_font"));
        clickElement(clickLoginHistory,"Personal");
        System.out.println("LoginHistory link is clicked ");
        Thread.sleep(5000);
        WebElement clickDownloadLoginHistory= driver.findElement(By.cssSelector(".pShowMore > a:nth-child(1)"));
        clickElement(clickDownloadLoginHistory,"Download");
        System.out.println("LoginHistory is downloaded-in .csv format"
        		+ "");
        
        WebElement clickDisplayLayout= driver.findElement(By.id("DisplayAndLayout_font"));
        //String dropdownChat
        clickElement(clickDisplayLayout,"DisplayAndLayout");
        System.out.println("Display and Layout link is clicked ");
        Thread.sleep(5000);
        WebElement clickEmail= driver.findElement(By.id("EmailSetup_font"));
        clickElement(clickEmail,"Email");
        System.out.println("Email link is clicked ");
        Thread.sleep(5000);
        WebElement clickMyEmailsettings= driver.findElement(By.id("EmailSettings_font"));
        clickElement(clickMyEmailsettings,"Email");
        System.out.println("MyEmailsettings link is clicked ");
        Thread.sleep(5000);
        WebElement clickCalenderReminders= driver.findElement(By.id("CalendarAndReminders_font"));
        clickElement(clickCalenderReminders,"Calender&Reminders");
        System.out.println("Calender and Reminders link is clicked ");
        Thread.sleep(5000);
        WebElement clickDevelop= driver.findElement(By.cssSelector("#userNav-menuItems > a:nth-child(3)"));
        clickElement(clickDevelop,"Developers console");
        System.out.println("Developers Console window is opened ");
        //getdriver.currentWindow
        Thread.sleep(5000);
        closeBrowser();
        Thread.sleep(5000);
        WebElement clickLogout= driver.findElement(By.cssSelector("#userNav-menuItems > a:nth-child(5)"));
        clickElement(clickLogout,"Logout Button");
        System.out.println("Test Case Passed:Logged out from Usermenu");
        closeBrowser();
		System.out.println("********UserMenu automation script ended***********");

	}
	//Login to SalesForce
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
    
   
   
  
    