package parametrizedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterWithTestNGXML {
	
	WebDriver driver;
	
	@Test
	@Parameters({"author","searchKey"})
	public void testParameter(@Optional("Abc") String author,String searchKey) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://google.com");

	WebElement searchText=driver.findElement(By.name("q"));
	
	searchText.sendKeys(searchKey);
	  System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
      System.out.println("Thread will sleep now");
      Thread.sleep(3000);
      System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
      //verifying the value in google search box
      AssertJUnit.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
	}
}
