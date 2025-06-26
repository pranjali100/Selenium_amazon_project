package sourceFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_AddAddressPage {
	WebDriver driver;


	@FindBy(id="ya-myab-plus-address-icon")
	WebElement addToAddress;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement fullName;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement mobNo;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement flatNo;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement areaName;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement town;
	
	/*
	 * @FindBy(xpath="//span[.='Choose a state']") WebElement state;
	 */
	
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement checkbox;
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	WebElement addAddress;
	
	public void fillAddressDetails(WebDriver driver) throws InterruptedException
	{
		addToAddress.click();
		fullName.sendKeys("Siya Sharma");
		mobNo.sendKeys("9087889990");
		pincode.sendKeys("440017");
		flatNo.sendKeys("76 ");
		areaName.sendKeys("Laghuvetan Colony");
		landmark.sendKeys("Indora");
		town.sendKeys("");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Choose a state']")));
		
	/*
	 * Thread.sleep(6000); Select sc = new Select(state); sc.selectByIndex(20);
	 */
//	sc.selectByVisibleText("MAHARASHTRA");
	Thread.sleep(2000);

	wait.until(ExpectedConditions.elementToBeClickable(checkbox));
	checkbox.click();
	Thread.sleep(4000);

	addAddress.click();
	Thread.sleep(6000);

	}
	
	public Amazon_AddAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
