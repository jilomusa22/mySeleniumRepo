package WebBrowserConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingConcept {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/MouseHover.php");
		driver.manage().window().maximize(); // Maximize window
	//	driver.manage().window().minimize(); // Minimize window
		
	//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		

		// driver.get("https://www.ebay.com/");

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(400);
		
	//	driver.findElement(By.xpath("//imput[@type='submit']")).click();// I Create My own xpath
		
		
	//	driver.switchTo().frame("mainpanel");
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();// I created mine
	}

}
