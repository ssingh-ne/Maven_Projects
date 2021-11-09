package Test_Cases;

import org.testng.annotations.Test;

import Pages.Home_page;
import Pages.WhatWeOffer_page;
import Test_Cases.Base_class;

public class What_we_offer1_TC  extends Base_class {
	
	
	@Test
	public void Heading1() throws InterruptedException {
		
		
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		
		w.Heading_one();

}
	
	@Test
	public void Heading2() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_two();
		
	}
	
	@Test
	public void Heading3() throws InterruptedException {
		
		
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_three();
		
	}
	@Test
	public void Heading4() throws InterruptedException {
		
		
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_four();
	}
	
	@Test
	public void Heading5() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_five();
		
	}
	@Test
	public void Heading6() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_six();
		
	}
	@Test
	public void Heading7() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_seven();
		
	}
	@Test
	public void Heading8() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_eight();
		
	}
	@Test
	public void Heading9() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_nine();
		
	}
	@Test
	public void Heading10() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_ten();
		
	}
	@Test
	public void Heading11() throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		WhatWeOffer_page w = new WhatWeOffer_page(driver);
		w.Heading_eleven();
		
	}
}