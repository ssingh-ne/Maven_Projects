package Aerospace_TestCases_Development;

import org.testng.annotations.Test;

import Aerospace_Pages.Aviation;
import Aerospace_Pages.Home_Page;

public class Menu_Aviation extends Base_class{


	@Test
	public void Home_Menu_Aeviation() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);
	Aviation a = new Aviation(driver);
	
	     h.Home_Menu_Aviation();
	     a.Heading1();
	     a.Section1();
	     a.Section2();
	     a.Section3();
	     a.Section4();
	     a.Section5();
	     a.More();
	     a.Contact_Us();
	     a.Privacy_policy();
	     a.CA_Privacy_policy();
}
}