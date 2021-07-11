package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	public WebDriver driver;

	public RegisterPage(WebDriver driver)

	{

		this.driver = driver;
	}

	private By rpRegisterHeader = By.xpath("//*[@id='userRegistrationContainer']/div[2]/div/h1");
	private By rpUserNameTextBox = By.id("logonId");
	private By rpPasswordTextBox = By.id("logonPassword");
	private By rpFullNameTextBox = By.id("firstName");
	private By rpEmailTextBox = By.id("email1");
	private By rpRememberMeCheckbox = By.id("rememberMe");
	private By rpRegisterButton = By.id("registerValidate");

	public WebElement getRegisterHeader() {

		return driver.findElement(rpRegisterHeader);
	}

	public WebElement getUserNameTextBox() {

		return driver.findElement(rpUserNameTextBox);
	}

	public WebElement getPasswordTextBox() {

		return driver.findElement(rpPasswordTextBox);
	}

	public WebElement getfullNameTextBox() {

		return driver.findElement(rpFullNameTextBox);
	}

	public WebElement getEmailTextBox() {

		return driver.findElement(rpEmailTextBox);
	}

	public WebElement getRememberMeCheckbox() {

		return driver.findElement(rpRememberMeCheckbox);
	}

	public WebElement getRegisterButton() {

		return driver.findElement(rpRegisterButton);
	}

}
