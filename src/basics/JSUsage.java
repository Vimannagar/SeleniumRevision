package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSUsage {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spotify.com/in-en/signup");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement maleradio = driver.findElement(By.xpath("//*[@id='gender_option_male']"));
		
		js.executeScript("arguments[0].click();", maleradio);
		
		
	}
	
}
