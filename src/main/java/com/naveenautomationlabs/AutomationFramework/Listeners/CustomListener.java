package com.naveenautomationlabs.AutomationFramework.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomationlabs.AutomationFramework.Utils.Utils;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test has started " + result.getMethod().getMethodName() + "  ***********");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test" + result.getMethod().getMethodName() + "Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test " + result.getMethod().getMethodName() + "   Failed" + "!!!!!!!!!!!!!!!!!!!!");
		Utils.takeScreenShot(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test " + result.getMethod().getMethodName() + "  Skipped" + "#################");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}
