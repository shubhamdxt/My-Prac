package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboardclass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://148.76.75.203/vehicular/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"email\"])[2]")).sendKeys("shubham@sourcesoftsolutions.com");
	    driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"password\"])[2]")).sendKeys("123456");
	    driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
	    WebElement dashboard=driver.findElement(By.xpath("//a[text()=\"dashboard\"]"));
//	    if(dashboard.isDisplayed()) {
//	    	System.out.println("it is dashboard");
//	    }else {
//	    	System.out.println("it is not dashboard");
//	    }
	    Select brnSel=new Select(driver.findElement(By.xpath("(//select[@name=\"manufacturer_id\"])[1]")));
	    brnSel.selectByVisibleText("Audi");
	    Select prSel=new Select(driver.findElement(By.xpath("(//select[@name=\"state_id\"])[1]")));
	    prSel.selectByVisibleText("Gauteng");
	    Select budSel=new Select(driver.findElement(By.xpath("(//select[@name=\"selling_price\"])[1]")));
	    budSel.selectByVisibleText("$ 4000 to 8000");
	    Select vihSel=new Select(driver.findElement(By.xpath("(//select[@name=\"age_type\"])[1]")));
	    vihSel.selectByVisibleText("Used");
	    driver.findElement(By.xpath("(//button[text()=\"Search Car\"])")).click();
	 //   driver.findElement(By.xpath("(//a[text()=\"Contact Us\"])[1]")).click();
	   // driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
	    driver.findElement(By.xpath("(//a[text()=\"Used Cars \"])[1]")).click();
	    
	   
	  }

}
