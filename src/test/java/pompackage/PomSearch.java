package pompackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePackage.BaseAmazonClass;

public class PomSearch extends BaseAmazonClass {

	
	//Search
		String txt ="t";
		//storing all web elements for search ductionality
		@FindBy(id="twotabsearchtextbox")
		WebElement searchInputField;
		
		//Getting loist items
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div/descendant::div[@role='button']//span[@class='s-heavy']"));
		int sizeOlist = lst.size();
		
		@FindBy(id="nav-search-submit-button")
		WebElement searchSubmitBtn;
	
		
		@FindBy(xpath="//span[@class='rush-component']//span[@class='a-color-state a-text-bold']") 
		WebElement srchResult;
	
		public PomSearch() {
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
				public void srchResult() {
				String resultTxt=	srchResult.getText();
				System.out.println(resultTxt);
				Assert.assertEquals(resultTxt,"\"iphone\"", "Search result text failed");
				System.out.println("Test passed");
				}
}        
