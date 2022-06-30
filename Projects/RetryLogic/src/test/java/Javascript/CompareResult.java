package Javascript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareResult 
{
@Test
	
	public void scroll() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\New folder\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
    JavascriptExecutor js =(JavascriptExecutor) driver;
    
    js.executeScript("window.scrollBy(0,700)");
    
    Thread.sleep(1000);
    
    js.executeScript( "document.querySelector('.tableFixHead').scrollTop=400 ");
    
    List<WebElement> allvalues = driver.findElements(By.xpath("//div[@class='tableFixHead']//tr//td[4]"));
     
    int sum= 0;

    for(int i=0;i< allvalues.size();i++)
    {
    	System.out.println(allvalues.get(i).getText());
    	
    	
    	  sum= sum + Integer.parseInt(allvalues.get(i).getText());
    	  
     }
    System.out.println(" sum is " + sum);
    
      // String str=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
       
      //  String cnt= str.split(":")[1].trim();
            //  System.out.println(cnt);
              
      int total= Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	
          //int total =99;
       Assert.assertEquals(sum, total);
       
	}

}
