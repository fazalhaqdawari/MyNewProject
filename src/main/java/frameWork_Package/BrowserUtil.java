package frameWork_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	private WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		System.out.println("Browser Name is " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Fazal Haq Popal\\Desktop\\New folder (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Correct Browser is not selected" + browser);

		}
		return driver;
	}

	public void enterUrl(String url) {
		System.out.println("This is my Url " + url);
		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		} else {
			System.out.println("Please enter correct Url to launch the program");
			try {
				throw new Exception("Incorrect Url, http or https is missing");
			} catch (Exception e) {
			}
		}
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
