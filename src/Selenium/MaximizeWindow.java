package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();

	}

}
