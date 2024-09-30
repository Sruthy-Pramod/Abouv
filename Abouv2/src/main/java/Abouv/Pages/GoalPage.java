package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoalPage {
	public WebDriver driver;

	@FindBy(xpath="//p[contains(text(),'Job Opportunities')]")
	WebElement jobopportunities;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="//h2[contains(text(),'Let’s create your profile!')]")
	WebElement letscreate;
	public GoalPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public boolean familyFreiends() throws InterruptedException
{
	jobopportunities.click();
	continuebutton.click();
	boolean b=letscreate.isDisplayed();
	return b;
}
}
