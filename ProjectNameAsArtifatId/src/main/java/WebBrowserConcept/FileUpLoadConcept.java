package WebBrowserConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpLoadConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		//PopUps: Alerts---JavaScript PopUp---(accept, dismiss) 
		//File Upload PopUp---Browser Button--type=file, sendKeys(path)
		//Browser Window PopUp--Adds PopUp---(WindowHandler API--getWindowHandles())

		// driver.get("https://www.ebay.com/");
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		// type = "file " should be available for browse/ attachment after inspecting element
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\msann\\OneDrive\\Documents\\SANNOH-DOC\\Kafka.docx");

	}

}
