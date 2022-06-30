package HandleDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static void main(String[] args) 
	{
		//https://rahulshettyacademy.com/AutomationPractice/
			
			
			WebDriverManager.chromedriver().setup();
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://vacations.spicejet.com/");
		  
		  driver.findElement(By.id("txtHotelCity")).sendKeys("Sateri Nagar Colony, Goa");
		  
		    driver.findElement(By.xpath("//input[@id='from']")).click();
		     

	}

}
