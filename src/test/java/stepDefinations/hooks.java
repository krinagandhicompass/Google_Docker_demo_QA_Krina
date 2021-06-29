package stepDefinations;

import java.io.File;
import java.io.FileReader;
import java.net.MalformedURLException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObject.baseUtils;
import utils.driverUtility;

public class hooks {

	driverUtility driverUtilObj = new driverUtility();

	@Before
	public void beforeTest() throws MalformedURLException {
		driverUtilObj.initiateDriver();
	}

	@After
	public void afterTest(Scenario scenario) {
		System.out.println(scenario.getStatus());
		if (scenario.getStatus().contentEquals("passed")) {
			baseUtils baseUtilsObj = new baseUtils();
			scenario.embed(baseUtilsObj.takeScreenshot(), "image/png");
		}
		driverUtilObj.quitDriver();
	}
}
