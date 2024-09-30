package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryHearPage {
	public WebDriver driver;

	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement familyfriends;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="//p[contains(text(),'Current Role?')]")
	WebElement currentrole;
	public CategoryHearPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public boolean familyFreiends() throws InterruptedException
{
	familyfriends.click();
	continuebutton.click();
	boolean b=currentrole.isDisplayed();
	return b;
}
}
