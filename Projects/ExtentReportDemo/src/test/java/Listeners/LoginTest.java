package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	public static  WebDriver driver;
	
	
	
	
	
	@Test
	public void Samplelogintest() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	  
	   driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://github.com/");
	  
	  driver.findElement(By.xpath("//div[@class='position-relative mr-3 mb-4 mb-lg-0 d-inline-block']//a")).click();
	  
	  Thread.sleep(1000);
	  
	 driver.findElement(By.id("login_field")).sendKeys("bhamare.dipali9@gmail.com");
	 
	 driver.findElement(By.id("password")).sendKeys("Anvika@2026");
	 
	 driver.findElement(By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']")).click();
	 
	 String exepagetitle="GitHub";
	 
	 Assert.assertEquals(driver.getTitle(), exepagetitle);
	 
	 System.out.println("Suceccfully login");
	 
	 }
	
	
	
}
