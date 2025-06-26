package sourceFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage extends DataFetching {
	WebDriver driver;
 
		@FindBy(id="ap_email_login")
		WebElement username;

		@FindBy(id="ap_password")
		WebElement password;

		@FindBy(xpath="//input[@type='submit']")
		WebElement submit;
		
		public void enterUsername()
		{
			username.sendKeys(un1);
			submit.click();
		}
		public void enterPassword() throws InterruptedException
		{
			password.sendKeys(pw1);
			submit.click();
			Thread.sleep(5000);

		}

		public Amazon_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
}
