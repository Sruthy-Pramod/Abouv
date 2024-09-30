package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInfoPage {
	public WebDriver driver;

	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement firstname;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[3]/div[1]/div[2]/input[1]")
	WebElement lastname;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[3]/div[1]/div[3]/input[1]")
	WebElement pincode;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="//div[contains(text(),'Which of these career related issues resonate to y')]]")
	WebElement text;
	public ProfileInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public boolean textverification() throws InterruptedException
{
	firstname.sendKeys("Sruthy");
	lastname.sendKeys("MK");
	pincode.sendKeys("602105");
	continuebutton.click();
	continuebutton.click();
	boolean b=text.isDisplayed();
	return b;

}
}


