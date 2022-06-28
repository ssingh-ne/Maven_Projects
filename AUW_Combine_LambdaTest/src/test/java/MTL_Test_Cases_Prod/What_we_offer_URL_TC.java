package MTL_Test_Cases_Prod;

import org.testng.annotations.Test;

import MTL_Pages.Home_page;
import MTL_Pages.WhatWeOffer_page;

public class What_we_offer_URL_TC extends Base_class {
	
	@Test
	public void Heading() throws InterruptedException {
		
		
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
	
	    w.Heading_one_URL();
	    w.Heading_Three_URL();

}
	}
