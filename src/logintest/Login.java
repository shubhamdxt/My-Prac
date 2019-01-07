package logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	        driver.get("http://148.76.75.204/utailer/");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='useremail']")).sendKeys("data@datasoma.com");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='userpassword']")).sendKeys("123456");
	        
	        
	        
	        

	}

}
