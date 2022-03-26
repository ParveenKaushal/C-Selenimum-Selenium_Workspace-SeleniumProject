package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
         System.setProperty("webdriver.chrome.driver","C:\\Selenimum\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.echoecho.com./htmlforms10.htm");
		
		List<WebElement> radioButton= driver.findElements(By.name("group1"));
		System.out.println(radioButton.size());
		
		
		radioButton.get(0).click();
		
		for(int i=0;i<radioButton.size();i++)
		{
			if(radioButton.get(i).isSelected())
			{
			System.out.println(radioButton.get(i).getAttribute("Value")+"..."+radioButton.get(i).isSelected());
		}
		}
		

	}

}
