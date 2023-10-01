package WebBrowserConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackAndForwardNavigations {// Back and  forward simulation

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.ebay.com/");// To Launch URL
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com");// Launching External URL
		driver.navigate().back();// Clicking on the back arrow on the browser
		
		Thread.sleep(3000);
		driver.navigate().forward();// Clicking on the forward arrow key on the browser
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();// To refresh

	}

}
