package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver)

	{

		this.driver = driver;
	}

	private By lpLogInHeader = By.xpath("//*[@id='loginContainer']/div[2]/div[1]/h1");
	private By lpUserNameTextBox = By.id("logonId");
	private By lpPasswordTextBox = By.id("logonPassword");
	private By lpRememberMeCheckbox = By.id("rememberMe");
	private By lpLogInButton = By.xpath("//*[@id='loginContainer']/div[2]/div[9]/input");

	public WebElement getLogInHeader() {

		return driver.findElement(lpLogInHeader);
	}

	public WebElement getUserNameTextBox() {

		return driver.findElement(lpUserNameTextBox);
	}

	public WebElement getPasswordTextBox() {

		return driver.findElement(lpPasswordTextBox);
	}

	public WebElement getRememberMeCheckbox() {

		return driver.findElement(lpRememberMeCheckbox);
	}

	public WebElement getlogInButton() {

		return driver.findElement(lpLogInButton);
	}
}
