package Test_Case_Dev;

import org.testng.annotations.Test;

import Page.About_us_page;
import Page.Home_Page;

public class About_US extends Base_class {

	@Test
	    public void Home_page () throws InterruptedException{
		// Open website, click on fotter link eg- twitter and come back to parent site and 
		
		
		
        About_us_page a = new About_us_page(driver);
        
        
        a.About_US_header();
        a.About_US_Subheader();
	    a.meet();
	    a.Our_Team();
	    a.Affiliates();
	
}
}
