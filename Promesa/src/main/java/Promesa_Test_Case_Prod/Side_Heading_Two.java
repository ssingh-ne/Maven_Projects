package Promesa_Test_Case_Prod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Promesa_Pages.Amplience;
import Promesa_Pages.Home;

public class Side_Heading_Two  extends Base_class {
	
	
	@Test
	
	public void Siheading_2 () throws InterruptedException{
		
		By FAQ_ques_one = By.xpath("//*[@name='/accordions/0/summary']");
		By sideheading_4 = By.xpath("(//*[@class='section__content']/div/div/h3)[4]");
	 	By sideheading_5 = By.xpath("(//*[@class='section__content']/div/div/h3)[5]");
	 	
		Amplience a = new Amplience(driver);
		Home h = new Home(driver);
		
		h.Side_Heading_four();
	 		
	 		String Mainheading4 = driver.findElement(sideheading_4).getText();
	 		
	 		System.out.println("Mainheading4 = "+ Mainheading4 );
	 		
	   h.Side_Heading_five();
	 	 		
	 	 	String Mainheading5 = driver.findElement(sideheading_5).getText();
	 	 		
	 	 	System.out.println("Mainheading5 = "+ Mainheading5 );
		
		/*a.Amplience_url();
		
		a.Amplience_Login();
		a.Promesa_Slots();
		a.Promesa_slotEdit_one();
		a.Promesa_slotEdit_four();
 		    int size3 = driver.findElements(By.tagName("iframe")).size();
	 		System.out.println(size3);
	 		driver.switchTo().frame(0);
	 		 String slot_heading4 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
	 		System.out.println("slot_heading 4 = "+slot_heading4);
	 		
	 	a.Promesa_slotEdit_five();
 		    int size4 = driver.findElements(By.tagName("iframe")).size();
	 		System.out.println(size4);
	 		driver.switchTo().frame(0);
	 		 String slot_heading5 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
	 		System.out.println("slot_heading 5 = "+slot_heading5);
	 		
	 	 			
	 	 		assertEquals(Mainheading4, slot_heading4);
		 		
           
	 	 		
	 	 		assertEquals(Mainheading5, slot_heading5);
*/	 	 		
	 	
	}
	
	
	

}
