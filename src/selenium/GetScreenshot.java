package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot
{
	public static WebDriver driver;

	public static void Screenshot() throws IOException
     {
    	    Date d= new Date();  // to find current date and time 
    	    
    	    String store= d.toString().replace(":", "-");  // store= Mon Aug 22 9-55 pm
    	    
    	    

			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		
    		File dest=new File("C:\\Users\\prajwal narute\\Pictures\\Selenium\\Screenshot"+store+".png");
    		
    		FileHandler.copy(source, dest);
     }
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		    System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			  driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			Screenshot();
			
			
			WebElement sign=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			sign.click();
			Thread.sleep(5000);
			Screenshot();
			
	}
}
