package Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenShot 
{
	 
		 
	public static String  capturescreenshot( String methodName ,WebDriver driver)
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		File  scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String filepath= System.getProperty("user.dir")+"//Screenshots//"+methodName + dateName+ ".png";
	  	try
		  //The below method will save the screen shot in d drive with test method name try 
		  {
	  FileUtils.copyFile(scrFile, new File(filepath));
	 
	  } 
		  catch (IOException e) 
	  {
	  e.printStackTrace();
	  }
		return filepath;
		
	  
	 
	  }
  
		
	}


