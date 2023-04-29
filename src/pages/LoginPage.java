package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	By hoverElement = By.xpath("//*[@id='nav-link-accountList']");
	
	@FindBy(xpath ="(//*[@id='nav-flyout-ya-signin']//a)[1]")
	WebElement signinbutton;
		
	@FindBy(xpath ="//*[@id='ap_email']")
	WebElement emailfield;
		
	@FindBy(xpath ="//input[@id='continue']")
	WebElement continuebutton;
		
	@FindBy(xpath ="//*[@id='ap_password']")
	WebElement passwordfield;
		
	@FindBy(xpath ="//*[@id='signInSubmit']")
	WebElement finalsignin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void hoverOnSignin()
	{
		Actions act = new Actions(driver);
		
		WebElement hover = driver.findElement(hoverElement);
		
		act.moveToElement(hover).perform();
		
		signinbutton.click();
		
	}
	
	public void enterUserName() {
		
		emailfield.sendKeys("8176867662");
		
		continuebutton.click();
		
	}
	
	public void enterPassword()
	{
		passwordfield.sendKeys("123456");
		
		finalsignin.click();
	}
	
	public String titleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
	}

}
