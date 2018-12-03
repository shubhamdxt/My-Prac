package pomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehiculaLogin {
	
	WebDriver driver;
	By homeLogin=By.xpath("//a[text()=\"Login\"]");
    
	//By userEmail=By.xpath("(//input[@name="email"])[2]");
	By userEmail=By.xpath("(//input[@name=\"email\"])[2]");
	
	By userPass=By.xpath("(//input[@name=\"password\"])[2]");
	
	By userLogin=By.xpath("//button[text()=\"Login\"]");
	 
	public VehiculaLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickhomeLogin() {
		driver.findElement(homeLogin).click();
	}
	
	public void setEmailId(String strEmailId) {
		driver.findElement(userEmail).sendKeys(strEmailId);
	}
	
	public void setPassword(String strPassword) {
		driver.findElement(userPass).sendKeys(strPassword);
	}
	
	public void clickuserLogin() throws Exception {
		driver.findElement(userLogin).click();
		//Thread.sleep(3000);
	}
	public void loginToVehicular(String strEmailId, String strPassword) throws Exception {
		this.clickhomeLogin();
		Thread.sleep(3000);
		this.setEmailId(strEmailId);
		
		this.setPassword(strPassword);
		this.clickuserLogin();
	
	}

}
