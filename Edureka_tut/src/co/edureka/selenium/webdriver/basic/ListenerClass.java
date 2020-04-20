package co.edureka.selenium.webdriver.basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ListenerClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		ListenerHelper helper = new ListenerHelper();
		eventHandler.register(helper);
		
		eventHandler.navigate().to("https://chercher.tech/java/listeners-selenium-webdriver");
		eventHandler.quit();
		eventHandler.unregister(helper);
		System.out.println("FINISH");

	}

}
