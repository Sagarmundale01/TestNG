package webpage.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest2 {
	
	//Here we are doing DataProvider by two ways:
	
	@Test(dataProvider = "create")
	public void test(String username, String password)
	{
		System.out.println(username + "---" + password );
		
		System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}
	
	
	@DataProvider(name = "create")
	public Object[][] dataSet1()
	{
		
		return new Object[][]
				
				{{"standard_user",  "secret_sauce"},
			     {"locked_out_user","secret_sauce"},
			     {"problem_user","secret_sauce"},
			     {"performance_glitch_user","secret_sauce"}};	
	
	}
	

}
