package Pages;

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
	By MTL_Logo = By.xpath("//*[@alt='applied-more-to-love']");
	By ContactUS_btn = By.xpath("//*[text()='CONTACT US']");
	By WhatWeOffer = By.xpath("(//*[@class='MuiButton-label'])[1]");
	By contact_US = By.xpath("//a[text()='CONTACT US']");
	By contact_us_text = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By Submit_contact = By.xpath("//*[text() = 'Submit']");
	By contact_US_Dropdown = By.xpath("//*[@id='mui-component-select-help']");
	
	String EXP_Privacy_Url_dev = "https://www.auw.com/privacy-policy";
	String EXP_CA_Privacy_Url_dev = "https://www.auw.com/ca-privacy-notice";
	String EXP_Contact_US_Value = "How can we help you?*"; 
	
	
	public Home_page (WebDriver driver){
		this.driver=driver;
	}

	 public void contact_us_dev () throws InterruptedException {
		 
		/* WebElement element = driver.findElement(contact_US);
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
		 */
		 String contactUS_Header = driver.findElement(contact_US).getText();
		 
		 System.out.println("Contact us header = " + contactUS_Header);
		 
		 driver.findElement(contact_US).click();
		 Thread.sleep(5000);
		 String contactUS = driver.findElement(contact_us_text).getText();
		 System.out.println("Contact us Page = " + contactUS);
		 
		 
		// Contact Us drop down 
			/*
			WebElement element1 = driver.findElement(Submit_contact);
			Actions actions1 = new Actions(driver);
			actions1.moveToElement(element1);
			actions1.perform();*/
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("window.scrollBy(0,1000)");
			 WebElement Element = driver.findElement(Submit_contact);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			
			Thread.sleep(5000);
			 //driver.findElement(contact_US_Dropdown).click();
			
			String ContactUS_DropDown_text = driver.findElement(contact_US_Dropdown).getText();
			
			System.out.println("ContactUS_DropDown_text = " + ContactUS_DropDown_text);
			
			Thread.sleep(3000);
			
			
		 
		 assertEquals(contactUS, contactUS_Header);
		 assertEquals(ContactUS_DropDown_text,EXP_Contact_US_Value);
	 }
	 
	 
	 public void  PrivacyPolicy () throws InterruptedException {
          // Privacy policy 
         
 		 driver.findElement(PrivacyPolicy).click();
 		 Thread.sleep(5000);
 		
 		WebDriverWait wait = new WebDriverWait(driver,30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(MTL_Logo));
 		
 		 String PrivacyURL =  driver.getCurrentUrl();
         System.out.println("Privacy Policy URL = " + PrivacyURL);
         
 		driver.findElement(MTL_Logo).click();
 		
 		
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
	 		wait1.until(ExpectedConditions.visibilityOfElementLocated(MTL_Logo));
	         
	 		 Thread.sleep(5000);
	 		 
	 		 driver.findElement(CA_Privacy_Note).click();
	 		 Thread.sleep(5000);
	 		 
	 		WebDriverWait wait2 = new WebDriverWait(driver,30);
	 		wait2.until(ExpectedConditions.visibilityOfElementLocated(MTL_Logo));
	 		
	 		 String CA_PrivacyURL =  driver.getCurrentUrl();
	         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
	 		
	 		driver.findElement(MTL_Logo).click();
	 		
	 		//assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url);
	 }
	 
	 public void  CA_PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		
		 		/*WebDriverWait wait1 = new WebDriverWait(driver,30);
		 		wait1.until(ExpectedConditions.visibilityOfElementLocated(MTL_Logo));
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
	 
	 
	 
	 public void ContactUS_btn () {
		 
		// Click on About Us button
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUS_btn));
			
		    driver.findElement(ContactUS_btn).click();
			}
	 
}
