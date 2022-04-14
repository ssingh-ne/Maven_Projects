package TestCase_Sample;

import org.testng.annotations.Test;

import Pages.Home_Page;

public class Myntra_search extends Base_class {
	
	@Test
	public void main_Home_Page() throws InterruptedException{
	
	Home_Page h = new Home_Page(driver);
	
	
	h.Search("Bag");
	
	
	
	
	}
	
	
	
}
