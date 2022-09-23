package HomeWorkFindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement id=driver.findElement(By.xpath("//input[@name='txtUsername']"));
	id.sendKeys("Admin");
	Thread.sleep(2000);
	
	WebElement pass=driver.findElement(By.xpath("//input[@type='password' and @id='txtPassword']"));
	pass.sendKeys("admin123");
	Thread.sleep(2000);
	
	WebElement click=driver.findElement(By.xpath("//div[@id='divLoginButton']//input[@type='submit']"));
	click.click();
	
	System.out.println("========================================================================================");


	
	}
	

}
