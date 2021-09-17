package Test_case_Prod;

import org.testng.annotations.Test;

import Pages.Home_page;

public class Footer extends Base_class {
	
	@Test
	public void AUW_twitter() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
		home.Twitter();
	
	
	}

	
	
	@Test
	public void AUW_Facebook() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
		
		home.Facebook();
		
	}
	
	@Test
	public void AUW_Linkedin() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
		home.Linkedin();
		
	
	}
	
	@Test
	public void AUW_Instagram() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
		home.Instagram();
       
	}
	
	@Test
	public void AUW_Policy() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");  
		
        Home_page home = new Home_page(driver);
		
        home.PrivacyPolicy();
        home.CA_PrivacyPolicy();
	
	System.out.println("Footer working properly");
	
	}





}
