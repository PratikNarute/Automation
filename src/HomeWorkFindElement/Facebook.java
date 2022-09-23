package HomeWorkFindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
 System.out.println("====================================================================================");	
		
//		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//		Thread.sleep(2000);
//		
//		WebElement radio=driver.findElement(By.xpath("//input[@name='sex' and @value='-1']"));
//		radio.click();
//		Thread.sleep(2000);
//		
//		boolean a=radio.isSelected();  //after clicking the botton will selected or not
//		System.out.println(a);
//		Thread.sleep(2000);
//		
//		boolean b=radio.isDisplayed();  // to sure  that the element use for UI functionality or not
//		System.out.println(b);
//		Thread.sleep(2000);
//		
//		if (b==true)
//		{
//			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("8625812214");
//			
//		}
   System.out.println("====================================================================================");	
//		WebElement text=driver.findElement(By.xpath("//button[text()='Log In']"));
//		String txt=text.getText();  // to show the text of tag
//		System.out.println(txt);
//		
//		String expectedTxt="Log In";
//		
//		if(txt.equals(expectedTxt))
//		{
//			System.out.println("test case is pass");
//		}
//		
	System.out.println("====================================================================================");	
	
	    WebElement button=driver.findElement(By.xpath("//button[text()='Log In']"));
	    boolean result=button.isEnabled(); //focus or non focus
	    Thread.sleep(2000);
	    
	    if (result==true)
	    {
	    	button.click();
	    }
	    else
	    {
	    	System.out.println("button is disabled");
	    }
	    
	 System.out.println("====================================================================================");	
	
	   }
}
