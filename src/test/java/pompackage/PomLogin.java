package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomLogin extends BaseAmazonClass {

	//Creating object repository containing all elements for login page
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(id="continue")
	WebElement ContinueBtn;
	
	@FindBy(id="ap_password")
	WebElement Password;
	
	@FindBy(id="signInSubmit")
	WebElement SignInBtn;
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement HelloMessage;
	@FindBy(className="ya-card__whole-card-link")
	WebElement YourOrders;
	@FindBy(xpath="//*[@id=\"a-page\"]/section/div/div[3]/ul/li[2]/a")
	WebElement BuyAgainLink;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[3]/ul/li[3]/span/a")
	WebElement NotYetShippedLink;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div/ul/li[5]/span/a")
	WebElement CancledOrdersLink;
	
	
	
	//Search
	String txt ="t";
	//storing all web elements for search fuctionality
	@FindBy(id="twotabsearchtextbox")
	WebElement searchInputField;
	
	//Getting list items
	List<WebElement> lst = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div/descendant::div[@role='button']//span[@class='s-heavy']"));
	int sizeOlist = lst.size();
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchSubmitBtn;
	
	//initialize elements in constructor
	
	public PomLogin() {
		PageFactory.initElements(driver, this);
		
			
		}
		
		public void typeLoginEmail(String email) {
			
			Email.sendKeys(email);
		
	}
		public void clickLoginContinueBtn() {
			ContinueBtn.click();
		}
		
		public String verify() {
		String title= driver.getTitle();
		return title;
		}
		
		public void typePassword(String password) {
			Password.sendKeys(password);
		}
		public void clickSignInBtn() {
			SignInBtn.click();
		}
	
		
		
		
		//After login, hover &clicking hello message
		public void ClickNav() {
			HelloMessage.click();
		}
		
		//Now clicking on your orders button
		public void clickYourOrders() {
			YourOrders.click();
		}
		//Now clicking on Buy Again h ref
		public void clickBuyAgainLnk() {
			BuyAgainLink.click();
		}
		//Now clicking on not yet shipped
		public void clickNotYetShippedLnk() {
			NotYetShippedLink.click();
		}
		//Now cancled orders
		public void clickCancelledOrdersLnk() {
		CancledOrdersLink.click();
		}
		
	/*	if(clickCancelledOrdersLnk.click()==true) {
			System.out.println("Test Passes");
		}
		else(){
			System.out.println("Test Failed");
		}
		
		
		*/
	/*
		public void lstSize() {
			System.out.println("Total list size is"+  + sizeOlist);
		}
		
		public void chooseOption() {
		for(int i=0; i<10; i++) {
			String itemVal = lst.get(i).getText();
			System.out.println(itemVal);
			if(itemVal.contains("towels")) {
				lst.get(i).click();
				break;
			}
		}
		}
		*/
	
}
