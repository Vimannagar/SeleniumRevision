package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestions {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("Shi");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='ui-menu-item']//a")));
		
		List<WebElement> cityname = driver.findElements(By.xpath("//*[@class='ui-menu-item']//a"));
		
		
		for(WebElement city :cityname)
		{
			String value = city.getText();
			
			System.out.println(value);
		}
		
		
		
		
	}

}
