package extentreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationexteport 
{
	ExtentReports extent;
	
	@BeforeTest
	public void reports()
	
	{
		//System.getProperty("user.dir")//reprts//homepage.html
		ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "//Reports//homepage.html");
		reporter.config().setReportName("Automation Reports");
		reporter.config().setDocumentTitle("TestResult");
		 extent= new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Dipali");
		
		
	}
	
	
	
	@Test
	public void Homepage()
	{
		ExtentTest test=  extent.createTest("HomePage");
		 
		WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://rahulshettyacademy.com");
		  
		  
		  System.out.println(driver.getTitle());
		  
		  test.fail("Result naot match");
		  
		  extent.flush();
	}

}
