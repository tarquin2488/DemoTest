package stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.AccountSummary;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import webDriver.BaseWebDriver;
import webDriver.CommonMethod;

public class StepDefinition {

	
	WebDriver driver=Hooks.driver;
	private HomePage hp = new HomePage(driver);
	private LoginPage lp = new LoginPage(driver);
	private RegisterPage rp = new RegisterPage(driver);
	private AccountSummary as = new AccountSummary(driver);
	Actions action = new Actions(driver);
	Faker fake = new Faker();

	@Given("User is on Farnell Login Screen")
	public void userIsOnFarnellLoginScreen() throws IOException, InterruptedException {

		hp.getHomePageLogInLink().click();
		lp.getLogInHeader().isDisplayed();

	}

	@Given("User is on Farnell Register Screen")
	public void userIsOnFarnellRegisterScreen() throws InterruptedException {

		hp.getHomePageRegisterLink().click();
		Assert.assertTrue("Validate Field is displayed or Not", rp.getRegisterHeader().isDisplayed());

	}

	@When("User enter all the details Correctly")
	public void userEnterAllTheDetailsCorrectly() {
		// Enter UserName
		String userName = CommonMethod.generateUsername();
		System.out.println(userName);
		rp.getUserNameTextBox().sendKeys(userName);

		// Enter Password
		rp.getPasswordTextBox().sendKeys("Test@1234");

		// Enter FullName
		Name fullName = fake.name();
		rp.getfullNameTextBox().sendKeys(fullName.toString());

		// Enter Email
		String emailAddress = fake.internet().emailAddress();
		System.out.println(emailAddress);

	}

	@When("User enter username {string} and password {string}")
	public void userEnterUsernameAndPassword(String string1, String string2) {

		lp.getUserNameTextBox().sendKeys(string1);
		lp.getPasswordTextBox().sendKeys(string2);

	}

	@When("User select Remember me checkbox")
	public void userSelectRememberMeCheckbox() {

		if (!lp.getRememberMeCheckbox().isSelected()) {
			lp.getRememberMeCheckbox().click();
			System.out.println("Remember me Checkbox is  Selected");
		}

		else {
			System.out.println("Remember me Checkbox is  Selected");
		}

	}

	@When("User UnCheck Remember me checkbox")
	public void userUncheckRememberMeCheckbox() {

		if (lp.getRememberMeCheckbox().isSelected()) {
			lp.getRememberMeCheckbox().click();
			System.out.println("Remember me Checkbox is  UnSelected");
		}

		else {
			System.out.println("Remember me Checkbox is  UnSelected");
		}

	}

	@When("User click on Login button")
	public void userClickOnLoginButton() {

		lp.getlogInButton().click();

	}

	@When("User click on Register button")
	public void userClickOnRegisterButton() {
		rp.getRegisterButton().click();

	}

	@Then("User is able to Register")
	public void userIsAbleToRegister() {

		String accountSummaryHeaderText = as.getAccountSummaryHeader().getText();
		Assert.assertEquals("Validate both String match", "My Account Summary", accountSummaryHeaderText);

	}

	@Then("User is able to Login Succesfully")
	public void userIsAbleToLoginSuccesfully() {

		String accountSummaryHeaderText = as.getAccountSummaryHeader().getText();
		Assert.assertEquals("My Account Summary", accountSummaryHeaderText);

	}

	@Then("Login details remembered on logout")
	public void loginDetailsRememberedOnLogout() {

		action.moveToElement(as.getMyAccountLink()).moveToElement(as.getLogOutButton()).click().build().perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(lp.getLogInHeader()));
		String textInsideUserNameTextBox = lp.getUserNameTextBox().getAttribute("value");
		// Check whether input field is blank
		if (textInsideUserNameTextBox.isEmpty()) {
			System.out.println("UserNameTextBox field is empty");
			Assert.assertFalse(textInsideUserNameTextBox.isEmpty());
		} else {
			System.out.println("UserNameTextBox field is Not empty");
			Assert.assertEquals("Username@123456", textInsideUserNameTextBox);
		}

	}

	@Then("Login details Not remembered on logout")
	public void loginDetailsNotRememberedOnLogout() {

		action.moveToElement(as.getMyAccountLink()).moveToElement(as.getLogOutButton()).click().build().perform();
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(lp.getLogInHeader()));
		String textInsideUserNameTextBox = lp.getUserNameTextBox().getAttribute("value");
		// Check whether input field is blank
		if (textInsideUserNameTextBox.isEmpty()) {
			System.out.println("Login details Not remembered on logout");
			Assert.assertTrue("Validate Text Inside UserName Field",textInsideUserNameTextBox.isEmpty());
		} else {
			System.out.println("Login details remembered on logout");
			Assert.assertTrue("Validate Text Inside UserName Field",textInsideUserNameTextBox.isEmpty());
		}

	}

}
