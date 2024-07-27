package webpage.ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginpage {

	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login");
	}
	
	@AfterTest
	public void logoutfromApplication()
	{
		System.out.println("Logout");
	}
	
	@Test(priority = 1, description="Test1")
	public void aloginTest() 
	{
    	System.out.println("Test1");
			
	}
	
	@Test(priority = 2, description = "Test2")
	public void blogoutTest()
	{
		System.out.println("Test2");
	}
	
	
		
	

}
