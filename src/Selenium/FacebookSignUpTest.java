package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "C:\\Selenimum\\SeleniumJars\\geckodriver.exe");
		


		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(000);
		
		driver.findElement(By.name("firstname")).sendKeys("srdtrytuyhj");
		String dv=driver.findElement(By.name("firstname")).getAttribute("placeholder");// to get placeholder value for any input box
		System.out.println(dv);
		driver.findElement(By.name("lastname")).sendKeys("3etffgugiu");
		driver.findElement(By.name("reg_passwd__")).sendKeys("345ertytu7");
		
		WebElement month= driver.findElement(By.id("month"));
		WebElement day= driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select m= new Select(month);
		Select d=new Select(day);
		Select y=new Select(year);
		
		m.selectByIndex(4);
		d.selectByIndex(4);
		y.selectByIndex(4);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}
