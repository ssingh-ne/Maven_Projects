package Warranty_Test_Case_Prod;

import org.testng.annotations.Test;

import Warranty_Page.Our_Partners_page;
import Warranty_Test_Case_Dev.Base_class;

public class Our_Partner extends Warranty_Test_Case_Prod.Base_class {
	
	
	@Test
	public void Partner1() throws InterruptedException {
		
        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner1();
        p.card1();
	    p.card2();
	    driver.quit();

}

	@Test
	public void Partner2() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 

        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner2();
        p.card1();
	    p.card2();
	    driver.quit();
}

	@Test
	public void Partner3() throws InterruptedException {
		
        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner3();
        p.card1();
	    p.card2();
	    driver.quit();
}

	@Test
	public void Partner4() throws InterruptedException {
	
        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner4();
        p.card1();
	    p.card2();
	    driver.quit();
}

	

	@Test
	public void Partner5() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 

        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner5();
        p.card1();
	    p.card2();
	    driver.quit();
}
	
	@Test
	public void Partner6() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 

        Our_Partners_page p = new Our_Partners_page(driver);
        
        p.PartnerHeader();
        p.Partner6();
        p.card1();
	    p.card2();
	    driver.quit();
}
} 