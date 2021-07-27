package Test_Cases_Prod;

import org.testng.annotations.Test;

import Pages.Login_page;

public class Forgot_Password  extends Base_class {
	
	@Test
	public void HomePage_Header_login() throws InterruptedException {
		
		
		Login_page l = new Login_page(driver);
		
		l.forgot_password_prod();
		
		
	
	}
	
	
	
	
	

}
