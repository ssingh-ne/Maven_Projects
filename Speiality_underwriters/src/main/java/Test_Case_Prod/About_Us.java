package Test_Case_Prod;

import org.testng.annotations.Test;

import Page.Home_page;

public class About_Us extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		Page.About_Us a = new Page.About_Us(driver);
		
		a.About_US_prod();
		
		
	}

}
