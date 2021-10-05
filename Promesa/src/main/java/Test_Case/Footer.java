package Test_Case;

import org.testng.annotations.Test;

import Pages.Home;

public class Footer extends Base_class {
	
@Test
	
	public void Footer_twitter() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Twitter();
	
}

   @Test

     public void Footer_facebook() throws InterruptedException{

         Home h = new Home(driver);

            h.Facebook();
}
	
   @Test
	
	public void Footer_linkedin() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.LinkedIN();
	
}
	
   
   @Test
	
	public void Footer_instagram() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Instagram();
	
}
   
   @Test
	
	public void Footer_PrivacyPolicy() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Privacy_Policy();
	h.CA_Privacy_Policy();
	
}
   
}
