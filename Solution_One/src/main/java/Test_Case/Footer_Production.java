package Test_Case;

import org.testng.annotations.Test;

import Pages.Home;

public class Footer_Production extends Base_class_Prod {
	
@Test
	
	public void Footer() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Login();
	h.Twitter();
	h.Facebook();
	h.LinkedIN();
	h.Instagram();
	h.Privacy_Policy();
	h.CA_Privacy_Policy();
	
}
	
}
