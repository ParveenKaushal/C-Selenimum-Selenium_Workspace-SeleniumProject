package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		List<WebElement> dropDrownList= driver.findElements(By.xpath("//div[@id='gh-cat-box']/select/option"));
		
		System.out.println(dropDrownList.size());
		
		for(int i=0; i<dropDrownList.size();i++)
		{
			System.out.println(dropDrownList.get(i).getText()+"...>"+dropDrownList.get(i).isSelected());
		}
		
		
		System.out.println("After selecting an item");
		
		WebElement selectItem= driver.findElement(By.id("gh-cat"));
		Select s= new Select(selectItem);
		s.selectByIndex(4);
		
		for (int i = 0; i < dropDrownList.size(); i++) {
			if(dropDrownList.get(i).isSelected())
			{
			System.out.println(dropDrownList.get(i).getText()+"...."+dropDrownList.get(i).isSelected());
			}
			
		}
		
	}

}
