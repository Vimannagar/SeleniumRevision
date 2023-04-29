package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 3)
	public void loginToApp() {
			
		lp.hoverOnSignin();
		lp.enterUserName();
		lp.enterPassword();
	}
	
	@Test(priority = 2)
	public void validateTitle()
	{
		String title = lp.titleOfPage();
		
	boolean ispresent = title.contains("Shopping");
	
	Assert.assertEquals(ispresent, true);
	
	
	}
	
	
	

}
