package Test_Case_Prod;

import org.testng.annotations.Test;

import Page.Contact_Us_page;
import Page.Home_page;

public class Contact_US_TC  extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException { 
		
		Home_page h = new Home_page(driver); 
		Contact_Us_page c = new Contact_Us_page(driver);
		
		c.contactUs_Prod();
	
		} 
	
}
