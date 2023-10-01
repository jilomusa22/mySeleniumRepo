package WebBrowserConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverOrHeadlessConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();// It is a class
		// HtmlUnitDriver() is other wise--- 
		//called Ghost Driver(Browser not launching)
		// It is very fast---performance is improved
		// We call this headless Browser:
		//Types of Headless Browser are--HtmlUnitBrowser---Java, PhantomJS---JavaScript
		// It is not suitable for Actions class---User actions, mouse movement, double
		// click, drag and drop.
		// Use it only on small script/test case----

		// This is not available in Selenium 3.x version
		// We have to download it from MVN Repository

		// driver.get("https://www.ebay.com/");
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		String title = driver.getTitle();// Get title
		System.out.println(title);

		String str = driver.getCurrentUrl();
		System.out.println(str);

	}

}
