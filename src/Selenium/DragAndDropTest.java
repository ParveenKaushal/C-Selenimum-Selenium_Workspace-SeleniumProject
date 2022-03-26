package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenimum\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
	WebElement drag=	driver.findElement(By.id("draggable"));
	WebElement drop= driver.findElement(By.id("droppable"));
	Actions builder= new Actions(driver);
	builder.dragAndDrop(drag, drop).build().perform();
	}

}
