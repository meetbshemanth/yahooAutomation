package annauniv_Department;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import DriverSetUp.ChromeDriverSetUp;
import Pages.HomePageOfAnnauniv;

public class FacultyofCivilEngineeringVerify 

{
	
	ChromeDriverSetUp cdriver;
	HomePageOfAnnauniv page;
	
	@BeforeSuite
	public void verifyFOCE()
	
	{	
		cdriver = new ChromeDriverSetUp();
		cdriver.driverSetUp("https://www.annauniv.edu");		
		page = new HomePageOfAnnauniv(cdriver.driver);		
	}
	
	
	@Test
	public void clickonDepartment() throws Exception
    {
		page.highLightFacultyOfCivilEngineering();		
		
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		cdriver.driverClose();
		
	} 
	
	

}
