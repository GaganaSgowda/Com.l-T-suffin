package com.lnsuffin.gearic.liberary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Lntsuffin.genericUtility.PropertyFileData;
import com.lnsuffin.pageobbjectrepo.Loginpage;

public class Baseclass1 {
		  public WebDriver driver;
		  public static WebDriver sdriver;
		  public PropertyFileUtility propUtility=new PropertyFileUtility();
		  public JavaUtility jUtil=new JavaUtility();
		  public WebdriverUtility webUtil=new WebdriverUtility();
		  
			PropertyFileData Plib=new PropertyFileData();
			WebdriverUtility web=new WebdriverUtility();
			public Loginpage lg;
		
		  public String browser;

		  @BeforeClass
		  public void startUp() {
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--disable-notifications");
			  System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
				driver= new ChromeDriver(options);
			 
			  System.out.println(browser+" Browser is Successfully Launched");
		
			  webUtil.maximizeWindow(driver);
			  webUtil.waitforPageToLoad(driver);
			  driver.get(Plib.getDataFromPropertyFile("url"));  
			  sdriver=driver;
		  }
		 
		  
	  @BeforeMethod
		  public void Login() throws Throwable
		  {
			  lg=new Loginpage(driver);
			  lg.Loginmethod("buyer2@OI2850-0000118.com","Connect@123"); 
			  System.out.println("Successfully Logged-in");
		  }
		  //@AfterMethod
//		  public void Logout() {
//			  lo=new LogoutPage(driver);
//			  lo.LogoutForApplication();
//			  System.out.println("Successfully Logged-Out");
//		  }
		 // @AfterClass
//		  public void tearDown() {
//			  driver.quit();
//			  System.out.println(browser+" Browser is Successfully closed");
//			 
//		  
//		}

}
