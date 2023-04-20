package testngdisc;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	
	@Parameters("username")
	@Test
	public void testCase1(String uname)
	{
		System.out.println("The value is :"+uname);
	}
	

}
