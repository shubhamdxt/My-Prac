package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersBlog implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Started" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Successfully Finished" +result.getName());
	}


	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed:" +result.getName());
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped" +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed but within success percentage" +result.getName());
	}
	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is onStart method" +context.getOutputDirectory());
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("This is onFinish method" +context.getPassedTests());
		System.out.println("This is onFinish method" +context.getFailedTests());
	}

	

	




	
}
