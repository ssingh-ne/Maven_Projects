package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Us_Page {
	
	WebDriver driver;

	
	By ContactUs_header = By.xpath("(//*[text()='Contact Us'])[1]");
	By ContactUs_home = By.xpath("(//*[text()='Contact Us'])[2]");
	By AFL_Logo = By.xpath("//*[@href='/']");
	By top_text = By.xpath("//*[@id='app']/div[2]/div/div/div[2]/p");
	
	String Contact_URL = "https://afl.auw.com/contact-us";
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
 	
}
