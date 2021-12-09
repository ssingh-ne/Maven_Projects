package AFL_Test_Cases_Dev;

import org.testng.annotations.Test;

import AFL_Pages.Home_page;

public class Footer_TC_dev extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException{
	
		
		Home_page h = new Home_page(driver);
		
		h.Cookies();
		h.CA_PrivacyPolicy_dev();
        h.PrivacyPolicy_dev();
        h.Legal_Notice_footer_dev();
        h.Complaints_Procedure_footer_dev();
	}
}
