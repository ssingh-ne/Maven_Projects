package Promesa_Test_Case_Development;

import org.testng.annotations.Test;

import Promesa_Pages.Home;

public class Footer extends Base_class {
	
@Test
	
	public void Footer() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Twitter();
	h.Facebook();
	h.LinkedIN();
	h.Instagram();
	h.Privacy_Policy_dev();
	h.CA_Privacy_Policy_dev();
	
}

	
	
	
}
