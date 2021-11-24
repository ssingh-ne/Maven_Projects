package Test_case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
		By sideHeading_Text_four = By.xpath("//*[@id='contentBlock0']/h5");
		
		
		Amplience a = new Amplience(driver);
		
		a.Amplience_url();
		
		a.Amplience_Login();
		a.Jumbo_Content();

		a.content1();
		int size = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size);
 		driver.switchTo().frame(0);
 		
 		 String slot_heading = driver.findElement(By.xpath("//*[@id='tinymce']/h2")).getText();
 		System.out.println("slot_heading = " +slot_heading);
	
 		a.content2();
 		
 		JavascriptExecutor js1 = (JavascriptExecutor) driver;
 		WebElement Element1 = driver.findElement(By.xpath("//*[@id='/internationalTextContent']/div/div[1]/am-collapsible-section-header/div/div/span"));
 		js1.executeScript("arguments[0].scrollIntoView();", Element1);
 		Thread.sleep(3000);
 		WebElement Element2 = driver.findElement(By.xpath("//*[@id='/textContent/values/0/value']/div/div[1]/am-collapsible-section-header/div/span"));
 		js1.executeScript("arguments[0].scrollIntoView();", Element2);
 		
 		
 		Thread.sleep(3000);
 		int size1 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size1);
 		driver.switchTo().frame(0);
 		String slot_heading2 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h3")).getText();
 		System.out.println("slot_heading2 = "+slot_heading2);
 		
    
 		a.content3();
 		int size2 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size2);
 		driver.switchTo().frame(0);
 		 String slot_heading3 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 		System.out.println("slot_heading3 =s "+slot_heading3);
		
		
		a.content4();
		
		Thread.sleep(3000);
 		WebElement Element3 = driver.findElement(By.xpath("//*[@id='/internationalTextContent']/div/div[1]/am-collapsible-section-header/div/div/span"));
 		js1.executeScript("arguments[0].scrollIntoView();", Element3);
 		Thread.sleep(3000);
 		WebElement Element4 = driver.findElement(By.xpath("//*[@id='/textContent/values/0/value']/div/div[1]/am-collapsible-section-header/div/span"));
 		js1.executeScript("arguments[0].scrollIntoView();", Element4);
		
 		int size3 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size1);
 		driver.switchTo().frame(0);
 		String slot_heading4 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h5")).getText();
 		System.out.println("slot_heading4 = "+slot_heading4);
 		
		
		 Home h = new Home(driver);
		 
		 h.Jumbo_url_dev();
	    
		// driver.switchTo().alert().accept();
		 
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
		 
		 String Heading_four_text = driver.findElement(sideHeading_Text_four).getText();
	 		
	 		System.out.println("Heading_Four text = "+ Heading_four_text);
		 String heading4 = driver.findElement(sideheading_four_heading).getText();
	 		
	 	 System.out.println("Heading 4 = " + heading4);
	 		
		/* assertEquals(heading1, slot_heading);
		 assertEquals(heading2, slot_heading2);
		 assertEquals(heading3, slot_heading3);*/
		 
		 
	 	Assert.assertTrue(slot_heading.contains(heading1),"Failure message") ;
	 	Assert.assertTrue(heading2.contains(slot_heading2),"Failure message") ;
	 	Assert.assertTrue(slot_heading3.contains(heading3),"Failure message") ;
	 	Assert.assertTrue(Heading_four_text.contains(slot_heading4),"Failure message") ;
	
	 	
	}
	
	
	

}
