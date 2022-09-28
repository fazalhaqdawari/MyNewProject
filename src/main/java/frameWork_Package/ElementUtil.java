package frameWork_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

 //6. Method - This time we get Element with SendKeys method 
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void closePage() {
		driver.close();
	}

	public void quitePage() {
		driver.quit();
	}

	public String getPagesource() {
		return driver.getPageSource();

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
}
