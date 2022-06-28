package Aerospace_TestCases_Development;

import org.testng.annotations.Test;

import Aerospace_Pages.Contact_US;
import Aerospace_Pages.Home_Page;

public class Menu_Contact_US extends Base_class{


	@Test
	public void Home_Menu_News() throws InterruptedException{  
		
		Home_Page h = new Home_Page(driver);
		
		Contact_US c = new Contact_US(driver);
		
		h.Home_Menu_Contact();
		
		c.Heading();
		c.Offices_Section();
		c.Contact_Form();
}
}