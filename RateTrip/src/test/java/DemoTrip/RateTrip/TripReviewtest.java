package DemoTrip.RateTrip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TripReviewtest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();		
	}
	
	@Test
	public void newReview() throws InterruptedException {
		LaunchPage launchPage = new LaunchPage(driver);
		SearchPage searchPage = new SearchPage(driver);
		ResultSearch resultSearch = new ResultSearch(driver);
		ReviewClick reviewClick =  new ReviewClick(driver);
		RatingClick ratingClick = new RatingClick(driver);
		
		launchPage.searchLaunch();
		searchPage.enteredSearch();
		resultSearch.firstClubClick();
		ratingClick.overallRatingClick();
		
	}

//	@AfterTest
//	public void closeBrowser() {
//		
//	}
}
