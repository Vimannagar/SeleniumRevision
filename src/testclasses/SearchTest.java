package testclasses;

import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void searchValidation()
	{
		sp.searchPhone();
		sp.clickOnMobile();
	}

}
