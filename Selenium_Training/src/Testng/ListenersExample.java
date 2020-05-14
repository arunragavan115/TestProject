package Testng;

import org.testng.ITestListener;

import org.testng.ITestResult;
import org.testng.ITestContext;


public class ListenersExample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case is going to execute");

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is passed");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case is skipped");
	}


	public void onTestFailedbutWithinSuccessPercentage(ITestResult context) {

	}

	public void onStart(ITestResult context) {
		System.out.println("before everything");
	}
	public void onFinish(ITestResult context) {
		System.out.println("after everything");

	}




}

