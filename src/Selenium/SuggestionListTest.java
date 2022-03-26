package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("love");
		Thread.sleep(2000);
	    List<WebElement> searchList= driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	    System.out.println(searchList.size());
	    for(WebElement s:searchList)
	    	
	    {
	    
	    	System.out.println(s.getText());
	    }

	}

}
