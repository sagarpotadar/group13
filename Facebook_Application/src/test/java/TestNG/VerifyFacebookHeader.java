package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import POM.FacebookHeader;
import POM.LoginPage;
import POM.Logout;
import base.Base;


public class VerifyFacebookHeader 
{
	private WebDriver driver;
	private FacebookHeader facebookHeader;
	private LoginPage loginPage;
	private Logout logout;
	
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launchBrowser");
	    System.setProperty("webdriver.chrome.driver", "E:\\SOFT\\chromedriver.exe");	
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@BeforeMethod 
	public void loginFacebook() {
		System.out.println("loginFacebook");
		driver.get("https://www.facebook.com");
		
        loginPage = new LoginPage(driver);
		
		loginPage.sendmobno();
		loginPage.sendpassword();
		loginPage.clickonloginbutton();
		
	    facebookHeader = new FacebookHeader(driver);	
	}
	
	
	@Test(enabled = false)
	public void toVerifyWatch() {
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
	System.out.println("toVerifyMarketplace");
	facebookHeader.clickonmarketplace();
		
	}
	
	@Test
	public void toVerifyGroups() {
		System.out.println("toVerifyGroups");
		facebookHeader.clickongroups();
	}
	
	@AfterMethod
	public void logoutFacebook() throws InterruptedException {
    logout = new Logout(driver);
   
    logout.ClickAccount();
    Thread.sleep(5000);
    logout.ClickLogout();
	System.out.println("logoutFacebook");
			
	}
	
	@AfterClass
	public void closedBrowser() throws InterruptedException {
		System.out.println("closedBrowser");
		Thread.sleep(3000);
		driver.quit();
				
	}
}
