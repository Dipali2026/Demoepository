package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampletest 
{
	
	@Test
	public void Myfirsttest()
	{
		System.out.println("Executing my first test");
		Assert.assertEquals(true, true);
	}
	
	
	@Test
	public void Mysecondtest()
	{
		System.out.println("Executing my second test");
		Assert.assertEquals(true,false);
	}


}
