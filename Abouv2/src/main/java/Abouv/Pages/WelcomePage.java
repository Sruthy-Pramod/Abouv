package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abouv.PageUtilities.MouseUtilities;

public class WelcomePage {
	public WebDriver driver;

	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signup;
	
	public WelcomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void sihnUp() throws InterruptedException
{
	signup.click();
}
}
