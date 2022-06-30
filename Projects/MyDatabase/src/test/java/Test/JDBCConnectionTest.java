package Test;

import java.sql.SQLException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.JDBCUtility;
import Pages.User;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JDBCConnectionTest 
{
	public static void main(String[] args) throws SQLException, Exception
	{
		String query= "select * from login where EmpId=10001" ;
		String Username="root" ;
		
		String password= "admin@123";
		
		String dburl="jdbc:mysql://localhost:3306/qadb";
	     
		JDBCUtility.getdata(dburl, Username, password );
		
		User user = JDBCUtility.getUserCredentials(query);
		
		System.out.println(user);
		
		//Map temp = JDBCUtility.getUserCredentialsMap();
	//	System.out.println(temp.get("username") +"  "+temp.get("password"));
		
		
	       // String UN= (String) temp.get("username");
	        
	      //  String pwd=(String) temp.get("password");
		
		
		  WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://github.com/");
		  
		  driver.findElement(By.xpath("//div[@class='position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a")).click();
		  
		  Thread.sleep(1000);
		  
		 driver.findElement(By.id("login_field")).sendKeys(user.getUseName());
		 
		 driver.findElement(By.id("password")).sendKeys(user.getPassword());
		 
		 driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']")).click();
		  

		 
	}
}
