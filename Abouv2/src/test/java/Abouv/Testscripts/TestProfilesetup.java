package Abouv.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abouv.Pages.CategoryHearPage;
import Abouv.Pages.ProfilesetupPage;
import Abouv.Pages.WelcomePage;

public class TestProfilesetup extends TestBase {
	
	ProfilesetupPage cat;
  @Test
  public void tellustextVerification() throws InterruptedException {
	  cat=new ProfilesetupPage(driver);
	  cat.otpverification();
	  Assert.assertTrue(true);
  }
}
