package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert 
{
   public static void main(String[] args) throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	 WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
	 submit.click();
	
	
	 
	 Alert alt=driver.switchTo().alert();  // Alert is interface to lacate the target of pop up window
	 
	    // Methods of Alert
	 alt.accept();       // ok,submit,aceept    
//	 alt.dismiss();      // cancel,dismiss
//	 alt.sendKeys("");
//	 String text=alt.getText();
//	 System.out.println(text);
	
}
}
