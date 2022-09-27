package pompackage;


import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomSort extends BaseAmazonClass{

@FindBy(id="twotabsearchtextbox")
WebElement srchBox;
	
@FindBy(id="nav-search-submit-button")
	WebElement srchBtn;

	public PomSort() {
		PageFactory.initElements(driver, this);
		
		driver.get("https://www.amazon.ca/");
			
		}
	

	
	public String fetchTitle() {
	String t=	driver.getTitle();
	System.out.println(t);
	return t;
	}
	

	List<Double> priceSortList = new ArrayList();

	public void searchProduct() {
		srchBox.sendKeys("iphone12");
		srchBtn.click();
	}
	
	public void getAllProducts() {
		List<WebElement> iphone_price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for(int i = 0; i<iphone_price.size(); i++) {
		String text =	iphone_price.get(i).getText();
		
		priceSortList.add(Double.valueOf(text));
		System.out.println(text);
		
		}
		
		priceSortList.sort(null);
		System.out.println(priceSortList);	
	
	}
	
	
}
