package Warranty_Test_Case_Dev;

import org.testng.annotations.Test;

import Warranty_Page.About_us_page;
import Warranty_Page.NewsEvents_Page;

public class NewsEvents extends Base_class {

	@Test
	    public void NewsEvents () throws InterruptedException{
		
        NewsEvents_Page n = new NewsEvents_Page(driver);
        
       n.News();
       /*        n.Image1();
        n.Image2();
        n.Image3();
        n.Image4();
*/        n.Image5();
        
        
	}
}
