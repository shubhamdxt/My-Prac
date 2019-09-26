package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderLine {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("https://www.google.co.in/");
	

		 String cssValue= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");

		 System.out.println("value"+cssValue);

		 Actions act = new Actions(driver);

		 act.moveToElement(driver.findElement(By.xpath("//a[text()='Hindi']"))).perform();

		 String cssValue1= driver.findElement(By.xpath("//a[text()='Hindi']")).getCssValue("text-decoration");

		 System.out.println("value over"+cssValue1);

		 driver.close();

		 }


}
