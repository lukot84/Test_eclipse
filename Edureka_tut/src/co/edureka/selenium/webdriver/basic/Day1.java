package co.edureka.selenium.webdriver.basic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day1 {

	WebDriver driver;
	
	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.edureka.co/blog/alerts-popups-in-selenium");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void searchCourse() {
		try {
			driver.findElement(By.id("wzrk-cancel")).click();
			//Thread.sleep(5000);
			//waitAndClick(driver, driver.findElement(By.className("webinar-box-title")), 10);
			click(driver, driver.findElement(By.className("webinar-box-title")));
			//driver.findElement(By.className("webinar-box-title")).click();
			//driver.findElement(By.cssSelector(".wzrk-alert.wiz-show-animate")).click();
			//driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-accountList']/span[1]")).click();
			System.out.println("FINISHED");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void waitAndClick(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void click(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}
	
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		myObj.searchCourse();

	}

}
