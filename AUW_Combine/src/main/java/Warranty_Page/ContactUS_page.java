package Warranty_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class ContactUS_page {
	
	WebDriver driver;
	
	
	
	By AboutUS_header = By.xpath("(//*[text()='About Us'])[1]");
	By NewandEvents = By.xpath("(//*[text()='News & Events'])[1]");
	By PartnerHeading = By.xpath("(//*[text()='Partner With Us'])[1]");
	By contactUS_Header = By.xpath("(//*[text()='Contact Us'])[2]");
	
	By ContactUs_Bottom = By.xpath("(//*[text()='Contact Us'])[3]");
	
	String contact_US_URL = "https://release-1-0-0--applied-warranty.netlify.app/contact-us";
	
	
	
	public ContactUS_page (WebDriver driver){
		this.driver=driver;
	}
	
	public void NewsEvents () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(NewandEvents);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(3000);
		driver.findElement(NewandEvents).click();
		
		Thread.sleep(3000);
		
		WebElement Element1 = driver.findElement(ContactUs_Bottom);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(3000);
		
		driver.findElement(ContactUs_Bottom).click();
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("News Events contact us URL = " + currentURL);
		
		assertEquals(currentURL, contact_US_URL);
		
		
		
	}

     public void AboutUS () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(AboutUS_header);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(3000);
		driver.findElement(AboutUS_header).click();
		
		Thread.sleep(3000);
		
		WebElement Element1 = driver.findElement(ContactUs_Bottom);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		Thread.sleep(3000);
		driver.findElement(ContactUs_Bottom).click();
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Abount US contact us URL = " + currentURL);
		
		assertEquals(currentURL, contact_US_URL);
		
		
		
	}
	
     public void partner () throws InterruptedException {
 		
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(PartnerHeading);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		Thread.sleep(3000);
 		driver.findElement(PartnerHeading).click();
 		
 		Thread.sleep(3000);
 		
 		WebElement Element1 = driver.findElement(ContactUs_Bottom);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 		
 		Thread.sleep(3000);
 		driver.findElement(ContactUs_Bottom).click();
 		
 		
 		String currentURL = driver.getCurrentUrl();
 		System.out.println("Abount US contact us URL = " + currentURL);
 		
 		assertEquals(currentURL, contact_US_URL);
 		
 		
 		
 	}
	
     public void contactUS () throws InterruptedException {
  		
  		JavascriptExecutor js = (JavascriptExecutor) driver;
  		WebElement Element = driver.findElement(contactUS_Header);
  		js.executeScript("arguments[0].scrollIntoView();", Element);
  		
  		Thread.sleep(3000);
  		
  		driver.findElement(contactUS_Header).click();
  		
  		Thread.sleep(3000);
  		
  		String currentURL = driver.getCurrentUrl();
  		System.out.println("Abount US contact us URL = " + currentURL);
  		
  		assertEquals(currentURL, contact_US_URL);
  		
  		
  		
  	}

}
