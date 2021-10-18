package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
    WebDriver driver;

    By EngAndDesign = By.xpath("//*[text()='ENGINEERING & DESIGN']");
    By About = By.xpath("//*[text()='ABOUT US']");
    By Convey = By.xpath("//*[text()='CONVEY WHAT WE OFFER']");
    By ConveyTab1 = By.xpath("//*[text()='Facilities & Capabilities']");
    By ConveyTab2 = By.xpath("//*[text()='Equipment Avaliable']");
    By ContactUS = By.xpath("//*[text()='CONTACT US']");
    By privacyURL = By.xpath("//*[@target='_self']");
    By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");



	public Home (WebDriver driver){
		this.driver=driver;
	}

	
	 public void Contact_Us () throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(ContactUS);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(5000);
		   
		  boolean contact =  driver.findElement(ContactUS).isDisplayed();
		  
		  System.out.println("contact us Is visible = " + contact);
		  
		  
		   
	   }
	   
	 public void ENGandDesign () throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(EngAndDesign);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(5000);
		   
		  boolean EngAndDesign_1 =  driver.findElement(EngAndDesign).isDisplayed();
		  
		  System.out.println("Engineering And Design Is visible = " + EngAndDesign_1);
		   
	   }
	
	 public void About_Us () throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(About);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(5000);
		   
		  boolean About_US =  driver.findElement(About).isDisplayed();
		  
		  System.out.println("About Us Is visible = " + About_US);
		   
	   }

	 public void convey_Us () throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(Convey);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(5000);
		   
		  boolean Convey_US =  driver.findElement(Convey).isDisplayed();
		  
		  System.out.println("Convey Is visible = " + Convey_US);
		  
		  Thread.sleep(2000);
		
		  WebElement Element1 = driver.findElement(ConveyTab1);
		   js.executeScript("arguments[0].scrollIntoView();", Element1);
		   
		   Thread.sleep(2000);
		   
		  boolean Convey_US1 =  driver.findElement(ConveyTab1).isDisplayed();
		  
		  System.out.println("Convey Tab 1 Is visible = " + Convey_US1);
		  
          boolean Convey_US2 =  driver.findElement(ConveyTab2).isDisplayed();
		  
		  System.out.println("Convey Tab 1 Is visible = " + Convey_US2);
		  
		  driver.findElement(ConveyTab1).click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(ConveyTab2).click();
		   
	   }

	 public void PrivacyPolicy () throws InterruptedException {
		   
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(PrivacyPolicy);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		  
		  Thread.sleep(3000);
		  
		 String URL = driver.findElement(privacyURL).getAttribute("href");
		 System.out.println("URL before click = " + URL);
		 
		 driver.findElement(PrivacyPolicy).click();
		 
		 Thread.sleep(4000);
		 
		 String URL1  = driver.getCurrentUrl();
		 
		 System.out.println("Url after click = " + URL1);
		 
		 driver.navigate().back();
		 
		 
		 assertEquals(URL, URL1);
		 
		  
		   
	   }
	 
	 
	 
	
	
}
