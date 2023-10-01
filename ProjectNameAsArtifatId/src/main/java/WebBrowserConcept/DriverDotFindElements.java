package WebBrowserConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverDotFindElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.ebay.com/");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();// Get title
		System.out.println(title);

		String str = driver.getCurrentUrl();
		System.out.println(str);
		// 1. get the total count of links. Link always has <a,
		// 1.a get the total number of input. as represented as <inpit
		// 1.c get the total number of button
		// 2. get the text of each link on the page

		List<WebElement> linkList1 = driver.findElements(By.tagName("a"));
		// List<WebElement> linkList2 =driver.findElements(By.tagName("input"));
		// List<WebElement> linkList3 =driver.findElements(By.tagName("button"));
		// size of linklist
		System.out.println(linkList1.size());

		for (int i = 0; i < linkList1.size(); i++) {

			String linkTest = linkList1.get(i).getText();
			System.out.println(linkTest);
		}

	}

}
