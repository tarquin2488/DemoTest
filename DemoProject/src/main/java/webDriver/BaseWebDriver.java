package webDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseWebDriver {

	public static WebDriver driver;
	public static Properties prop;
	public static final String workingDir = System.getProperty("user.dir");
	public static FileInputStream fis;

	public static WebDriver getDriver() {

		prop = new Properties();
		try {
			fis = new FileInputStream(workingDir + "//src//main//java//webDriver//Global.properties");
			prop.load(fis);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		String browser = prop.getProperty("browser");

		try {
			if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", workingDir + "//drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				// Accept Cookies
				new WebDriverWait(driver, 10).until(
						ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='onetrust-accept-btn-handler']")))
						.click();
				// Wait for Page Load After Accepting Cookies
				new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='guestPar']/a[1]")));
			}

			else {
				System.setProperty("webdriver.chrome.driver", workingDir + "//drivers//chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				// Accept Cookies
				new WebDriverWait(driver, 10).until(
						ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='onetrust-accept-btn-handler']")))
						.click();
				// Wait for Page Load After Accepting Cookies
				new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class)
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='guestPar']/a[1]")));

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return driver;

	}

}
