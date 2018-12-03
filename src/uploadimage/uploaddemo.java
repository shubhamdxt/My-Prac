package uploadimage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\New folder\\BasicDemo\\exefile\\geckodriver.exe");
	    WebDriver	driver=new FirefoxDriver();
		
		driver.get("https://test2.meetmehere.com/");
		driver.findElement(By.xpath("//*[@id=\"signinbtn\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Tejaswa@sourcesoftsolutions.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"signin_btn\"]")).click();

	}

}
