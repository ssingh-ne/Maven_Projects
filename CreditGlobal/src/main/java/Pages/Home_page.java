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
	
	
	
	By WhatWeDO = By.xpath("(//*[text()='What We Do'])[1]");
	By OurApproach = By.xpath("(//*[text()='Our Approach'])[1]");
	By ContactUS = By.xpath("(//*[text()='Contact Us'])[1]");
	By Login = By.xpath("//*[text()='Login']");
	By logo = By.xpath("//*[@alt='Credit Global']");
	
	
	
	String Dev_Login_URL_EXP  = "https://develop--credit-global.netlify.app/login";
	String Dev_Contact_us_exp = "https://develop--credit-global.netlify.app/contact-us";
	String Dev_Our_approach_exp = "https://develop--credit-global.netlify.app/our-approach";
	String Dev_What_weDo_exp = "https://develop--credit-global.netlify.app/what-we-do";
	
	
	String Prod_Login_URL_EXP  = "https://cg.com/login";
	String Prod_Contact_us_exp = "https://cg.com/contact-us";
	String Prod_Our_approach_exp = "https://cg.com/our-approach";
	String Prod_What_weDo_exp = "https://cg.com/what-we-do";
	
public Home_page (WebDriver driver){
		
		this.driver=driver;
	}

	//test
	public void login () throws InterruptedException {
		
        String Login_Header = driver.findElement(Login).getText();
		 
		 System.out.println("Contact us header = " + Login_Header);
		 
		 driver.findElement(Login).click();
		 
		 Thread.sleep(5000);
		
		 String Current_URL = driver.getCurrentUrl();
		 
		 assertEquals(Current_URL, Dev_Login_URL_EXP);
		 
		 driver.findElement(logo).click();
		
		 Thread.sleep(3000);
	}
	
	
	 public void ContactUS_btn () throws InterruptedException {
		 Thread.sleep(5000);
		// Click on About Us button
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUS));
			
		    driver.findElement(ContactUS).click();
	
		    Thread.sleep(5000);
			
			 String Current_URL = driver.getCurrentUrl();
			 
			 assertEquals(Current_URL, Dev_Contact_us_exp);
			 
			 driver.findElement(logo).click();
			
			 Thread.sleep(3000);
	 
	 }
	 

	 public void Our_approach () throws InterruptedException {
		 
		// Click on About Us button
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(OurApproach));
			
		    driver.findElement(OurApproach).click();
		    
		    Thread.sleep(5000);
			
			 String Current_URL = driver.getCurrentUrl();
			 
			 assertEquals(Current_URL, Dev_Our_approach_exp);
			 
			 driver.findElement(logo).click();
			
			 Thread.sleep(3000);
			}
	 

	 public void What_weDo () throws InterruptedException {
		 
		// Click on About Us button
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(WhatWeDO));
			
		    driver.findElement(WhatWeDO).click();
		    
		    Thread.sleep(5000);
			
			 String Current_URL = driver.getCurrentUrl();
			 
			 assertEquals(Current_URL, Dev_What_weDo_exp);
			 
			
			}
	 
	 public void login_prod () throws InterruptedException {
			
	        String Login_Header = driver.findElement(Login).getText();
			 
			 System.out.println("Contact us header = " + Login_Header);
			 
			 driver.findElement(Login).click();
			 
			 Thread.sleep(5000);
			
			 String Current_URL = driver.getCurrentUrl();
			 
			 assertEquals(Current_URL, Prod_Login_URL_EXP);
			 
			 driver.findElement(logo).click();
			
			 Thread.sleep(3000);
		}
		
		
		 public void ContactUS_btn_prod () throws InterruptedException {
			 
			// Click on About Us button
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUS));
				
			    driver.findElement(ContactUS).click();
		
			    Thread.sleep(5000);
				
				 String Current_URL = driver.getCurrentUrl();
				 
				 assertEquals(Current_URL, Prod_Contact_us_exp);
				 
				 driver.findElement(logo).click();
				
				 Thread.sleep(3000);
		 
		 }
		 

		 public void Our_approach_prod () throws InterruptedException {
			 
			// Click on About Us button
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(OurApproach));
				
			    driver.findElement(OurApproach).click();
			    
			    Thread.sleep(5000);
				
				 String Current_URL = driver.getCurrentUrl();
				 
				 assertEquals(Current_URL, Prod_Our_approach_exp);
				 
				 driver.findElement(logo).click();
				
				 Thread.sleep(3000);
				}
		 

		 public void What_weDo_prod () throws InterruptedException {
			 
			// Click on About Us button
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(WhatWeDO));
				
			    driver.findElement(WhatWeDO).click();
			    
			    Thread.sleep(5000);
				
				 String Current_URL = driver.getCurrentUrl();
				 
				 assertEquals(Current_URL, Prod_What_weDo_exp);
				 
				
				}
	 
}
