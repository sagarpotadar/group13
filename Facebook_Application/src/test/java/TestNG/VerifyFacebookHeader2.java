package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import POM.FacebookHeader;
import POM.LoginPage;
import POM.Logout;
import Utils.Utility;
import base.Base;

public class VerifyFacebookHeader2 extends Base
{
	private WebDriver driver;
	private FacebookHeader facebookHeader;
	private LoginPage loginPage;
	private Logout logout;
	private int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		System.out.println("launchBrowser");
		if(browser.equals("chrome")){
			driver = openChromeBrowser();
		}
		if(browser.equals("firefox")){
			driver = openFirefoxBrowser();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	@BeforeClass
	public void pomclass() {
		System.out.println("pomclass");
	    loginPage = new LoginPage(driver);
	    facebookHeader = new FacebookHeader(driver);	
	    logout = new Logout(driver);    
		
	}
	
	@BeforeMethod 
	public void loginFacebook() {
		System.out.println("loginFacebook");
		driver.get("https://www.facebook.com");
		
		loginPage.sendmobno();
		loginPage.sendpassword();
		loginPage.clickonloginbutton();
	    	
	}
	
	
	@Test(enabled = false)
	public void toVerifyWatch() {
		testID = 101;
		System.out.println("toVerifyWatch");
		facebookHeader.clickonwatch();
//		String url =  driver.getCurrentUrl();
//		System.out.println("url");
//		Assert.assertEquals(url, "https://www.facebook.com/watch/?ref=tab");
//		
//		String title =driver.getTitle();
//		SoftAssert softAssert = new SoftAssert();
		
		
	}
	
	@Test
	public void toVerifyMarketplace() {
		testID = 1002;
		
	System.out.println("toVerifyMarketplace");
	facebookHeader.clickonmarketplace();
		
	}
	
	@Test
	public void toVerifyGroups() {
		testID = 1003;
		System.out.println("toVerifyGroups");
		facebookHeader.clickongroups();
	}
	
	@AfterMethod
	public void logoutFacebook() throws IOException {
		
	    Utility.saveScreenshot(driver,testID);
		
        logout.ClickAccount();
        logout.ClickLogout();
	    System.out.println("logoutFacebook");
			
	}
	
	@AfterClass
	public void clearObject() throws IOException  {
		System.out.println("clearObject");
		Utility.saveScreenshot(driver,testID);
		loginPage = null;
		facebookHeader = null;
		logout = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("closedBrowser");
		driver.close();
		driver = null;	
		System.gc();
	}
}
