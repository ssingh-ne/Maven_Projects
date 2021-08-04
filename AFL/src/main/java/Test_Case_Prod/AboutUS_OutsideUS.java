package Test_Case_Prod;

import org.testng.annotations.Test;

import Pages.About_Us_Page;
import Pages.Home_page;

public class AboutUS_OutsideUS extends Base_class {
	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	About_Us_Page a = new About_Us_Page(driver);
	
	h.Cookies();
	a.About_US_header();
	h.Header();
	a.MeatTeam_Outside_US();
	a.About_US_homePage();
	
	}

}
