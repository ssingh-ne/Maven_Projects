package Speciality_underwriters_Test_Case_Prod;

import org.testng.annotations.Test;

import Speciality_underwriters_Page.Home_page;

public class About_Us extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		Speciality_underwriters_Page.About_Us a = new Speciality_underwriters_Page.About_Us(driver);
		
		a.About_US_prod();
		
		
	}

}
