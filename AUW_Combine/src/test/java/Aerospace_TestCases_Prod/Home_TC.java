package Aerospace_TestCases_Prod;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Aerospace_TestCases_Development.*;
import Aerospace_Pages.*;



public class Home_TC  extends Base_class {

	@Test
	public void Home_Page_main() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);
	
	h.logo();
	//h.Home_Aviation();
		
}
}