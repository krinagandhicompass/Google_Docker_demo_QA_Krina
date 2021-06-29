package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class driverUtility {

	public static RemoteWebDriver driver;

	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public void initiateDriver() throws MalformedURLException {

//
		ChromeOptions options = new ChromeOptions();
//		DesiredCapabilities dc= DesiredCapabilities.chrome();
		URL url=new URL("http://localhost:4444/wd/hub");
		driver=new RemoteWebDriver(url,options);
		driver.manage().window().maximize();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-web-security");
//		options.addArguments("--allow-running-insecure-content");
//		setDriver(new RemoteWebDriver(options));
//		driver = new RemoteWebDriver(
//				new URL("http://localhost:4444/wd/hub"),
//				new ChromeOptions());





//
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-web-security");
//		options.addArguments("--allow-running-insecure-content");
////		options.addArguments("--headless");
//		setDriver(new ChromeDriver(options));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void quitDriver() {
		driver.quit();
	}

}
