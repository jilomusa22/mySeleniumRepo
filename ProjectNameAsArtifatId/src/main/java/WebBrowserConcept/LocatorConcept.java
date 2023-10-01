package WebBrowserConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		String title = driver.getTitle();// Get title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		// driver.close();// To quit or close browser

		// By Xpath----2

		// Sign in

		// driver.findElement(By.linkText("register")).click();
		driver.findElement(By.linkText("Sign in")).click();// By linktext
		// driver.findElement(By.linkText("User Agreement")).click();
	//	driver.findElement(By.xpath("//*[@id=\"signin-form\"]/div[1]/div/div[1]/label")).sendKeys("msannoh44@g,ail.com");

	//	driver.findElement(By.linkText("Email or username")).sendKeys("msannoh44@g,ail.com");
	//	driver.findElement(By.linkText("Password")).sendKeys("House@2020");
     // 
	//	driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Boo");
	//	driver.findElement(By.id("userid")).sendKeys("msannoh44@gmail.com");
	//	driver.findElement(By.).sendKeys("House@2020");

		// By Id----1

		// driver.findElement(By.id("id=\"firstname\"")).sendKeys("Musa");
		// driver.findElement(By.id("id=\"lastname\"")).sendKeys("Boo");
		// driver.findElement(By.id("Email")).sendKeys("msannoh44@gmail.com");
		// driver.findElement(By.id("password")).sendKeys("House@2020");
		// driver.findElement(By.xpath("//*[@id=\"legalTextId\"]/div/div/p/a[1]")).click();
		// driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[3]/a")).click();
		// driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[3]/div[1]/div[2]/span/a")).click();

		// By name----3
		
		// By Partial linktest............not recommended
		
		// CSS celector----4
		// #userid
		
	//	driver.findElement(By.cssSelector("#userid")).sendKeys("msannoh44@g,ail.com");
		
		//signin-continue-btn
	//	driver.findElement(By.id("signin-continue-btn")).click();
		
	//	driver.findElement(By.className("floating-label__label floating-label__label--animate floating-label__label--inline")).sendKeys("House@2020");
	//	driver.findElement(By.id("sgnBt")).click();
		
		// #signin-form > div.null > div.password-box-wrapper.qm-element-masked > div > label
		// By Class------not recommended---5

	}

}
