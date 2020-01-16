package DemoTrip.RateTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultSearch {
	
	@FindBy(xpath="//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[4]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div[1]/div[1]")
	private WebElement resultClick;
	
	public ResultSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void firstClubClick() throws InterruptedException {
		Thread.sleep(3000);
		resultClick.click();	
	}

}
