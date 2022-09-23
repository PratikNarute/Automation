package HomeWorkFindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeeksForGeeks 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
	  
	    driver.get("https://www.w3schools.com/sql/");
	    
	    WebElement signbutton=driver.findElement(By.xpath("//a[@title='Java Tutorial']"));
	    signbutton.click();
	   
	    

	
}
}
