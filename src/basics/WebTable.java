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
		
		int i =1;
		
		
		for(WebElement elementvalue :allelement)
		{
			String text = elementvalue.getText();
			
			System.out.print(text+" ");
			i++;
			
			if(i==5)
			{
				System.out.println();
				i = 1;
			}
			
		}
		
//		WAP to print the values inside the console as they appears over web
		
	}

}
