package Test_Cases_Prod;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.WhatWeOffer_page;
import Test_Cases_Prod.Base_class;

public class What_we_offer1_Firefox_TC  extends Base_class {
	
	
	@Test
	public void Heading() throws InterruptedException {
		
		
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		
		w.Heading_one();
	    w.Heading_two();
		w.Heading_three();
		w.Heading_four();
		w.Heading_five();
		w.Heading_six();
		w.Heading_seven();
		w.Heading_eight();
		w.Heading_nine();
		w.Heading_ten();
		//w.Heading_eleven();

}
}