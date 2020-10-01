package testNGListner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretrylistner implements IRetryAnalyzer {
	private int retrycount=0;
	private static  final int maxretrycount=5;
	public boolean retry(ITestResult result) {
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		return false;
	}


}
