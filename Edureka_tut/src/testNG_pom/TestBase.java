package testNG_pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestBase {
	
	public static WebDriver driver;
	
  @Test
  public void f() {
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  try {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.amazon.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
	  
  }

}
