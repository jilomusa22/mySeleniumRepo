package WebBrowserConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.ebay.com/");// To Launch URL
		driver.manage().window().maximize(); // Maximize window
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
	   //No need to remember this---Just copy and paste
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// getScreenshotAs is a method/ med.png is the name of the file
	    FileUtils.copyFile(src,new File("C:\\Users\\msann\\eclipse-workspaceNew\\ProjectNameAsArtifatId\\src\\main\\java\\WebBrowserConcept/med.png"));
	//	FileUtils.copyFile(src,new File("C:\\Users\\msann\\Downloads\\LocationOfSeleniumScreenShots/medow.png"));
     //C:\Users\msann\Downloads\LocationOfSeleniumScreenShots
	}

}
