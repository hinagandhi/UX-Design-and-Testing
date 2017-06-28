package seleniumTesting;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testCases   {
 WebDriver driver;
 WebElement temp;
 public void goToWebpage()
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hina\\chromedriver_win32\\chromedriver.exe"); 
	 driver = new ChromeDriver();	
	 driver.get("http://7xqpvl.axshare.com/#c=2");
 }
 public void orderHboProvider() 
 {
     try{
       temp = driver.findElement(By.id("u27_img"));
       //driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
       Thread.sleep(3000);
       temp.click();
     }catch(Exception e)
     {
    	 System.out.println("Error: " + "There is no element order HBO GO"); 
     }
      try
      {
       temp = driver.findElement(By.id("u43_img"));   
       //driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
       Thread.sleep(4000);
       temp.click();
      }catch(Exception e)
      {
    	System.out.println("Error: " + "There is no element Charter | Spectrum");
      }   
 }
 public void fillNoInformation()
 {
	try{
	Thread.sleep(4000);	
	driver.findElement(By.id("u70_img")).click();
	//driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS)
	}catch(Exception e)
	{
		System.out.println("Error: " + "There is no element Register");	
	}
 }
 public void fillSomeInformation()
 {
	 try{
		driver.findElement(By.id("u57_input")).sendKeys("John"); 
		Thread.sleep(3000);
		}catch(Exception e)
	    {
			 System.out.println("There is no such element text input Name");
		 }
	  try
	  {
		driver.findElement(By.id("u62_input")).sendKeys("john@gmail.com");
		Thread.sleep(3000);
	  }catch(Exception e)
	  {
		  System.out.println("There is no such element email address");
	  }
	  try{
		driver.findElement(By.id("u63_input")).sendKeys("231 Park Drive");
		driver.findElement(By.id("u70_img")).click();
	  }catch(Exception e)
	  {
		  System.out.println("There is no such element street");
	  }
 }
 public void fillAllInformation()
 {

	 try{
		driver.findElement(By.id("u58_input")).sendKeys("17");
		Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element apartment number"); 
	 }
	 try{
		driver.findElement(By.id("u59_input")).sendKeys("Boston");
		Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element state");
	 }
	 try{
		driver.findElement(By.id("u60_input")).sendKeys("456");
		Thread.sleep(3000);
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element State");
	 }
	 try{
		driver.findElement(By.id("u61_input")).sendKeys("02215");
		Thread.sleep(5000);
		}catch(Exception e)
	 {
			 System.out.println("There is no such element street");
	 }
		driver.findElement(By.id("u70_img")).click();
		
 }
 
 public void fillCorrectInformationAndLogin()
 {
	 try{
	 driver.findElement(By.id("u60_input")).clear();
	 Thread.sleep(2000);
	 driver.findElement(By.id("u60_input")).sendKeys("MA");
	 Thread.sleep(4000);
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element state");
	 }
	 driver.findElement(By.id("u66_img")).click();
 }
 public void continueBrowsing()
 {
	 try{
		 Thread.sleep(4000);
		 driver.findElement(By.id("u104_img")).click();
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element start browsing");
	 }
//	 try{
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("u264_img")).click();
//	 }catch(Exception e)
//	 {
//		 System.out.println("There is no such element notification");
//	 }
	 try{
		 Thread.sleep(4000);
		 driver.findElement(By.id("u262_img")).click();
	 }catch(Exception e)
	 {
		 System.out.println("There is no such element language");
	 }
	 try{
		 Thread.sleep(4000);
		 driver.findElement(By.id("u260_img")).click();
		 Thread.sleep(4000);
	 }catch(Exception e)
	 {
		 System.out.println("There is no such section continue watching");
	 }
	 driver.close();
 }
 public void showError()
 {
	 try{
	 driver.findElement(By.id("u2291_img")).click(); 
	 }catch(Exception e)
	 {
		 System.out.println("There is no such section 'All Section'"); 
	 }
 }
 
}
