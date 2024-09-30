package Abouv.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abouv.Pages.WelcomePage;

public class TestWelcome extends TestBase{
	WelcomePage wel;
  @Test
  public void welcomepage() {
	  wel=new WelcomePage(driver);
	  Assert.assertEquals(null,driver.getTitle());
  }
}
