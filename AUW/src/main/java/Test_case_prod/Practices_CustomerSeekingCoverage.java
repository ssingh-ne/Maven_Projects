package Test_case_prod;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.Practices_ForagentsAndBrokers;
import Pages.Practices_customerSeekingCoverage;
import Pages.Practices_customerSeekingCoverage_prod;

public class Practices_CustomerSeekingCoverage extends Base_class {
	
	
	@Test
	public void Practices_CustomerSeekingCoverage() throws InterruptedException{
		
		
		Practices_ForagentsAndBrokers ab = new Practices_ForagentsAndBrokers(driver);
		
		Practices_customerSeekingCoverage_prod fb = new Practices_customerSeekingCoverage_prod(driver);
		
		Home_page h = new Home_page(driver);
		
		fb.Practices_link_CustomerSeekingCoverage();
		
		h.Cookies();
		
		fb.CustomerSeekingCoverage_Heading1();
		
		fb.CustomerSeekingCoverage_Heading2();
		
		fb.CustomerSeekingCoverage_Heading3();
		
		fb.CustomerSeekingCoverage_Heading4();
		
		fb.CustomerSeekingCoverage_Heading5();
		
		fb.CustomerSeekingCoverage_Heading6();
		
		fb.CustomerSeekingCoverage_Heading7();
		

}}
