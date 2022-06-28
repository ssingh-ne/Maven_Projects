package Aerospace_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class About_US {

	WebDriver driver;
	
	
	By Heading = By.xpath("(//*[@id='contentBlock0']/p)[1]");
	By Contact_Us = By.xpath("//*[text()='CONTACT US']");
	By image1 = By.xpath("//*[@id='36be0126-38ea-46b9-afb0-0915876510cc']");
	
	
	 public About_US (WebDriver driver){
			this.driver=driver;
		}

	 public void Heading () {
		 
		 boolean x = driver.findElement(Heading).isDisplayed();
		 
		 System.out.println("Page heading is displayed = " + x);
		 
		 Assert.assertEquals(x, true, "About Us heading not loaded");
	 }	
	 
    public void Image_Section () {
    	 
    	JavascriptExecutor js = (JavascriptExecutor) driver;
  	   WebElement Element = driver.findElement(image1);
  	   js.executeScript("arguments[0].scrollIntoView();", Element);
  	   
  	   
    	 boolean x = driver.findElement(image1).isDisplayed();
    	 
    	 System.out.println("Images section is displayed = " + x);
    	 
    	 Assert.assertEquals(x, true, "Images are not loaded");
    }
	
    public void image_click() {
    	
    	
    	
    	
    }
    
    
    
    
    public void Contact_Form () {
 	   
 	   
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 	   WebElement Element = driver.findElement(Contact_Us);
 	   js.executeScript("arguments[0].scrollIntoView();", Element);
 		 
 	   
 	   boolean ContactSection = driver.findElement(Contact_Us).isDisplayed();
 		 
 	   System.out.println("Contact Us is displayed = " + ContactSection);
 	   
 	   
 	   /*boolean Contact_Submit = driver.findElement(ContactUs_Form_submit).isDisplayed();
 		 
 	   System.out.println("Submit is displayed = " + Contact_Submit);
 	   */
 	   
 	   Assert.assertEquals(ContactSection, true, "Contact us not loaded");
 		 
 	//   Assert.assertEquals(Contact_Submit, true, "Contact us Submit not loaded");
 	   
 	   
 	   
    }
}
