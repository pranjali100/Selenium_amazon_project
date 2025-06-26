package sourceFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage1{
	WebDriver driver;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement AddToWishlist;
	
	//click on add to cart

	@FindBy(id="add-to-cart-button")
	WebElement AddToCart;
	
	public void clickOnAddToWishlist(WebDriver driver) throws InterruptedException
	{
		AddToWishlist.click();
		Thread.sleep(5000);
	}
	public void clickOnAddToCart() throws InterruptedException
	{
		AddToCart.click();
		Thread.sleep(5000);
	}
	
	public Amazon_ProductPage1(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);
	}
}
/*
 * @FindBy(partialLinkText="View Your List") WebElement viewYourList;
 * 
 * @FindBy(partialLinkText= "Add to Cart") WebElement addToCart;
 * 
 * @FindBy(xpath="//span[text()='View Cart']") WebElement viewCart;
 */