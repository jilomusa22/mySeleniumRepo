package WebBrowserConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitConcept {
	private static final String SECONDS = null;

// When Application is very slow to launch, and there is timeout issues

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);// PageLoad TimeOut
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//Dynamic wait--For actions on all elements

		// If elements events are completed within 2 sec for eg, it will proceed, unlike
		// Thread.Sleep
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();// To clear all cookies

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());

	}

}
