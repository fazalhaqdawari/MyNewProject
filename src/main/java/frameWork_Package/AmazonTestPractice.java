package frameWork_Package;


public class AmazonTestPractice {

	public static void main(String[] args) {
		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();

		br.launchBrowser(browser);
		br.maximizeWindow();
		br.enterUrl("https://www.amazon.com/");
		String pageTile = br.getPageTitle();
		if (pageTile.contains("Amazon")) {
			System.out.println("It is page correct title");
		}

		if (br.getPageCurrentUrl().contains("amazon")) {
			System.out.println("Url Is correct");
		}
		String pageSource = br.getPagesource();
		if (pageSource.contains("Amazon")) {
			System.out.println("We are getting the correct page source this time");
		}
	}
	}


