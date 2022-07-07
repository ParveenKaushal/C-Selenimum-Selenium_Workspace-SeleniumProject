package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emails {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
driver.get("https://mail.google.com/mail/u/0/?pli=1#inbox");
driver.findElement(By.id("identifierId")).sendKeys("kaushalparveen09@gmail.com");
driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kaushal1992");
driver.findElement(By.xpath("//button[@type='button']")).click();
Thread.sleep(2000);
	}

}
