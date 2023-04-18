package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromTextField {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("Text to be verified");
		
		String text = firstname.getAttribute("value");
		
		boolean isequal = text.equals("Text to be verified");
		
		System.out.println(isequal);
		
	}

}
