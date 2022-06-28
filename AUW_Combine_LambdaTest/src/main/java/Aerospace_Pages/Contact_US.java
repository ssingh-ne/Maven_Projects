package Aerospace_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Contact_US {
	
	WebDriver driver;
	
	
	By contactUs_heading = By.xpath("//*[@id='contentBlock0']/h1/strong");
	By contactUs_Form_submit = By.xpath("//*[@type='submit']");
	By contactUs = By.xpath("//*[text()='Contact Us']"); 
	By offices = By.xpath("//*[text()='Offices']");
	
	
	 public Contact_US (WebDriver driver){
			this.driver=driver;
		}

     public void Heading () {
	 
	 boolean x = driver.findElement(contactUs_heading).isDisplayed();
	 
	 System.out.println("Page heading is displayed = " + x);
	 
	 Assert.assertEquals(x, true, "Contact Us heading not loaded");
	 
	 
	 
 }
     public void Offices_Section () {
    	 
    	 boolean x = driver.findElement(offices).isDisplayed();
    	 
    	 System.out.println("Offices section is displayed = " + x);
    	 
    	 Assert.assertEquals(x, true, "Offices section is not loaded");
    	 
    	 
    	 
     }

     public void Contact_Form () {
	   
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(contactUs);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
		 
	   
	   boolean ContactSection = driver.findElement(contactUs).isDisplayed();
		 
	   System.out.println("Contact Us is displayed = " + ContactSection);
	   
	   
	   boolean Contact_Submit = driver.findElement(contactUs_Form_submit).isDisplayed();
		 
	   System.out.println("Submit is displayed = " + Contact_Submit);
	   
	   
	   Assert.assertEquals(ContactSection, true, "Contact us not loaded");
		 
	   Assert.assertEquals(Contact_Submit, true, "Contact us Submit not loaded");
	   
	   
	   
   }

     
 
 
}
