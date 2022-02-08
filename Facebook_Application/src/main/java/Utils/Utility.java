package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{

	public static void saveScreenshot(WebDriver driver , int testID) throws IOException
	{	
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File test = new File("E:\\SS\\"+ "test "+testID+" " + timestamp + ".jpg");		//to take multiple screenshot use for loop and name of each file should b diffrnt
		FileHandler.copy(src, test);
		
//		Date currendate = new Date();
//		String screenshot = currendate.toString().replace(" ","-").replace(":","-");
//		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
//        File dest = new File("E:\\velocity\\Screenshot\\"+screenshot+testID+".jpg");	
//        FileHandler.copy(scr, dest); 	
	}

}
