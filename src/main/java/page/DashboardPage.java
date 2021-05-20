package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library 
	@FindBy(how=How.XPATH, using = "//h2[contains(text(),'Dashboard')]") WebElement DASHBOARD_ELEMENT;
	@FindBy(how=How.XPATH, using = "//span[text()='Customers']") WebElement CUSTOMER_BUTTON;
	@FindBy(how=How.XPATH, using = "//a[text()='Add Customer']") WebElement ADD_CUSTOMER;
	
	//Interactive Methods
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dashboard page not found.");
		
	}
	
	public void clickCustomerButton() {
		CUSTOMER_BUTTON.click();
	}
	
	public void clickAddCustomerButton() {
		ADD_CUSTOMER.click();
	}

}
