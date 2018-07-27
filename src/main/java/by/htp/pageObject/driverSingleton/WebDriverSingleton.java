package by.htp.pageObject.driverSingleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
	
	private static WebDriver driver;
	
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\Dev\\chromedriver.exe";

	

	private WebDriverSingleton() {
	}

	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty(CHROME, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}
}
