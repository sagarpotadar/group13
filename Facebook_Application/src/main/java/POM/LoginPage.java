package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	private WebDriver driver ;                    // global
	
	@FindBy (xpath ="//input[@type='text']")
	private WebElement mobno;
	
	@FindBy (xpath ="//input[@type='password']") 	
	private WebElement password;
	
	@FindBy (xpath ="//button[@name='login']")
	private WebElement loginbutton;
	
	
	
	public LoginPage (WebDriver driver)           // local 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	//Actions on wWebElement 
	
	
//	public void acceptthealert()                 // alert popup
//	{
//		Alert alt = driver.switchTo().alert();
//		alt.accept();  
//		alt.dismiss();
//	}
	
	public void sendmobno()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);     //Explicit wait
		wait.until(ExpectedConditions.visibilityOf(mobno));
		if(mobno.isDisplayed()) 
		{
			mobno.sendKeys("9822380794");
		}
	}
	
	public void sendpassword()
	{
		if(password.isDisplayed()) 
		{
			password.sendKeys("sagar#215");
		}
	}
	
	public void clickonloginbutton()
	{
		if(loginbutton.isDisplayed())
		{
			loginbutton.click();
		}
	}
	

}
