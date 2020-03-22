package Pages;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomePageOfAnnauniv 

{
	WebDriver driver;	
	WebDriverWait wait;
	Actions action;
    Select select;
	      
	
	      @FindBy(xpath ="//*[text()='Departments']")
	      WebElement depatmentTag;
	      
	      @FindBy(xpath ="//a[@name='link13']")
	      WebElement  facultyofCivilEngineering;
	      
	      @FindBy(xpath ="//a[text()='Home']")
	      WebElement  homeTag;
	      
	      
	      @FindBy(xpath="//a[xpath='1']//tr//td//div//a")
	      WebElement  manuBar;
	                  
	      
	      //Institute for Ocean Management
	      
	  	
	     public HomePageOfAnnauniv(WebDriver driver)
	  	{
	  		this.driver=driver;
	  		
	  		PageFactory.initElements(driver, this);
	  	}
	  	
	
	      
	      
	      public void highLightFacultyOfCivilEngineering() throws Exception	      
	      {
	    	  JavascriptExecutor js = (JavascriptExecutor)driver;	
	    	  js.executeScript("arguments[0].click();", depatmentTag);
	    	  action = new Actions(driver);
	      	  action.moveToElement(facultyofCivilEngineering).perform();
	      	  action.moveByOffset(3, 1).perform();
	      	  Thread.sleep(5000);
	      	  
	      	  
	        action.moveToElement( driver.findElement(By.xpath("//*[contains(text(),'Institute for Ocean Management')]"))).click().perform();
	      	//js.executeScript("arguments[0].style.display='block';", we);
	      	  boolean status = homeTag.isDisplayed();
	      	  System.out.println(status);
	      	  
	          boolean status1 = facultyofCivilEngineering.isDisplayed();
	         
	
	    	  
	      }
	      
}
