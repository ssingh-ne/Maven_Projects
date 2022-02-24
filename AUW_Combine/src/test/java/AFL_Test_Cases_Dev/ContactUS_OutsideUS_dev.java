package AFL_Test_Cases_Dev;

import org.testng.annotations.Test;

import AFL_Pages.About_Us_Page;
import AFL_Pages.Contact_Us_Page;
import AFL_Pages.Home_page;
 
public class ContactUS_OutsideUS_dev extends Base_class {
	
	@Test
	public void ContactUs_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	Contact_Us_Page c = new Contact_Us_Page(driver);
	
	c.ContactUS_Dev();
	h.Header();
	c.ContactUS_home_dev();
	h.Header();
	c.Contact_US_Coverage_Outside_US();
	
	
	
	
	
	}
	

}
