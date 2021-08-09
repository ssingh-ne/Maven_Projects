package Test_case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Amplience;
import Pages.Home;

public class Side_Heading  extends Base_class {
	
	
	@Test
	
	public void Side_heading() throws InterruptedException{
		
		By sideheading_one_heading = By.xpath("//*[@id='multi-state-coverage']/section/div/div/div/div/h2");
		By sideheading_two_heading = By.xpath("//*[@id='contentBlock0']/h3");
		// By sideheading_three_heading = By.xpath("//*[@id='guaranteed-cost-program']/section/div/div/div/div/h3[1]");
		By sideheading_three_heading = By.xpath("//*[@id='guaranteed-cost-program']/section/div/div/div/div/h3[1]");
		By sideheading_four_heading = By.xpath("//*[@id='contact-us']/section/div/div/div/div/div/div/div/div/div[1]/p");
		
		
		
		Amplience a = new Amplience(driver);
		
		a.Amplience_url();
		
		a.Amplience_Login();
		a.Jumbo_Slots();
		a.Jumbo_slotEdit_one();
		int size = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size);
 		driver.switchTo().frame(0);
 		 String slot_heading = driver.findElement(By.xpath("//*[@id='tinymce']/h2")).getText();
 		System.out.println("slot_heading = " +slot_heading);
		
 	 a.Jumbo_slotEdit_two();
 		
 		int size1 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size1);
 		driver.switchTo().frame(0);
 		String slot_heading2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h3")).getText();
 		System.out.println("slot_heading2 = "+slot_heading2);
 		
      a.Jumbo_slotEdit_three();
 		
 		int size2 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size2);
 		driver.switchTo().frame(0);
 		 String slot_heading3 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 		System.out.println("slot_heading3 =s "+slot_heading3);
		
		 Home h = new Home(driver);
		 
		 h.Jumbo_url_dev();
	     driver.switchTo().alert().accept();
		 h.SideHeadingONE();
		 
		 WebDriverWait wait_h = new WebDriverWait(driver,60);
	     wait_h.until(ExpectedConditions.visibilityOfElementLocated(sideheading_one_heading));
	 		
	 	 String heading1 = driver.findElement(sideheading_one_heading).getText();
	 		
	 	 System.out.println("Heading 1 = " + heading1);
	 	
		 Thread.sleep(5000);
		 
		 h.SideHeadingTWO();
		 String heading2 = driver.findElement(sideheading_two_heading).getText();
	 		
	 	 System.out.println("Heading 2 = " + heading2);
		 Thread.sleep(5000);
		 
		 h.SideHeadingTHREE();
		 
		 String heading3 = driver.findElement(sideheading_three_heading).getText();
	 		
	 	 System.out.println("Heading 3 = " + heading3);
		 Thread.sleep(5000);
		 h.SideHeadingFour();
		 String heading4 = driver.findElement(sideheading_four_heading).getText();
	 		
	 	 System.out.println("Heading 4 = " + heading4);
	 		
		/* assertEquals(heading1, slot_heading);
		 assertEquals(heading2, slot_heading2);
		 assertEquals(heading3, slot_heading3);
		*/ 
		 
	 	Assert.assertTrue(slot_heading.contains(heading1),"Failure message") ;
	 	Assert.assertTrue(heading2.contains(slot_heading2),"Failure message") ;
	 	Assert.assertTrue(slot_heading3.contains(heading3),"Failure message") ;
	
	
	}
	
	
	

}
