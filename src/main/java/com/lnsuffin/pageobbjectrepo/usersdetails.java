package com.lnsuffin.pageobbjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class usersdetails {
	public WebDriver driver;
	public void  userdetails() {}
	public void userdetails (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
