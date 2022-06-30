package Analyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest
{
//	@Test (retryAnalyzer=RetryLogic.Retry.class)
	@Test
	public void firstTest()
	{
		 Assert.assertEquals(true, false);
	}
	
    
	//@Test (retryAnalyzer=RetryLogic.Retry.class)
	@Test
	public void SecondTest()
	{
		 Assert.assertEquals(true, false);
	}
	
	@Test
	public void TirdTest()
	{
		 Assert.assertEquals(true,true);
	}
	

}
