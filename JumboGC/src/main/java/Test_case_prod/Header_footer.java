package Test_case_prod;

import org.testng.annotations.Test;

import Pages.Home;

public class Header_footer extends Base_class {
	
	
	@Test
	
	public void Header_Footer() throws InterruptedException{
		
      Home h = new Home(driver);
      Thread.sleep(15000);
        h.Login();
		h.Facebook();
		h.Instagram();
		h.LinkedIN();
		h.Privacy_Policy();
		h.CA_Privacy_Policy();
		
		
	
	}

}
