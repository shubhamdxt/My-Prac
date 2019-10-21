package listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListeners implements IInvokedMethodListener  {
	
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("Before Invocation of: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());
	}


	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println("After Invocation of: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());
	}

	
}
