package Pinnacle_Test_Cases_Development;

import org.testng.annotations.Test;

import Pinnacle_Pages.Home;

public class HomePage_TC extends Base_class{
	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Home_continue();
	
	h.ENGandDesign();
	h.About_Us();
	h.Contact_Us();
	h.convey_Us();
	h.PrivacyPolicy();
	}

}
