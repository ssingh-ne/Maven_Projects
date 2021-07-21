package Test_Case_dev;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.About_Us;
import Pages.Home_page;

public class AUW_AboutUS extends Base_class {
	
	
	@Test
	public void AboutUS() throws InterruptedException{
		

		
		
		Home_page home = new Home_page(driver);
		home.Cookies();
		home.AboutUs_btn();
		
		About_Us about = new About_Us(driver);
		
		about.Header();
		home.Header();
		about.LeftTab_one();
		about.LeftTab_two();
		about.NEWSandPress_Heading_one();
		/*about.NEWSandPress_Heading_two();
		about.NEWSandPress_Heading_three();
		about.NEWSandPress_Heading_four();
		about.NEWSandPress_Heading_five();
		about.NEWSandPress_Heading_Six();
		*/
		about.View_All_Releases();
		about.Contact_Us();
		
	}

}
