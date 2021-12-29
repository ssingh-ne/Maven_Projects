package JumboGC_Test_case_prod;

import org.testng.annotations.Test;

import JumboGC_Pages.Home;

public class Header_footer extends Base_class {
	

	@Test
	
	public void Header_Login() throws InterruptedException{
		
      Home h = new Home(driver);
      Thread.sleep(15000);
        h.Login();
		
		
	}

@Test
	
	public void Footer_Facebook() throws InterruptedException{
		
      Home h = new Home(driver);
      Thread.sleep(15000);
        
		h.Facebook();
		
	}
	
@Test

   public void Footer_Instagram() throws InterruptedException{
	
  Home h = new Home(driver);
  Thread.sleep(15000);
    h.Instagram();
	
}
@Test

    public void Footer_linkedIN() throws InterruptedException{
	
  Home h = new Home(driver);
  Thread.sleep(15000);
    
	h.LinkedIN();
	
}
	
@Test

public void Footer_Privacy() throws InterruptedException{
	
  Home h = new Home(driver);
  Thread.sleep(15000);
    
	h.Privacy_Policy();
	h.CA_Privacy_Policy();
	
	

}
}
