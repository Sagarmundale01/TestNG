package webpage.ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login To Application");
	}
	
	@AfterTest
	public void logoutFromApplicaton()
	{
		System.out.println("Logout From Application");
	}
	
	@BeforeMethod
	public void connectedToDB()
	{
		System.out.println("connected to DB");
	}
	
	@AfterMethod 
	public void disconnectedFromDB()
	{
		System.out.println("Disconnected from DB");
	}
	
	
	@Test(priority = 1,description = "Test1")
	public void aloginTest() {
			   
		System.out.println("Login  is successful");
			
	}
	
	@Test (priority = 2, description = "Test2")
	public void blogoutTest()
	{
		System.out.println("Logout is successful");
	}
	
	
	

		
	

}
