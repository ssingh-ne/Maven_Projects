package AFL_Test_Cases_Dev;

import org.testng.annotations.Test;

import AFL_Pages.About_Us_Page;
import AFL_Pages.Home_page;

public class AboutUS_OutsideUS_dev extends Base_class {
	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_page h = new Home_page(driver);
	About_Us_Page a = new About_Us_Page(driver);
	
	h.Cookies();
	a.About_US_header_Dev();
	h.Header();
	a.Content_load();
	a.MeatTeam_Outside_US();
	a.About_US_homePage_dev();
	
	}

}
