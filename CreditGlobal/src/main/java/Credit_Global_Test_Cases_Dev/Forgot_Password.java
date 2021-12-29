package Credit_Global_Test_Cases_Dev;

import org.testng.annotations.Test;

import Credit_Global_Pages.Login_page;

public class Forgot_Password  extends Base_class {
	
	@Test
	public void HomePage_Header_login() throws InterruptedException {
		
		
		Login_page l = new Login_page(driver);
		
		l.forgot_password();
		
		
	
	}
	
	
	
	
	

}
