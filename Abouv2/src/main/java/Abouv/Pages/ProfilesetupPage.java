package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilesetupPage {
	public WebDriver driver;

	@FindBy(xpath="//button[contains(text(),'Continue with email')]")
	WebElement conemail;
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement email;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement submit;
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	WebElement otp1;
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[2]")
	WebElement otp2;
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[3]")
	WebElement otp3;
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[4]")
	WebElement otp4;
	@FindBy(xpath="//p[contains(text(),'Tell us about yourself?')]")
	WebElement tellus;
	public ProfilesetupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public boolean otpverification() throws InterruptedException
{
	conemail.click();
	email.sendKeys("sruthypramod1992@gmail.com");
	submit.click();
	otp1.sendKeys("");
	otp2.sendKeys("");
	otp3.sendKeys("");
	otp4.sendKeys("");
	submit.click();
	boolean b=tellus.isDisplayed();
	return b;
}
}


