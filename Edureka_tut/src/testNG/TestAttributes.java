package testNG;

import org.testng.annotations.Test;

public class TestAttributes {
  @Test
  public void f() {
  }
  
  @Test(dependsOnMethods = {"b"})
  public void a() {
  }
  
  @Test(priority = 0)
  public void b() {
  }
}
