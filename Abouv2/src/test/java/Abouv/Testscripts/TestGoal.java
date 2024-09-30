package Abouv.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Abouv.Pages.CategoryHearPage;
import Abouv.Pages.GoalPage;
import Abouv.Pages.WelcomePage;

public class TestGoal extends TestBase {
	
	GoalPage go;
  @Test
  public void goaltextVerification() {
	  go=new GoalPage(driver);
	  Assert.assertTrue(true);
  }
}
