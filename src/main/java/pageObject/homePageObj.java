package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.driverUtility;

public class homePageObj extends baseUtils {
	public WebDriver driver;
	WebDriverWait wait;
	driverUtility objDriverUtility = new driverUtility();

	public homePageObj() {
		this.driver = objDriverUtility.getDriver();
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(this.driver, 30);
	}
	
	@FindBy(css = "a[href*='SignOutOptions']")
	WebElement accountBtn;
	
	@FindBy(css = "a[href*='Logout']")
	WebElement signOutBtn;

	@FindBy(xpath = "//input[@aria-label='Search Google Account']")
	WebElement searchbar;

	public String getAccountDetails()
	{
		return accountBtn.getAttribute("aria-label");
	}
	
	public void waitForHomePageToLoad() {
		waitForJSToLoad();
		wait.until(ExpectedConditions.elementToBeClickable(accountBtn));
	}

	public void signOut() {
		wait.until(ExpectedConditions.elementToBeClickable(accountBtn));
		click(accountBtn);
		click(signOutBtn);
	}

	public void searchText(String text){
		wait.until(ExpectedConditions.elementToBeClickable(searchbar));
		searchbar.sendKeys(text);
		searchbar.sendKeys(Keys.ENTER);
	}
}
