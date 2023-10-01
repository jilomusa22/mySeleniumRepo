package WebBrowserConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();

		FileInputStream input = new FileInputStream(
				"C:\\Users\\msann\\eclipse-workspaceNew\\ProjectNameAsArtifatId\\src\\main\\java\\WebBrowserConcept\\config.properties");

		prop.load(input);

		System.out.println(prop.get("name"));
		System.out.println(prop.get("age"));

		// System.out.println(prop.get("URL")); OR
		String url = prop.getProperty("URL");
		System.out.println(url);

		String bro = prop.getProperty("browser");
		System.out.println(bro);

		if (bro.equals("chrome")) {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.get(url);

			String title = driver.getTitle();// Get title
			System.out.println(title);
			System.out.println(driver.getCurrentUrl());

			driver.manage().window().maximize();
		} else if (bro.equals("FF")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new FirefoxDriver();

			// WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

			Thread.sleep(2000);

			// driver.findElement(By.linkText("SIGN-ON")).click();
			driver.findElement(By.name("userName")).sendKeys("Musaboo123");
			// password
			driver.findElement(By.name("password")).sendKeys("Musaboo1234");
			
			Thread.sleep(2000);
			// submit
			driver.findElement(By.name("submit")).click();


			// Flights Linktest

			driver.findElement(By.linkText("Flights")).click();

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='oneway']")).click();

			// passCount
			// Drop Down Handling
			Select select = new Select(driver.findElement(By.name("passCount")));

			select.selectByVisibleText("4");
			Thread.sleep(2000);
			// fromPort
			Select select1 = new Select(driver.findElement(By.name("fromPort")));
			select1.selectByVisibleText("London");
			Thread.sleep(2000);
			// fromMonth
			Select select2 = new Select(driver.findElement(By.name("fromMonth")));
			select2.selectByVisibleText("May");
			Thread.sleep(2000);
			// fromDay
			Select select3 = new Select(driver.findElement(By.name("fromDay")));
			select3.selectByVisibleText("4");
			Thread.sleep(2000);

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
			Thread.sleep(2000);

			// radio
			driver.findElement(By.xpath("//input[@value='First']")).click();
			Thread.sleep(2000);
			

			// airline
			Select select7 = new Select(driver.findElement(By.name("airline")));
			select7.selectByVisibleText("Blue Skies Airlines");
			Thread.sleep(2000);

			// findFlights
			driver.findElement(By.name("findFlights")).click();
			
			driver.navigate().back();
	//		Thread.sleep(3000);
	//		driver.navigate().refresh();// To refresh


			Thread.sleep(2000);
			// submit
			driver.findElement(By.name("submit")).click();
		} else if (bro.equals("IE")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new InternetExplorerDriver();

			driver.get(url);

			driver.manage().window().maximize();

			
		}

	}

}
