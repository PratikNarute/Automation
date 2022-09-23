package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CaptureScreenShot
{

	

	public static void main(String[] args) throws InterruptedException, IOException
	   {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement sign=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		sign.click();
		Thread.sleep(2000);
		
	  
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select s3=new Select(year);
	  
		Thread.sleep(2000);

	   
		
		
		
		// Capture Screen shot
		int a=22;
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\prajwal narute\\Pictures\\Selenium\\SR"+a+".png");
		
		FileHandler.copy(source, dest);
		
		
		
		
		  s3.selectByVisibleText("1997");
		
	    	   
		a++;
	   
		File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1=new File("C:\\Users\\prajwal narute\\Pictures\\Selenium\\SR"+a+".png");		
		FileHandler.copy(source1, dest1);
		
		
		
		
		
		
	

}
}