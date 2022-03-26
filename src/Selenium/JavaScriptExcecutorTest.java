package Selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExcecutorTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.ebay.ca/");
		
		
		//driver.findElement(By.linkText("Registration")).click();
		
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(7000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement career= driver.findElement(By.linkText("Careers"));
		//js.executeScript("window.scrollBy(0,4000)"); method 1
		
		
		//js.executeScript("arguments[0].scrollIntoView(true);",career); method 2
		
		js.executeScript("arguments[0].click();", career);
		
		//js.executeScript("arguments[0].value='gjhgjhj'", career); when we need to type any value when input box is not in view
		
		//career.click();
	
		
	
		
		
		
		
		
		

	}

}
