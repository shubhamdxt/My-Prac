package grouptest;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(groups= {"smokeTest","functional Test"})
	public void loginTest() {
		System.out.println("Login Successfully");
	}
}
