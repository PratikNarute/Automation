package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupChhildWindow 
{
    public static void main(String[] args) throws InterruptedException
    {
   	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	
    	driver.get("https://www.w3schools.com/js/js_popup.asp ");
    	driver.manage().window().maximize();
//   	
//    	WebElement alert=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]"));
//    	WebElement confirm=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[2]"));
//    	WebElement prompt=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[3]"));
//    	WebElement line=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[4]"));
//  	
//    	alert.click();
//    	Thread.sleep(2000);
//    	
//    	confirm.click();
//    	Thread.sleep(2000);
//    	
//    	prompt.click();
//    	Thread.sleep(2000);
//    	
//    	line.click();
//    	Thread.sleep(2000);
//    	
//    	
//    	String main=driver.getWindowHandle();    //Address of main window
//    	System.out.println("main: "+main);
//    	
//    	ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());  //address main and child windows 
//    	
//    	System.out.println(addr.get(0));
//    	
//    	System.out.println(addr.get(1));
//    	System.out.println(addr.get(2));
//    	System.out.println(addr.get(3));
//    	System.out.println(addr.get(4));
//    	
//    	
//    	
//    	for (int a=1;a<addr.size();a++)//a=2
//    	{
//    		driver.switchTo().window(addr.get(a));
//    		String url=driver.getCurrentUrl();
//    		System.out.println("index"+a+":"+url);
//    		Thread.sleep(2000);
//    			
//    	}
   
   	
   System.out.println("*********************************************************************************************");	
     
       
	
	
    List<WebElement> button=driver.findElements(By.xpath("//a[contains(text(),'Try it Yourself »')]"));
    // findElements it is use to find the same element which is show multiple matching

	button.get(0).click();
	Thread.sleep(2000);	
	button.get(1).click();
	Thread.sleep(2000);
	button.get(2).click();
	Thread.sleep(2000);
	button.get(3).click();
	Thread.sleep(2000);
	
	
	String main=driver.getWindowHandle();    //Address of main window
	System.out.println("main: "+main);
	
	ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());  //address main and child windows 
	
	System.out.println(addr.get(0));
	
	System.out.println(addr.get(1));
	System.out.println(addr.get(2));
	System.out.println(addr.get(3));
	System.out.println(addr.get(4));
	
	
	for (int a=1;a<addr.size();a++)
	{
		driver.switchTo().window(addr.get(a));
		String url=driver.getCurrentUrl();
		System.out.println("index"+a+":"+url);
		Thread.sleep(2000);
			
	}

	
    	
    	
   	
    	
    	
    	
	}
}
