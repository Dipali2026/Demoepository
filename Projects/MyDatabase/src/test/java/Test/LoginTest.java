package Test;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.JDBCUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	@Test
	public void logintogithub() throws Exception
	{
		String query= "select Userame, Password from login" ;
		String Username="root" ;
		
		String password= "admin@123";
		
		String dburl="jdbc:mysql://localhost:3306/qadb";
	     
		JDBCUtility.getdata(dburl, Username, password );
		
		//JDBCUtility.getUsersCredentials(query);
		
		//System.out.println(JDBCUtility.getUsersCredentials(query));
		
		int count= JDBCUtility.getUsersCredentials(query).size();
		try
		{
		for(int i=0;i<count;i++)
		{
			String UN= JDBCUtility.getUsersCredentials(query).get(i).getUseName();
			//System.out.println(UN);
			
			String PWD =JDBCUtility.getUsersCredentials(query).get(i).getPassword();
			//System.out.println(PWD);
			

			  WebDriverManager.chromedriver().setup();
			  
			  WebDriver driver = new ChromeDriver();
			  
			  driver.manage().window().maximize();
			  
			  driver.get("https://github.com/");
			  
			  driver.findElement(By.xpath("//div[@class='position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a")).click();
			  
			  Thread.sleep(1000);
			  
			 driver.findElement(By.id("login_field")).sendKeys(UN);
			 
			 driver.findElement(By.id("password")).sendKeys(PWD);
			 
			 driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']")).click();
			 
			 String exepagetitle="GitHub";
			 
			 Assert.assertEquals(driver.getTitle(), exepagetitle);
			 
			 System.out.println("Suceccfully login");
		}
		}
    catch(Exception e)
		{
    	      
    	
    	    System.out.println(e.getMessage());
		}
}
}