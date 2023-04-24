package testngdisc;

import org.testng.annotations.Test;

public class GroupingOfTestCase {
	
	
	@Test(priority = 1, groups = "sanity")
	public void login()
	{
		System.out.println("Login test case");
	}
	
	@Test(priority = 2, groups = {"functional", "sanity"})
	public void home()
	{
		System.out.println("home test case");
	}
	
	@Test(priority = 3, groups = "regression")
	public void profile()
	{
		System.out.println("profile test case");
	}

	
	@Test(priority = 4, groups = "sanity")
	public void logout()
	{
		System.out.println("logout test case");
	}
}
