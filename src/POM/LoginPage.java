package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage

              // POM class strickly follow the Encapsulation and Abstraction concept
{
     @FindBy(xpath="//*[text()='Username']")
     private WebElement username;
     
     @FindBy (xpath="//input[@name='password']")
     private WebElement  password;
     
     @FindBy (xpath="//button[@type='submit'] ")
     private WebElement LoginButton;
     
     
     public LoginPage(WebDriver driver) // [Initialize the elements by xpath] [pass argument as driver to call the methods of web driver interface]
     {
    	 PageFactory.initElements(driver,this);
     }
     
     
      // store operation of web element in non static methods
     public void UserName()
     {
    	 username.sendKeys("Admin");
     }
     
     public void Password()
     {
    	 password.sendKeys("admin123");
     }
     
     public void ClickLoginButton()
     {
    	 LoginButton.click();
     }
    
}
