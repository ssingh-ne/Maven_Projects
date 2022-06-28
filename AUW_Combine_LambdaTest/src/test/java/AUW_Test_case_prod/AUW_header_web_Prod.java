package AUW_Test_case_prod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AUW_Pages.Home_page;
import AUW_Test_case_prod.Base_class;

public class AUW_header_web_Prod  extends Base_class{
	@Test
public void main() throws InterruptedException{
	
	System.out.println("Open website, Click on header buttons and verify redirection is on correct pages");
	
	// Click on Experience button
	
	Home_page home = new Home_page(driver);
	
	home.Experience_btn();
	Thread.sleep(4000);
	String Actual_URL = driver.getCurrentUrl();

	System.out.println("Current URL = " + Actual_URL);
	
	String Experience_Exp_URL = "https://www.auw.com/experience";
	
	Thread.sleep(4000);
	// Click on Intelligence button
	
	home.Intelligence_btn();
	Thread.sleep(4000);
	String Actual_Intel_URL = driver.getCurrentUrl();

	System.out.println("Intel_URL = " + Actual_Intel_URL);
	
	String Intelligence_Exp_URL ="https://www.auw.com/intelligence";
	Thread.sleep(4000);
	
	// Click on About Us button
	home.AboutUs_btn();
	Thread.sleep(4000);
	String Actual_About_but = driver.getCurrentUrl();

	System.out.println("About_but = " + Actual_About_but);
	
	String AboutUs_Exp_URL ="https://www.auw.com/about-us";
	
	Thread.sleep(4000);
	// Click on Login button
	
	home.Login_btn();
	Thread.sleep(4000);
	String Actual_Login = driver.getCurrentUrl();

	System.out.println("Login = " + Actual_Login);
	
	String Login_Exp_URL ="https://www.appliedunderwriters.com/Login.aspx";
	Thread.sleep(4000);
	 assertEquals(Experience_Exp_URL, Actual_URL);
	 assertEquals(Intelligence_Exp_URL, Actual_Intel_URL );
	 assertEquals(AboutUs_Exp_URL, Actual_About_but);
	 assertEquals(Login_Exp_URL, Actual_Login);
	 
	
}

}
