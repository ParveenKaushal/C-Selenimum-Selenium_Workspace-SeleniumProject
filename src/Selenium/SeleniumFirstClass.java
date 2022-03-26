package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenimum\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
