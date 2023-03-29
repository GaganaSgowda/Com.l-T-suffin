package com.lnsuffin.pageobbjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lnsuffin.gearic.liberary.WebdriverUtility;

public class Applayloans {
	public WebDriver driver;
	//WebdriverUtility web=new WebdriverUtility();
	public  Applayloans() {}
	public Applayloans(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//span[text()='Apply for Loan']")
	private WebElement apploans;
	
	@FindBy(xpath = "//button[text()=' AVAIL NOW ']")
	private WebElement AVAILNOW;
	
	//@FindBy(xpath = "//a[text()=' Offered Rate of Interest ']")
	//private WebElement OfferedRate;
	
	//@FindBy(xpath = "//button[text()='OK'")
	//private WebElement OK;
	
	public void loans() throws Throwable {
		apploans.click();
		Thread.sleep(2000);
		//web.scrollAction(driver);
		 AVAILNOW.click();
		 Thread.sleep(2000);                                         
	//	 OfferedRate.click();
		// Thread.sleep(2000);
		// OK.click();
	}
}
