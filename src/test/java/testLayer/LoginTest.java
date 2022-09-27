package testLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomLogin;
import testData.ExcelSheet;

public class LoginTest extends BaseAmazonClass{

	PomLogin Log;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void initSetup() {
		initiation();
		 Log = new PomLogin();
	}
	
	@Test
	public void LoginTitle() {
		String actual=Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Sign In");
	}
	
	@DataProvider
	public Object[][] Details(){
		Object[][] result = ExcelSheet.readdata("Sheet2");
		return result;
	}
	
	@Test(dataProvider="Details")
	public void LoginTest1( String Email, String pass) {
		
		
		Log.typeLoginEmail(Email);
		Log.clickLoginContinueBtn();
		Log.typePassword(pass);
		Log.clickSignInBtn();
		
		Log.ClickNav();
		System.out.println("Clicked Nav");
		Log.clickYourOrders();
		System.out.println("Opened Your Orders page");
		Log.clickBuyAgainLnk();
		System.out.println("Opened Buy Again link");
		Log.clickNotYetShippedLnk();
		System.out.println("Opened orders that haven't yet been shipped");
		Log.clickCancelledOrdersLnk();
		System.out.println("Opened cancelled orders page");
		
			
		
	}

}
