package Test_Case_Prod;

import org.testng.annotations.Test;

import Pages.About_Us_Page;
import Pages.Contact_Us_Page;
import Pages.Home_page;
 
public class ContactUS_OutsideUS extends Base_class {
	
	@Test
	public void ContactUs_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	Contact_Us_Page c = new Contact_Us_Page(driver);
	
	c.ContactUS();
	h.Header();
	c.ContactUS_home();
	h.Header();
	
	
	
	
	
	
	}
	

}