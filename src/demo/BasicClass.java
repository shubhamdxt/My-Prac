package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("http://toolsqa.com/selenium-webdriver/browser-commands/");
		//driver.getCapabilities();
		//driver.getCurrentUrl();
	//	driver.getKeyboard();\
	WebElement elmnt=driver.findElement(By.id("UserName"));
	boolean status=elmnt.isDisplayed();
	if (status==true) {
		System.out.println("success");
	}
	else {
		System.out.println("not success");
	}
	//System.out.println("status of the page :"+status);
	//	String title=driver.getTitle();
	//System.out.println("title of the page :"+title);
		

	}

}
