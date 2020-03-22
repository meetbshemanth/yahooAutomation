package DriverSetUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class ChromeDriverSetUp

{
	public WebDriver driver;
	WebDriverWait wait;

	public void driverSetUp(String Url)
	{
		System.setProperty("webdriver.chrome.driver", "./src/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentoutput", "true");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 5);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	 
	public void driverClose()
	{
		driver.quit();
	}

}
