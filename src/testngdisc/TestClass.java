package testngdisc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	static WebDriver driver;
	@Test
	public void searchFlight(){
	
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		WebElement searchbutton= driver.findElement(By.xpath("//*[text()='Search123']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", searchbutton);
		
		
		
	}
	
	
	

}
