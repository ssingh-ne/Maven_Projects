package Test_Cases_Dev;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.What_we_do;

public class What_we_Do_TC  extends Base_class {
	
	@Test
	
	public void HomePage_Header_login() throws InterruptedException {
	
		What_we_do w = new What_we_do(driver);
		Home_page h=new Home_page(driver);
		
		h.What_weDo();
		w.SideHeadin_1();
		w.SideHeadin_2();
		w.SideHeadin_3();
		w.SideHeadin_4();
		
	}
	
	
	
	
	
	

}
