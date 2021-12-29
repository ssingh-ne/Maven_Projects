package Solution_one_Development;

import org.testng.annotations.Test;

import Solution_one_Pages.Home;

public class Footer_Develop extends Base_class_Development {
	
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
