package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {
	
	public WebDriver driver;
	
	public FilterPage(WebDriver driver) {
		
		this.driver=driver;
	}

	private By mobileFilter = By.linkText("Mobiles");
	private By samsungFilter = By.xpath("//div[@class='_3879cV'] [text()='SAMSUNG']");
	private By assuredFilter = By.xpath("//img[@class='_3U-Vxu']");
	private By highToLowFilter = By.xpath("//div[@class='_10UF8M'][text()='Price -- High to Low']");
	private By items = By.xpath("//div[@class='_4rR01T']");
	private By itemPrice = By.xpath("//div[@class='_30jeq3 _1_WHN1']");
	private By itemLink = By.xpath("//a[@class='_1fQZEK']");
	
	
	
	public WebElement getMobileFilter() {

		return driver.findElement(mobileFilter);
	}

	public WebElement getSamsungFilter() {

		return driver.findElement(samsungFilter);
	}

	public WebElement getAssuredFilter() {

		return driver.findElement(assuredFilter);
	}

	public WebElement getHighToLowFilter() {

		return driver.findElement(highToLowFilter);
	}

	public List<WebElement> getItems() {

		return driver.findElements(items);
	}

	public List<WebElement> getItemPrice() {

		return driver.findElements(itemPrice);
	}
	
	public List<WebElement> getItemLink() {

		return driver.findElements(itemLink);
	}
}
