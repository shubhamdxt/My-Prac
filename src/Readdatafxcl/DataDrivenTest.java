package Readdatafxcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {
	 WebDriver driver;
	    XSSFWorkbook workbook;
	    XSSFSheet sheet;
	    XSSFCell cell;
	    @BeforeTest
	    public void initialization() throws Exception {
	    	System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://148.76.75.203/vehicular/");
			driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
	    	
	    }
	    @Test
	    public void loginData() throws Exception {
	    	File src=new File("G:\\New folder\\BasicDemo\\Data\\Testdata.xlsx");
	    	FileInputStream fis = new FileInputStream(src);
	    	// Load he workbook.
			workbook = new XSSFWorkbook(fis);
			// Load the sheet in which data is stored.
			sheet= workbook.getSheetAt(0);
			for(int i=1; i<=sheet.getLastRowNum(); i++) {
				// Import data for Email.
				cell = sheet.getRow(i).getCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				System.out.println("bdsvjjb");
				
				System.out.println("fsfb");
				Thread.sleep(5000);
	//			driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"email\"])[2]")).clear();
//				driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"email\"])[2]")).sendKeys(cell.getStringCellValue());
			 driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"email\"])[2]")).sendKeys(cell.getStringCellValue()); 
			 
			//	driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"password\"])[2]")).clear();
				
	//	    driver.findElement(By.xpath("(//input[@class=\"form-control\" and @name=\"password\"])[2]")).sendKeys(cell.getStringCellValue());
//			    driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
			}
	    	
	    }

}
