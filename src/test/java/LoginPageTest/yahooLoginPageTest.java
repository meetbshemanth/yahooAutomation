package LoginPageTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import DriverSetUp.ChromeDriverSetUp;
import Pages.LoginPage;

public class yahooLoginPageTest

{
	WebDriver driver;
	ChromeDriverSetUp Chromedriver;
	LoginPage login;
	WebDriverWait wait;
	
	

	
	public void inilizingDriverAndLoginPage() 
	{
		Chromedriver = new ChromeDriverSetUp();
		Chromedriver.driverSetUp("http://login.yahoo.com");
		login=new LoginPage(Chromedriver.driver);
		
	}

	@Test
	public void loginpageVerify() throws Exception
	{	
		String condition = login.enterUserID("ketanvj", "123456");
//		wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath("//div[contains(text(),'ketanvj')]"))));

		
		AssertJUnit.assertEquals(condition, "Invalid password. Please try again","The login is not successful because for wrong password");
		
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//p[@role='alert']"))));

	}

	@AfterSuite
	public void closedriver()
	{
		driver.quit();
	}

}
