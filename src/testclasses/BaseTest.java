package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;
import pages.SearchPage;

public class BaseTest {
	static WebDriver driver;
	LoginPage lp;
	
	SearchPage sp;
	
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
	}
	
	@BeforeClass
	public void createObject()
	{
		 lp = new LoginPage(driver);
		 sp = new SearchPage(driver);
	}
	
	
//	@AfterSuite
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
