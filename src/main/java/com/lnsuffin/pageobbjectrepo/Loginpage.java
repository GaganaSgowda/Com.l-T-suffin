package com.lnsuffin.pageobbjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginpage {
public WebDriver driver;
public Loginpage() {}
public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//span[contains(text(),'Login/Register ')]")             //span[contains(text(),'Login/Register ')]
private WebElement Login;                                      //span[text()='Login/Register ']

@FindBy(xpath = "//button[contains(.,' Login ')]")
private WebElement LoginButton;

@FindBy(xpath = "//span[text()='Login using alternate method']")
private WebElement Login2;

@FindBy(xpath = "//input[@id='signInName']")
private WebElement email;

@FindBy(xpath = "//button[@type='submit']")
private WebElement contiue;

//@FindBy(xpath = "//input[@placeholder='Password']")
@FindBy(xpath="//*[@type='password']")
private WebElement password;

@FindBy(xpath = "//button[@type='submit']")
private WebElement submit;



//@FindBy(xpath = "//input[@id='firstName']")
//private WebElement userdetails;

public WebDriver getDriver() {
	return driver;
}
public WebElement getLogin() {
	return Login;
}
public WebElement getLoginButton() {
	return LoginButton;
}
public WebElement getLogin2() {
	return Login2;
}
public WebElement getEmail() {
	return email;
}
public WebElement getContiue() {
	return contiue;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
public void Loginmethod(String eamil, String pwd) throws Throwable  {
	Login.click();
	Thread.sleep(3000);
	LoginButton.click();
	Thread.sleep(3000);
	//Login2.click();
	//Thread.sleep(5000);
	email.sendKeys(eamil);
	contiue.click();
	email.sendKeys(eamil);
	Thread.sleep(5000);
	password.click();
	password.sendKeys(pwd);
	submit.click();Login.click();
	Thread.sleep(10000);
	Assert.assertEquals(driver.getCurrentUrl(), "https://demo.lntsufin.com/buyer/#/home");
//	
}
 
}
