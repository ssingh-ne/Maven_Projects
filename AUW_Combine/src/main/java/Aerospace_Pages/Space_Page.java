package Aerospace_Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Space_Page {
	
	WebDriver driver;
	
	
	By Top_Heading1 = By.xpath("//*[@id='contentBlock0']/h1");
	By section1 = By.xpath("(//*[@id='contentBlock0']/p)[1]");
	By section2 = By.xpath("//*[text()='Space Coverages']");
	By section3 =  By.xpath("//*[text()='Coverage Highlights']");
	By section4 = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div/div[1]");
	By section5 = By.xpath("//*[text()='At the controls']");
	By More = By.xpath("//*[text()='ABOUT US']");
	By contact_US = By.xpath("//*[text()='CONTACT US']");
	By Privacy_policy = By.xpath("//*[text()='Privacy Policy']");
	By CA_Privacy_Notice = By.xpath("//*[text()='CA Privacy Notice']");
	
	
	String Exp_More_URL = "/about-us";
	String Exp_Privacy_URL = "auw.com/privacy-policy";
    String Exp_CA_Privacy_URL = "auw.com/ca-privacy-notice";
    String Exp_Contact_URL = "/contact-us";
    
	
	
	
	
	 public Space_Page (WebDriver driver){
			this.driver=driver;
		}



	 public void Heading1 () {
		 
		 boolean Heading = driver.findElement(Top_Heading1).isDisplayed();
		 System.out.println("Heading is visible = " + Heading);
		 
		 String Heading1 = driver.findElement(Top_Heading1).getText();
		 System.out.println("Top Heading = " + Heading1);
		 
		 Assert.assertEquals(Heading, true); 
	 }
	 
	 public void Section1 () throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(section1);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(3000);
		 
		 boolean Heading = driver.findElement(section1).isDisplayed();
		 System.out.println("section 1 is visible = " + Heading);
		 
		 Assert.assertEquals(Heading, true); 
	 }
	  
     public void Section2 () throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(section2);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(3000);
		 
		 boolean Heading = driver.findElement(section2).isDisplayed();
		 System.out.println("Section 2 is visible = " + Heading);
		 
		 Assert.assertEquals(Heading, true); 
	 }
	 
     public void Section3 () throws InterruptedException {
	 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(section3);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	    Thread.sleep(3000);
	 
	    boolean Heading = driver.findElement(section3).isDisplayed();
	    System.out.println("Section 3 is visible = " + Heading);
	 
	    Assert.assertEquals(Heading, true); 
	 }
	 
     public void Section4 () throws InterruptedException {
	 
	     JavascriptExecutor js = (JavascriptExecutor) driver;
         WebElement Element = driver.findElement(section4);
	     js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	       Thread.sleep(5000);
	 
    	 boolean Heading = driver.findElement(section4).isDisplayed();
	     System.out.println("Section 4 is visible = " + Heading);
	     
	     Assert.assertEquals(Heading, true); 
	 }
	 
	 
     public void Section5 () throws InterruptedException {
	 
	     JavascriptExecutor js = (JavascriptExecutor) driver;
         WebElement Element = driver.findElement(section5);
	     js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	      Thread.sleep(3000);
	 
	     boolean Heading = driver.findElement(section5).isDisplayed();
	     System.out.println("Section 5 is visible = " + Heading);
	 
	     Assert.assertEquals(Heading, true); 
	 }
	 
	 
	 public void More () throws InterruptedException {
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(More);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	    Thread.sleep(3000);
	    
		driver.findElement(More).click();
		
		Thread.sleep(3000);
	    
		String More_URL = driver.getCurrentUrl();
		
		System.out.println("More button redirects = " + More_URL);
		
		driver.navigate().back();
		 
		 Assert.assertTrue(More_URL.contains(Exp_More_URL),"More redirection URL is incorrect") ;
	 
	 }
	 
	 public void Privacy_policy () throws InterruptedException {
		 
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement Element = driver.findElement(Privacy_policy);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		    Thread.sleep(3000);
		    
			driver.findElement(Privacy_policy).click();
			
			Thread.sleep(3000);
		    
			Set<String> handlesSet1 = driver.getWindowHandles();
	        List<String> handlesList1 = new ArrayList<String>(handlesSet1);
	        driver.switchTo().window(handlesList1.get(1));
			String Privacy_URL = driver.getCurrentUrl();
			
			System.out.println("Privacy Policy redirects = " + Privacy_URL);
			
			driver.close();
	        driver.switchTo().window(handlesList1.get(0));
			 
			Assert.assertTrue(Privacy_URL.contains(Exp_Privacy_URL),"Privacy policy redirection URL is incorrect") ;
		 
		 }
	 
	 public void CA_Privacy_policy () throws InterruptedException {
		 
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement Element = driver.findElement(CA_Privacy_Notice);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		    Thread.sleep(3000);
		    
			driver.findElement(CA_Privacy_Notice).click();
			
			Thread.sleep(3000);
			
			Set<String> handlesSet1 = driver.getWindowHandles();
	        List<String> handlesList1 = new ArrayList<String>(handlesSet1);
	        driver.switchTo().window(handlesList1.get(1));
			
			String CA_Privacy_URL = driver.getCurrentUrl();
			
			System.out.println("CA Privacy Policy redirects = " + CA_Privacy_URL);
			
			driver.close();
	        driver.switchTo().window(handlesList1.get(0));
			 
			Assert.assertTrue(CA_Privacy_URL.contains(Exp_CA_Privacy_URL),"CA Privacy policy redirection URL is incorrect") ;
		 
		 }
	 
	 public void Contact_Us ()  throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement Element = driver.findElement(contact_US);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		    Thread.sleep(3000);
		    
			driver.findElement(contact_US).click();
			
			Thread.sleep(3000);
		    
			String Contact_URL = driver.getCurrentUrl();
			
			System.out.println("Contact US button redirects = " + Contact_URL);
			
			driver.navigate().back();
			 
			 Assert.assertTrue(Contact_URL.contains(Exp_Contact_URL),"Contact us redirection URL is incorrect") ;
		 
		 
	 }
}

	 
	 

