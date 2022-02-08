package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookHeader
{
	private WebDriver driver;

	@FindBy (xpath ="(//span[@class='l9j0dhe7'])[1]")
	private WebElement home;
	
	@FindBy (xpath = "(//span[@class='l9j0dhe7'])[2]")
	private WebElement watch;
	
	@FindBy (xpath = "(//span[@class='l9j0dhe7'])[3]")
	private WebElement marketplace;
	
	@FindBy (xpath ="(//span[@class='l9j0dhe7'])[4]")
	private WebElement groups;
	
	
	public FacebookHeader (WebDriver driver)           // local 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void clickonhome()
	{
		home.click();
	}
	public void clickonwatch()
	{
		watch.click();
	}
	public void clickonmarketplace()
	{
		marketplace.click();
	}
	public void clickongroups()
	{
		groups.click();
	}
	
}
