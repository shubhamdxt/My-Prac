package radio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import bsh.commands.dir;

public class Radioclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://148.76.75.203/vehicular/");
	
		driver.findElement(By.xpath("(//a[contains(text(),'Sign up')])[1]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.name("user_nickname")).sendKeys("shubham");

	    driver.findElement(By.xpath("(//input[@name='email'])[3]")).sendKeys("kk@sourcesoftsolutions.com");

	     System.out.println("good");
         Select ss=new Select(driver.findElement(By.xpath("(//select[@name='state_id'])[2]")));
        Thread.sleep(2000);
	    ss.selectByVisibleText("Gauteng");
	 //    Thread.sleep(5000);
	
	    Select ss1=new Select(driver.findElement(By.xpath("(//select[@name='city_id'])[1]")));
	    Thread.sleep(2000);
	    ss1.selectByVisibleText("Benoni");
	    driver.findElement(By.xpath("//input [@class='form-control' and @id='mobile_no_user' ]")).sendKeys("xsfsfzvxv");;
	    driver.findElement(By.xpath("//input [@class='form-control' and @id='loginPass' ]")).sendKeys("123456");
	    driver.findElement(By.xpath("(//input[@type='checkbox' ])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='radio' ])[2]")).click();
	    driver.findElement(By.xpath("//button[text()=\"Sign up\" ]")).click();
	    WebElement chEmail=driver.findElement(By.xpath("(//div[text()=\" Confirmation Email is sent to your email id.\"])[3]"));
	    Thread.sleep(2000);
	    if(chEmail.isDisplayed())
	    {
	    	System.out.println("success");
	    }else {
	    	System.out.println("not success");
	    }
	}

}
