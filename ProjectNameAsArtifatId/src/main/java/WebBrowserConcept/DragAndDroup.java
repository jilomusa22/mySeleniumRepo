to mouse overpackage WebBrowserConcept;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDroup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

	//	driver.get("https://www.ebay.com/");
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();// To clear all cookies

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().frame(0);// If only frame is present
		// Interview questions
		
		Thread.sleep(5000);// This is a static/Hard wait
		Actions action = new Actions(driver);	// Actions Class is used to mouse over
		
		 action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build()
		.perform();
		
		

	}

}
