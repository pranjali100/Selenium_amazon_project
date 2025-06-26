package testFiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;
import sourceFiles.Amazon_ProductPage1;
import sourceFiles.Amazon_SearchResultPage;
import sourceFiles.DataFetching;

@Listeners(Amazon_ItestListener.class)
public class TC2_LoginToAmazon_SearchProduct_AddToWishlist extends BaseClass
{
	@Test(retryAnalyzer = Amazon_RetryAnalyzer.class)
	public void loginToAmazonSearchProductAddwishlist() throws InterruptedException, EncryptedDocumentException, IOException
	{
		DataFetching datafc = new DataFetching();
		datafc.dataFetch();

	Amazon_HomePage d1 = new Amazon_HomePage(driver);
	d1.clickOnAccountListHover(driver);
	Thread.sleep(3000);
	
	Amazon_LoginPage d2 = new Amazon_LoginPage(driver);
    d2.enterUsername();
	Thread.sleep(3000);
    d2.enterPassword();
	Thread.sleep(3000);

	d1.searchTheProduct();
	
	Amazon_SearchResultPage k = new Amazon_SearchResultPage(driver);
	k.clickOnFirstProduct(driver);
	
	//get title of product page
	driver.getTitle();
	
	Amazon_ProductPage1 p1 = new Amazon_ProductPage1(driver);

	p1.clickOnAddToWishlist(driver);
	Thread.sleep(5000);
	
	/*
	 * SoftAssert sc = new SoftAssert(); sc.assertEquals(driver.getCurrentUrl(),
	 * "https://www.amazon.in/"); Reporter.log("Assert is passed");
	 */
   // d1.clickOnSignout(driver);
    }
}
