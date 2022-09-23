package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

      // POM class strickly follow the Encapsulation and Abstraction concept
{
	@FindBy(xpath=" //span[text()='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leave;
	
	
	
	
	public HomePage(WebDriver driver) // [Initialize the elements by xpath] [pass argument as driver to call the web driver interface  methods]
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	 // store operation of web element in non static methods
	public void AdminTab()
	{
		admin.isDisplayed();
	}
	
	public void PIM_Tab()
	{
		pim.isDisplayed();
	}
	
	public void LeaveTab()
	{
		leave.isDisplayed();
	}

}
