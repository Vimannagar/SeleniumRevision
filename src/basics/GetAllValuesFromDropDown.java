package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllValuesFromDropDown {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spotify.com/in-en/signup");
		
		List<WebElement> allmonths = driver.findElements(By.xpath("//*[@id='month']//option"));
		
		for(WebElement month :allmonths)
		{
			System.out.println(month.getText());
		}
	}

}
