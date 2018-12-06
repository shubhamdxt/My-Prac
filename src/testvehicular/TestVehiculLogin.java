package testvehicular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomdemo.VehiculaLogin;

public class TestVehiculLogin {

	VehiculaLogin objLogin;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://148.76.75.203/vehicular/");
		Thread.sleep(7000);
	}
	
	@Test
	public void loginMetodCall() throws Exception {
		
		
		objLogin=new VehiculaLogin(driver);
		
		objLogin.loginToVehicular("shubham@sourcesoftsolutions.com", "123456");
	}

}
