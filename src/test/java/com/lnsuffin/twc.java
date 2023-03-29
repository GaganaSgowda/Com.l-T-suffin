package com.lnsuffin;

import org.testng.annotations.Test;

import com.lnsuffin.gearic.liberary.Baseclass1;
import com.lnsuffin.pageobbjectrepo.Applayloans;
import com.lnsuffin.pageobbjectrepo.Homepage;





public class twc extends Baseclass1{
	Homepage Hm;
	Applayloans Al;
//@Test
public void test() throws Throwable 
{
	System.out.println("sucessfully done");
}
@Test(priority = 1)
public void homepage() throws Throwable {
	 Hm=new Homepage(driver);
	  Hm.userdetail();
}
@Test(priority = 2)
public void applayloans() throws Throwable {
	Al=new Applayloans(driver);
	Al.loans();
}

}
