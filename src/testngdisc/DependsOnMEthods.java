package testngdisc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMEthods {

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login test case");
		
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"login", "profile"})
	public void homepage()
	{
		System.out.println("home test case");
	}
	
	@Test(priority = 2)
	public void profile()
	{
		System.out.println("Profile test case");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout test case");
	}
}
