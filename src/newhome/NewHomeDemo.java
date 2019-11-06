package newhome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewHomeDemo {
	
	
	public static void main(String [] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.newhomesource.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		System.out.println("hello");
		//WebElement elmnt=driver.findElement(By.xpath("//li[@id='nhs_GlobalNavSearch']"));
		 WebDriverWait wait=new WebDriverWait(driver, 40);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='nhs_GlobalNavSearch']")));
	//	act.moveToElement(elmnt);
		Thread.sleep(2000);
 // WebElement link= driver.findElement(By.xpath("//a[contains(text(),'Atlanta, GA')]"));
//  WebDriverWait wait=new WebDriverWait(driver, 60);
 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Atlanta, GA')]")));
		//driver.findElement(By.xpath("//a[text()='Atlanta, GA']")).click();
		Thread.sleep(2000);
		System.out.println("after");
		
	}

}
