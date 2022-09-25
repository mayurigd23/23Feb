package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPage {

@FindBy (xpath = "//input[@name='email']") private WebElement email;
	@FindBy (xpath = "//input[@id='pass']") private WebElement pwd;
	@FindBy (xpath = "//button[@name='login']") private WebElement submit;
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgot;
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement Signup;

	@FindBy (xpath = "//a[text()='Create a Page']") private WebElement createPage;

	public FacebookloginPage  (WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	
	public void EnterEmailId(String mail) {
		email.sendKeys(mail);
	}
	public void Enterpwd(String pass) {
		pwd.sendKeys(pass);
	}
	public void clickonsumit() {
		submit.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
	public void  clickSignup() {
		Signup.click();
	}
	
	
	public void createpage() {
	createPage.click();
	}
}
