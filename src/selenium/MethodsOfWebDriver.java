package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver 
{
 public static void main(String[] args) throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();  //open chrome browser
	
	driver.get("https://www.facebook.com/");  //start to open url in chrome browser
	//Thread.sleep(3000);
/*	
	driver.navigate().to("https://www.facebook.com/"); //start to navigate url
	Thread.sleep(2000);
	
	driver.navigate().back(); // to perform backword operation
	Thread.sleep(3000);
	
	driver.navigate().forward(); // to perform forward operation
	Thread.sleep(3000);
	
	driver.navigate().refresh(); // to perform page reload or refresh operation
	Thread.sleep(3000);
	System.out.println("==================================================================");
	
	String url=driver.getCurrentUrl(); //to get current url
	System.out.println(url);
	Thread.sleep(3000);
	
	String title=driver.getTitle();  // to get page title
	System.out.println(title);
	System.out.println("==================================================================");
	
	
	driver.manage().window().maximize(); // maximize browser
	Thread.sleep(2000);
	
	//driver.manage().window().minimize();  // minimize browser
	 Thread.sleep(2000);
		
	
	Dimension d=new Dimension(350,400);  // Dimension of object (W,L)
	driver.manage().window().setSize(d); // To set size of app
	Thread.sleep(2000);
	
	
	Point p=new Point(300,100);  //object of point (X,Y)
	driver.manage().window().setPosition(p);  // To set the position
	Thread.sleep(3000);
	
	System.out.println("==================================================================");
	driver.close();  // close current tab those tab open by selenium
	driver.quit();   // close browser completly those open by selenium
	
	
	System.out.println("==================================================================");
	
     

	
*/



 }
}




