package sourceFiles;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_HomePage {
	WebDriver driver;

	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShopping;
	
	@FindBy(partialLinkText="Account & Lists")
	WebElement accListHover;
	
	@FindBy(xpath="//span[text()='Sign in']")
	WebElement signIn;
	
	//searchproduct
	@FindBy(id="twotabsearchtextbox")
	WebElement searchProduct;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement signOut;
	
	//address add
	@FindBy(xpath="//span[@id='glow-ingress-line1']")
	WebElement addAddress;
//	
@FindBy(linkText="Add an address or pick-up point")
	WebElement addAddressLink;
	
//broken links
@FindBy(tagName="a")
WebElement brokenlinks;

	public void clickOnAccountListHover(WebDriver driver) throws InterruptedException
	{
		/*
		 * if( continueShopping.isDisplayed()) { continueShopping.click();
		 *  Actions a = new Actions(driver);
		 * a.moveToElement(accListHover).perform();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * signIn.click(); } else {
		 */
		this.driver=driver;
		Thread.sleep(5000);
			Actions a = new Actions(driver);
			a.moveToElement(accListHover).perform();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       signIn.click();
		//}
	}
	
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void searchTheProduct() {
		searchProduct.sendKeys("shoes" +Keys.ENTER);
	}
	
	public void clickOnSignout(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(accListHover).perform();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		signOut.click();
	}
	public void deliverTo(WebDriver driver) throws InterruptedException {
		this.driver=driver;
       Thread.sleep(3000);
   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='glow-ingress-line1']"))).click();
		//a.moveToElement(addAddress).perform();
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add an address or pick-up point")));
	        addAddressLink.click();
	    
}


}