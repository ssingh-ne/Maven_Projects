package Speciality_underwriters_Test_Case_Dev;

import org.testng.annotations.Test;

import Speciality_underwriters_Page.Home_page;

public class Home_TC extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		Home_page h = new Home_page(driver);
		
		h.CA_PrivacyPolicy_dev();
		h.PrivacyPolicy_dev();	
		
	}

}
