package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library 
	@FindBy(how=How.XPATH, using = "//input[@id='username']") WebElement  USER_NAME;
	@FindBy(how=How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_FIELD;
	@FindBy(how=How.XPATH, using = "//input[@id='email']") WebElement EMAIL_FIELD;
	@FindBy(how=How.XPATH, using = "//input[@id='phone']") WebElement PHONE_FIELD;
	@FindBy(how=How.XPATH, using = "//input[@name='address']") WebElement ADDRESS_FIELD;
	@FindBy(how=How.XPATH, using = "//span[@id='select2-country-container']") WebElement COUNTRY_FIELD;
	
	//Interactive Methods
	public void insertFullName(String fullName) {
		
		int generatedNumber = randomGenerator(999);
		USER_NAME.sendKeys(fullName + generatedNumber);
		
	}
	
	public int randomGenerator(int bound) {
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(bound);
		return randomNumber;
		
	}

	public void chooseCompanyOption(String company) {
		
		SelectDropDown(COMPANY_FIELD, company);
	}

	public void SelectDropDown(WebElement elementLocator, String visibleText) {
		Select select = new Select(elementLocator);
		select.selectByVisibleText(visibleText);
		
	}
	
	public void insertEmail(String email) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD.sendKeys(generatedNumber + email);
	}
	
	public void insertPhoneNumber(String phone) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD.sendKeys(generatedNumber + phone);
	}
	
	public void chooseCountryOption(String country) {
		SelectDropDown(COUNTRY_FIELD, country);
	}

}
