package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver)

	{

		this.driver = driver;
	}

	private By hpLogInLink = By.xpath("//*[@id='guestPar']/a[1]");
	private By hpRegisterLink = By.xpath("//*[@id='guestPar']/a[2]");

	public WebElement getHomePageLogInLink() {

		return driver.findElement(hpLogInLink);
	}

	public WebElement getHomePageRegisterLink() {

		return driver.findElement(hpRegisterLink);
	}

}
