package AUW_Test_case_prod;

import org.testng.annotations.Test;

import AUW_Pages.Home_page;
import AUW_Pages.Practices_ForagentsAndBrokers;
import AUW_prod.Base_Class;

public class Practices_AgentsBrokers extends Base_Class {
	
	@Test
	public void Practices_AgentsBrokers() throws InterruptedException{
		
		
		Practices_ForagentsAndBrokers ab = new Practices_ForagentsAndBrokers(driver);
		Home_page h = new Home_page(driver);
		
		ab.Practices_link_agentBrokers();
		h.Cookies();
		ab.AgentBroker_subheader();
		
		ab.Column1_Heading();
		ab.Column2_Heading();
		ab.Column3_Heading();
		ab.Column4_Heading();
		ab.Column5_Heading();
		ab.Column6_Heading();
		ab.Column7_Heading();
		ab.Column8_Heading();
		ab.Column9_Heading();
		ab.Column10_Heading();
		ab.Column11_Heading();
		ab.Contact_US();
		
	}
		


}
