package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
  @Test(groups = {"A"})
  public void f1() {
	  System.out.println("Inside f1");
  }
  
  @Test(groups = {"B"})
  public void f2() {
	  System.out.println("Inside f2");
  }
  
  @Test(groups = {"A"})
  public void f3() {
	  System.out.println("Inside f3");
  }
  
  @Test(groups = {"B"})
  public void f4() {
	  System.out.println("Inside f4");
  }
  
  @BeforeTest(groups = {"A"})
  public void beforeAnyTest() {
	  System.out.println("Before test");
  }
  
  @AfterTest(groups = {"A"})
  public void AfterAllTests() {
	  System.out.println("Afetr test");
  }
  
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("Before method");
  }
  
  @AfterMethod
  public void afetrEveryMethod() {
	  System.out.println("After method");
  }
}
