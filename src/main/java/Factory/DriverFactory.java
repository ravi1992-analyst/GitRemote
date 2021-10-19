package Factory;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public WebDriver intiDriver(String browsername, Properties prop) {
		System.out.println("browser is:" + browsername);
		
		switch(browsername.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			System.out.println("no such driver is existed:" + browsername);
			
		}
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
		return driver;
	} 

}
