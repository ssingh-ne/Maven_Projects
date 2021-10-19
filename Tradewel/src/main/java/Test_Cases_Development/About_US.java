package Test_Cases_Development;

import org.testng.annotations.Test;

import Pages.Home_Page;

public class About_US extends Base_class{
	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);
	
	
	h.About_US();
	h.CA_privacy_policy();
	h.privacy_policy();
	
	
	}

}
