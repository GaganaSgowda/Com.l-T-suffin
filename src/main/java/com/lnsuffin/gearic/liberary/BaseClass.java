package com.lnsuffin.gearic.liberary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Lntsuffin.genericUtility.JavaUtility;
import com.Lntsuffin.genericUtility.PropertyFileData;
import com.Lntsuffin.genericUtility.WebDriverUtility;
import com.lnsuffin.pageobbjectrepo.Loginpage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticdriver;
	public WebDriverUtility Webdriver;
	public PropertyFileData Pfile;	
	public JavaUtility JLib;
	PropertyFileData Plib=new PropertyFileData();
	WebdriverUtility web=new WebdriverUtility();
	//public Loginpage lg;
	@BeforeClass
	public void startUp() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		driver= new ChromeDriver(options);
		staticdriver=driver;
		driver.get(Plib.getDataFromPropertyFile("url"));	
		web.maximizeWindow(driver);
	}
	//@BeforeMethod
	//public void login() throws Throwable {
	//	 lg=new Loginpage(driver);
	 //   lg.Loginmethod("buyer2@OI2850-0000118.com","Connect@123");
	//}
	@BeforeMethod
	  public void Login() throws Throwable
	  {
		 // lg=new Loginpage(driver);
		 // lg.Loginmethod("buyer2@OI2850-0000118.com","Connect@123"); 
		  System.out.println("Successfully Logged-in");
	  }
}


























