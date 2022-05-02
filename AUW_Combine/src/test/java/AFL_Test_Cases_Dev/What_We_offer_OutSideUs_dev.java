package AFL_Test_Cases_Dev;

import org.testng.annotations.Test;

import AFL_Pages.Home_page;
import AFL_Pages.What_we_offer;

public class What_We_offer_OutSideUs_dev extends Base_class {
	
	@Test
	public void WhatweOffer_outsideUS() throws InterruptedException{
	
		
		Home_page h = new Home_page(driver);
		
		What_we_offer w = new What_we_offer(driver);
		
		h.Cookies();
		w.Heading_one_Tab1_OutsideUS();
		w.Heading_one_Tab2_OutsideUS();
		w.Heading_one_Tab3_OutsideUS();
		w.Heading_Two_OutsideUS();
		
		
	} 
	
	
	

}
