package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.CreateNewAccount;



public class VerifyCreateNewAcc
{
	private WebDriver driver;
	private POM.CreateNewAccount createNewAccount;
	
	@BeforeClass
	
	public void launchBrowser() {
		System.out.println("launchBrowser");
	    System.setProperty("webdriver.chrome.driver", "E:\\SOFT\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	@BeforeMethod 
	public void createaccNewPage() {
		System.out.println("createaccNewPage");
		driver.get("https://www.facebook.com");
		createNewAccount = new CreateNewAccount(driver);
			
	}
	
	@Test
	public void toVerifyNewaccpage() throws InterruptedException {
		
	  
		createNewAccount.clickoncreatenewacc();
		Thread.sleep(3000);
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
	public void toVerifySignup() {
		System.out.println("toVerifySignup");
		createNewAccount.clickonsignup();	
	}
	
	@AfterClass
	public void tocloseBrowser() {
		System.out.println("tocloseBrowser");
		driver.close();
	}
	

}
