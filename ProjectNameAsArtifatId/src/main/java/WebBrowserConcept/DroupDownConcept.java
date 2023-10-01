package WebBrowserConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DroupDownConcept {// newtours Application

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);

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

		// Flights Linktest

		driver.findElement(By.linkText("Flights")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();

		// passCount
		// Drop Down Handling
		Select select = new Select(driver.findElement(By.name("passCount")));

		select.selectByVisibleText("4");
		Thread.sleep(1000);
		// fromPort
		Select select1 = new Select(driver.findElement(By.name("fromPort")));
		select1.selectByVisibleText("London");
		Thread.sleep(1000);
		// fromMonth
		Select select2 = new Select(driver.findElement(By.name("fromMonth")));
		select2.selectByVisibleText("May");
		Thread.sleep(2000);
		// fromDay
		Select select3 = new Select(driver.findElement(By.name("fromDay")));
		select3.selectByVisibleText("4");
		Thread.sleep(1000);

		// toPort

		Select select4 = new Select(driver.findElement(By.name("toPort")));
		select4.selectByVisibleText("Sydney");

		Thread.sleep(2000);
		// toDay
		
		Select selectx = new Select(driver.findElement(By.name("toMonth")));
		selectx.selectByVisibleText("April");
		Thread.sleep(1000);

		Select select5 = new Select(driver.findElement(By.name("toDay")));
		select5.selectByVisibleText("10");
		Thread.sleep(1000);

		// radio
		driver.findElement(By.xpath("//input[@value='First']")).click();
		Thread.sleep(1000);
		

		// airline
		Select select7 = new Select(driver.findElement(By.name("airline")));
		select7.selectByVisibleText("Blue Skies Airlines");
		Thread.sleep(1000);

		// findFlights
		driver.findElement(By.name("findFlights")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();// To refresh
		////a[contains(text(),'Hotels')]
		
	//	driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hotels')]")).click();
	}

}
