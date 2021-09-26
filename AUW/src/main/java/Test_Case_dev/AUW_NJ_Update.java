package Test_Case_dev;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.NJ_Update;

public class AUW_NJ_Update extends Base_class {
	
	
	@Test
	public void main() throws InterruptedException{
		
		NJ_Update nj = new NJ_Update(driver);
		Home_page h = new Home_page(driver);
		
		nj.Update_URL();
		nj.Header_();
		h.Cookies();
		nj.Facts_View();
		nj.Header_();
		nj.Reload_Update_URL();
		nj.Facts_Download();
					
	}

}
