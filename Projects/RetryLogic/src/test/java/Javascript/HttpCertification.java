package Javascript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HttpCertification 
{
	@Test
	public void handlehttpcertification()
	{
		ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\New folder\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver(options);
    
    driver.manage().window().maximize();
    
    driver.get("https://expired.badssl.com");
	}
    

}
