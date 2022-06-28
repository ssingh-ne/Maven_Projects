package Aerospace_Pages;


import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Home_Page {
	
	WebDriver driver;
	
	
	By Aviation = By.xpath("(//*[text()='Aviation'])[2]");
	By Aerospace = By.xpath("(//*[text()='Aerospace'])[2]");
	
	By Menu = By.xpath("//*[@id='__next']/div[1]/button/span[1]");
	By Menu_Aviation = By.xpath("(//*[text()='Aviation'])[1]");
	By Menu_Aerospace = By.xpath("(//*[text()='Aerospace'])[1]");
	By Menu_Contact = By.xpath("//*[text()='Contact']");
	By Menu_AboutUs = By.xpath("//*[text()='About Us']");
	By Menu_space = By.xpath("//*[text()='Space']");
	
	By Logo_part1  = By.xpath("(//*[@target='_self'])[1]");
	By Logo_part2  = By.xpath("(//*[@target='_self'])[3]");
	By Logo_part3  = By.xpath("(//*[@target='_self'])[4]");
	By Logo_part4  = By.xpath("(//*[@target='_self'])[4]");
	
	By Aviation_scroll = By.xpath("//*[@alt='Arrow down icon']");
	By Aerospace_scroll = By.xpath("(//*[text()='Aerospace'])[2]");
	
	By content = By.xpath("//*[@id='contentBlock0']/p");
	By News = By.xpath("//*[text()='News']");
	
	String Exp_Aviation_Url = "/aviation";
	String Exp_News_Url = "/news";
	String Exp_contact_url = "/contact-us";
	String Exp_AboutUs_url = "/about-us";
	String Exp_SpaceUs_url = "/space";
	
	
	
	
	  public Home_Page (WebDriver driver){
			this.driver=driver;
		}

      public void logo() throws InterruptedException {
	  
    	  Thread.sleep(5000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement Element = driver.findElement(Logo_part1);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	  // Logo part 1 
	  driver.findElement(Logo_part1).click();
	  
	  Thread.sleep(5000);
	  
	  String URL1 = driver.getCurrentUrl();
	  
	  System.out.println("URL 1 from Logo = " + URL1);
	 
	//  driver.navigate().back();
	  
	  Thread.sleep(5000);
	  

	  // Logo part 2 
	  System.out.println("11");
	  driver.findElement(Logo_part2).click();
	  
	  Thread.sleep(5000);
	  
	  String URL2 = driver.getCurrentUrl();
	 
	  System.out.println("URL 2 from Logo = " + URL2);
	 
	 // driver.navigate().back();
	  
	  Thread.sleep(5000);
	  
	  // Logo part 3
	  driver.findElement(Logo_part3).click();
	  
	  Thread.sleep(5000);
	  
	  String URL3 = driver.getCurrentUrl();
	 
	  System.out.println("URL 3 from Logo = " + URL3);
	 
	//  driver.navigate().back();
	  
	  Thread.sleep(5000);
	  
	/*  // Logo part 4 
	  driver.findElement(Logo_part4).click();
	  
	  Thread.sleep(5000);
	  
	  String URL4 = driver.getCurrentUrl();
	  
	  System.out.println("URL 4 from Logo = " + URL4);
	  
	//  driver.navigate().back();
	  */
	  Thread.sleep(5000);
	  
	  
	  
  }

      public void Home_Aviation () throws InterruptedException {
	  
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
          
    	 // js.executeScript("window.scrollTo(0,1000)");
    	   WebElement Element = driver.findElement(Aviation_scroll);
    	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  

    	  Thread.sleep(5000);
    	  
    	  String webelement = driver.findElement(content).getText();
    	
    	  System.out.println("=="+webelement);
    	  
    	  /*WebElement t = driver.findElement(content);
    	 // t.sendKeys(Keys.CONTROL);
    	  t.sendKeys(Keys.ARROW_DOWN);
    	  
    	  */Thread.sleep(5000);

    	  driver.findElement(Aviation_scroll).click();

    	  Thread.sleep(5000);

      }

      public void Home_Menu_Aviation () throws InterruptedException{
	   
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
       
  	 // js.executeScript("window.scrollTo(0,1000)");
  	   WebElement Element = driver.findElement(Menu);
  	  js.executeScript("arguments[0].scrollIntoView();", Element);
  	  
  	  Thread.sleep(3000);
  	  
  	  driver.findElement(Menu).click();
  	  
  	Thread.sleep(3000);
	  
  	driver.findElement(Menu_Aviation).click();
  	
  	Thread.sleep(5000);
  	
  	String URL = driver.getCurrentUrl();
  	System.out.println("Aviation Url = " + URL);
  	
  	 Assert.assertTrue(URL.contains(Exp_Aviation_Url),"Aviation URL is different") ;
	  
   }

      public void Home_Menu_News () throws InterruptedException{
   	   
   	   
   	   JavascriptExecutor js = (JavascriptExecutor) driver;
          
     	 // js.executeScript("window.scrollTo(0,1000)");
     	   WebElement Element = driver.findElement(Menu);
     	  js.executeScript("arguments[0].scrollIntoView();", Element);
     	  
     	  Thread.sleep(3000);
     	  
     	  driver.findElement(Menu).click();
     	  
     	Thread.sleep(3000);
   	  
     	driver.findElement(News).click();
     	
     	Thread.sleep(5000);
     	
     	String URL = driver.getCurrentUrl();
     	System.out.println("News Url = " + URL);
     	
     	 Assert.assertTrue(URL.contains(Exp_News_Url),"News URL is different") ;
   	  
      }

      public void Home_Menu_Contact () throws InterruptedException{
   	   
   	   
   	   JavascriptExecutor js = (JavascriptExecutor) driver;
          
     	 // js.executeScript("window.scrollTo(0,1000)");
     	   WebElement Element = driver.findElement(Menu);
     	  js.executeScript("arguments[0].scrollIntoView();", Element);
     	  
     	  Thread.sleep(3000);
     	  
     	  driver.findElement(Menu).click();
     	  
     	Thread.sleep(3000);
   	  
     	driver.findElement(Menu_Contact).click();
     	
     	Thread.sleep(5000);
     	
     	String URL = driver.getCurrentUrl();
     	System.out.println("Contact Url = " + URL);
     	
     	 Assert.assertTrue(URL.contains(Exp_contact_url),"Contact Us URL is different") ;
   	  
      }

      public void Home_Menu_AboutUs  () throws InterruptedException{
      	   
      	   
      	   JavascriptExecutor js = (JavascriptExecutor) driver;
             
        	 // js.executeScript("window.scrollTo(0,1000)");
        	   WebElement Element = driver.findElement(Menu);
        	  js.executeScript("arguments[0].scrollIntoView();", Element);
        	  
        	  Thread.sleep(3000);
        	  
        	  driver.findElement(Menu).click();
        	  
        	Thread.sleep(3000);
      	  
        	driver.findElement(Menu_AboutUs).click();
        	
        	Thread.sleep(5000);
        	
        	String URL = driver.getCurrentUrl();
        	System.out.println("AboutUs Url = " + URL);
        	
        	 Assert.assertTrue(URL.contains(Exp_AboutUs_url),"About Us URL is different") ;
      	  
         }

      public void Home_Menu_Space  () throws InterruptedException{
     	   
     	   
     	   JavascriptExecutor js = (JavascriptExecutor) driver;
            
       	 // js.executeScript("window.scrollTo(0,1000)");
       	   WebElement Element = driver.findElement(Menu);
       	  js.executeScript("arguments[0].scrollIntoView();", Element);
       	  
       	  Thread.sleep(3000);
       	  
       	  driver.findElement(Menu).click();
       	  
       	Thread.sleep(3000);
     	  
       	driver.findElement(Menu_space).click();
       	
       	Thread.sleep(5000);
       	
       	String URL = driver.getCurrentUrl();
       	System.out.println("Space Url = " + URL);
       	
       	 Assert.assertTrue(URL.contains(Exp_SpaceUs_url),"About Us URL is different") ;
     	  
        }


}
