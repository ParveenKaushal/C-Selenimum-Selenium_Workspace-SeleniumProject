package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		


		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		

	}

}
