package Abouv.Testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop=null;
	public static WebDriver driver;
  @Test
  public void testBase() {
	  try
	  {
		  prop=new Properties();
		  FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"src\\test\\resources\\Config.Properties"
				  );
		  prop.load(ip);
	  }
	  
		  catch(FileNotFoundException e)
	  {
		  e.printStackTrace();
	  }
	  catch(IOException e)
	  {
		  e.printStackTrace();
	  }
  }
 

  
	  private String takesScreenShotOnFailure(String name) throws IOException {
		  String dateName=new SimpleDateFormat("YYMMddmmhhss").format(new Date());
		  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  String destination=System.getProperty("user.dir")+"\\target\\"+name+dateName+".png";
		  File finaldestination=new File(destination);
		  FileUtils.copyFile(source,finaldestination);
		  return destination;
		
	}

@BeforeTest
  public void beforeTest() throws InterruptedException {
	 WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	 driver.get("https://rebune.com/en");
	 driver.manage().window().maximize();
	
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
