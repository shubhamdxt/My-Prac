package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String [] args) 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.getElementsByClassName(ElementLocator).click();");
   // (JavascriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");
    /*WebElement body=driver.findElement(By.tagName("body"));
    body.sendKeys(Keys.chord(Keys.CONTROL, "a"));*/
   /* driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    boolean ss=driver.getPageSource().contains("Your recently viewed items and featured recommendations");
    System.out.print(ss);*/
    /*JavascriptExecutor js=(JavascriptExecutor)driver;
   // js.executeScript("document.getElementById('twotabsearchtextbox').value='samsung m30 mobiles';");
  //  js.executeScript("history.go(0)");
    String innerText=js.executeScript("return document.URL;").toString();
    System.out.println(innerText);*/
}
}