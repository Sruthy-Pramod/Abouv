package Abouv.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abouv.Pages.CategoryHearPage;
import Abouv.Pages.WelcomePage;

public class TestCategoryHear extends TestBase {
	
	CategoryHearPage cat;
  @Test
  public void currentroleVerification() {
	  cat=new CategoryHearPage(driver);
	  Assert.assertTrue(true);
  }
}
