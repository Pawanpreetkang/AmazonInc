package pompackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomSignup extends BaseAmazonClass {

	//Object repository store page elements
	
	@FindBy(id="createAccountSubmit")
	WebElement CreateAccBtn;
	
	@FindBy(id="ap_customer_name")
	WebElement Yourname;
	
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="ap_password_check")
	WebElement PasswordAgain;
	
	@FindBy(id="continue")
	WebElement Signupbtn;
	@FindBy(className="a-alert-content")
	WebElement ErrorMessge1;
	
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']//div[@class='nav-line-1-container']")
	WebElement SignupLink;
	//initiate we b elements first create constructor
	
	
	public PomSignup() {
		PageFactory.initElements(driver, this);

		//driver.get("https://www.amazon.ca/");
	}
	public void ClickHelloMsg() {
		SignupLink.click();
	}
	public void ClickCrtAcBtn() {
		CreateAccBtn.click();
	}
	
	public void typeYourname(String name) {
		Yourname.sendKeys(name);
	}
	public void typeEmail(String email) {
		Email.sendKeys(email);
	}
	public void typePassword(String pass) {
		Password.sendKeys(pass);
	}
	public void typePasswordAgain(String pass) {
		PasswordAgain.sendKeys(pass);
	}
	public void clickbutton() {
		Signupbtn.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
}
