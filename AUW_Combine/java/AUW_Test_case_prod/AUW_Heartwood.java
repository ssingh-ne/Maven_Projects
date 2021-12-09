package AUW_Test_case_prod;

import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import AUW_Pages.Home_page;

public class AUW_Heartwood extends Base_class {
	@Test
	public void main() throws InterruptedException{
		// Open website, click on fotter link eg- twitter and come back to parent site and 
		
	//	System.out.println("Open website, Click on footer buttons");
	
		By Exp_button = By.xpath("//a[text()='Experience']");
		By Close_btn = By.xpath("//span[@class='MuiIconButton-label']");
		
		By Explore1 = By.xpath("(//*[@class='MuiButton-label'])[1]");
		By Explore2 = By.xpath("(//*[@class='MuiButton-label'])[2]");
		By Explore3 = By.xpath("(//*[@class='MuiButton-label'])[3]");
		By Explore4 = By.xpath("(//*[@class='MuiButton-label'])[4]");
		By Explore5 = By.xpath("(//*[@class='MuiButton-label'])[5]");
		
		
		Home_page home = new Home_page(driver);
		home.Cookies();
		
 		driver.findElement(Exp_button).click();
 		
 		Thread.sleep(2000);
	
       driver.findElement(Explore1).click();
        
       String s =  driver.getCurrentUrl();
       
       System.out.println("1st URL = " + s);
       
      driver.findElement(Close_btn).click();
   	
      Thread.sleep(2000);
       
     
  	driver.get("https://www.auw.com/");
  	
  	Thread.sleep(2000);
  	
  	driver.findElement(Exp_button).click();
  	Thread.sleep(2000);	
       driver.findElement(Explore2).click();
        
       String s1 =  driver.getCurrentUrl();
       
       System.out.println("2nd URL = " + s1);
       
       driver.findElement(Close_btn).click();
       
       Thread.sleep(2000);
       
       
     	driver.get("https://www.auw.com/");
     	
     	Thread.sleep(2000);
     	
     	driver.findElement(Exp_button).click();
     	Thread.sleep(2000);	
          driver.findElement(Explore3).click();
           
          String s3 =  driver.getCurrentUrl();
          
          System.out.println("3rd URL = " + s3);
          
          driver.findElement(Close_btn).click();
          
          Thread.sleep(2000);
          
          
       	driver.get("https://www.auw.com/");
       	
       	Thread.sleep(2000);
       	
       	driver.findElement(Exp_button).click();
       	Thread.sleep(2000);	
            driver.findElement(Explore4).click();
             
            String s4 =  driver.getCurrentUrl();
            
            System.out.println("4th URL = " + s4);
            
            driver.findElement(Close_btn).click();
            
        	Thread.sleep(2000);
       
            driver.get("https://www.auw.com/");
           	
           	Thread.sleep(2000);
           	
           	driver.findElement(Exp_button).click();
           	Thread.sleep(2000);	
                driver.findElement(Explore5).click();
                 
                String s5 =  driver.getCurrentUrl();
                
                System.out.println("5th URL = " + s5);
                
                driver.findElement(Close_btn).click();
                
           
}}
