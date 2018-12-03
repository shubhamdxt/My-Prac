package sandeepdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.101:8000");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("My title");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sandeepkumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("S@N^d&p!23456");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='email']")).clear();
			Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test1@gmail.com");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='button button-large']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("S@N^d&p!23456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
       // driver.close();

	}

}
