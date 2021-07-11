package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountSummary {

	public WebDriver driver;

	public AccountSummary(WebDriver driver)

	{

		this.driver = driver;
	}

	private By asAccountSummaryHeader = By.xpath("//*[contains(text()='My Account Summary')]");
	private By asNameText = By.xpath("//*[@id='article']/div[1]/table/tbody[1]/tr[1]/td");
	private By asMyAccountLink = By.xpath("//*[@id='headContent']/div[3]/div/div[2]/div[1]/a");
	private By asLogOutButton = By.xpath("//*[@id='ad_pf_header_espot_myacc']/ul/li[13]/a[1]");

	public WebElement getAccountSummaryHeader() {

		return driver.findElement(asAccountSummaryHeader);
	}

	public WebElement getNameText() {

		return driver.findElement(asNameText);
	}

	public WebElement getMyAccountLink() {

		return driver.findElement(asMyAccountLink);
	}

	public WebElement getLogOutButton() {

		return driver.findElement(asLogOutButton);
	}

}
