package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.driverUtility;

public class loginPageObj extends baseUtils {

	public WebDriver driver;
	WebDriverWait wait;

	driverUtility objDriverUtility = new driverUtility();

	public loginPageObj() {
		this.driver = objDriverUtility.getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(this.driver, 30);

	}

	@FindBy(css = "input[type='email']")
	WebElement emailTextbox;

	@FindBy(css = "div[data-primary-action-label='Next'] button")
	WebElement nextBtn;

	@FindBy(css = "input[type='password']")
	WebElement pwdTextbox;

	public void navigateToGmail() {
		driver.get("https://accounts.google.com/signin");
	}

	public void doLogin(String userName, String password) {
		sendKeys(emailTextbox, userName);
		clickOnSubmit();
		sendKeys(pwdTextbox, password);
	}

	public void clickOnSubmit() {
		try {
			click(nextBtn);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			driver.findElement(By.cssSelector("div[data-primary-action-label='Next'] button")).click();
		}
	}
}
