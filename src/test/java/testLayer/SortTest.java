package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomSort;

public class SortTest extends BaseAmazonClass{

	PomSort sr;
	
	
	public SortTest() {
		super();
	}
	@BeforeMethod
	public void initSetup() {
		initiation();
		sr= new PomSort();
	}
	
	@Test
	public void SortTest1() {
		sr.searchProduct();
		sr.fetchTitle();
		sr.getAllProducts();
	}
}
