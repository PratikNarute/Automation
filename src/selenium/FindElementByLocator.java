package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLocator 
{
  

public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://www.facebook.com/");
	driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
	
	// find element element by attributes [ Not too much efective for locating elements
//
	WebElement Name=driver.findElement(By.id("email"));
	Name.sendKeys("8625812214");
	Thread.sleep(2000);
	
	WebElement Pass=driver.findElement(By.id("pass"));
	Pass.sendKeys("8007808212");
	Thread.sleep(2000);
	
	WebElement Submit=driver.findElement(By.name("login"));
	Submit.click();
	

	
	
System.out.println("==================================================================");

       // xpath
	
 // 1) xpath by tag name+attribute       // xpath("//tag name[@attribute= 'attribute value']");
 // 2) xpath by tag name+text           //  xpath("//tag name[text()='text value']");
	                               
//	WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
//	name.sendKeys("862585555");
//	Thread.sleep(2000);
//	
//	WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
//	password.sendKeys("862585555");
//	Thread.sleep(2000);
//	
//	WebElement click=driver.findElement(By.xpath("//button[text()='Log In']"));
//	click.click();
    
                                    
System.out.println("=====================================================================");

	
 // 3) xpath by contains       // xpath("(// tag name[contains(@attribute, 'partial attribute value' )])")
	
//    WebElement username=driver.findElement(By.xpath("(//input[contains(@type,'text' )])"));
//    username.sendKeys("86258212214");
//    Thread.sleep(2000);
//    
//    WebElement pass=driver.findElement(By.xpath("(//input[contains( @class,'inputtext' ) ] )[2]"));
//    pass.sendKeys("86258212214");
//    Thread.sleep(2000);
//    
//    WebElement sign=  driver.findElement(By.xpath("(//button[contains(@value,'1' )])"));
//    sign.click();

System.out.println("=====================================================================");


 // 4) Absolute xpath

//    WebElement username=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//    username.sendKeys("86258212214");
//    Thread.sleep(2000);
//
//    WebElement pass=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
//    pass.sendKeys("86258212214");
//    Thread.sleep(2000);
//
//    WebElement sign=  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
//    sign.click();
    
    
System.out.println("=====================================================================");


 // 5) relative xpath         xpath("//parent//child") //locate parent element
//
//      WebElement username=driver.findElement(By.xpath("//form[@class='_9vtf']//input[@type='text']"));
//      username.sendKeys("86258212214");
//      Thread.sleep(2000);
//
//      WebElement pass=driver.findElement(By.xpath("//div[@id='passContainer']//input[@name='pass']"));
//      pass.sendKeys("86258212214");
//      Thread.sleep(2000);
//
//      WebElement login= driver.findElement(By.xpath("//div[@class='_6ltg']//button[@value='1']"));  // locate imigiate parent element
//      login.click();

 System.out.println("=====================================================================");
    
    // keywords of xpath
 
                // 1) parent keyword  
//    WebElement name=driver.findElement(By.xpath("//input[@type='text']/parent::div")); [Locate imidiate parent element]
//    name.sendKeys("8625812214");
//    Thread.sleep(2000);
//    
//    WebElement pass=driver.findElement(By.xpath("//input[@id='pass']/ancestor::div ")); [Locate grand parent element]
//    pass.sendKeys("86258212214");
//    Thread.sleep(2000);
//    
//    WebElement click=driver.findElement(By.xpath("//button[@value='1']/parent::div"));
//    click.click();
 
            // 2) and keyword [high chance of accurate locating]
//      WebElement id=driver.findElement(By.xpath("//input[@name='email' and @type='text']"));
//      id.sendKeys("8625812214");
//      Thread.sleep(2000);
//      
//      WebElement pass=driver.findElement(By.xpath("//input[contains(@class, 'inputtext') and @name='pass']"));
//      pass.sendKeys("3rjuunkiu8");
//      Thread.sleep(2000);
//      
//      WebElement login=driver.findElement(By.xpath("//button[text()='Log In' and @name='login']"));
//      login.click();
      
            // 3) or keyword [low chance of accurate locating]
//      WebElement id=driver.findElement(By.xpath("//input[@name='email' or @type='text']"));
//      id.sendKeys("8625812214");
//      Thread.sleep(2000);
//      
//      WebElement pass=driver.findElement(By.xpath("//input[@type='password' or @name='pass']"));
//      pass.sendKeys("3rjuunkiu8");
//      Thread.sleep(2000);
//      
      WebElement login=driver.findElement(By.xpath("//button[text()='Log In' or @name='login']"));
      login.click();
     
      
       
        

      

   }
}
