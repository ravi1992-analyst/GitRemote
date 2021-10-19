package MyTest;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CongifReader.ConfigPropReader;
import Factory.DriverFactory;
import pages.HomePage;

public class HomePageTest {
	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;
	HomePage homepage;
	WebDriver driver;

	@BeforeTest // implementation
	public void setup() {
		cp = new ConfigPropReader();
		prop = cp.initLangProp("french");
		df = new DriverFactory();
		df.intiDriver("firefox", prop);
		homepage = new HomePage(driver);
	}

	@Test
	public void headerTest() {
		Assert.assertTrue(homepage.isHearderDisplay(prop.getProperty("hearder")));
	}

	@Test
	public void contactFooterTest() {

		Assert.assertTrue(homepage.isContactDisplay("contact"));
	}

	@AfterTest
	public void Close() {
		driver.quit();
	}

}
