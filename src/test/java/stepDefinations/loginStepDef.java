package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObject.homePageObj;

//import io.cucumber.java.en.And;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

import pageObject.loginPageObj;
import utils.driverUtility;

//@RunWith(Cucumber.class)
public class loginStepDef {

	loginPageObj objLoginPageObj = new loginPageObj();
	homePageObj objhHomePageObj = new homePageObj();

	@Given("^Google login page URL passed$")
	public void google_login_page_URL_passed() throws Throwable {
		objLoginPageObj.navigateToGmail();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String userName, String password) {
		objLoginPageObj.doLogin(userName, password);
	}

	@When("^click on next button$")
	public void click_on_next_button() {
		objLoginPageObj.clickOnSubmit();
	}

	@Then("^correct \"([^\"]*)\" should able to login$")
	public void correct_should_able_to_login(String userName) {
		objhHomePageObj.waitForHomePageToLoad();
		Assert.assertTrue(userName + "is not logged into account",
				objhHomePageObj.getAccountDetails().contains(userName));
	}

}
