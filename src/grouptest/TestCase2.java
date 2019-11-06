package grouptest;

import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(groups={"functional Test"})
	public void composeMail(){
		System.out.println("Mail Sent");
	}

}
