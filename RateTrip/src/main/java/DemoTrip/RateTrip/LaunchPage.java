package DemoTrip.RateTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage {

	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[5]/div")
	private WebElement clickSearch;
	
	public LaunchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public void searchLaunch() throws InterruptedException {
		Thread.sleep(3000);
		clickSearch.click();
		//clickSearch.click();	
		}
	}
