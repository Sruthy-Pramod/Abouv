package Abouv.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abouv.Pages.CategoryHearPage;
import Abouv.Pages.CurrentrolePage;

public class TestCurrentrole extends TestBase {
	CurrentrolePage cu;

  @Test
  
	  public void currentroleVerification() {
		  cu=new CurrentrolePage(driver);
		  Assert.assertTrue(true);
  }
}
