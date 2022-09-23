package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait 
{
   public static void main(String[] args)
   {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	
   	WebDriver driver=new ChromeDriver();
   	
   	driver.get("https://www.w3schools.com/js/js_popup.asp ");
   	driver.manage().window().maximize();
   	
   	WebElement alert=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]"));
   	alert.click();
   	
   	// Implicitly wait  [put wait on overall webpage]
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //this work for only one exception
   	
   	 
   System.out.println("*************************************************************************'");
   
   
   	// Explicit wait [put wait on specific element] [duration+condition]
   	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10)); // put wait in evary 0.5 sec
        	                                                             //WebDriverWait is class present in selenium
   	
   	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" "))); // It is use to give expected condition until the visibility of element is loacated by xpath. 
   	WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" ")));
   	
   	
    System.out.println("*************************************************************************'");
   	
   	
   	// Fluent wait [duration+polling frequency+condition]
//   	 	Wait <WebDriver> w = new FluentWait <WebDriver> (driver).
//   			withTimeout(Duration.ofSeconds(10)).
//   			pollingEvery(Duration.ofSeconds(2)).
//   			ignoring(NosuchElementException.class);
  
   	

   	
   	
   	
   	
   	
   	
   	
   	
   	
   	
  
    
   	
   	
   }
}
