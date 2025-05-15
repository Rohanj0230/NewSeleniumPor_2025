package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenClas implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I will run on test pass" + result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" I will run when test get fail" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I will run on test skip" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}

}
