package webpage.ui;

import org.testng.annotations.Test;

@Test(groups = "user_regresssion")
public class GroupsDemoTest {
	
	@Test (priority = 1, groups = "Regression")
	public void aTest1()
	{
		System.out.println("Test1");
	} 
	
	
	@Test(priority = 2, groups ={"Regression", "bvt"} )
	public void bTest2() 
	{
	  System.out.println("Test2");
			
	}
	
	
	@Test(priority = 3, groups = {"Regression","bvt"})
	public void cTest3() 
	{
	  System.out.println("Test3");
			
	}
	
	@Test(priority = 4, groups = "bvt")
	public void dTest4() 
	{
	  System.out.println("Test4");
			
	}
	
	
	
	
	

}
