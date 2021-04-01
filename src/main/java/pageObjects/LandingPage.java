package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
	}

	private By loginLink = By.linkText("Login");
	private By emailId = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	private By password = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	private By loginButton = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	private By searchBox = By.xpath("//input[@title='Search for products, brands and more']");

	public WebElement getLoginLink() {

		return driver.findElement(loginLink);
	}

	public WebElement getEmailId() {

		return driver.findElement(emailId);
	}

	public WebElement getPassword() {

		return driver.findElement(password);
	}

	public WebElement getLoginButton() {

		return driver.findElement(loginButton);
	}

	public WebElement getSearchBox() {

		return driver.findElement(searchBox);
	}


}
