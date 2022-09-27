package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomFilter;


public class FilterTest extends BaseAmazonClass {

	PomFilter flt ;
	public FilterTest() {
		super();
	}
	
	@BeforeMethod
	public void initSetup() {
		initiation();
		 flt = new PomFilter();
	}
	
	@Test
	public void FilterTest1() {
		flt.searchtext("shoes");
		flt.submitBtnClick();
		flt.checkF();
	}
	
}
