package testLayer;

import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomSignup;
import testData.ExcelSheet;

public class SignupTest extends BaseAmazonClass{
	PomSignup Sig;
	
	public SignupTest() {
		super();
	}
	@BeforeMethod
	public void initSetup() {
		initiation();
		 Sig = new PomSignup();
		// Sig.ClickHelloMsg();
		 Sig.ClickCrtAcBtn();
	}
	
	@Test(priority=1)
	public void Title() {
	String actual =	Sig.verify();
	System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Registration");
		
		} 
	@DataProvider
	public Object[][] Details(){
		 Object result[][]=ExcelSheet.readdata("Sheet1");
		 return result;
	}
	@Test(priority =2, dataProvider="Details")
	public void SignupTest1(String Yourname, String Email, String Password, String PasswordAgain) {
		Sig.typeYourname(Yourname);
		
		Sig.typeEmail(Email);
		Sig.typePassword(Password);
		
		Sig.typePasswordAgain(PasswordAgain);
		Sig.clickbutton();
		
	}
	
	
	/*@AfterMethod
	public void close() {
	
		driver.close();
		
		
	}*/
	
}
