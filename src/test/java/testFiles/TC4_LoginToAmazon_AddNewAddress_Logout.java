package testFiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sourceFiles.Amazon_AddAddressPage;
import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;
import sourceFiles.DataFetching;

@Listeners(Amazon_ItestListener.class)
public class TC4_LoginToAmazon_AddNewAddress_Logout extends BaseClass {
	@Test(retryAnalyzer = Amazon_RetryAnalyzer.class)

	public void loginToAmazonAddNewAddressLogout() throws InterruptedException, EncryptedDocumentException, IOException
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
     
    //click on address link
     d1.deliverTo(driver);
 	Thread.sleep(5000);

    
    Amazon_AddAddressPage pg = new Amazon_AddAddressPage(driver);
    pg.fillAddressDetails(driver);
 	Thread.sleep(5000);

 	
    d1.clickOnSignout(driver);
	Thread.sleep(3000);

    }
}