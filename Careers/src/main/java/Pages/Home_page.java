package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_page {
	
	WebDriver driver;
	

	By Exp_button = By.xpath("//a[text()='Experience']");
	
	By Intel_button = By.xpath("//a[text()='Intelligence']");
	
	By About_button = By.xpath("//a[text()='About Us']");
	
	By Login_button = By.xpath("//a[text()='Login']");
	
	By Twitter_image = By.xpath("//*[@alt='twitter']");
	By fb_image = By.xpath("//*[@alt='facebook']");
	By Link_image = By.xpath("//*[@alt='linkedin']");
	By Insta_image = By.xpath("//*[@alt='instagram']");
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By  CA_Privacy_Note = By.xpath("//*[text()='CA Privacy Notice']");
	//By AUW_Logo = By.xpath("//*[@alt='Applied Underwriters']");
	//By AUW_Logo = By.xpath("//*[@alt='Applied Careers Logo']");
	By AUW_Logo = By.xpath("//*[@alt='Applied Careers']");
	String EXP_Twitter_Url = "https://twitter.com/AppliedUW";
	
	String EXP_FB_Url = "https://www.facebook.com/AppliedUW/";
	String EXP_link_Url = "https://www.linkedin.com";
	
	String EXP_Insta_Url = "https://www.instagram.com/";
	String EXP_Privacy_Url = "https://careers.auw.com/privacy-policy";
	String EXP_CA_Privacy_Url = "https://careers.auw.com/ca-privacy-notice";
	
	String EXP_Privacy_Url_dev = "https://develop--applied-careers.netlify.app/privacy-policy";
	String EXP_CA_Privacy_Url_dev = "https://develop--applied-careers.netlify.app/ca-privacy-notice";
	
	public Home_page (WebDriver driver){
		this.driver=driver;
	}


	 public void  Twitter () throws InterruptedException {
	 
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(fb_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
			driver.findElement(Twitter_image).click();
			 Thread.sleep(5000);
			
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	        String TwitterURL =  driver.getCurrentUrl();
	        System.out.println("Twitter URl = " + TwitterURL);
	         driver.close();
	         driver.switchTo().window(handlesList.get(0));
	         
	         assertEquals(TwitterURL, EXP_Twitter_Url);
	 
	 }
	
	 public void  Facebook () throws InterruptedException {
		 // Facebook 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(fb_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
 		 driver.findElement(fb_image).click();
 		 
 		 Thread.sleep(10000);
 		
         Set<String> handlesSet1 = driver.getWindowHandles();
         List<String> handlesList1 = new ArrayList<String>(handlesSet1);
         driver.switchTo().window(handlesList1.get(1));
         String FBURL =  driver.getCurrentUrl();
         System.out.println("handlesSet1= " +handlesSet1);
         System.out.println("facebook URl = " +FBURL);
         driver.close();
         driver.switchTo().window(handlesList1.get(0));
         
         assertEquals(FBURL, EXP_FB_Url);
        // Assert.assertTrue(EXP_link_Url.contains(LINKURL),"Failure message") ; 
         
         
	 }
	

	 public void  Linkedin () throws InterruptedException {
	  // Linkedin 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 driver.findElement(Link_image).click();
		 Thread.sleep(5000);
		
     Set<String> handlesSet2 = driver.getWindowHandles();
     List<String> handlesList2 = new ArrayList<String>(handlesSet2);
     driver.switchTo().window(handlesList2.get(1));
     String LINKURL =  driver.getCurrentUrl();
    
     System.out.println("LinkedIn URl = " +LINKURL);
     driver.close();
     driver.switchTo().window(handlesList2.get(0));
     
     Assert.assertTrue(LINKURL.contains(EXP_link_Url),"Failure message") ;
     
     //assertEquals(LINKURL, EXP_link_Url);
	 }
	 
	 public void  Instagram () throws InterruptedException {
      // Instagram 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
 		 driver.findElement(Insta_image).click();
 		 Thread.sleep(5000);
 		
         Set<String> handlesSet3 = driver.getWindowHandles();
         List<String> handlesList3 = new ArrayList<String>(handlesSet3);
         driver.switchTo().window(handlesList3.get(1));
         String INSTAURL =  driver.getCurrentUrl();
         System.out.println("Instagram URl = " +INSTAURL);
         driver.close();
         driver.switchTo().window(handlesList3.get(0));
         
       //  assertEquals(INSTAURL, EXP_Insta_Url);
	 
         Assert.assertTrue(INSTAURL.contains(EXP_Insta_Url),"Instagram URL not match") ;
	 }
	 
	 public void  PrivacyPolicy () throws InterruptedException {
          // Privacy policy 
         
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
 		 driver.findElement(PrivacyPolicy).click();
 		 Thread.sleep(5000);
 		
 		WebDriverWait wait = new WebDriverWait(driver,30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(AUW_Logo));
 		
 		 String PrivacyURL =  driver.getCurrentUrl();
         System.out.println("Privacy Policy URL = " + PrivacyURL);
         
 		driver.findElement(AUW_Logo).click();
 		
 		
 		assertEquals(PrivacyURL, EXP_Privacy_Url);
	 }
	 
	 public void  PrivacyPolicy_dev () throws InterruptedException {
         // Privacy policy 
        
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 driver.findElement(PrivacyPolicy).click();
		 Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AUW_Logo));
		
		 String PrivacyURL =  driver.getCurrentUrl();
        System.out.println("Privacy Policy URL = " + PrivacyURL);
        
		driver.findElement(AUW_Logo).click();
		
		
		assertEquals(PrivacyURL, EXP_Privacy_Url_dev);
	 }
	 
	 public void  CA_PrivacyPolicy () throws InterruptedException {
		// CA Privacy Note 
	 		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
	 	     
	 		 Thread.sleep(5000);
	 		 
	 		 driver.findElement(CA_Privacy_Note).click();
	 		 Thread.sleep(5000);
	 		 
	 		WebDriverWait wait2 = new WebDriverWait(driver,30);
	 		wait2.until(ExpectedConditions.visibilityOfElementLocated(AUW_Logo));
	 		
	 		 String CA_PrivacyURL =  driver.getCurrentUrl();
	         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
	 		
	 		driver.findElement(AUW_Logo).click();
	 		
	 		assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url);
	 }
	 
	 public void  CA_PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
		 WebElement Element = driver.findElement(Link_image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		         
		 		 Thread.sleep(5000);
		 		 
		 		 driver.findElement(CA_Privacy_Note).click();
		 		 Thread.sleep(5000);
		 		 
		 		WebDriverWait wait2 = new WebDriverWait(driver,30);
		 		wait2.until(ExpectedConditions.visibilityOfElementLocated(AUW_Logo));
		 		
		 		 String CA_PrivacyURL =  driver.getCurrentUrl();
		         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
		 		
		 		driver.findElement(AUW_Logo).click();
		 		
		 		assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url_dev);
		 }
	 
	 
	 public void Experience_btn () {
	// Click on Experience button
	
	driver.findElement(Exp_button).click();
	
	
	 }
	 
	 public void Intelligence_btn () {
	// Click on Intelligence button
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Intel_button));
		
		driver.findElement(Intel_button).click();
	 }
	 
	 
	 public void AboutUs_btn () {
		 
		// Click on About Us button
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(About_button));
			
		    driver.findElement(About_button).click();
			}
			  
	 public void Login_btn () {
		 
		// Click on Login button
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Login_button));
			
		    driver.findElement(Login_button).click();
			}
			 
	 
	 
	 
	 
}
