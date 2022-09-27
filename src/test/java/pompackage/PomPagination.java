package pompackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomPagination extends BaseAmazonClass{
	@FindBy(xpath="//span[@class='s-pagination-strip']//a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")
	WebElement NextBtn;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(68) > div > div > span > a:nth-child(3)")
	WebElement secondPageBtn;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(54) > div > div > span > a:nth-child(4)")
	WebElement thirdPage;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(54) > div > div > span > a:nth-child(5)")
    WebElement fourthPage;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(66) > div > div > span > a:nth-child(6)")
	WebElement fifthPage;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(54) > div > div > span > a:nth-child(6)")
	WebElement sixthPage;
	
	@FindBy(css="#search > div.s-desktop-width-max.s-desktop-content.s-opposite-dir.sg-row > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(66) > div > div > span > a:nth-child(6)")
	WebElement seventhPage;
	
	
	/*
	 
	 Page 1 Sponsered: //div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']
	 Page 1 unsponsered://div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']
	 
	 
	 Page 2 Sponsered:  //div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base']
	 
	 */
	
	public PomPagination() {
		PageFactory.initElements(driver, this);
		
		driver.get("https://www.amazon.ca/s?k=t-shirt&crid=3ER7SNE1WZ4D6&qid=1662851854&sprefix=tshi%2Caps%2C139&ref=sr_pg_1");
			
		}
	
	public void title() {
		driver.getTitle();
	}
	
	public void scrol() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 11000);");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void creatingArrayofproducts() {
		//fetching and storing all the products in variable products
	   List<WebElement> firstPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
		   List<String> firstPageProductNames = new ArrayList();
	
		   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
	   for(WebElement names: firstPageproducts) {
		   firstPageProductNames.add(names.getText());
		   System.out.println(names.getText());
	   }
	   System.out.println("****************************************");
	  
	   secondPageBtn.click();
	   scrol();
	   
	   
	   //Fetching elements of second page
	   
	 //fetching and storing all the products in variable products
	   List<WebElement> secondPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
		   List<String> secondPageProductNames = new ArrayList();
	
		   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
	   for(WebElement names: secondPageproducts) {
		   secondPageProductNames.add(names.getText());
		   System.out.println(names.getText());
	   }
	   System.out.println("****************************************");
	  thirdPage.click();
	  scrol();
	  
	  //Fetching elements of third page
	   
		 //fetching and storing all the products in variable products
		   List<WebElement> thirdPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
			   List<String> thirdPageProductNames = new ArrayList();
		
			   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
		   for(WebElement names: thirdPageproducts) {
			   thirdPageProductNames.add(names.getText());
			   System.out.println(names.getText());
		   }
		   System.out.println("****************************************");
		 
		   fourthPage.click();
		  scrol();
		  
		//Fetching elements of fourth page
		   
			 //fetching and storing all the products in variable products
			   List<WebElement> fourthPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
				   List<String> fourthPageProductNames = new ArrayList();
			
				   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
			   for(WebElement names: fourthPageproducts) {
				   fourthPageProductNames.add(names.getText());
				   System.out.println(names.getText());
			   }
			   System.out.println("****************************************");
			 fifthPage.click();
			 scrol();
			 
			//Fetching elements of fifth page
			   
			 //fetching and storing all the products in variable products
			   List<WebElement> fifthPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
				   List<String> fifthPageProductNames = new ArrayList();
			
				   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
			   for(WebElement names: fifthPageproducts) {
				   fifthPageProductNames.add(names.getText());
				   System.out.println(names.getText());
			   }
			   System.out.println("****************************************");
			 sixthPage.click();
			 scrol();
	   
			//Fetching elements of sixth page
			   
			 //fetching and storing all the products in variable products
			   List<WebElement> sixthPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
				   List<String> sixthPageProductNames = new ArrayList();
			
				   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
			   for(WebElement names: sixthPageproducts) {
				   sixthPageProductNames.add(names.getText());
				   System.out.println(names.getText());
			   }
			   System.out.println("****************************************");
			 seventhPage.click();
			 scrol();
	   
			//Fetching elements of seventh page
			   
			 //fetching and storing all the products in variable products
			   List<WebElement> seventhPageproducts =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
				   List<String> seventhPageProductNames = new ArrayList();
			
				   //creating for loop to store list variable name in element names, loop runs till all the values from products get stored in element.
			   for(WebElement names: seventhPageproducts) {
				   seventhPageProductNames.add(names.getText());
				   System.out.println(names.getText());
			   }
			   System.out.println("****************************************");
			
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /*
	   while(true) {
		   NextBtn.click();
			scrol();
			products =	driver.findElements(By.xpath("//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//descendant::span[@class='a-size-base-plus a-color-base a-text-normal']"));
								for(WebElement names: products) {
				   productNames.add(names.getText());
				   System.out.println(names.getText());
			   }
			   System.out.println("****************************************");
			
			   
			   
			   try {
	   NextBtn = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-medium s-widget-container-height-medium celwidget slot=MAIN template=PAGINATION widgetId=pagination-button']//descendant::a[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
			   }catch(Exception e) {
				   e.printStackTrace();
				   System.out.println("No more products");
				   break;
				   
			   } 
	   }*/
	 //  System.out.println("****************************************");
		
	   
	   
	}
	
	
	
	
}
