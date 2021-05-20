package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddCustome() {
		driver = BrowserFactory.init();
		 
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignIn();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.insertFullName("Selenium");
		addCustomerPage.chooseCompanyOption("Techfios");
		addCustomerPage.insertEmail("demo@techfios.com");
		addCustomerPage.insertPhoneNumber("000-000-0000");
		addCustomerPage.chooseCountryOption("France");
		
		BrowserFactory.tearDown();
	}

}
