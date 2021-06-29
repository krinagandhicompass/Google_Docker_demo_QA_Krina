package stepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.homePageObj;
import pageObject.loginPageObj;

public class homePageStepDef {
	
	loginPageObj objLoginPageObj = new loginPageObj();
	homePageObj objhHomePageObj = new homePageObj();
	
	@When("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		objhHomePageObj.waitForHomePageToLoad();  
	}

	@Then("^user should be able to signout$")
	public void user_should_be_able_to_signout() throws Throwable {
		objhHomePageObj.signOut();
		Thread.sleep(1000);
	}
	@Then("^User should be able to search with \"([^\"]*)\"$")
	public void user_should_be_able_to_search_with(String searchtext) throws Throwable {
		objhHomePageObj.searchText(searchtext);
	}

}
