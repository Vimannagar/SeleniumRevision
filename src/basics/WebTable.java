package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr"));
		
		int rowcount = rows.size();
		
		System.out.println(rowcount);
		
		List<WebElement> allelement = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
		
		
		for(WebElement elementvalue :allelement)
		{
			String text = elementvalue.getText();
			
			System.out.print(text);
		}
		
//		WAP to print the values inside the console as they appears over web
		
	}

}
