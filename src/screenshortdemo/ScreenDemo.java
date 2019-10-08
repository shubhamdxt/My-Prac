package screenshortdemo;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenDemo {
	
	@Test
	public void screenShort() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
        takeScreenShort(driver, "C:\\Users\\shubham\\Desktop\\upload\\pic.png");
		
	}
	
	public void takeScreenShort(WebDriver webdriver,String fileWithPathPath) throws Exception {
		TakesScreenshot scrShot=((TakesScreenshot)webdriver);
		
		File  srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		File descFile= new File(fileWithPathPath);
		
		FileUtils.copyFile(srcFile, descFile);
	
		
	}


}
