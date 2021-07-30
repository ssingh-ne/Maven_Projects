package Test_Cases_Prod;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.More_Offers;

public class More_offers_TC extends Base_class {
		
		@Test
		public void More_offers() throws InterruptedException { 
			
			More_Offers m = new More_Offers(driver);
			
			m.More_offer();
			
			
		}
	
}
