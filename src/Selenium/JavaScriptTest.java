

package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\\\Selenimum\\\\SeleniumJars\\\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
	
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		
		Thread.sleep(2000);
		al.accept();

	}

}
