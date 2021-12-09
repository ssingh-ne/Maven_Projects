package Warranty_Test_Case_Dev;

import org.testng.annotations.Test;

import Warranty_Page.About_us_page;
import Warranty_Page.Partner_withUS_Page;

public class Partner_With_US  extends Base_class {
	
	
	@Test
    public void partner () throws InterruptedException{
	// Open website, click on fotter link eg- twitter and come back to parent site and 
	
	
	
    Partner_withUS_Page p = new Partner_withUS_Page(driver);
	
	
	p.partner();
	
	
	
	}
	
	

}
