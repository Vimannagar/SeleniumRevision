package testngdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClassExecution {
	

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
