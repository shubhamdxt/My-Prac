package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class BasicClass {
	
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Login'])[1]")).click();
		
	     WebElement email=driver.findElement(By.xpath("(//input[@name='email'])[2]"));
		 email.sendKeys("shubham@sourcesoftsolutions.com");
		 
		
		WebElement pass=driver.findElement(By.xpath("(//input[@name='password'])[2]"));
		pass.sendKeys("123456");
		
		
		WebElement loginBtn=driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
		loginBtn.click();
	
		
		
		
		
		/*Dimension d = new Dimension(500,500);
		driver.manage().window().setSize(d);*/
				/*CASE- 1. Both User name and Password are entered correctly. 
				Check whether Email field exists or not 
				    try
				        {
				          WebElement a1 = driver.findElement(By.xpath("//*[@id='Email']"));
				          System.out.println("---------Emaild exists --------------\n-----------------------");
				          a1.sendKeys("ENTER CORRECT MAIL ID");
				         }
				    catch(Throwable e)
				         {
				         System.out.println("Emaild not found: " + e.getMessage());
				         }

				    //Check whether Password field exists or not
				     try
				        {
					 WebElement password = driver.findElement(By.xpath("//*[@id='Passwd']"));
				         System.out.println("----------Passwordd exits ------------\n-----------------------");
				         password.sendKeys("ENTER CORRECT PASSWORD");
				        }
				    catch(Throwable e)
				        {
					 System.out.println("Passwordd not found: " + e.getMessage());
				        }

				     //Asserting the Sign In button exists or not and clicking it
				    try
				       {
				//	WebElement button = driver.findElement(By.id("signIn        System.out.println("-------Signutton exists----------\n-----------------------"));
				       //To uncheck the "Check sign in" checkbox
				       WebElement check_stay_sign_in = driver.findElement(By.xpath("//*[@id='PersistentCookie']"));
				        check_stay_sign_in.click();   
				//	button.click();
				        }
				    catch(Throwable e)
				        {
					System.out.println("Signutton not found: "+ e.getMessage());
				        }
				    //Check if login was proper or not
				    try
				        {
					WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				        String text = GmailText.getText();
				        if(text.equals("Primary"))
				       {
					System.out.println("----------Sucessfuln -------\n-----------------------");
				       }else
				       {
					System.out.println("----------Loginure ----------\n-----------------------");
					}
				       }
				     catch(Throwable e)
				        {
					 System.out.println("Inbox not found: "+e.getMessage());
				        }
				    //===
				    //Asserting and click on the Account link which contain Signout button.
				     try
				        {
					WebElement person = driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span"));
				        System.out.println("--------Theunt link containing Signout button exists ---------\n-----------------------");
					person.click();
				       }
				    catch(Throwable e)
				       {
					System.out.println("Linkthe drop-down not found: "+e.getMessage());
				        }


				    //Asserting and clicking on the Signout button.
				    try
				       {	
					WebElement signout = driver.findElement(By.xpath("//*[@id='gb_71']"));
				        System.out.println("--------Signbutton exists  ---------\n-----------------------");
					signout.click();
				        }
				    catch(Throwable e)
				        {
					System.out.println("Signbutton not found: "+e.getMessage());
				        }

				    //Check whether Signout was proper or not.
				    try
				       {	
				       WebElement GmailText = driver.findElement(By.xpath("//divss = 'banner']/h1"));
				       String text = GmailText.getText();
				       if(text.equals("One account. All of Google."))
				       {
				       System.out.println("----------Signwas successful -------");
				       }
				     else
				       {
				        System.out.println("----------Signwasn't successful ----------");
					}
				        }

				    catch(Throwable e)
				        {
					System.out.println("Signlink not found: "+e.getMessage());
				        }


				  // CASE- 2. Both Email and Password Fields are blank.
				    try
				        {
				//	WebElement button = driver.findElement(By.id("signInbutton.click());			        "
				WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				String text = GmailText.getText();
				if(text.equals("Primary"))
				{
				   System.out.println("----------Sucessfuln -------");
				}
				else
				{
					System.out.println("----------Loginure ----------");
						}
						
				}
				catch(Throwable e)
				{
						System.out.println("Erroril and Password fields are blank. \n----------------------- ");
				System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				  }


				// CASE- 3. Email field is filled and Password field is blank
				try
				{		
				//		WebElement email = driver.findElement(By.id("Emailemail.sendKeys("abcd123@gmail.com");
			//	WebElement button = driver.findElement(By.id("signInbutton.click();


				WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				String text = GmailText.getText();
				if(text.equals("Primary"))
				{
				System.out.println("----------Sucessfuln -------\n-----------------------");
				}
				else
				{
				System.out.println("----------Loginure ----------\n-----------------------");
						}
						
				 }
				catch(Throwable e)
				 {
						System.out.println("Errorsword field is blank. \n-----------------------");
				System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				 }	

			//	driver.findElement(By.id("Email")).clearlearing the Email field


				// CASE- 4. Email field is blank and Password field is filled

				try
				{		
		//				WebElement password = driver.findElement(By.id("Passwdpassword.sendKeys("ENTER PASSWORD");
		//		WebElement button = driver.findElement(By.id("signInbutton.click();


				WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				String text = GmailText.getText();
				if(text.equals("Primary"))
				{
				System.out.println("----------Sucessfuln -------");
				}
				else
				{
				System.out.println("----------Loginure ----------");
						}
							
				}
				catch(Throwable e)
				{
				    	System.out.println("Erroril field is blank. \n-----------------------");
				System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				 }
				  
			//	driver.findElement(By.id("Passwd")).clearlearing the Password field


				//CASE- 5. Email and Password are entered wrong 	

				try
				{
		//				 WebElement email = driver.findElement(By.id("Email email.sendKeys("ENTER INCORRECT MAIL ID");
		//		 WebElement password = driver.findElement(By.id("Passwd password.sendKeys("ENTER INCORRECT PASSWORD");
		//		 WebElement button = driver.findElement(By.id("signIn button.click();
				 
				 WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				 String text = GmailText.getText();
				 if(text.equals("Primary"))
				 {
				 System.out.println("----------Sucessfuln -------");
				 }
				 else
				 {
				 System.out.println("----------Loginure ----------");
						 }
						 
				  }
				catch(Throwable e)
				{
					
					  System.out.println("Errororrect Email and Password. \n-----------------------");		  
				  System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				}
				 
	//			driver.findElement(By.id("Email")).clearlearing the Email field
		//		driver.findElement(By.id("Passwd")).clearlearing the Password field
						
					
				 // CASE- 6. Email is wrong and Password is correct 	
				 try 
				 {
					 
		//				WebElement email = driver.findElement(By.id("Emailemail.sendKeys("ENTER INCORRECT EMAIL ID");
	//			WebElement password = driver.findElement(By.id("Passwdpassword.sendKeys("ENTER CORRECT PASSWORD");
		//		WebElement button = driver.findElement(By.id("signInbutton.click();
	//			WebElement Inbox = driver.findElement(By.xpath("//*[@id=':53']/div/div[1]/span/a"));
				if(Inbox != null) 
				{
				System.out.println("Sucessfuln \n -----------------");
				} 
				else 
				{
				System.out.println("Loginure");
						}
				  } 
				 catch(Throwable e) 
				 {
					  
					  System.out.println("Errororrect Email. \n-----------------------");
				  System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				  }
				 
				  driver.findElement(By.id("Email")).clearlearing the Email field
				  driver.findElement(By.id("Passwd")).clearlearing the Password field
				  
				  
				//CASE- 7. Email is correct and Password is wrong 	
				 try
				 {
						 WebElement email = driver.findElement(By.id("Email email.sendKeys("ENTER CORRECT EMAIL ID");
				 WebElement password = driver.findElement(By.id("Passwd password.sendKeys("ENTER INCORRECT PASSWORD");
				 WebElement button = driver.findElement(By.id("signIn	 button.click();
					 
				 
					 WebElement GmailText = driver.findElement(By.xpath("//*[@id=':36']"));
				 String text = GmailText.getText();
				 if(text.equals("Primary"))
				 {
				 System.out.println("----------Sucessfuln -------");
				 } 
				 else
				 {
				 System.out.println("----------Loginure ----------");
							}
				  }
				 catch(Throwable e)
				 {
					   System.out.println("Errororrect Password. \n-----------------------");			  
				   System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
				  }

				  driver.findElement(By.id("Email")).clearlearing the Email field
				  driver.findElement(By.id("Passwd")).clearlearing the Password field

				//closing current driver window	
						driver.close();
						
					}*/
		
/*	public static void main(String[] args) throws AWTException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		final URL url = new URL("https://www.swtestacademy.com/extentreports-testng/");
		final URLConnection conn = url.openConnection();
	
		  
		//  driver.get("http://www.facebook.com");
		  
		//  driver.get("https://www.swtestacademy.com/extentreports-testng/");
			 driver.manage().window().maximize();
		  ((JavascriptExecutor)driver).executeScript("window.open()");
		  ((JavascriptExecutor)driver).executeScript("window.open()");
		  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  driver.get("http://google.com");
		
		Robot abc = new Robot();
		 
	    abc.keyPress(KeyEvent.VK_CONTROL);
	    abc.keyPress(KeyEvent.VK_T);
	    abc.keyRelease(KeyEvent.VK_CONTROL);
		    
	  
	    
	  
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement username= driver.findElement(By.id("email")); 
	    js.executeScript("arguments[0].setAttribute('style,'border:solid  9px red'');", username);
	    
	    WebElement R1 = driver.findElement(By.xpath("//af='/shop/men?src=tn&nav_id=5']"));
	    Actions builder = new Actions(driver);
	    builder.contextClick(R1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    System.out.println("this is double click operations"); 		
	    
	    Actions ac=new Actions(driver);
	   
	    WebElement homeelmnt=driver.findElement(By.xpath("//span[text()='HOME']"));
	 //   ac.doubleClick(homeelmnt).build().perform();
	    ac.contextClick(homeelmnt).build().perform();
	    System.out.println("this is double click operations");
	    
	//    WebElement e= driver.findElement(By.cssSelector(abc)).sendKeys(Keys.Control + "t");
		//driver.getCapabilities();
		//driver.getCurrentUrl();
	//	driver.getKeyboard();\
	WebElement elmnt=driver.findElement(By.id("UserName"));
	boolean status=elmnt.isDisplayed();
	if (status==true) {
		System.out.println("success");
	}
	else {
		System.out.println("not success");
		System.out.println("new updates are done here");
	}
	//System.out.println("status of the page :"+status);
	//	String title=driver.getTitle();
	//System.out.println("title of the page :"+title);
		

	}*/
	
	/*private static boolean netIsAvailable() {
		
	    try {
	    	
	        final URL url = new URL("http://www.google.com");
	        final URLConnection conn = url.openConnection();
	        conn.connect();
	        conn.getInputStream().close();
	        return true;
	    } catch (MalformedURLException e) {
	        throw new RuntimeException(e);
	    } catch (IOException e) {
	        return false;
	    }
	}*/
	
/*	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "G://New folder//BasicDemo//exefile//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebikefind.com/");
	
		//driver.findElements(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).c;
		
		driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' English ']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
	}
*/
}
}
