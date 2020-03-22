package LoginPageTest;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import DriverSetUp.ChromeDriverSetUp;
import Pages.LoginPage;

public class yahooLoginPageTestTest 
{

	 
	ChromeDriverSetUp chromedriver;
	LoginPage login;
	WebDriverWait wait;
	
	
	
	@AfterSuite
  public void closedriverTest() 
  {
		chromedriver.driver.quit();
  }

  @BeforeSuite
  public void inilizingDriverAndLoginPageTest() 
  {
	  chromedriver = new ChromeDriverSetUp();
		//chromedriver.driverSetUp();
		login=new LoginPage(chromedriver.driver);
   
  }

  @Test
  public void loginpageVerifyTest() throws Exception 
  {
	  String condition = login.enterUserID("ketanvj", "123456");		
      Assert.assertEquals(condition, "Invalid password. Please try again","The login is not successful because for wrong password");	 

  }
  
  
  

}
