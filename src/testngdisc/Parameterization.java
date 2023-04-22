package testngdisc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	
	@Parameters("username")
	@Test
	public void testCase1(String uname)
	{
		System.out.println("The value is :"+uname);
	}
	
	@Parameters("browser")
	@Test
	public void launchBrowser(String browsername)
	{
		WebDriver driver;
		if(browsername.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
	}
	

}
