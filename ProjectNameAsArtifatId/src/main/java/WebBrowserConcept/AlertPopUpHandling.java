package WebBrowserConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

	   //driver.get("https://www.ebay.com/");
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		String title = driver.getTitle();// Get title
		System.out.println(title);
		
		String str=driver.getCurrentUrl();
		System.out.println(str);
	//OR System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(400);
		
		driver.findElement(By.name("alert")).click();
		
		Alert  alert=driver.switchTo().alert();// Handling Alerts
		
              System.out.println(alert.getText());
              alert.accept();// This will click on OK button
          //  alert.dismiss();// This will click on Cancel button
	}

}
