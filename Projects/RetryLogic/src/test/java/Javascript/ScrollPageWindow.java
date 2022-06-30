package Javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPageWindow 
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
    
	}
}
