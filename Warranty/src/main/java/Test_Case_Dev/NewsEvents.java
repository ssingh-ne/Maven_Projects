package Test_Case_Dev;

import org.testng.annotations.Test;

import Page.About_us_page;
import Page.NewsEvents_Page;

public class NewsEvents extends Base_class {

	@Test
	    public void NewsEvents () throws InterruptedException{
		
        NewsEvents_Page n = new NewsEvents_Page(driver);
        
        n.News();
        n.Image1();
        n.Image2();
        n.Image3();
        n.Image4();
        n.Image5();
        
        
	}
}
