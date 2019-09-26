package demo;

import java.time.format.DateTimeFormatterBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DateTimePicker {
	
	
	public void dateTimePicker() throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/");
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		Actions ac=new Actions(driver);
		ac.moveByOffset(5, 5);
		dateBox.sendKeys("08232019");
		Thread.sleep(2000);
		
	//	dateBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		dateBox.sendKeys("0354PM");
		Thread.sleep(2000);
	//dateBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}

}
