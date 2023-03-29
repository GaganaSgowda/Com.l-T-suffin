package com.lnsuffin.pageobbjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
	public WebDriver driver;
	public  Homepage() {}
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//div[@role='button']")
	private WebElement profile;

	@FindBy(xpath = "//span[text()=' Manage your Profile ']")
	private WebElement manageprofile;
	
	@FindBy(xpath = "//span[text()=' Menu ']")
	private WebElement menu;
	
	@FindBy( xpath = "//a[text()=' Manage Profile Changes ']" )
	private WebElement manageprofilechanges;
	
	@FindBy(xpath="//a[@class='anchor downloadLink viewRecord']")
	private WebElement view;
	
	@FindBy(xpath ="//button[text()=' Back ']")
	private WebElement back;
	
	public void userdetail() throws InterruptedException {
		profile.click();
		Thread.sleep(3000);
	    manageprofile.click();
	    Thread.sleep(3000);
	    menu.click();
	    Thread.sleep(3000);
	    manageprofilechanges.click();
	    Thread.sleep(3000);
	    view.click();
	    Thread.sleep(3000);
	    back.click();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://demo.lntsufin.com/buyer/#/home");
	}
	
}
