package RetryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer
{
	// initialize the counter
	
	int counter =0;
	
	int retrylimit=3;

	public boolean retry(ITestResult result) 
	{
		//this the code for retry logic
		if(counter<retrylimit)
		{
			counter++;
			return true;
			
		}
		
		return false;
	}

}
