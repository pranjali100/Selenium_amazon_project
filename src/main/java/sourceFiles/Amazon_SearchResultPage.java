package sourceFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amazon_SearchResultPage {
	ChromeDriver driver;
	@FindBy(xpath = "//div[@class='a-section aok-relative s-image-tall-aspect'][1]")
	WebElement firstProduct;

	public void clickOnFirstProduct(WebDriver driver) {
		firstProduct.click();
		Reporter.log("Moving control from parent to child window");
		/*
		 * // moving control to second window Set<String> windowId =
		 * driver.getWindowHandles(); Iterator<String> i1 = windowId.iterator(); String
		 * parentWindow = i1.next(); String childWindow = i1.next();
		 * driver.switchTo().window(childWindow);
		 */
	}

	/*
	 * @FindBy(id="a-autoid-1-announce") WebElement AddToCart;
	 * 
	 * @FindBy(css="button[id='a-autoid-108-announce']") WebElement secondAddToCart;
	 * public void clickOnAddToCart(ChromeDriver driver) throws InterruptedException
	 * { AddToCart.click(); Thread.sleep(5000);
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	 * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
	 * "button[id='a-autoid-108-announce']"))).click(); secondAddToCart.click();
	 * Thread.sleep(10000); }
	 */
	public Amazon_SearchResultPage(WebDriver driver) {
		// this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
