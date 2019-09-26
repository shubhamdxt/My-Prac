package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://wordpressdemo.webkul.com/wordpress-latest-tweets/");
		driver.manage().window().maximize();
		}

	}


