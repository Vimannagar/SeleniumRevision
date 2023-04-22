package testngdisc;

import org.testng.annotations.Test;

public class DataTest {
	
	
	@Test(dataProvider = "testdata", dataProviderClass = testngdisc.DataProviderClass.class)
	public void getDataTest(String s1, String s2)
	{
		System.out.println("values are :"+s1+" "+s2);
	}

}
