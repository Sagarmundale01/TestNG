package webpage.ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {

	Boolean datasetup = false;
	
	@Test(enabled = false)
	public void skipTest1()
	{
		System.out.println("skipping this test");
	}
	
	@Test
	public void skipTest2()
	{
		System.out.println("skipping this test forcefully");
		throw new SkipException("skeeping this test");
		
	}
	
	@Test
	public void skipTest3()
	{
		System.out.println("skipping this test based on condition");
		if(datasetup == true)
		{
			System.out.println("Execute the test");
		}
		else
		{
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
			
		}
		
	}


}
