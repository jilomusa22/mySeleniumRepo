package WebBrowserConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver;
		driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// Waiting on
		// specific element from DB to get
		// registered
		// This is also called synchronization wait
		driver.get("https://www.ebay.com/");// To Launch URL
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();

	//	clickOn(driver, driver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a")), 20);

		driver.findElement(By.xpath("//*[@id=\"gh-p-2\"]/a")).click();
//		WebDriverWait  wait = new WebDriverWait(driver,10);
		// #gh-p-2 > a

	}

//	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
	//			.until(ExpectedConditions.elementToBeClickable(locator));
	//	locator.click();
	

}
