package Credit_Global_Test_Cases_Dev;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Credit_Global_Pages.Home_page;




public class Home_TC extends Base_class {
	
	@Test
	public void HomePage_Header_login() throws InterruptedException {
	
		Home_page h = new Home_page(driver);
		
		
		h.login();
		
	}
	
	@Test
	public void HomePage_Header_ContactUS_btn() throws InterruptedException {
	
		Home_page h = new Home_page(driver);
		
		h.ContactUS_btn();
	
	}
	
	@Test
	public void HomePage_Header_Our_approach() throws InterruptedException {
	
		Home_page h = new Home_page(driver);
		
		h.Our_approach();
	
	}
	

	@Test
	public void HomePage_Header_What_weDo() throws InterruptedException {
	
		Home_page h = new Home_page(driver);
		
		h.What_weDo();
	
	}

}
