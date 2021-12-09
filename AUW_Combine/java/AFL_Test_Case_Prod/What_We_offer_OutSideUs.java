package AFL_Test_Case_Prod;

import org.testng.annotations.Test;

import AFL_Pages.Home_page;
import AFL_Pages.What_we_offer;

public class What_We_offer_OutSideUs extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException{
	
		
		Home_page h = new Home_page(driver);
		
		What_we_offer w = new What_we_offer(driver);
		
		h.Cookies();
		w.Heading_one_Tab1_OutsideUS();
		w.Heading_one_Tab2_OutsideUS();
		w.Heading_one_Tab3_OutsideUS();
		w.Heading_Two_OutsideUS();
		
		
	} 
	
	
	

}
