package login;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginClass {

  
 public static void main(String [] args) throws Exception
  {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://148.76.75.203/vehicular/");
		driver.manage().window().maximize();
		   driver.findElement(By.xpath("//button[text()=\"Login\"]")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"email\"])[2]")).sendKeys("shubham@sourcesoftsolutions.com");
	    driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"password\"])[2]")).sendKeys("123456");
	    driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	    WebElement dashboard=driver.findElement(By.xpath("//a[text()=\"dashboard\"]"));
	    if(dashboard.isDisplayed()) {
	    	System.out.println("it is dashboard");
	    }else {
	    	System.out.println("it is not dashboard");
	    }
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[text()=\"Home\"])[1]")).click();
	    driver.findElement(By.xpath("(//a[text()=\"Used Cars \"])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[text()=\"New Cars \"])[1]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//a[contains(text(),'News & Reviews')])[1]")).click();
//	    Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[text()=\"Trade-Ins\"])[1]")).click();
//	    driver.findElement(By.xpath("(//a[text()="Contact Us"])[1]")).click();
        driver.findElement(By.xpath("(//a[text()=\"Contact Us\"])[1]")).click();
        driver.findElement(By.xpath("(//a[text()=\" Sell Your Car\"])[1]")).click();
       // Select catSel=new Select(By.xpath("(//select[@class=\"form-control s-icon2\" and @id=\"category_id\"])[1]"));
        driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"product_name\"]")).sendKeys("Virus");
        
        Select catSel=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control s-icon2\" and @id=\"category_id\"])[1]")));
        catSel.selectByVisibleText("Demo car");
        Select brSel=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control s-icon2\" and @id=\"manufacuture_id\"])[1]")));
        brSel.selectByVisibleText("Audi");
        driver.findElement(By.xpath("(//input[@name=\"actual_price\"])[1]")).sendKeys("78945");
        driver.findElement(By.xpath("(//input[@name=\"selling_price\"])[1]")).sendKeys("123456");
        Select tranSel=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control s-icon2\"])[4]")));
               tranSel.selectByVisibleText("transmission qa");   
               Select colSel=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control s-icon2\"])[5]")));
               colSel.selectByVisibleText("white");
               Select fulSel=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control s-icon2\"])[6]")));
               Thread.sleep(5000);   
               fulSel.selectByVisibleText("CNG");
            //   driver.findElement(By.xpath("//input[@type=\"month\"]")).click();
               driver.findElement(By.xpath("(//input[@class=\"form-control\" and @type=\"number\"])[3]")).sendKeys("100");
               driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"cover_distance\"])[1]")).sendKeys("200m");
               Select ageSel=new Select(driver.findElement(By.xpath("//select[@name=\"age_type\"]")));
               ageSel.selectByVisibleText("New");
               driver.findElement(By.xpath("(//textarea[@class=\"form-control\" and @id=\"description\"])[1]")).sendKeys("This is good notezsvsmvmzsnvmnsvmns");
               driver.findElement(By.xpath("//button[@class=\"btn btn-info btn-sm\"]")).click();
             Runtime.getRuntime().exec("C:\\Users\\shubham\\Desktop\\upload\\flower.exe");
        //     Runtime.getRuntime().exec("G:\\New folder\\BasicDemo\\exefile\\test.exe");
           //  driver.findElement(By.xpath("//button[text()=\"Select pictures\"]")).sendKeys("C:\\Users\\shubham\\Downloads\\1.jpg",Keys.ENTER);
        //      pic.sendKeys("C:\\Users\\shubham\\Pictures\\test");
          //    driver.findElement(By.xpath("(//button[@type=\"submit\" ])[1]")).click();
              System.out.println("This is good pic");
     //       driver.findElement(By.xpath("(//a[text()=\"logout\"])[1]")).click();
	}

}

