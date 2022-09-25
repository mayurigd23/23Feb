package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
	public static WebDriver openBrowsers(String url){
System.setProperty("webdriver.gecko.driver","C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get(url);
				return driver;
	}
}
