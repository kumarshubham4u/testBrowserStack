package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage {

	public WebDriver driver;

	public FilterPage(WebDriver driver) {

		this.driver = driver;
	}

	private By osFilter = By.xpath("//span[text()='iOS']");
	private By sortDropdown = By.xpath("//span[text()='Sort by:']");
	private By highToLowFilter = By.xpath("//a[text()='Price: High to Low']");
	private By items = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
	private By itemPrice = By.xpath("//a[@class='a-size-base a-link-normal a-text-normal']");
	private By itemLink = By.xpath("//a[@class='a-link-normal a-text-normal']");

	public WebElement getIOSFilter() {

		return driver.findElement(osFilter);
	}

	public WebElement getSortDropdown() {

		return driver.findElement(sortDropdown);
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
