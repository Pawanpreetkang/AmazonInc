package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomPagination;

public class PaginationTest extends BaseAmazonClass {

	
	PomPagination pomPage;
	
	public PaginationTest() {
          
		super();
	
	}
	
	@BeforeMethod
	public void initSetup() {
		initiation();
		 pomPage = new PomPagination();
	}
	
	@Test
	public void paginationTest1() {
		pomPage.title();
		pomPage.scrol();
		pomPage.creatingArrayofproducts();
	}
}
