package testngdisc;

import org.testng.annotations.Test;

public class Keywords {
	
	
	
	
//	priority keyword:
	
	
	@Test(priority = 1)
	public void testcase1()
	{
		System.out.println("testcase 1");
	}
	
	
	@Test(priority = 2)
	public void testcase2()
	{
		System.out.println("testcase 2");
	}
	
	

	@Test
	public void testcase3()
	{
		System.out.println("testcase 3");
	}
	
	
	@Test
	public void testcase4()
	{
		System.out.println("testcase 4");
	}
	
	
	
	

}
