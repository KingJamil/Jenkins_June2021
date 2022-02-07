package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "/html/body/section/div/div[1]/div[2]/div/h2")
	WebElement DashboardHeader;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank')]") WebElement BankAndCashButton;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]") WebElement NewAccountButton;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}

	public void clickSignInButton() {
		SignInButton.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickBank_Cash_Button() {
		BankAndCashButton.click();
	}
	public void clickNew_Account_Button() {
		NewAccountButton.click();
	}

	public void verify_user_is_on_dashboard_page() {
		
//		Assert.assertEquals(DashboardHeader.getText(), "Dashboard", "Dashboard");
	}

}
