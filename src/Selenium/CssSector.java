package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSector {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		


		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("Parveen");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Rani");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	    
		
	}

}
