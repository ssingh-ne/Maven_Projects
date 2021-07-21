package Test_case_prod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.Experience_page;
import Pages.Home_page;
import Pages.Intelligence_page;

public class AUW_Intelligence_TC extends Base_class {
	
	@Test
	public void main() throws InterruptedException{
		
		/* Steps covered 
		1. Open URL and click on Intelligence Tab n banner 
		2. Click on Image and verify open in new tab 
		3. Click on text n redirect on same page
		*/
		
		Home_page h = new Home_page(driver);
		Intelligence_page i = new Intelligence_page(driver);
		
		
		h.Cookies();
		h.Intelligence_btn();   // Click on Experience button in header
		h.Header();
// First image and text 
		i.URL_Prod();
		i.Img_one();
		h.Header();
		String Current_IMG_URL1 = driver.getCurrentUrl();
		System.out.println("Current_IMG_URL one = "+Current_IMG_URL1);
		i.Back_to_Applied();
		
		i.Text_one();
		h.Header();
		String Current_Text_URL1 = driver.getCurrentUrl();
		System.out.println("Current_Text_URL one = "+Current_Text_URL1);
		
		i.Back_to_Applied();
		
		assertEquals(Current_IMG_URL1, Current_Text_URL1);
		
// Second image and text 
		i.URL_Prod();
		i.Img_two();
		h.Header();
		String Current_IMG_URL2 = driver.getCurrentUrl();
		System.out.println("Current_IMG_URL Two = "+Current_IMG_URL2);
		i.Back_to_Applied();
				
		i.Text_two();
		h.Header();
		String Current_Text_URL2 = driver.getCurrentUrl();
		System.out.println("Current_Text_URL Two = "+Current_Text_URL2);
				
		i.Back_to_Applied();
				
		assertEquals(Current_IMG_URL2, Current_Text_URL2);
				
				
// Third image and text 
		i.URL_Prod();
		i.Img_three();
		h.Header();
		String Current_IMG_URL3 = driver.getCurrentUrl();
		System.out.println("Current_IMG_URL three = "+Current_IMG_URL3);
		i.Back_to_Applied();
				
		i.Text_Three();
		h.Header();
		String Current_Text_URL3 = driver.getCurrentUrl();
		System.out.println("Current_Text_URL three = "+Current_Text_URL3);
				
		i.Back_to_Applied();
				
		assertEquals(Current_IMG_URL3, Current_Text_URL3);
	}

}
