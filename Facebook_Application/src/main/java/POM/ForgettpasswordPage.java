package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgettpasswordPage
{
	private WebDriver driver;
	
	@FindBy (xpath ="//input[@type='text']")
	private WebElement email;
	
	@FindBy (xpath ="//input[@type='password']")
	private WebElement password;

	@FindBy (xpath ="//button[@name='login']")
	private WebElement button;

	@FindBy (xpath ="//a[text()='Forgotten password?']")
	private WebElement password1;

	@FindBy (xpath ="//input[@aria-label='Email address or mobile number']")
	private WebElement mobile;

	public ForgettpasswordPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}

	public void sendemail()
	{
		email.sendKeys("velocity");	
	}
	public void sendpassword()
	{
		password.sendKeys("123456");	
	}
	public void clickonbutton()
	{
		button.click();
	}
	public void clickonpassword1()
	{
		password1.click();
	}
	public void sendmobile()
	{
		mobile.sendKeys("123456");
	}	
}
