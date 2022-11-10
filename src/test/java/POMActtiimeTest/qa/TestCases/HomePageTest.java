package POMActtiimeTest.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import POMActtiimeTest.POMActtiimeTest.TestBase;


import POMActtiimeTest.qa.Pages.HomePage;
import POMActtiimeTest.qa.Pages.Login;

public class  HomePageTest extends TestBase{

	Login loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
		
	}
	
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new Login();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		
		
	}
	
	
	@Test(priority = 1)
	public void homePageLogoTest() {
		
	boolean flag= homePage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
	
	@Test(priority = 2)
	public void homePageTaskLinkTest() {
		
	homePage.clickOnTaskLink();

		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
