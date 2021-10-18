package Test_Cases_Development;

import org.testng.annotations.Test;

import Pages.WhatsNewPage;

public class WatsNew extends Base_class {
	
	@Test
	public void WhatsNew() throws InterruptedException{
	
	WhatsNewPage n = new WhatsNewPage(driver);
	
	n.News1();
	
	n.LoadMore();
	
	}
	

}
