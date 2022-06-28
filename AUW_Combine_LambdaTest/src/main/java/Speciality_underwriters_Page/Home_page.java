package Speciality_underwriters_Page;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_page {
	
	WebDriver driver;
	
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By  CA_Privacy_Note = By.xpath("//*[text()='CA Privacy Notice']");
	By SU_Logo = By.xpath("//*[@alt='Applied Specialty Underwriter Logo']");
	
	
	String EXP_Privacy_Url_dev = "https://www.auw.com/privacy-policy";
	String EXP_CA_Privacy_Url_dev = "https://www.auw.com/ca-privacy-notice";
	String EXP_Contact_US_Value = "How can we help you?*"; 
	
	
	public Home_page (WebDriver driver){
		this.driver=driver;
	}

	 
	 
	 public void  PrivacyPolicy () throws InterruptedException {
          // Privacy policy 
         
 		 driver.findElement(PrivacyPolicy).click();
 		 Thread.sleep(5000);
 		
 		WebDriverWait wait = new WebDriverWait(driver,30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(SU_Logo));
 		
 		 String PrivacyURL =  driver.getCurrentUrl();
         System.out.println("Privacy Policy URL = " + PrivacyURL);
         
 		driver.findElement(SU_Logo).click();
 		
 		
 		//assertEquals(PrivacyURL, EXP_Privacy_Url);
	 }
	 
	 public void  PrivacyPolicy_dev () throws InterruptedException {
         // Privacy policy 
        
		 driver.findElement(PrivacyPolicy).click();
		 Thread.sleep(5000);
		
		 Set<String> handlesSet = driver.getWindowHandles();
	        List<String> handlesList = new ArrayList<String>(handlesSet);
	        driver.switchTo().window(handlesList.get(1));
	       String MTLURL  =  driver.getCurrentUrl();
	       System.out.println("Privacy Policy URL = " + MTLURL);
	        driver.close();
	        driver.switchTo().window(handlesList.get(0));
	        
		
		assertEquals(MTLURL, EXP_Privacy_Url_dev);
	 }
	 
	 public void  CA_PrivacyPolicy () throws InterruptedException {
		// CA Privacy Note 
	 		
	 		WebDriverWait wait1 = new WebDriverWait(driver,30);
	 		wait1.until(ExpectedConditions.visibilityOfElementLocated(SU_Logo));
	         
	 		 Thread.sleep(5000);
	 		 
	 		 driver.findElement(CA_Privacy_Note).click();
	 		 Thread.sleep(5000);
	 		 
	 		WebDriverWait wait2 = new WebDriverWait(driver,30);
	 		wait2.until(ExpectedConditions.visibilityOfElementLocated(SU_Logo));
	 		
	 		 String CA_PrivacyURL =  driver.getCurrentUrl();
	         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
	 		
	 		driver.findElement(SU_Logo).click();
	 		
	 		//assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url);
	 }
	 
	 public void  CA_PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		
		 		/*WebDriverWait wait1 = new WebDriverWait(driver,30);
		 		wait1.until(ExpectedConditions.visibilityOfElementLocated(SU_Logo));
		        */ 
		 		 Thread.sleep(5000);
		 		 
		 		 driver.findElement(CA_Privacy_Note).click();
		 		 Thread.sleep(5000);
		 		 
		 		 Set<String> handlesSet = driver.getWindowHandles();
			        List<String> handlesList = new ArrayList<String>(handlesSet);
			        driver.switchTo().window(handlesList.get(1));
			       String MTLURL  =  driver.getCurrentUrl();
			       System.out.println("CA privacy URL = " + MTLURL);
			        driver.close();
			        driver.switchTo().window(handlesList.get(0));
		 	    
			        assertEquals(MTLURL, EXP_CA_Privacy_Url_dev);
		 }
	 
	
	 
}
