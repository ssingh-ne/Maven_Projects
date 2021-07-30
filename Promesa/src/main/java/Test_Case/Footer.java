package Test_Case;

import org.testng.annotations.Test;

import Pages.Home;

public class Footer extends Base_class {
	
@Test
	
	public void Footer() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Twitter();
	h.Facebook();
	h.LinkedIN();
	h.Instagram();
	h.Privacy_Policy();
	h.CA_Privacy_Policy();
	
}

	
	
	
}
