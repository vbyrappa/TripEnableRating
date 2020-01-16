package DemoTrip.RateTrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RatingClick {
	
	@FindBy(xpath="//*[@id=\"bubble_rating\"]")
	private WebElement circleClick;
	
	@FindBy(xpath="//*[@id=\"bubble_rating\"]")
	private WebElement circleClick5;
	
	@FindBy(name="ReviewTitle")
	private WebElement titleReview;
	
	@FindBy(name="ReviewText")
	private WebElement yourReview;
	
	@FindBy(name="noFraud")
	private WebElement checkBoxReview;
	
	@FindBy(id="SUBMIT")
	private WebElement finalSubmit;
	
	public RatingClick(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void overallRatingClick() {
		circleClick.click();
		circleClick5.click();
		titleReview.sendKeys("Good Food and Good Service");;
		yourReview.sendKeys("We came to club mahindra and we were welcomed by welcomed drink apple gloc\r\n" + 
				"That good in tast and according to winter and after that we had lunch at panorama restaurant thanks to all food and beverage team for good serive");
		checkBoxReview.click();
		finalSubmit.click();
	}

}
