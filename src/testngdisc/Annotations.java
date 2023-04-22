package testngdisc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void abeforeMethod()
	{
		System.out.println("ABefore method");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	@Test
	public void testCase1()
	{
		System.out.println("Test case1");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class annotation");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class annotation");
	}

	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test annotation");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test annotation");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
