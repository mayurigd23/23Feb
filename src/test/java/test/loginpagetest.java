package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.openBrowser;
import pom.FacebookloginPage;

public class loginpagetest {
	WebDriver driver;
	
	@BeforeMethod
	public void loginurl() {
		driver = openBrowser.openBrowsers("https://www.facebook.com/");
	}
	@Test(priority = 1)
	public void logintest() {
	FacebookloginPage facebooklogin = new FacebookloginPage(driver); 
		facebooklogin.EnterEmailId("mayuri");
	facebooklogin.Enterpwd("mayu");
	// facebooklogin.clickonsumit();
	}
	
	@Test (priority =2)
	public void clickforgot() {
		FacebookloginPage facebooklogin = new FacebookloginPage(driver); 
	facebooklogin.clickonforgot();
	}
	@Test (priority =3 ,invocationCount =2 , dependsOnMethods= {"clickforgot"})
	public void clickonsighnup() {
		FacebookloginPage facebooklogin = new FacebookloginPage(driver); 
	facebooklogin.clickSignup();
	}
	
	@Test(priority =4 , timeOut=1000)
	public void loginwithemail() {
		FacebookloginPage facebooklogin = new FacebookloginPage(driver); 
			facebooklogin.EnterEmailId("mayuri");
			facebooklogin.clickonsumit();
	}

}
