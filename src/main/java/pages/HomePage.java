package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utils.ElementUtil;

public class HomePage {
	private WebDriver driver;
	private ElementUtil elementUtil;

	// creating the constructor of this class
	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	private WebElement getHeaderElement(String headerValue) { // encalpuated by making it private, client can't see

		String headerXpathValue = "//a[contains(text(),'" + headerValue + "')]";
		return elementUtil.getElement("xpath", headerXpathValue);
	}

	public boolean isHearderDisplay(String headerValue) {
		String header = getHeaderElement(headerValue).getText();
		System.out.println(header);
		return getHeaderElement(headerValue).isDisplayed();

	}

	private WebElement getContactElement(String ContactValue) {
		String contactXpathValue = "//a[contains(text(),'" + ContactValue + "')]";
		return elementUtil.getElement("xpath", contactXpathValue);
	}

	public boolean isContactDisplay(String ContactValue) {
		  String contact = getContactElement(ContactValue).getText();
		  System.out.println(contact);
	  return getContactElement(ContactValue).isDisplayed();

	}
}
