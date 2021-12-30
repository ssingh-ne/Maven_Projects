package MTL_Test_Cases_Dev;

import org.testng.annotations.Test;

import MTL_Pages.Home_page;

public class Home_URL extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		Home_page h = new Home_page(driver);
		
		h.contact_us_dev();
		h.CA_PrivacyPolicy_dev();
		h.PrivacyPolicy_dev();	
		
	}

}
