package Test_Case_dev;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.Experience_page;
import Pages.Home_page;

public class AUW_Experience extends Base_class {
	
	@Test
	public void main() throws InterruptedException{
		/* Steps covered 
		1. Open URL and click on Experience Tab In banner 
		2. Click on Explore tab and verify the Close button available and Header not available 
		3. Click on the images at the bottom of the page 
		*/
		
		By Experience_Heading1 = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[2]/h1");
		By Experience_Heading2 = By.xpath("//*[@id='app']/main/div[3]/div/div/div/div/div[2]/h1");
		By Experience_Heading3 = By.xpath("//*[@id='app']/main/div[4]/div/div/div/div/div[2]/h1");
		By Experience_Heading4 = By.xpath("//*[@id='app']/main/div[5]/div/div/div/div[2]/h1");
		By Experience_Heading5 = By.xpath("//*[@id='app']/main/div[6]/div/div/div/div/div[2]/h1");
		
		By Explore_Heading1 = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/h1");
		By Explore_Heading2 = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/h1");
		By Explore_Heading3 = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/h1");
		By Explore_Heading4 = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/h1");
		By Explore_Heading5 = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div/h1");
		
		
		Home_page h = new Home_page(driver);
		Experience_page e = new Experience_page(driver);
		
		h.Cookies();
		h.Experience_btn();   // Click on Experience button in header
		h.Header();
		
// Capture 1st Heading 
		System.out.println("heading 1");
		String Exp_heading_1 = driver.findElement(Experience_Heading1).getText();
		System.out.println("Exp_heading_1 = "+ Exp_heading_1);
		
		e.ExploreONE(); // Click on Explore 1st button
		
		String Explore_Heading_1 = driver.findElement(Explore_Heading1).getText();
		System.out.println("Explore_Heading_1 = "+ Explore_Heading_1);
		
		e.close_btn_visible(); // Close button is visible
		e.Exp_card1(); // Experience card option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page 
		
		e.ExploreONE();
		e.Exp_card2(); // Experience card 2 option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page 
		
		assertEquals(Explore_Heading_1, Exp_heading_1);
		
// Capture 2nd Heading 
		System.out.println("heading 2");
		String Exp_heading_2 = driver.findElement(Experience_Heading2).getText();
		System.out.println("Exp_heading_2 = "+ Exp_heading_2);
		
		e.ExploreTwo(); // Click on Explore 2nd button
		
		String Explore_Heading_2 = driver.findElement(Explore_Heading2).getText();
		System.out.println("Explore_Heading_2 = "+ Explore_Heading_2);
		
		e.close_btn_visible(); // Close button is visible
		e.Exp_card1(); // Experience card option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev();  // After Close Page redirect to Experience page 
		
		e.ExploreTwo();
		e.Exp_card2(); // Experience card 2 option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page 
		
		assertEquals(Explore_Heading_2, Exp_heading_2);
		
			
// Capture 3rd Heading 
		System.out.println("heading 3");
		String Exp_heading_3 = driver.findElement(Experience_Heading3).getText();
		System.out.println("Exp_heading_3 = "+ Exp_heading_3);
				
		e.ExploreThree(); // Click on Explore 3rd button
				
		String Explore_Heading_3 = driver.findElement(Explore_Heading3).getText();
		System.out.println("Explore_Heading_3 = "+ Explore_Heading_3);
				
		e.close_btn_visible(); // Close button is visible
		e.Exp_card1(); // Experience card option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev();  // After Close Page redirect to Experience page 
		
		e.ExploreThree();
		e.Exp_card2(); // Experience card 2 option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page 
				
		assertEquals(Explore_Heading_3, Exp_heading_3);
		
// Capture 4th Heading 
		System.out.println("heading 4");
		String Exp_heading_4 = driver.findElement(Experience_Heading4).getText();
		System.out.println("Exp_heading_4 = "+ Exp_heading_4);
						
		e.ExploreFour(); // Click on Explore 4th button
						
		String Explore_Heading_4 = driver.findElement(Explore_Heading4).getText();
		System.out.println("Explore_Heading_4 = "+ Explore_Heading_4);
						
		e.close_btn_visible(); // Close button is visible
		e.Exp_card1(); // Experience card option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev();  // After Close Page redirect to Experience page 
		
		e.ExploreFour();
		e.Exp_card2(); // Experience card 2 option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page  
						
	    assertEquals(Explore_Heading_4, Exp_heading_4);
		
// Capture 5th Heading 
	    System.out.println("heading 5");
     	String Exp_heading_5 = driver.findElement(Experience_Heading5).getText();
	    System.out.println("Exp_heading_5 = "+ Exp_heading_5);
	 						
	    e.ExploreFive(); // Click on Explore 5th button
	 						
	    String Explore_Heading_5 = driver.findElement(Explore_Heading5).getText();
	    System.out.println("Explore_Heading_5 = "+ Explore_Heading_5);
	 						
	    e.close_btn_visible(); // Close button is visible
		e.Exp_card1(); // Experience card option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev();  // After Close Page redirect to Experience page 
		
		e.ExploreFive();
		e.Exp_card2(); // Experience card 2 option click and opening in Modal
		e.close_btn_close();  // closing close button
		e.URL_Dev(); // After Close Page redirect to Experience page 					
	    assertEquals(Explore_Heading_5, Exp_heading_5);
	    
}
}