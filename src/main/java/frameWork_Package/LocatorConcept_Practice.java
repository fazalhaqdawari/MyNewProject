package frameWork_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept_Practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		// Following are different strategies to click or find locators
		// 1.Method
//		driver.findElement(By.id("input-email")).sendKeys("Popal@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Ashwa");
		// 2. Method
//		WebElement emailID = driver.findElement(By.id("input-email"));
//		WebElement passID = driver.findElement(By.id("input-password"));
//		emailID.sendKeys("Haroon");
//		passID.sendKeys("Ashwa");
		// 3. Method
//		By emailID = By.id("input-email");
//		By passID = By.id("input-password");
//		driver.findElement(emailID).sendKeys("Angeeza");
//		driver.findElement(passID).sendKeys("Ashwa");
		// 4. Method
//		By emailId = By.id("input-email");
//		By passID = By.id("input-password");
//		
//		WebElement sendEmailId = driver.findElement(emailId);
//		WebElement sendPassId = driver.findElement(passID);
//		sendEmailId.sendKeys("Haroon Khan");
//		sendPassId.sendKeys("Ashwa Jaan");
		// 5. Method with a Generic Method
//		By emailId = By.id("input-email");
//		By passID = By.id("input-password");
//		getElement(emailId).sendKeys("Ashwa and Haroon");
//		getElement(passID).sendKeys("Ashwa");
		// 6. Method GetElement with SendKeys
//		By emailId = By.id("input-email");
//		By passID = By.id("input-password");
//		doSendKeys(emailId, "Ashwa and Angeeza");
//		doSendKeys(passID, "Ashwa"); 

		ElementUtil eleUtil = new ElementUtil(driver);
		By emailId = By.id("input-email");
		By passID = By.id("input-password");
		eleUtil.doSendKeys(emailId, "Fazal");
		eleUtil.doSendKeys(passID, "Ashwa");
		String PageTitle = eleUtil.getPageTitle();
		System.out.println(PageTitle);

//	// 5. Method with a Generic Method 
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	// 6. Method - This time we get Element with SendKeys method 
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
	}
}
