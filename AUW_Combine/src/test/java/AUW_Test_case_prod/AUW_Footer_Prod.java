package AUW_Test_case_prod;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AUW_Pages.Home_page;

public class AUW_Footer_Prod extends Base_class {
	
	@Test
	public void AUW_Footer() throws InterruptedException{
		// Open website, click on fotter link eg- twitter and come back to parent site and 
		
		System.out.println("Open website, Click on footer buttons");
		
		Home_page home = new Home_page(driver);
		
		home.Cookies();
		home.Twitter();
		home.Facebook();
		home.Linkedin();
		home.Instagram();
        home.PrivacyPolicy();
        home.CA_PrivacyPolicy();
          
         
}}
	
	

	
