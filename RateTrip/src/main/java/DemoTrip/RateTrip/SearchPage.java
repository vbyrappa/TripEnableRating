package DemoTrip.RateTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy(id="mainSearch")
	private WebElement enterSearch;
	
	@FindBy(id="SEARCH_BUTTON")
	private WebElement searchClickContent;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteredSearch() {
		enterSearch.sendKeys("Club Mahindra");
		enterSearch.click();
		searchClickContent.click();
	}

}
