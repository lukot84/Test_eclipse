package testNG_pom;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MainTest extends TestBase{
  @Test
  public void f() {
	  PageTest pageTest = PageFactory.initElements(driver, PageTest.class);
	  pageTest.setSearch("Java");
	  pageTest.clickSearch();	  
  }
}
