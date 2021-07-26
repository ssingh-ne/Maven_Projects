package Test_case_Prod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.*;



public class Side_Heading1 extends Base_class {
	
	
	@Test
	public void Side_Heading() throws InterruptedException {
		
		// Open website, click on footer link eg- twitter and come back to parent site and 
		
        Home_page home = new Home_page(driver);
        Amplience a = new Amplience(driver);
        
        Side_Heading head = new Side_Heading(driver);
        
        By sideheading_1 = By.xpath("//*[@class='section__content']/div/div/h2");
        By sideheading_2 = By.xpath("(//*[@class='section__content']/div/div/h3)[2]");
        By sideheading_3 = By.xpath("//*[@id='benefits']/section/div/div/div/div/h3");
        By sideheading_4 = By.xpath("(//*[@class='section__content']/div/div/h3)[2]");
        
        
      
      head.Side_heading_1();
        
        String Mainheading1 = driver.findElement(sideheading_1).getText();
	 		
	    System.out.println("Mainheading1 = "+ Mainheading1 );
	 		
	    head.Side_heading_2();
        
        String Mainheading2 = driver.findElement(sideheading_2).getText();
 		
	    System.out.println("Mainheading2 = "+ Mainheading2 );
        
        head.Side_heading_3();
        
        String Mainheading3 = driver.findElement(sideheading_3).getText();
 		
	    System.out.println("Mainheading3 = "+ Mainheading3 );
	    
	    String Current_URL = driver.getCurrentUrl();
	    
	    System.out.println("Current_URL = " + Current_URL);
	    
        head.Side_heading_4();  
        
        Set<String> handlesSet1 = driver.getWindowHandles();
        List<String> handlesList1 = new ArrayList<String>(handlesSet1);
        driver.switchTo().window(handlesList1.get(1));
        String NewURL =  driver.getCurrentUrl();
        System.out.println("New URL = " + NewURL);

        Assert.assertNotEquals(Current_URL, NewURL, "Oppened new tab");
        
        a.Amplience_url();
        a.Amplience_Login();
        a.Carrer_Slots();
        a.carrer_slotEdit_one();
        
        int size5 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size5);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_1 = driver.findElement(By.xpath("//*[@id='tinymce']/h2")).getText();
 	    
 		System.out.println(" Mainheading 1 = "+Mainheading_1);
 		
 		
        a.Carrer_slotEdit_two();
        
        int size2 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size2);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_2 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	    
 		System.out.println(" Mainheading 2 = "+Mainheading_2);
 		
 		
        a.Carrer_slotEdit_three();
        
        int size3 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size3);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_3 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	    
 		System.out.println(" Mainheading 3 = "+Mainheading_3);
 		
 		
 		
 		assertEquals(Mainheading1, Mainheading_1);
 		assertEquals(Mainheading2, Mainheading_2);
 		assertEquals(Mainheading3, Mainheading_3);
 		
	
	}

}
