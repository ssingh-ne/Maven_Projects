package Test_Cases_Dev;

import org.testng.annotations.Test;

import Pages.Home_page;

public class HomePage_TC_dev extends Base_class {
	
	@Test
	public void Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	
	    h.Cookies();
	    h.Content_load();
	    h.Moreoffers();
	    h.About_US_header_dev();
		h.ContactUs_Header_dev();
		h.ContactUs_Btn_dev();
		h.Language_DropDown_dev();
		h.Quote();
		
	}

}
