package Test_Case_Prod;

import org.testng.annotations.Test;

import Page.What_we_offer_Page;

public class What_We_offer extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		What_we_offer_Page w = new What_we_offer_Page(driver);
		
		w.What_we_offer1();
	    w.What_we_offer2();
	    w.What_we_offer3();
		}

}
