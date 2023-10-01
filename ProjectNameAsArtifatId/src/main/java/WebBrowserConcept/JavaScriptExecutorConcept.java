package WebBrowserConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {// Not working as expected

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.ebay.com/");
		driver.get("https://demo.guru99.com/test/newtours/");

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(1000);

		// driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("Musaboo123");
		// password
		driver.findElement(By.name("password")).sendKeys("Musaboo1234");

		Thread.sleep(1000);
		// submit
		driver.findElement(By.name("submit")).click();

	}

//	public static void flash(WebElement element, WebDriver driver) {
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//
//		String bgcolor = element.getCssValue("backgroundColor");
//
//		for (int i = 0; i < 100; i++) {
//
//			changeColor("rgb(0,200,0))", element, driver);
//			changeColor(bgcolor, element, driver);
//		}
//
//	}
//	
//	public static void changeColor(String color, WebElement element,WebDriver, driver) {
//		JavascriptExecutor js= ((JavascriptExecutor) driver);
//		js.executeScript("argument[0].style.background='"+color+"'",element);
//		
//	}

}
