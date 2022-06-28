package Adler_TestCases_Prod;

import org.testng.annotations.Test;

import Adler_Pages.Home_page;

public class Home extends Base_class {

	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	
	h.About_Us_prod();
	h.Contact_Us();
	h.PrivacyPolicy_prod();
	
	}
	
}
