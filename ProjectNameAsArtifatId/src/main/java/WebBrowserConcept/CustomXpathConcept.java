package WebBrowserConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); // Maximize window
		// *[@id="gh-ac"]
		// html/body/div[4]/div/header/table/tbody/tr/td[5]/form/table/tbody/tr/td[1]/div[1]/div/input[1]

		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Books");
		// driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Chairs");
		// combobox
		// driver.findElement(By.xpath("//input[contains(@role,'combobox')]")).sendKeys("Cups");
		// Use Contains when Id is changing/Dynamic, eg id=test_123 to id=test_652

		// Use contains Or ends-with
		// id=1235_test_y
		// id=34251_test_y
		// id=7680_test_y
		// Either of the twos below
		// driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Cups");
		// driver.findElement(By.xpath("//input[ends-with(@id,'-ac')]")).sendKeys("cup");
		// gh-ac
		// Use starts-with
		// id=test_761
		// id=test_091

		Thread.sleep(4000);
		// Dont use absolute xpath, it is very slow, it will fail the next day(Change at
		// anytime).
		// driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("Pen");//
		// eg of id
		// driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Pen");
		// Expand Watch List
		driver.findElement(By.xpath("//a[contains(text(),' Sell')]")).click();// This is working
		// driver.findElement(By.id("gh-btn")).click();
		// Search for anything

	}

}
