package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
//		Write a text inside the a text field and verify that we have written the correct word
		
		
		
		
		
		
		
		
	}
	
	
}
