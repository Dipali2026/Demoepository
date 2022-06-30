package Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listenrsdemo implements ITestListener	
{
	
	
	public  ExtentReports extent;
	public ExtentTest test;
	
	
	 public void onStart(ITestContext context) 
	 {
		 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
		 ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "//Reports//"+dateName+context.getName()+".html");
			reporter.config().setReportName("Automation Reports");
			reporter.config().setDocumentTitle("TestResult");
			 extent= new ExtentReports();
			
			extent.attachReporter(reporter);
			
			extent.setSystemInfo("Tester", "Dipali");
			 test=  extent.createTest(context.getName());
		  }
	
	 public void onTestStart(ITestResult result) 
	 {
		    System.out.println("Tets case started");
		    System.out.println(result.getTestName());
		    
		    System.out.println(result.getName());
			
			
		 
	 }
	 
	
	 public void onTestSuccess(ITestResult result) 
	 {
		 System.out.println("Tetscase  executed sucessfully");
		
		 
			
		 
	 }


	 public  void onTestSkipped(ITestResult result) 
	 {
		 System.out.println("Tets case completed");
		 
	 }
	 
	 public void onTestFailure(ITestResult result) 
	 {
		 System.out.println("***** Error "+result.getName()+" test has failed *****");
		 
	    	String methodName =result.getName().toString().trim();
	    	
	    	System.out.println(result.getThrowable());
	    	
	    	TakesScreenShot.capturescreenshot(methodName, LoginTest.driver);
	    	
	        String screenshotspsth=TakesScreenShot.capturescreenshot(methodName, LoginTest.driver) ;
	        
	           test.log(Status.FAIL, "Test case is failed at below location  "+result.getThrowable() +test.addScreenCaptureFromPath(screenshotspsth));
	    		   //test.addScreenCaptureFromPath(screenshotspsth));
	   
	   	 
	  	  //ts.capturescreenshot(methodName,LoginTest.driver);
	 }
	 
	 public void onFinish(ITestContext context)
	 {
		 LoginTest.driver.close();  
			extent.flush();
		  }
	 
}
	 
		
		 
