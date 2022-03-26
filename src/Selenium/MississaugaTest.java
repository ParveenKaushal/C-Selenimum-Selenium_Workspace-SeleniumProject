package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.mississauga.ca/");
		driver.findElement(By.linkText("Our organization")).click();
		Thread.sleep(2000);
		
		List<WebElement> listButton= driver.findElements(By.xpath("//header/nav[@id='com-main-navbar']/div[1]/ul[1]/li[1]/ul[1]/li/a"));
		System.out.println(listButton.size());
		for(WebElement lb:listButton)
		{
			System.out.println(lb.getText());
			
			
			if(lb.getText().equals("Health and safety"))
					{
				
				lb.click();
				Thread.sleep(2000);
				break;
					}
			
		}
		
		
	}

}
