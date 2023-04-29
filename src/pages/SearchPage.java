package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchfield;
	
	
	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	WebElement searchbutton;
	
	
	@FindBy(xpath = "//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//h2//a")
	WebElement mobile;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchPhone()
	{
		searchfield.sendKeys("Mobile");
		searchbutton.click();
	}
	
	public void clickOnMobile()
	{
		mobile.click();
		
		String parentid = driver.getWindowHandle();
		
		driver.switchTo().window(parentid);
		
	}

}
