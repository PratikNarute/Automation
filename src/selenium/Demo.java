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

public class Demo 
{
	public static WebDriver driver;
	public static void Screenshot() throws IOException
	{
		Date d= new Date();
		String store=d.toString().replace(":", "-");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\prajwal narute\\Pictures\\Selenium\\Screenshot"+store+".png");
		FileHandler.copy(source, dest);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		
	    driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		Screenshot();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("arijit singh");
		Screenshot();
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		Screenshot();
	}

	
		
}



