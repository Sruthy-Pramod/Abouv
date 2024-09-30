package Abouv.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUPage {
	public WebDriver driver;

	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement mobile;
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement continuebutton;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement otp1;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[2]")
	WebElement otp2;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[3]")
	WebElement otp3;
	@FindBy(xpath="//body/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/input[4]")
	WebElement otp4;
	@FindBy(xpath="//button[contains(text(),'Continue'")
	WebElement contine;
	
	public SignUPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void sign() throws InterruptedException
{
	mobile.sendKeys("8089466161");
	
	continuebutton.click();
	otp1.sendKeys(" ");
	otp2.sendKeys(" ");
	otp3.sendKeys(" ");
	otp4.sendKeys(" ");
	contine.click();
}
}



