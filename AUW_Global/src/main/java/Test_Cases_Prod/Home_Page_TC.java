package Test_Cases_Prod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.Home_page;

public class Home_Page_TC extends Base_class {
	
	@Test
	public void HomePage() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Verify all links and buttons");  
		
		
		String Expected_URl_LearnMore = "https://auw.global/about";
		String Expected_URl_AfterLogoClicked = "https://auw.global/";
		String Expected_URl_Actual_MoreBtn = "https://auw.global/partners";
		String Expected_URl_Actual_Disclaimer ="https://auw.global/privacy-policy";
		
		
		
        Home_page h = new Home_page(driver);
        
        h.Learn_more();
        String Actual_URL = driver.getCurrentUrl();
        System.out.println("Learn More URL = " + Actual_URL);
        
		assertEquals(Actual_URL, Expected_URl_LearnMore);
		Thread.sleep(5000);
		h.Logo_redirection();
		
	    String Actual_afterlogo = driver.getCurrentUrl();
	    System.out.println("After Logo clicked = " + Actual_afterlogo);
	        
		assertEquals(Actual_afterlogo, Expected_URl_AfterLogoClicked);
		Thread.sleep(5000);
		
		h.Legal_disclaimer();
		
		String Actual_Disclaimer = driver.getCurrentUrl();
		System.out.println("Disclaimer URL = " + Actual_Disclaimer);
		        
		assertEquals(Actual_Disclaimer, Expected_URl_Actual_Disclaimer);
		
		h.Logo_redirection_about();
		
        h.More_messageFounder();
		
		String Actual_MoreBtn = driver.getCurrentUrl();
		System.out.println("Learn More URL = " + Actual_MoreBtn);
		        
		assertEquals(Actual_MoreBtn, Expected_URl_Actual_MoreBtn);
		
	}

}
