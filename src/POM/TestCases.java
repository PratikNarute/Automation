package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			
			// verify login page
			LoginPage login=new LoginPage(driver);
			login.UserName();
			login.Password();
			login.ClickLoginButton();
			
			
			
			
			
			
			// verify home page
			HomePage home=new HomePage(driver);
			home.AdminTab();
			home.PIM_Tab();
			home.LeaveTab();
		
		
	}

}
