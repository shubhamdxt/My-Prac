package hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class DDTExcel {
	ChromeDriver driver;
	  
	 @Test(dataProvider="testdata")
	 public void DemoProject(String username, String password) throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
	 driver = new ChromeDriver();
	  
	 driver.get("http://newtours.demoaut.com/");
	  
	 driver.findElement(By.name("userName")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.name("login")).click();
	  
	 Thread.sleep(5000);
	//  Verify.verify(driver.getTitle().matches("Find a Flight: Mercury Tours:"), "Invalid credentials");
	 Assert.assertTrue(driver.getTitle().matches("Find a Flight: Mercury Tours:"), "Invalid credentials");
	 System.out.println("Login successful");
	 }
	  
	 @AfterMethod
	 void ProgramTermination()
	 {
	 driver.quit();
	 }
	 
	@DataProvider(name="testdata")
	 public Object[][] TestDataFeed()
	 {
	  
	 ReadExcelFile config = new ReadExcelFile("G:\\New folder\\BasicDemo\\Data\\hybrid.xlsx");
	  
	 int rows = config.getRowCount(0);
	  
	 Object[][] credentials = new Object[rows][2];
	 
	for(int i=0;i<rows;i++)
	 {
	 credentials[i][0] = config.getData(0, i, 0);
	 credentials[i][1] = config.getData(0, i, 1);
	 }
	  
	 return credentials;
	 }
	}
