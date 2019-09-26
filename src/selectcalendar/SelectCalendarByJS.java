package selectcalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJS {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/");

		WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		System.out.println(date);
		String dateVal="6-30-2019";
		System.out.println(dateVal);
		
		selectDateByJS(driver, date, dateVal);
	  }
      public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal) 
      {
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("argument[0].setAttribute('value','"+dateVal+"');", element);
      }
}
