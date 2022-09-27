package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.BaseAmazonClass;

public class PomFilter extends BaseAmazonClass{

	
	/*
	 * //ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/li[@id='p_n_feature_eleven_browse-bin/24042397011']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']
	 */
	
	
	//Search
			String txt ="t";
			//storing all web elements for search ductionality
			@FindBy(id="twotabsearchtextbox")
			WebElement searchInputField;
			@FindBy(id="nav-search-submit-button")
			WebElement searchSubmitBtn;
		
			@FindBy(css="#p_n_feature_eleven_browse-bin\\/24042397011 > span > a > span")
			WebElement CheckFall;
			
			@FindBy(css="#search > span > div > h1 > div > div.sg-col-14-of-20.sg-col.s-breadcrumb.sg-col-10-of-16.sg-col-6-of-12 > div > div")
			WebElement Falltxt;
			
			public PomFilter() {
				PageFactory.initElements(driver, this);
				
				driver.get("https://www.amazon.ca/");
				
					
				}
			//Creating method to type in for search
			public void searchtext(String txt) {
				searchInputField.sendKeys(txt);
			}
			
			public void submitBtnClick() {
				searchSubmitBtn.click();
			}	
			public void checkF() {
				CheckFall.click();
			String newText=	Falltxt.getText();
			Assert.assertEquals(newText, "1-48 of 621 results for \"shoes\"");
			System.out.println("test passes");
				
			}
	
}
