package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement footerLink = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));// to read one item at a time
		
		List<WebElement> links= footerLink.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
		
		System.out.println(links.get(i).getText());
		}
		
		System.out.println(" code to get multiple links list at same time");
		
		List<WebElement> linksAll= driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']/a"));
		
		for(int i=0;i<links.size();i++)
		{
		
		System.out.println(links.get(i).getText());
		}

	}

}
