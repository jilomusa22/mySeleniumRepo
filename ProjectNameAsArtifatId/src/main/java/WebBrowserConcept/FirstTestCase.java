package WebBrowserConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {
	// Selenium supports only web applications.No desk top application like Go to
	// meeting, Skipe etc
	// Selenium support multiple browser
	// It is lightweight
	// It is in the for of API, No look and field/UI
	// It is an open source

//	@Test

	// Chrome Driver
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		// System.out.println(driver.getTitle());
		String title = driver.getTitle();// Get title
		System.out.println(title);
		
		// Validation Point

		if (title.equals("Google")) {
			
			System.out.println("Correct Title");

		}else {
			
			System.out.println("In-Correte Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
	//	System.out.println(driver.getPageSource());
		
	//	driver.quit();// To quit the browser
		
	//	driver.close();// To quit or close browser

	}

}
