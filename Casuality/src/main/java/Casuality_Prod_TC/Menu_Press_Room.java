package Casuality_Prod_TC;

import org.testng.annotations.Test;

import Casuality_pages.About_US;
import Casuality_pages.Home;
import Casuality_pages.Menu_PressRoom;

public class Menu_Press_Room  extends Base_class {

	
	@Test
	public void HomePage() throws InterruptedException {
		
		Home h = new Home(driver);
		Menu_PressRoom m = new Menu_PressRoom(driver);
		
		h.Menu_click();
		m.PressRoom_click();
		m.URL_Match();
		m.text_1();
		m.LoadMOre();
		m.text_2();
		
		
		
	}

}
