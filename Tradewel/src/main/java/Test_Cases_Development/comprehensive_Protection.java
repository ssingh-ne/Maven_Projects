package Test_Cases_Development;

import org.testng.annotations.Test;

import Pages.Home_Page;

public class comprehensive_Protection extends Base_class{
	
	@Test
	public void Comprehensive() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);

	h.Comprehensive();
	
	
	}
}


