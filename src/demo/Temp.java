package demo;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;


public class Temp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://in.sagepub.com/en-in/sas/home");
		
		/*org.openqa.selenium.support.ui.Select ss=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@class='form-select required error']")));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[1].click();", ss);
		//ss.selectByIndex(5);
		ss.selectByValue("india");
		List<WebElement> ll=driver.findElements(By.xpath("//input[@class='form-text jquery-once-1-processed tt-input']"));
     
		for(int i=0;i<ll.size();i++) 
		{
    	 ll.get(i).click(); 
      }  
		*/
	}

}
