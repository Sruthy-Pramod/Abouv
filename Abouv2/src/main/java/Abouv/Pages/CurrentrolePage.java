package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentrolePage {
	public WebDriver driver;

	@FindBy(xpath="//p[contains(text(),'Student')]")
	WebElement student;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="What's your goal?")
	WebElement goal;
	public CurrentrolePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public boolean familyFreiends() throws InterruptedException
{
	student.click();
	continuebutton.click();
	boolean b=goal.isDisplayed();
	return b;
}
}


