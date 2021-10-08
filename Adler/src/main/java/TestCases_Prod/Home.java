package TestCases_Prod;

import org.testng.annotations.Test;

import Pages.Home_page;

public class Home extends Base_class {

	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	
	h.PrivacyPolicy();
	
	}
	
}
