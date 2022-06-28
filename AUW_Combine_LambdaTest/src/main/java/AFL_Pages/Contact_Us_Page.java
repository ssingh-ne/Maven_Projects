package AFL_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Contact_Us_Page {
	
	WebDriver driver;

	
	By ContactUs_header = By.xpath("(//*[text()='Contact Us'])[1]");
	By ContactUs_home = By.xpath("(//*[text()='Contact Us'])[2]");
	By AFL_Logo = By.xpath("//*[@href='/']");
	By top_text = By.xpath("//*[@id='__next']/div[2]/div/div/div[2]/p");
	By MiddleEastCoverage = By.xpath("//*[text()='For European and Middle East Coverages']");
	By UnitedStateCoverage = By.xpath("//*[@id='__next']/main/div[4]/div/div/div/h2");
	
	String Exp_MiddleEast = "For European and Middle East Coverages";
	String Exp_UnitedStates = "For United States Coverages";
	
	String Contact_URL = "https://www.afl.auw.com/contact-us";
	String Contact_URL_dev = "https://develop--applied-financial-lines.netlify.app/contact-us";

	public Contact_Us_Page (WebDriver driver){
		this.driver=driver;
	}
	
	public void ContactUS_Dev() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AFL_Logo).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(ContactUs_header);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		  
		driver.findElement(ContactUs_header).click();
		Thread.sleep(3000);
		
		// displying header text
		boolean topText = driver.findElement(top_text).isDisplayed();
		
		System.out.println("heading test ia appearing = " + topText);
		
		String URL = driver.getCurrentUrl();
		System.out.println("Contact Us _URL = " + URL);
		  
		assertEquals(URL, Contact_URL_dev);
	}
	
	public void ContactUS() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(AFL_Logo).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(ContactUs_header);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		  
		driver.findElement(ContactUs_header).click();
		Thread.sleep(3000);
		
		// displying header text
		boolean topText = driver.findElement(top_text).isDisplayed();
		
		System.out.println("heading test ia appearing = " + topText);
		
		String URL = driver.getCurrentUrl();
		System.out.println("Contact Us _URL = " + URL);
		  
		assertEquals(URL, Contact_URL);
	}
	
    public void ContactUS_home() throws InterruptedException {
	   
	   driver.findElement(AFL_Logo).click();
	   Thread.sleep(2000);
		
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(ContactUs_home);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   Thread.sleep(2000);  
	   driver.findElement(ContactUs_home).click();
	   Thread.sleep(3000);
	   
	   // displying header text
	   
	  boolean topText = driver.findElement(top_text).isDisplayed();
	 		
	  System.out.println("heading test ia appearing = " + topText);
	 		
		  
	   String URL = driver.getCurrentUrl();
	   System.out.println("Contact Us _URL = " + URL);
		  
	   assertEquals(URL, Contact_URL);
		
		
	}
	
    public void ContactUS_home_dev() throws InterruptedException {
 	   
 	   driver.findElement(AFL_Logo).click();
 	   Thread.sleep(2000);
 		
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 	   WebElement Element = driver.findElement(ContactUs_home);
 	   js.executeScript("arguments[0].scrollIntoView();", Element);
 	   Thread.sleep(2000);  
 	   driver.findElement(ContactUs_home).click();
 	   Thread.sleep(3000);
 	   
 	   // displying header text
 	   
 	  boolean topText = driver.findElement(top_text).isDisplayed();
 	 		
 	  System.out.println("heading test ia appearing = " + topText);
 	 		
 		  
 	   String URL = driver.getCurrentUrl();
 	   System.out.println("Contact Us _URL = " + URL);
 		  
 	   assertEquals(URL, Contact_URL_dev);
 		
 		
 	}
 	
    public void Contact_US_Coverage_Outside_US () throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(MiddleEastCoverage);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(5000);
		
    	String Middle_East= driver.findElement(MiddleEastCoverage).getText();
    	System.out.println("Middle_East = " + Middle_East);
    	Assert.assertEquals(Middle_East, Exp_MiddleEast);

    	WebElement Element2 = driver.findElement(UnitedStateCoverage);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		Thread.sleep(2000);
		
    	String United_Estate = driver.findElement(UnitedStateCoverage).getText();
    	
    	Assert.assertEquals(United_Estate, Exp_UnitedStates);
    	
    	System.out.println("On contact us page - For European and Middle East Coverages - visible on top ");
    	
    	
    }



}
