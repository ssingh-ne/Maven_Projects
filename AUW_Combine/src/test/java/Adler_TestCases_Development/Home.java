package Adler_TestCases_Development;

import org.testng.annotations.Test;

import Adler_Pages.Home_page;

public class Home extends Base_class {

	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	
	h.Contact_Us();
	h.About_Us();
	h.PrivacyPolicy();
	
	}
	
}
