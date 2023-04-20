package testngdisc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnabledKeyword {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
		Assert.fail();
	}
	
	@Test(priority = 2, dependsOnMethods = {"login"})
	public void homepage()
	{
		System.out.println("home test case");
	}
	
	@Test(priority = 3, enabled = false)
	public void profile()
	{
		System.out.println("Profile test case");
	}

}
