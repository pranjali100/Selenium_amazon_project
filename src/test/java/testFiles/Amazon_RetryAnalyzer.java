package testFiles;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Amazon_RetryAnalyzer implements IRetryAnalyzer {
	int initialCount = 0;
	int retryCount = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (initialCount < retryCount) {
			initialCount++;
			return true;
		}
		return false;

	}

}
