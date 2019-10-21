package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectDropdown {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        

          WebElement select1 = driver.findElement(By.xpath("//option[@value='Volvo']"));
       // WebElement select2 = driver.findElement(By.xpath("//option[@value='Saab']"));
          Thread.sleep(2000);
          Actions action = new Actions(driver);
          action.keyDown(Keys.CONTROL).click(select1).build().perform();
	}

}
