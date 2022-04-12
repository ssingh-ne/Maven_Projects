package Warranty_Test_Case_Dev;

import org.testng.annotations.Test;

import Warranty_Page.Home_Page;

public class HomePage_Testcase extends Base_class {
	
	@Test
	public void Home_page () throws InterruptedException{
		// Open website, click on fotter link eg- twitter and come back to parent site and 
		
		
		
  Home_Page h = new Home_Page(driver);
	
        h.Header();
        h.sudHeading_dev();
        h.Our_products_section1();
        h.Our_products_section2();
	    h.Our_products_section3();
	    h.Our_products_section4();
	    h.Our_products_section5();
	    h.Our_products_section6();
	    h.Our_partners();
	    h.CA_PrivacyPolicy_dev();
	    h.PrivacyPolicy_dev();
	 
	
	}
}

