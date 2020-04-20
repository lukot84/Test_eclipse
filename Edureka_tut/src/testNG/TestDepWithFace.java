package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDepWithFace {

	WebDriver driver;

	@Test
	public void invokeBrowser() {

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

	@Test(dependsOnMethods = { "invokeBrowser" })
	public void searchCourse() {
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
			driver.findElement(By.className("nav-input")).click();
			// driver.findElement(By.cssSelector("input.nav-input")).click();
			// driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-accountList']/span[1]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
}
