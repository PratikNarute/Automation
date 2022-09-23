package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupFrameWindow 
{
	public static void main(String[] args) throws InterruptedException
    {
   	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.w3schools.com/js/js_popup.asp ");
    	driver.manage().window().maximize();
    	  
    	
    	WebElement alert=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]"));
    	alert.click();
    	      
        String main=driver.getWindowHandle();                                     // to address the main window
        ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles()); // to address the main and child windows
        
        driver.switchTo().window(addr.get(1));
        
//        driver.switchTo().frame(1);  // by index
        driver.switchTo().frame("iframeResult");  // name&id
//        driver.switchTo().frame(iframe); // by ref of web element of iframe xpath
        Thread.sleep(2000);
      
        WebElement button= driver.findElement(By.xpath("//button[text()='Try it']"));
//        button.click();
     
       
        //driver.switchTo().parentFrame();      // to switch the focus on imigidiate parent frame window
        driver.switchTo().defaultContent();    //to switch the focus on main page
          
        WebElement theam= driver.findElement(By.xpath("//a[@title='Change Theme' and @onclick='retheme()']"));
        theam.click();
       

}
}