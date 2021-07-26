package Test_Cases_Prod;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.Home_page;

public class Applied_logo  extends Base_class {
	
	@Test
	public void More_button() throws InterruptedException {
		
		
	/*Steps - 1. Open Home page capture the URL
	          2. Click on Learn more  and capture th URL 
	          3. click on any of the article 
	          4. click on logo and capture the URL n match with Learn more URL
	          5. again click on logo and capture the URL n match with home page URL   */
	
		Home_page h = new Home_page(driver);
		
		h.Article_logo();
		
	
	}

}
