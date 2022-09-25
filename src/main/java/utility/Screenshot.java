package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.openBrowser;

public class Screenshot {

		public static void screens() throws IOException {
			
			WebDriver driver = openBrowser.openBrowsers("https://www.facebook.com/");
		
			File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\mayur\\OneDrive\\Documents\\subodh Sir\\selenium\\facebook.jpg");
	FileHandler.copy(Source, Destination);
		}
	}

