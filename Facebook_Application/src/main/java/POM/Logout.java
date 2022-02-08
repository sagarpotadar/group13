package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{  
	@FindBy(xpath = "//div[@aria-label='Account']")private WebElement Account;
	@FindBy(xpath = "//span[contains(text(),'Log Out')]")private WebElement LogOut;
	
	public Logout(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void ClickAccount() {
		Account.click();
	}
	
	public void ClickLogout() {
		LogOut.click();
	}
	
}
