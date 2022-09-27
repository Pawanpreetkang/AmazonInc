package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseAmazonClass {

	public static Properties prop= new Properties();
	public static WebDriver driver;
	
	//Step1 Create class constructor;
	public BaseAmazonClass() {
		
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\kangp\\Desktop\\AmazonAutomation\\src\\test\\java\\environmentVariables\\Config.properties");
		prop.load(file);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
		
		
	}
	//Step 2 method to contain all common commands
			public static void initiation(){
				//driver path,
				//maximize window, pageload timeouts
				
			String browsername=	prop.getProperty("browser");
				if(browsername.equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new ChromeDriver();
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
				
			}
}
