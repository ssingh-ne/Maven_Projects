package Casuality_Dev_TC;

import org.testng.annotations.Test;

import Casuality_pages.Home;
import Casuality_pages.Menu_Carriers;

public class Menu_Our_Carriers extends Base_class{
	

	@Test
	public void Carriers() throws InterruptedException {
		
		Home h = new Home(driver);
	    Menu_Carriers c = new Menu_Carriers(driver);
	    
	    h.Menu_click();
	    c.MenuCarrier();
	    c.Ambest();
		
		
		
	}
}
