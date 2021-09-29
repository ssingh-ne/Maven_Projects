package Test_case_Development;

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
        By sideheading_4 = By.xpath("//*[@id='industry-recognition']/section/div/div/div/h2");
        By Sideheading4_Content = By.xpath("//*[@id='contentBlock0']/*");
        String Heading4URL = "https://www.insurancebusinessmag.com/us/news/breaking-news/revealed--americas-top-insurance-employers-2021-302273.aspx";
      
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
	    
        String Mainheading4 = driver.findElement(sideheading_4).getText();
        
        String Mainheading_content = driver.findElement(Sideheading4_Content).getText();
        
        
        System.out.println("Content from website = "+ Mainheading_content );
	    System.out.println("Mainheading4 = "+ Mainheading4 );
	    
   head.Side_heading_URL();
        Set<String> handlesSet1 = driver.getWindowHandles();
        List<String> handlesList1 = new ArrayList<String>(handlesSet1);
        driver.switchTo().window(handlesList1.get(1));
        String NewURL =  driver.getCurrentUrl();
        System.out.println("Side_heading_URL = " + NewURL);
   
        driver.close();
        driver.switchTo().window(handlesList1.get(0));
       
   head.Side_heading_5();  
        
        Set<String> handlesSet2 = driver.getWindowHandles();
        List<String> handlesList2 = new ArrayList<String>(handlesSet2);
        driver.switchTo().window(handlesList2.get(1));
        String NewURL1 =  driver.getCurrentUrl();
        System.out.println("New URL = " + NewURL1);
        
    a.Amplience_url();
    a.Amplience_Login();
    a.Carrer_Content();
    a.carrer_slotEdit_one();
        
        int size5 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size5);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_1 = driver.findElement(By.xpath("//*[@id='tinymce']/h2")).getText();
 	    
 		System.out.println("Side Heading 1 from AMP = "+Mainheading_1);
 		
 		
     a.Carrer_slotEdit_two();
        
        int size2 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size2);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_2 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	    
 		System.out.println(" Side Heading 2 from AMP = "+Mainheading_2);
 		
 		
     a.Carrer_slotEdit_three();
        
        int size3 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size3);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_3 = driver.findElement(By.xpath("//*[@id='tinymce']/h3")).getText();
 	    
 		System.out.println("Side Heading 3 from AMP = "+Mainheading_3);
 		
    a.Carrer_slotEdit_four();
        
        int size4 = driver.findElements(By.tagName("iframe")).size();
 		System.out.println(size4);
 		driver.switchTo().frame(0);
 		
 	    String Mainheading_4 = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/div[2]/div[2]/div/p")).getText();
 	    
 		System.out.println("Side Heading 4 from AMP = "+Mainheading_4);
 		
 		
 		 
 		assertEquals(Mainheading1, Mainheading_1);
 		assertEquals(Mainheading2, Mainheading_2);
 		assertEquals(Mainheading3, Mainheading_3);
 		
 		 Assert.assertNotEquals(Current_URL, NewURL1, "Oppened new tab");

	    Assert.assertTrue(Mainheading_content.contains(Mainheading_4),"Heading not match") ;
	    
	
	}

}
