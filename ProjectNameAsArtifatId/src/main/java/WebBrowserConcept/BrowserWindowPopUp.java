package WebBrowserConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUp {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.ebay.com/");
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.id("xxxxx")).click();// Assume we click and window popup appeared.
		           // object
		Set<String>  handle  =driver.getWindowHandles();
		
		Iterator<String>  itr =handle.iterator();
		String parentWidowId=itr.next();
		
		System.out.println("Parent window id "+parentWidowId);
		
		String childWidowId=itr.next();
		
		System.out.println("Child window id "+childWidowId);
		
		driver.switchTo().window(childWidowId);
		System.out.println("Child Window PopUp title"+ driver.getTitle());
		
		driver.close();// Don't use driver. quit
		
		driver.switchTo().window(parentWidowId);
		
	    System.out.println("Parent windowId title"+ driver.getTitle());

	}

}
