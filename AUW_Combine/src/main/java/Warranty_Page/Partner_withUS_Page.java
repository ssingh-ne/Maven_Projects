package Warranty_Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class Partner_withUS_Page {
	
	
	WebDriver driver;
	
	
	
	By Heading = By.xpath("(//*[text()='Partner With Us'])[1]");
	String URL = "https://release-1-0-0--applied-warranty.netlify.app/partner-with-us";
	
	
	public Partner_withUS_Page (WebDriver driver){
		this.driver=driver;
	}

	
	public void partner () throws InterruptedException {

		  
 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		
 		 Thread.sleep(5000);
 		 
 		 driver.findElement(Heading).click();
 		 Thread.sleep(5000);
 		 
 		 String CurrentURL = driver.getCurrentUrl();
 		 
 		 System.out.println("Partner URL = " + CurrentURL);
 		 
 		assertEquals(CurrentURL, URL);
		
	}

}
