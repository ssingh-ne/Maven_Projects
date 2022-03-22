package Aerospace_TestCases_Development;

import org.testng.annotations.Test;

import Aerospace_Pages.About_US;
import Aerospace_Pages.Contact_US;
import Aerospace_Pages.Home_Page;

public class Menu_About_Us extends Base_class{


	@Test
	public void Home_Menu_AboutUS() throws InterruptedException{  
		
		Home_Page h = new Home_Page(driver);
		
		About_US a = new About_US(driver);
		
		h.Home_Menu_AboutUs();
		a.Heading();
		a.Image_Section();
		a.Contact_Form();
		

}
}