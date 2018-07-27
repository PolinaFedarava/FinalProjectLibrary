package by.htp.pageObject.steps;

import org.openqa.selenium.WebDriver;

import by.htp.pageObject.driverSingleton.WebDriverSingleton;

public class CommonSteps {
	
	private WebDriver driver;

	public void initBrowser() {
		driver = WebDriverSingleton.getDriver();
	}

	public void closeDriver() {
		WebDriverSingleton.closeDriver();
	}
}
