package handlewindowpop;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPop {
	
	public static void main(String [] args) throws Exception 
	{
		
	System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.navigate().to("http://www.popuptest.com/goodpopups.html");
    driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	
	Thread.sleep(2000);
	
	        Set<String> handle =driver.getWindowHandles();
	        Iterator<String> iterator=handle.iterator();
	            String parentWindow=iterator.next();
	            System.out.println("parent window id:"+ parentWindow);
	            
	            String childWindowId = iterator.next();
	            
	    		System.out.println("Child window id:"+childWindowId);
	    		driver.switchTo().window(childWindowId);
	    		Thread.sleep(2000);
	    		
	    		System.out.println("child window pop up title"+driver.getTitle());
	    		System.out.println("child window pop up title");
	    		
	    		driver.close();
	    		
	    		
	    		driver.switchTo().window(parentWindow);
	    		
	    		Thread.sleep(2000);
	    		
	    		System.out.println("parent window title"+driver.getTitle());
    }
}