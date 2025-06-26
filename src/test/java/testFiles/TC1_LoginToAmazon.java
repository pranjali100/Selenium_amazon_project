package testFiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sourceFiles.Amazon_HomePage;
import sourceFiles.Amazon_LoginPage;
import sourceFiles.DataFetching;

@Listeners(Amazon_ItestListener.class)
public class TC1_LoginToAmazon  extends BaseClass{

	@Test(retryAnalyzer = Amazon_RetryAnalyzer.class)
	public void loginToAmazon() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		DataFetching datafc = new DataFetching();
		datafc.dataFetch();

		Amazon_HomePage d1 = new Amazon_HomePage(driver);
		d1.clickOnAccountListHover(driver);
	//	
		Amazon_LoginPage d2 = new Amazon_LoginPage(driver);
        d2.enterUsername();
	     Thread.sleep(3000);
        d2.enterPassword();
	     Thread.sleep(10000);

        d1.clickOnSignout(driver);
	     Thread.sleep(3000);

        }
}
