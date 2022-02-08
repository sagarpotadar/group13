package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
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

import POM.CreateNewAccount;
import Utils.Utility;
import base.Base;

public class VerifyCreateNewAcc2 extends Base
{
	private WebDriver driver;
	private POM.CreateNewAccount createNewAccount;
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
	public void pomClass() {
		System.out.println("pomClass");
		createNewAccount = new CreateNewAccount(driver);
		
	   }
	
	@BeforeMethod 
	public void createaccNewPage() {
		System.out.println("createaccNewPage");
		driver.get("https://www.facebook.com");	
	}
	
	@Test
	public void toVerifyNewaccpage() throws InterruptedException {
		
	  
		createNewAccount.clickoncreatenewacc();
		Thread.sleep(3000);
		testID = 101;
		createNewAccount.sendfirstname();
		createNewAccount.sendlastname();
		createNewAccount.sendmobilenumber();
		createNewAccount.sendpassword();
		createNewAccount.selectday();
		createNewAccount.selectmonth();
		createNewAccount.selectyear();
		createNewAccount.clickonname();			
	}
	
	@AfterMethod
	public void toVerifySignup() throws IOException {
		System.out.println("toVerifySignup");
//		ITestResult result = null;
//		if(ITestResult.FAILURE == result.getStatus())
//		{
			Utility.saveScreenshot(driver,testID);
//		}
		createNewAccount.clickonsignup();	
	}
	
	@AfterClass
	public void clearObject() {
		System.out.println("clearObject");
		createNewAccount = null;
		}
	
	@AfterTest
	public void closedBrowser() {
		System.out.println("closedBrowser");
		driver.close();
		driver = null;
		System.gc();			
	}	
}
