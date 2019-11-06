package actionsclaasoperation;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\New folder\\BasicDemo\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://facebook.com");
	//	driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*WebElement textElmnt=driver.findElement(By.id("email"));
		Actions action=new Actions(driver);
		Action seriesOfAction=action.moveToElement(textElmnt).click()
				.keyDown(textElmnt,Keys.SHIFT)
				.sendKeys(textElmnt,"Hello")
				.keyUp(textElmnt, Keys.UP)
				.doubleClick(textElmnt)
				.contextClick()
				.build();
		
		seriesOfAction.perform();*/
		
		/*WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;*/
		
		// Locate 'Bicycle' checkbox using name
			/*	WebElement bicyle = driver.findElement(By.name("vehicle1"));
				// Locate 'Message' textbox using id
				WebElement messageTextBox = driver.findElement(By.id("enterText"));
				// Locate 'click()' using id
				WebElement element = driver.findElement(By.id("click"));
				
				Actions action =new Actions(driver);*/
				/*action.moveToElement(messageTextBox).keyDown(Keys.SHIFT).
				sendKeys(messageTextBox,"hello is good").keyUp(Keys.SHIFT).perform();
				action.click(bicyle).perform();*/
			//	action.moveToElement(driver.findElement(By.id("labelText"))).
			//	doubleClick().perform();
				
				  String query = "This is a test";
				   
				    driver.get("https://www.google.com");
				    WebElement searchBox = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
				    System.out.println(searchBox);
				    searchBox.sendKeys(query);

				    // make sure it has focus
				    searchBox.click();

				    Actions actions = new Actions(driver);
				    // go to the beginning of input
				    actions.sendKeys(Keys.HOME).build().perform();
				    int length = query.substring(0, query.indexOf("a")).length();

				    actions.keyDown(Keys.LEFT_SHIFT);
				    
				    for (int i = 0; i < length; i++){
				    	
				        actions.sendKeys(Keys.ARROW_RIGHT);
				    }
				    actions.keyUp(Keys.LEFT_SHIFT);
				    actions.build().perform();
	}

}
