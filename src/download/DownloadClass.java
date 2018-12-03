package download;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DownloadClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/newtours/";
	        WebDriver driver = new ChromeDriver();

	        driver.get(baseUrl);           
            WebElement link_Home = driver.findElement(By.linkText("Home"));
            WebElement td_Home = driver
                    .findElement(By
                    .xpath("//html/body/div"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr/td"
                    + "/table/tbody/tr"));    
             
            Actions builder = new Actions(driver);
            Action mouseOverHome = builder
                    .moveToElement(link_Home)
                    .build();
             
            String bgColor = td_Home.getCssValue("background-color");
            System.out.println("Before hover: " + bgColor);        
            mouseOverHome.perform();        
            bgColor = td_Home.getCssValue("background-color");
            System.out.println("After hover: " + bgColor);
	     //   driver.close();
	        }

	}


