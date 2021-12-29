package Pinnacle_Test_Cases_Development;

import org.testng.annotations.Test;

import Pinnacle_Pages.Home;
import Pinnacle_Pages.WhatsNewPage;

public class WatsNew extends Base_class {
	
	@Test
	public void WhatsNew() throws InterruptedException{
	
	WhatsNewPage n = new WhatsNewPage(driver);
	Home h = new Home(driver);
	
	h.Home_continue();
	
	n.News1();
	
	n.LoadMore();
	
	}
	

}
