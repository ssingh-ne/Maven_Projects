package Careers_Test_case_Development;

import org.testng.annotations.Test;

import Careers_Pages.Home_page;

public class Footer extends Base_class {
	
	@Test
	public void AUW_Footer() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
		home.Twitter();
		home.Facebook();
		home.Linkedin();
		home.Instagram();
        home.PrivacyPolicy_dev();
        home.CA_PrivacyPolicy_dev();
	
	
	
	}

}
