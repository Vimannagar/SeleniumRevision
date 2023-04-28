package testngdisc;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNG {
//	Assert is also called as HardAssert
//	SoftAssert is also called as Verify
	
	
	
	@Test
	public void testCase1()
	{
		String actual = "Hello";
		
		String expected  = "hello";
		
	Assert.assertEquals(actual, expected);
	
	Assert.assertTrue(false);
	
	Assert.assertFalse(false);
	
	System.out.println("After assertion statement");
	}
	
	
	@Test
	public void softAssertionTest()
	{
		String actual = "Hello";
		
		String expected  = "hello";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actual, expected);
		
		System.out.println("After assertion statement");
		
		sa.assertAll();
	}
	

}
