package testNG_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageTest {
	
	WebDriver driver;

	public PageTest(WebDriver driver) {
		this.driver = driver;
	}
	
@FindBy(id = "twotabsearchtextbox") WebElement searchBox;
//@FindBy(how = How.ID ,using = "twotabsearchtextbox") WebElement searchBox;
@FindBy(className = "nav-input") WebElement searchClick;
	
public void setSearch(String searchText){
	searchBox.sendKeys("Java");
}

public void clickSearch(){
	searchClick.click();
}

}
