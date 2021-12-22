package AUW_Global_Test_Cases_Prod;

import org.testng.annotations.Test;

import AUW_Global_Pages.Home_page;
import AUW_Global_Pages.LearnMore_page;

public class LearnMore_TC extends Base_class {
	
	@Test
	public void LearnMore() throws InterruptedException {
		
		System.out.println("Verify contents on Learn more page");  
		
		
		Home_page h = new Home_page(driver);
		LearnMore_page l = new LearnMore_page(driver);
		
		
		h.Learn_more();
		l.Morebutton();
		
		
	}

}
