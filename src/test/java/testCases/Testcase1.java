package testCases;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjects.FilterPage;
import pageObjects.LandingPage;
import resources.BaseTest;

public class Testcase1 extends BaseTest {

	@Test
	public void flipkart() throws InterruptedException {

		LandingPage objLand = new LandingPage(driver);
		FilterPage objF = new FilterPage(driver);

		objLand.getEmailId().sendKeys(prop.getProperty("emailId"));
		objLand.getPassword().sendKeys(prop.getProperty("password"));
		objLand.getLoginButton().click();
		Thread.sleep(2000);
		objLand.getSearchBox().sendKeys(prop.getProperty("item") + Keys.ENTER);
		Thread.sleep(5000);
		objF.getMobileFilter().click();
		Thread.sleep(3000);
		objF.getSamsungFilter().click();
		Thread.sleep(2000);
		objF.getAssuredFilter().click();
		Thread.sleep(2000);
		objF.getHighToLowFilter().click();
		Thread.sleep(4000);
		List<String> webList = new ArrayList<String>();
		for (int i = 0; i < objF.getItems().size(); i++) {

			webList.add(objF.getItems().get(i).getText());
			webList.add(objF.getItemPrice().get(i).getText());
			webList.add(objF.getItemLink().get(i).getAttribute("href"));
			webList.add("\n");
		}
		System.out.println(webList);

	}

}
