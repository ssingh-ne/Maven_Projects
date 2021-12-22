package AUW_Global_Test_Cases_Development;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import AUW_Global_Pages.Home_page;

public class Home_Page_TC extends Base_class {
	
	@Test
	public void HomePage() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Verify all links and buttons");  
		
		
		String Expected_URl_LearnMore = "https://develop--auw-global.netlify.app/about";
		String Expected_URl_AfterLogoClicked = "https://develop--auw-global.netlify.app/";
		String Expected_URl_Actual_MoreBtn = "https://develop--auw-global.netlify.app/partners";
		String Expected_URl_Actual_Disclaimer ="https://develop--auw-global.netlify.app/privacy-policy";
		
		
		
        Home_page h = new Home_page(driver);
       // h.Cookies();
        h.Learn_more();
        String Actual_URL = driver.getCurrentUrl();
        System.out.println("Learn More URL = " + Actual_URL);
        
		assertEquals(Actual_URL, Expected_URl_LearnMore);
		
		h.Logo_redirection();
		
	    String Actual_afterlogo = driver.getCurrentUrl();
	    System.out.println("After Logo clicked = " + Actual_afterlogo);
	        
		assertEquals(Actual_afterlogo, Expected_URl_AfterLogoClicked);
		
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
