package testFiles;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Amazon_ItestListener implements ITestListener {
	// define global variable
public static WebDriver driver;

	public String DateTimestamp() {
		// Third way by using date class by providing time with ss
		Date d1 = new Date();
		System.out.println(d1.getTime()); // epoch time converter -- epoch time used in testng
		Date d2 = new Date(d1.getTime());
		System.out.println(d2); // human understandable time we got
		String s1 = d2.toString();
		String date = s1.substring(8, 10);
		String month = s1.substring(4, 7);
		String year = s1.substring(24);
		String hour = s1.substring(11, 13);
		String minute = s1.substring(14, 16);
		String second = s1.substring(17, 19);
		String newTime = date.concat(month).concat(year).concat(hour).concat(minute).concat(second);
		System.out.println(newTime);

		return date.concat(month).concat(year).concat(hour).concat(minute).concat(second);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is Pass");
		String time = DateTimestamp();
		// two folders will b there fo pass screenshot and other for fail screenshot
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\GitProjectsLava\\AmazonAutomation\\ScreenshotFolder\\Pass\\TestCasePass"+ new Amazon_ItestListener().getClass() + time + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {

		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is Fail");
		String time = DateTimestamp();

		// two folders will b there fo pass screenshot and other for fail screenshot
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\GitProjectsLava\\AmazonAutomation\\ScreenshotFolder\\Fail\\TestCaseFail"+ new Amazon_ItestListener().getClass() + time + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
