package Casuality_Prod_TC;

import org.testng.annotations.Test;

import Casuality_pages.About_US;
import Casuality_pages.Home;

public class Menu_About_US extends Base_class {

	
	@Test
	public void HomePage() throws InterruptedException {
		
		Home h = new Home(driver);
		About_US a = new About_US(driver);
		
		
	h.Menu_click();	
	a.About_click();
	a.sideHeading_1();
	a.sideHeading_2();
	a.sideHeading_3();
	a.sideHeading_4();
	a.Learn_more();
	
	
	
	}

}
