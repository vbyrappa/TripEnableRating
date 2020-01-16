package DemoTrip.RateTrip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewClick {
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[4]/div/div[1]/div[1]/div/div/div[2]/div/div[2]/div/div[1]/a")
	private WebElement writeClick;
	
	@FindBy(xpath="//*[@id=\"component_8\"]//div/span[contains(@class,'brand-global-nav-action-search-Search__label--3PRUD')]")
	private WebElement clickHead;
	
	public ReviewClick(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void editReview(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		clickHead.sendKeys(Keys.ESCAPE);
		//writeClick.click();	
	}

}
