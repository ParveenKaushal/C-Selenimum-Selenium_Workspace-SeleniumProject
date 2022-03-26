package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		


		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.com/");
	WebElement fashionHover=	driver.findElement(By.linkText("Fashion"));
	Actions builder= new Actions(driver);
	
	builder.moveToElement(fashionHover).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> fashion= driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[2]/li/a"));
		System.out.println(fashion.size());
		
		for(int i=0; i<fashion.size();i++)
		{
			System.out.println(fashion.get(i).getText());
		}
		
		
		//for(WebElement f:fashion)
			
		//{
		//	System.out.println(f.getText());
		//}
		

	}

}
