package Adler_TestCases_Prod;

import org.testng.annotations.Test;

import Adler_Pages.Home_page;

public class News extends Base_class {

	
	@Test
	public void main_Home_Page() throws InterruptedException{
		
		Home_page h = new Home_page(driver);
		
		h.News1();
		h.News2();
		h.News3();
		h.News4();
		
		
	}

}
