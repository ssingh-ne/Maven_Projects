package Test_Case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.Amplience;
import Pages.Home;

public class Side_Heading_Develop  extends Base_class_Development {
	
	
	@Test
	
	public void Side_Heading_One () throws InterruptedException{
		
		By sideheading_1 = By.xpath("//*[@class='section__content']/div/div/h2");
		By sideheading_2 = By.xpath("(//*[@class='section__content'])[2]//div/div/div/div/div/div/h3");
		By sideheading_3 = By.xpath("(//*[@class='section__content'])[3]//div/div/div/div/div/h5");
		By sideheading_4 = By.xpath("(//*[@class='section__content']/div/div/h3)[2]");
	 	By sideheading_5 = By.xpath("//*[@id='contentBlock0']/h4");
	 	
		
		Amplience a = new Amplience(driver);
		Home h = new Home(driver);
		
	 	h.Side_Heading_one();
	 		
	 	String Mainheading1 = driver.findElement(sideheading_1).getText();
	 		
	 	System.out.println("Mainheading1 = "+ Mainheading1 );
	 		
        h.Side_Heading_two();
        Thread.sleep(5000);
	 	String Mainheading2 = driver.findElement(sideheading_2).getText();
	 		
	 	System.out.println("Mainheading 2 = "+ Mainheading2 );
	 		
        h.Side_Heading_three();
        Thread.sleep(5000);
	 	String Mainheading3 = driver.findElement(sideheading_3).getText();
	 		
	 	System.out.println("Mainheading 3 = "+ Mainheading3);
	 		
	 	h.Side_Heading_four();
 		
 		String Mainheading4 = driver.findElement(sideheading_4).getText();
 		
 		System.out.println("Mainheading4 = "+ Mainheading4 );
 		
        h.Side_Heading_five();
 	 		
 	 	String Mainheading5 = driver.findElement(sideheading_5).getText();
 	 		
 	 	System.out.println("Mainheading5 = "+ Mainheading5 );
		
		a.Amplience_url();
		
		a.Amplience_Login();
		
		a.solution_slot();
			
		 a.solution_slotEdit_one();
		 int size = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size);
 		driver.switchTo().frame(0);
 		 String slot_heading1 = driver.findElement(By.xpath("//*[@id='tinymce']/h2")).getText();
 		System.out.println("slot_heading 1 = " +slot_heading1);
 		
 	    a.Solution_slotEdit_two();
 			
 			int size1 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size1);
 	 		driver.switchTo().frame(0);
 	 		String slot_heading2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h3")).getText();
 	 		System.out.println("slot_heading 2 = "+slot_heading2);
 	 			
 	      a.Solution_slotEdit_three();
 	 		
 	 		int size2 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size2);
 	 		driver.switchTo().frame(0);
 	 		String slot_heading3 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h5")).getText();
 	 		System.out.println("slot_heading 3 = "+slot_heading3);
 	 		
 	 		Thread.sleep(5000);
 	 		
 	 		a.Solution_slotEdit_four();
 	 		int size3 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size3);
 	 		driver.switchTo().frame(0);
 	 		 String slot_heading4 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	 		System.out.println("slot_heading 4 = "+ slot_heading4);
 	 		
 	 		
 	 		a.Solution_slotEdit_five();
 	 		
 	 		int size4 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size4);
 	 		driver.switchTo().frame(0);
 	 		 String slot_heading5 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h4")).getText();
 	 		System.out.println("slot_heading 5 = "+ slot_heading5);
 	 		
 	 		
 	 		
	 	 	
	 	 	assertEquals(Mainheading1, slot_heading1);
	 	 	assertEquals(Mainheading2, slot_heading2);
	 	 	assertEquals(Mainheading3, slot_heading3);
	 	 	assertEquals(Mainheading4, slot_heading4);
 	 		assertEquals(Mainheading5, slot_heading5);
		
	}
	
	
	

}
