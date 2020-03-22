package Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 

{
	   WebDriver driver;
	   WebDriverWait wait;
	
	   public LoginPage(WebDriver driver)
	   {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	   }
	

		@FindBy(xpath ="//a[@id='header-signin-link']")
		 WebElement signInBtn;
		
		@FindBy(xpath ="//input [@name='username']") 
		 WebElement userID;
		
		
		@FindBy(xpath ="//input[@name='password']")
		 WebElement userPassword;
		
		@FindBy(xpath ="//input[@id='login-signin']")
		 WebElement nextinput;
		
		@FindBy(xpath ="//button[@id='login-signin']")
		 WebElement nextBtn;
		
		@FindBy(xpath="//p[@class='error-msg']")
		WebElement inValidMsg;
		
		
	    
		public void clickOnSignIn()
		{
			signInBtn.click();
			
		}
		
		
		public String enterUserID(String userName,String Password) throws InterruptedException
		{
			String loginwindow= driver.getWindowHandle();			
			userID.sendKeys(userName);				
			nextinput.click();	
			wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(userPassword));			
			userPassword.sendKeys(Password);
			nextBtn.click();		
			String condition = inValidMsg.getText();
			return condition;
		}
		 
		public String enterUserID2(String userName,String Password) throws InterruptedException
		{
			String loginwindow= driver.getWindowHandle();			
			userID.sendKeys(userName);				
			nextinput.click();	
			wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(userPassword));			
			userPassword.sendKeys(Password);
			nextBtn.click();		
			String condition = inValidMsg.getText();
			return condition;
		}
		
		
		
	
}
