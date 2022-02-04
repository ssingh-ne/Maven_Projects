package Casuality_Prod_TC;

import org.testng.annotations.Test;

import Casuality_pages.About_US;
import Casuality_pages.Home;
import Casuality_pages.Menu_Contact_Page;

public class Menu_Contact_Us extends  Base_class {
	
	@Test
	public void HomePage() throws InterruptedException {
		
		Home h = new Home(driver);
		Menu_Contact_Page c = new Menu_Contact_Page(driver);
		
		h.Menu_click();
		c.MenuContact();
		c.URL_Match();
		c.contact_us();
		
	
	
	
	
	}
}
