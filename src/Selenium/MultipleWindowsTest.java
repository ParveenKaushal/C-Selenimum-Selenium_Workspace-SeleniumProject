package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   WebElement help= driver.findElement(By.linkText("Help"));
	   help.click();
	   
	   Set<String> allwindows= driver.getWindowHandles();
	    System.out.println(allwindows.size());
	    
	   // for(String a:allwindows)
	    //{
	    	//System.out.println(a);
	    //}
	    
	    Iterator<String> itr= allwindows.iterator();
	    String mainWindow= itr.next();
	    String childWindow= itr.next();
	    System.out.println(mainWindow);
	    System.out.println(childWindow);
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(childWindow);
	    System.out.println(driver.getTitle());
	    driver.close();
	    
	    driver.switchTo().window(mainWindow);
	    System.out.println(driver.getTitle());
	    
	    
	    
	}

}
