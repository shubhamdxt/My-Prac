 package Links;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://148.76.75.203/vehicular/");
    driver.findElement(By.name("s")).sendKeys(Keys.F5);
    driver.findElement(By.linkText("CLICK HERE"));
	
//	List<WebElement> links = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
	//int boxes = driver.findElements(By.xpath(".//*[@class='dijitReset dijitInputInner']")).size();
//	System.out.println(boxes);
//	for(int i=0;i<links.size();i++) {
//		System.out.println(links.get(i).getText());
//	}
	
	}

}
