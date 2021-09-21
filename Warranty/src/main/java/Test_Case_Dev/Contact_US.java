package Test_Case_Dev;

import org.testng.annotations.Test;

import Page.ContactUS_page;

public class Contact_US extends Base_class {

		@Test
		    public void ContactUS () throws InterruptedException{
			
			
			ContactUS_page c = new ContactUS_page(driver);
			
			c.AboutUS();
			c.contactUS();
            c.NewsEvents();
            c.partner();
		
		
		}
		

}
