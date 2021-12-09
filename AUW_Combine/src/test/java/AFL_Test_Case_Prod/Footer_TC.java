package AFL_Test_Case_Prod;

import org.testng.annotations.Test;

import AFL_Pages.Home_page;

public class Footer_TC extends Base_class {
	
	@Test
	public void Footer() throws InterruptedException{
	
		
		Home_page h = new Home_page(driver);
		
		h.Cookies();
		h.CA_PrivacyPolicy();
        h.PrivacyPolicy();
        h.Legal_Notice_footer();
        h.Complaints_Procedure_footer();
	}
}
