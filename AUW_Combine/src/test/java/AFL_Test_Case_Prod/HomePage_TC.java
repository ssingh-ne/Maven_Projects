package AFL_Test_Case_Prod;

import org.testng.annotations.Test;

import AFL_Pages.Home_page;

public class HomePage_TC extends Base_class {
	
	@Test
	public void Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	
	    h.Cookies();
	    h.Moreoffers();
	    h.About_US_header();
		h.ContactUs_Header();
		h.ContactUs_Btn();
		h.Language_DropDown();
		h.Quote();
		
	}

}
