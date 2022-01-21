package Casuality_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Menu_Contact_Page {
	
WebDriver driver;
	

	By Menu_contactUs = By.xpath("//*[text()='Contact Us']");
	
	String Exp_url = "contact-us";
	
	By contact_text = By.xpath("//*[@id='app']/main/main/div[3]/div/div/h2");
	By Submit_btn = By.xpath("//*[text()='Submit']");
	
	public Menu_Contact_Page (WebDriver driver){
		this.driver=driver;
	}

    public void MenuContact () throws InterruptedException {
    	
    	Thread.sleep(2000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Menu_contactUs);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 driver.findElement(Menu_contactUs).click();
		 
		 Thread.sleep(2000);
    }

    public void URL_Match ()throws InterruptedException {
 	   
 	   Thread.sleep(3000);
 	   
 	   String URL = driver.getCurrentUrl();
 	   
 	   Assert.assertTrue(URL.contains(Exp_url),"Failure message");   
    }
    
	public void contact_us () throws InterruptedException {
		
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Submit_btn);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 String Text = driver.findElement(contact_text).getText();
		 boolean Text2 = driver.findElement(Submit_btn).isDisplayed();
		 
		 System.out.println("Contact Page text is visible = " + Text);
		 System.out.println("Submit button is visible = " + Text2);
		
	}
	
	
}
