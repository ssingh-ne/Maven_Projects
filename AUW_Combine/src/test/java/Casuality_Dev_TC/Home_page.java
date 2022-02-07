package Casuality_Dev_TC;

import org.testng.annotations.Test;

import Casuality_pages.Home;
import Casuality_pages.Home_Press_Room;

public class Home_page extends Base_class {

	
	@Test
	public void HomePage() throws InterruptedException {
		
		Home h = new Home(driver);
		Home_Press_Room r = new Home_Press_Room(driver); 
		
		h.About_US();
		h.Privacy_policy();
		h.Carrer();
		h.Privacy_policy();
		//r.PressRoom();
	
	}
}
	