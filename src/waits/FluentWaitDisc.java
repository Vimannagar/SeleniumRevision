package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentWaitDisc {
	
	
	@Test
	public void fluentWaitTest()
	{
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.pollingEvery(Duration.ofSeconds(1))
									.withTimeout(Duration.ofSeconds(180))
									.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a-link-normal']//img[@alt='Summer Garden Days']")));
				
		WebElement image = driver.findElement(By.xpath("//*[@class='a-link-normal']//img[@alt='Summer Garden Days']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", image);
	}
	

}
