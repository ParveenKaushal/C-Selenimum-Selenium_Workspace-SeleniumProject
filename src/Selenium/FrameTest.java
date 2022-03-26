package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenimum\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sort= driver.findElements(By.linkText("Sortable"));
		
		System.out.println(sort.size());
		if(sort.size()>0)
		{
			System.out.println("sort Preseent and test pass");
			
		}
		else
		{
			System.out.println("sort element not present and test fail");
		}
		
		List<WebElement> drag= driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		if(drag.size()>0)
		{
			System.out.println("drag Preseent and test pass");
			
		}
		else
		{
			System.out.println("drag element not present and test fail");
		}
		
		
		System.out.println("............After switch to frame............");
		
		driver.switchTo().frame(0);//we need to switch to frame if we are looking element which is in frame
      sort= driver.findElements(By.linkText("Sortable"));//we do not need to initialize same variable again like sort
		
		System.out.println(sort.size());
		if(sort.size()>0)
		{
			System.out.println("sort Preseent and test pass");
			
		}
		else
		{
			System.out.println("sort element not present and test fail");
		}
		
		 drag= driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		if(drag.size()>0)
		{
			System.out.println("drag Preseent and test pass");
			
		}
		else
		{
			System.out.println("drag element not present and test fail");
		}
		
		
	}

}
