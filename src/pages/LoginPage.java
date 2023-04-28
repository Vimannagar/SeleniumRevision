package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	By hoverElement = By.xpath("//*[@id='nav-link-accountList']");
	
	@FindBy(xpath ="(//*[@id='nav-flyout-ya-signin']//a)[1]")
	WebElement signinbutton;
	
	
	@FindBy(xpath ="//*[@id='ap_email']")
	WebElement emailfield;
	
	
	
	@FindBy(xpath ="//input[@id='continue']")
	WebElement continuebutton;
	
	public void hoverOnSignin()
	{
		driver.findElement(hoverElement);
	}

}
