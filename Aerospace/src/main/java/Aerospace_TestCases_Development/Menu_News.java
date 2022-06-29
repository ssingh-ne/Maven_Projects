package Aerospace_TestCases_Development;

import org.testng.annotations.Test;

import Aerospace_Pages.Home_Page;
import Aerospace_Pages.News_page;

public class Menu_News extends Base_class{


	@Test
	public void Home_Menu_News() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);
	News_page n = new News_page(driver);
	
	
	
	h.Home_Menu_News();
	n.Top_heading();
	n.News_image1();
	n.News_image2();
	n.News_image3();
//	n.News_image4();
	
	
}
}