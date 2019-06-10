package propertydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertyclass {
	public static void main(String [] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		driver = new ChromeDriver();					
	    driver.get("http://demo.guru99.com/test/guru99home/");					
	    driver.manage().window().maximize();	
	    System.out.println("first......");
	// Load the properties File		
	    Properties obj = new Properties();	
	    System.out.println("first......"+obj);
	    FileInputStream objFile=new FileInputStream(System.getProperty("G:\\New folder\\BasicDemo\\property\\application.properties"));
	    System.out.println("first......");
	    obj.load(objFile);
	      driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();
	      driver.navigate().back();
	      
	      driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");
	      
	      driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();
	      
	      
	}

}
