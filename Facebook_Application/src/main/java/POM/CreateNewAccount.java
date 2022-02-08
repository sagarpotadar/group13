package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount
{
	private WebDriver driver ;
	
	@FindBy (xpath = "//a[text()='Create New Account']" )
	private WebElement createnewacc;
	
	@FindBy (xpath = "//input[@name='firstname']" )
	private WebElement firstname;
	
	@FindBy (xpath = "//input[@name='lastname']" )
	private WebElement lastname;
	
	@FindBy (xpath = "//input[@aria-label='Mobile number or email address']" )
	private WebElement mobilenumber;
	
	@FindBy (xpath = "//input[@data-type='password']" )
	private WebElement password;
	
	@FindBy (xpath = "//select[@title='Day']" )
	private WebElement day;
	
	@FindBy (xpath = "//select[@id='month']" ) 
	private WebElement month;
	
	@FindBy (xpath = "//select[@title='Year']")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@name='sex'])[2]")
	private WebElement name;
	
	@FindBy (xpath = "(//button[text()='Sign Up'])[1]" )
	private WebElement signup; 
	
	public CreateNewAccount (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void clickoncreatenewacc()
	{
		createnewacc.click();
	}
	
	public void sendfirstname()
	{
		firstname.sendKeys("sagar");
	}
	public void sendlastname()
	{
		lastname.sendKeys("Potadar");
	}
	
	public void sendmobilenumber()
	{
		mobilenumber.sendKeys("9822380794");
	}
	
	public void sendpassword()
	{
		password.sendKeys("s1234567s");
	}
	
     public void selectday()
     {
    	 Select s = new Select (day);
         s.selectByIndex(20);
     }
     
     public void selectmonth()
     {
    	 Select m = new Select(month);
 		 m.selectByIndex(4);  
     }
     
     public void selectyear()
     {
    	 Select y = new Select(year);
 	     y.selectByValue("1993");  
     }
     
     public void clickonname()
     {
    	 name.click();
     }
	
	public void clickonsignup()
	{
		signup.click();
	}
	
}
