package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomSearch;

public class SearchTest extends BaseAmazonClass {

	PomSearch srch;
	
	public SearchTest() {
		super();
	}
	
	@BeforeMethod
	public void initSetup() {
		initiation();
		 srch = new PomSearch();
	}
	
	@Test
	public void SearchFunctionalityTest1() {
		srch.searchtext("iphone");
		//Log.lstSize();
		srch.submitBtnClick();
		//Log.chooseOption();
		srch.srchResult();
	}
	
	
	
}
