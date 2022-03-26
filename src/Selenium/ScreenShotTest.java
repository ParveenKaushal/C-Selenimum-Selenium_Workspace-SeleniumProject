package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenimum\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		File srcFile= driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Selenimum\\Testing\\firstScreenShot.png"));
	}

}
