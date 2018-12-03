package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngClass {
	
@Test(priority=3)
public void xMethod() {
	System.out.println("This is x method");
}
@Test(priority=1)
public void aMethod() {
    //throw new SkipException("This is a skip method");
	System.out.println("This is a method");
}
@Test(successPercentage=2)
public void nMethod() {
	System.out.println("This is n method");
}
}
