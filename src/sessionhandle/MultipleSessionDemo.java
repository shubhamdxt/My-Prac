package sessionhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSessionDemo {
	@Test
	public void firstMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
  
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
        Thread.sleep(5000);
    	driver.close();
	}
	@Test
	public void secondMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
  
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void tecondMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
   
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        Thread.sleep(5000);
    	driver.close();
	}
	


}
