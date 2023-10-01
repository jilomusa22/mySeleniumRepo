package WebBrowserConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMvmtDragDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();// To clear all cookies
		// driver.manage().window().minimize(); // Minimize window

		// driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		// driver.get("https://www.ebay.com/");

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		if(title.equals("Practice handling Alerts in selenium webdriver")) {
			
			System.out.println("Launh was successful");
			
		}else {
			
			System.out.println("Launch Failed");
		}
		
	//	driver.findElement(By.name("Allow")).click();

	//	Alert alert = driver.switchTo().alert();// Handling Alerts

	//	System.out.println(alert.getText());

		Actions action = new Actions(driver);// Mouse over is done by action class
	//	sub-menu
		action.moveToElement(driver.findElement(By.id("sub-menu"))).build().perform();
	//  action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Mouse Hover DropDown')]"))).build().perform();
	//	driver.findElement(By.xpath("//a[contains(text(),'Link 2')]")).click();// I created mine
		
	 driver.findElement(By.id("link1")).click();
    //Mouse Hover DropDown
	}

}
