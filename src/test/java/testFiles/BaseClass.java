package testFiles;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseClass extends Amazon_ItestListener{

@BeforeMethod
  public void loginAmazon() throws InterruptedException
  {
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Browser is successfully launched");
		/*
		 * driver = new EdgeDriver(); driver.get("https://www.amazon.in");
		 * Thread.sleep(5000); driver.manage().window().maximize();
		 * Reporter.log("Browser is successfully launched");
		 */
  }
	
  @AfterMethod 
	  public void logoutAmazon() 
	  { 
		  driver.close();
		  Reporter.log("Browser is successfully closed");
	  }
}
