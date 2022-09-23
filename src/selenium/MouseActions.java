package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions
{
  public static void main(String[] args) throws InterruptedException 
  {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	  driver.get("https://www.cricbuzz.com/");
	  driver.manage().window().maximize();
    Thread.sleep(2000);
    
    Actions mouse = new Actions(driver);  //Action is an interface 
    
    WebElement livescore = driver.findElement(By.xpath("//a[@title='Live Cricket Score']"));
    Thread.sleep(2000);
    mouse.moveToElement(livescore).click().build().perform();
    Thread.sleep(2000);
    
    WebElement fb=driver.findElement(By.xpath("//a[@title='Facebook']"));
    JavascriptExecutor b =(JavascriptExecutor)driver;
    b.executeScript("arguments[0].scrollIntoView(true)", fb);
    
	
//    JavascriptExecutor a = (JavascriptExecutor)driver;  // JavascriptExecutor is a interface in selenium
//    a.executeScript("window.scrollBy(0,1000)");        // use to scroll down and up window by pixel size 
    
   
     
    System.out.println("**************************************************************************************");
    
//    driver.get("https://demoqa.com/droppable/");
//    driver.manage().window().maximize();
//	Thread.sleep(2000);
//	
//	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
//	WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
//	
//	Thread.sleep(2000);
//	
//	Actions act=new Actions(driver);
//	
//	act.dragAndDrop(drag, drop).perform();
	
	
	
 

//	Methods of actions class
//	act.click();
//	act.contextClick();                   - click the right button of mouse
//	act.doubleClick();
//	act.moveToElement(button);            - to move the cursl of mouse on element
//	act.build();                          - to join two different method by using method chaining
//	act.perform();
//	act.dragAndDrop(livescore, livescore) -to drag and drop functionality
    

 
	
}
}