package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFunctionality
{
  public static void main(String[] args) throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    WebElement day=driver.findElement(By.xpath(" //select[@id='day']"));
		    Select s1=new Select(day);
		    s1.selectByIndex(0);
		    Thread.sleep(2000);
		    
		    WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		    Select s2=new Select(month);
		    s2.selectByValue("1");
		    Thread.sleep(2000);
		    
		    WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		    Select s3=new Select(year);
		    s3.selectByVisibleText("1997");
		    Thread.sleep(2000);
		    
	
  }
}
