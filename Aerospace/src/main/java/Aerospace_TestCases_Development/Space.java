package Aerospace_TestCases_Development;

import org.testng.annotations.Test;

import Aerospace_Pages.Aviation;
import Aerospace_Pages.Contact_US;
import Aerospace_Pages.Home_Page;
import Aerospace_Pages.Space_Page;

public class Space extends Base_class{


	@Test
	public void Home_Menu_News() throws InterruptedException{  
		
		Home_Page h = new Home_Page(driver);
		
		Contact_US c = new Contact_US(driver);
		
		Space_Page s = new Space_Page(driver);
		
		h.Home_Menu_Space();
		 s.Heading1();
	     s.Section1();
	     s.Section2();
	     s.Section3();
	     s.Section4();
	     s.Section5();
		 s.More();
		 s.Contact_Us();
		 s.CA_Privacy_policy();
		 s.Privacy_policy();
		
		
	}}