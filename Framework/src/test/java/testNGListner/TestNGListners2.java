package testNGListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGListners2 implements ITestListener {
	
	public void onTestStart(ITestResult result) {
System.out.println("***************test start:"+ result.getName());
	}	
	public void onTestSuccess(ITestResult result) {
		System.out.println("***************test success:"+ result.getName());
	}	
	public void onTestFailure(ITestResult result) {
		System.out.println("***************test failed:"+ result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("***************test skipped:"+ result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("***************test start:"+ result.getName());
	}
	public void onStart(ITestContext context) {
		System.out.println("***************test start:"+ context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("***************test finished:"+ context.getName());
	}




}
