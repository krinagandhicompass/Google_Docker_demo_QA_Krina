package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.driverUtility;

public class baseUtils {

	public WebDriver driver;
	WebDriverWait wait;
	driverUtility objDriverUtility = new driverUtility();

	public baseUtils() {
		this.driver = objDriverUtility.getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(this.driver, 30);
	}

	public void click(WebElement el) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
		el.click();
	}

	public void sendKeys(WebElement el, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(el));
		el.clear();
		el.sendKeys(value);
	}

	public void waitForJSToLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(driver -> (js.executeScript("return document.readyState").equals("complete")));
		if ((Boolean) js.executeScript("return window.jQuery != undefined")) {
			while (!(Boolean) js.executeScript("return jQuery.active == 0")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		}
		
	}
	
	public byte[] takeScreenshot() {	
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BYTES);	 	
	}
}
