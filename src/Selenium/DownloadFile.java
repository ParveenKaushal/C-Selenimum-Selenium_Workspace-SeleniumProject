package Selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DownloadFile {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		profile.setPreference("browser.download.dir","C:/Selenimum");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");        
		profile.setPreference( "browser.download.manager.showWhenStarting", false );
		profile.setPreference( "pdfjs.disabled", true );
		FirefoxOptions opt = new FirefoxOptions();
		
		opt.setProfile(profile);
		driver = new FirefoxDriver(opt);  
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		JavascriptExecutor jsr= (JavascriptExecutor)driver ;
		WebElement v= driver.findElement(By.id("accept-cookie-notification"));
		v.click();
		WebElement pdf= driver.findElement(By.xpath("//div[@class='col-xs-6 col-sm-3 col-md-2 download-button-left']"));
		System.out.println(pdf.getLocation());
		jsr.executeScript("window.scrollBy(527,4150)");	
		pdf.click();
		
		Thread.sleep(2000);
		System.out.println("download done");
		
		
		

	}

}
