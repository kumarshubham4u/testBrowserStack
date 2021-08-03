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
	public void amazon() throws InterruptedException {

		LandingPage objLand = new LandingPage(driver);
		FilterPage objF = new FilterPage(driver);
		
	
		log.info("Search for item: " + prop.getProperty("item"));
		objLand.getSearchBox().sendKeys(prop.getProperty("item") + Keys.ENTER);
		Thread.sleep(3000);
		log.info("Selecting IOS Filter");
		objF.getIOSFilter().click();
		Thread.sleep(2000);
		log.info("Clicking on Sort DropDown");
		objF.getSortDropdown().click();
		Thread.sleep(4000);
		log.info("Selecting High to Low Price Filter");
		objF.getHighToLowFilter().click();
		Thread.sleep(2000);
		log.info("Getting the item details");
		List<String> webList = new ArrayList<String>();
		for (int i = 0; i < objF.getItems().size(); i++) {

			webList.add(objF.getItems().get(i).getText() + " , " + objF.getItemPrice().get(i).getText() + " , "
					+ objF.getItemLink().get(i).getAttribute("href") + "\n");
		}
		System.out.println(webList);
		log.info(webList); 

	}

}
