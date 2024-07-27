package webpage.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleTest {

	    @Test
		public void testTitle()
		{
			SoftAssert softassert = new SoftAssert();
								
			String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			String expectedText = "Search";
						
			System.setProperty("webdriver.chrome.driver", "C:\\Temp\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
			System.out.println(expectedText);
			System.out.println("Verify Title");
			softassert.assertEquals(actualtitle, expectedtitle, "text Verification failed");
						
			String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("Search");
			System.out.println("Verifying Text");
			System.out.println(actualtext);
			
			softassert.assertEquals(actualtitle, expectedtitle, "text Verification failed");
			System.out.println("closing browser");
			softassert.assertAll();
			
			driver.close();
			
		}
		
	}

