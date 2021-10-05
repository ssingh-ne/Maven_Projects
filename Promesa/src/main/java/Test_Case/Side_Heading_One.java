package Test_Case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.Amplience;
import Pages.Home;

public class Side_Heading_One  extends Base_class {
	
	
	@Test
	
	public void Side_Heading_One () throws InterruptedException{
		
		By sideheading_1 = By.xpath("//*[@class='section__content']/div/div/h2");
		By sideheading_2 = By.xpath("(//*[@class='section__content']/div/div/h3)[2]");
		By sideheading_3 = By.xpath("(//*[@class='section__content']/div/div/h3)[3]");
		By Sideheading_Content1 = By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/h2");
		
		Home h = new Home(driver);
		Amplience a = new Amplience(driver);
		
		/*a.Amplience_url();
		
		a.Amplience_Login();
		a.Promesa_content();
		a.Promesa_slotEdit_one();
		
        Thread.sleep(5000);
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]"));
    	js.executeScript("arguments[0].scrollIntoView();", Element);
 		String name = driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
 		System.out.println("name = "+name);
 		Thread.sleep(2000);
 		
 		 
		int size = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size);
 		driver.switchTo().frame(0);
 		Thread.sleep(2000);
 		
 		String edit = driver.findElement(By.xpath("//*[text()='Edit']")).getText();
 		System.out.println("slot_heading 1 -" +edit);
 		
 		Thread.sleep(5000);
 		String slot_heading1 = driver.findElement(Sideheading_Content1).getText();
  		System.out.println("slot_heading 1 = " +slot_heading1 );
 		
 		
 		Thread.sleep(5000);
 		
 		WebElement Element = driver.findElement(Sideheading_Content1);
    	js.executeScript("arguments[0].scrollIntoView();", Element);
    	Thread.sleep(2000);
 		 String slot_heading = driver.findElement(Sideheading_Content1).getText();
 		System.out.println("slot_heading 1 = " +slot_heading1);
		
 			a.Promesa_slotEdit_two();
 			
 			int size1 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size1);
 	 		driver.switchTo().frame(0);
 	 		 String slot_heading2 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	 		System.out.println("slot_heading 2 = "+slot_heading2);
 	 		
 	      a.Promesa_slotEdit_three();
 	 		
 	 		int size2 = driver.findElements(By.tagName("iframe")).size();
 	 		System.out.println(size2);
 	 		driver.switchTo().frame(0);
 	 		 String slot_heading3 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	 		System.out.println("slot_heading 3 = "+slot_heading3);
 	 		
 	 		Thread.sleep(5000);*/
 	 		driver.get("https://promesa.auw.com/");
 	 		
 	 		//driver.switchTo().alert().accept();
 	 		
 	 		h.Side_Heading_one();
 	 		
 	 		String Mainheading1 = driver.findElement(sideheading_1).getText();
 	 		
 	 		System.out.println("Mainheading1 = "+ Mainheading1 );
 	 		
 	 	//	assertEquals(Mainheading1, slot_heading1);
 	 		
             h.Side_Heading_two();
             Thread.sleep(5000);
 	 		String Mainheading2 = driver.findElement(sideheading_2).getText();
 	 		
 	 		System.out.println("Mainheading 2 = "+ Mainheading2 );
 	 		
 	 	//	assertEquals(Mainheading2, slot_heading2);
 	 		
            h.Side_Heading_three();
            Thread.sleep(5000);
 	 		String Mainheading3 = driver.findElement(sideheading_3).getText();
 	 		
 	 		System.out.println("Mainheading 3 = "+ Mainheading3);
 	 		
 	 		//assertEquals(Mainheading3, slot_heading3);
	 		
 		
	}
	
	
	

}
