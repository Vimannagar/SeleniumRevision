package testngdisc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestCaseExecution {
	
	
	@Test
	public void searchFlight(){
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		WebElement searchbutton= driver.findElement(By.xpath("//*[text()='Search']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", searchbutton);
		
		
		
	}
	
	
	@Test
	public void getDetails()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String text= driver.findElement(By.xpath("//*[text()='Create a new account']")).getText();
		
		System.out.println(text);
	}
			
	
	

}
