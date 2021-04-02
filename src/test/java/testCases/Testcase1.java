package testCases;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjects.FilterPage;
import pageObjects.LandingPage;
import resources.BaseTest;

public class Testcase1 extends BaseTest {
	private static Logger log = LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void flipkart() throws InterruptedException {

		LandingPage objLand = new LandingPage(driver);
		FilterPage objF = new FilterPage(driver);

		log.info("Entering Email Id");
		objLand.getEmailId().sendKeys(prop.getProperty("emailId"));
		log.info("Entering password");
		objLand.getPassword().sendKeys(prop.getProperty("password"));
		log.info("Clicking on Login Button");
		objLand.getLoginButton().click();
		Thread.sleep(2000);
		log.info("Search for item: " + prop.getProperty("item"));
		objLand.getSearchBox().sendKeys(prop.getProperty("item") + Keys.ENTER);
		Thread.sleep(5000);
		log.info("Selecting Mobile Filter");
		objF.getMobileFilter().click();
		Thread.sleep(3000);
		log.info("Selecting Samsung Filter");
		objF.getSamsungFilter().click();
		Thread.sleep(2000);
		log.info("Selecting Flikart Assured Filter");
		objF.getAssuredFilter().click();
		Thread.sleep(2000);
		log.info("Selecting High to Low Price Filter");
		objF.getHighToLowFilter().click();
		Thread.sleep(4000);
		log.info("Getting the item details");
		List<String> webList = new ArrayList<String>();
		for (int i = 0; i < objF.getItems().size(); i++) {

			webList.add(objF.getItems().get(i).getText());
			webList.add(objF.getItemPrice().get(i).getText());
			webList.add(objF.getItemLink().get(i).getAttribute("href"));
			webList.add("\n");
		}
		System.out.println(webList);
		log.info(webList);

	}

}
