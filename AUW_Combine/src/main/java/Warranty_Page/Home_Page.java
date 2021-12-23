package Warranty_Page;

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

public class Home_Page {
	
	
	
	WebDriver driver;
	
	
	By logo = By.xpath("//*[@alt='Applied Warranty Logo']"); 
	By About_us = By.xpath("(//*[text()='About Us'])[1]");
	By Our_Products = By.xpath("(//*[text()='Our Products'])[1]");
	By PartnerWith_us = By.xpath("(//*[text()='Partner With Us'])[1]");
	By NewsEvents_us = By.xpath("(//*[text()='News & Events'])[1]");
	By Contact_us_header = By.xpath("(//*[text()='Contact Us'])[1]");
	
	By Contact_us_bottom = By.xpath("(//*[text()='Contact Us'])[3]");
	
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By CA_PrivacyNotice = By.xpath("//*[text()='CA Privacy Notice']");
	
	By Partener = By.xpath("//*[text()='Our Partners']");
	
	String EXP_CA_Privacy_Url_dev = "https://www.auw.com/ca-privacy-notice";
	String EXP_Privacy_Url_dev = "https://www.auw.com/privacy-policy";
	
	
	// Our_products_section 
	
	By Our_products_image1 = By.xpath("//a[@href='/our-products/service-contracts']/div/img");
	By Our_products_content1 = By.xpath("//*[text()='Service Contracts and Extended Warranties']");
	By Our_products_LearnMore1 = By.xpath("(//*[text()='Learn More'])[1]");
	
	String Exp_URL1 = "https://develop--applied-warranty.netlify.app/our-products/service-contracts";
	
	By Our_products_image2 = By.xpath("//a[@href='/our-products/electronics']/div/img");
	By Our_products_content2 = By.xpath("(//*[text()='Portable Electronics Insurance'])[2]");
	By Our_products_LearnMore2 = By.xpath("(//*[text()='Learn More'])[2]");
	
	String Exp_URL2 ="https://develop--applied-warranty.netlify.app/our-products/electronics"; 
	
	By Our_products_image3 = By.xpath("//a[@href='/our-products/travel-insurance']/div/img");
	By Our_products_content3 = By.xpath("(//*[text()='Travel Insurance'])[2]");
	By Our_products_LearnMore3 = By.xpath("(//*[text()='Learn More'])[3]");
	
	String Exp_URL3 ="https://develop--applied-warranty.netlify.app/our-products/travel-insurance"; 
	
	By Our_products_image4 = By.xpath("//a[@href='/our-products/event-ticket-protection']/div/img");
	By Our_products_content4 = By.xpath("(//*[text()='Event Ticket Protection'])[2]");
	By Our_products_LearnMore4 = By.xpath("(//*[text()='Learn More'])[4]");
	
	String Exp_URL4 ="https://develop--applied-warranty.netlify.app/our-products/event-ticket-protection"; 
	
	By Our_products_image5 = By.xpath("//a[@href='/our-products/oem-and-distributor-programs']/div/img");
	By Our_products_content5 = By.xpath("(//*[text()='OEM and Distributor Programs'])[2]");
	By Our_products_LearnMore5 = By.xpath("(//*[text()='Learn More'])[5]");
	
	String Exp_URL5 ="https://develop--applied-warranty.netlify.app/our-products/oem-and-distributor-programs"; 
	
	By Our_products_image6 = By.xpath("//a[@href='/our-products/auto-dealership-program']/div/img");
	By Our_products_content6 = By.xpath("//*[text()='Auto Dealership Programs']");
	By Our_products_LearnMore6 = By.xpath("(//*[text()='Learn More'])[6]");
	
	String Exp_URL6 ="https://develop--applied-warranty.netlify.app/our-products/auto-dealership-program";
	
	By cookies_prompt = By.xpath("//*[text()='I Agree']");
	
	By subheading = By.xpath("//*[@id='app']/div[2]/div/div/div[1]/h1");
	
	// Our partners
	
	By partner1 = By.xpath("//*[@alt='GoReady']");
	By  partner2 = By.xpath("//*[@alt='USI Affinity']");
	By  partner3 = By.xpath("//*[@alt='Cover Genius']");
	By  partner4 = By.xpath("//*[@alt='My Essentials']");
	By  partner5 = By.xpath("//*[@alt='New Leaf']");
	By  partner6 = By.xpath("//*[@alt='On Point']");
	
	
	 public Home_Page (WebDriver driver){
		this.driver=driver;
	}

	 
     public void Header() {
		 
			// Click on header options
		 		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Our_Products));
					
		boolean Exp_Our_Products = driver.findElement(Our_Products).isDisplayed();
		boolean Exp_PartnerWith_us = driver.findElement(PartnerWith_us).isDisplayed();
		boolean Exp_NewsEvents_us = driver.findElement(NewsEvents_us).isDisplayed();
		boolean AboutUs_Button = driver.findElement(About_us).isDisplayed();
		boolean LOGO = driver.findElement(logo).isDisplayed();
		boolean Exp_Contact_us_header = driver.findElement(Contact_us_header).isDisplayed();
		
		System.out.println("Header options visible - Our Products = " + Exp_Our_Products  +", Partner button = "+Exp_Contact_us_header+", Partner button = " + Exp_PartnerWith_us + ", News and Events = "+ Exp_NewsEvents_us + ", AboutUs_Button = "+ AboutUs_Button + ", Logo = "+ LOGO);
		System.out.println("Header is visible");
			 
		 }
	
	 
     public void  CA_PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		
		 		/*WebDriverWait wait1 = new WebDriverWait(driver,30);
		 		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));*/
		         
		 		JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(CA_PrivacyNotice);
				js.executeScript("arguments[0].scrollIntoView();", Element);
		 		
		 		
		 		Thread.sleep(5000);
		 		 
		 		 driver.findElement(CA_PrivacyNotice).click();
		 		 Thread.sleep(5000);
		 		
		 		  Set<String> handlesSet3 = driver.getWindowHandles();
		          List<String> handlesList3 = new ArrayList<String>(handlesSet3);
		          driver.switchTo().window(handlesList3.get(1));
		          String CA_PrivacyURL =  driver.getCurrentUrl();
		          System.out.println("Ca Privacy URL = " +CA_PrivacyURL);
		          
		          boolean promtURL= driver.findElement(cookies_prompt).isDisplayed();
		          System.out.println("Cookies Promt displayed = " + promtURL);
		          driver.close();
		          driver.switchTo().window(handlesList3.get(0));
		 		
		 		/*
		 		 String CA_PrivacyURL =  driver.getCurrentUrl();
		         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
		 		
		 		driver.findElement(logo).click();
		 		*/
		 		assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url_dev);
		 }
	 
	
	 
     public void  PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		 
		 		JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement Element = driver.findElement(PrivacyPolicy);
				 js.executeScript("arguments[0].scrollIntoView();", Element);
		 		
		 		
		 		Thread.sleep(5000);
		 		 
		 		 driver.findElement(PrivacyPolicy).click();
		 		 Thread.sleep(5000);
		 		
		 		  Set<String> handlesSet3 = driver.getWindowHandles();
		          List<String> handlesList3 = new ArrayList<String>(handlesSet3);
		          driver.switchTo().window(handlesList3.get(1));
		          String PrivacyURL =  driver.getCurrentUrl();
		          System.out.println("Privacy URl = " +PrivacyURL);
		          
		          boolean promtURL= driver.findElement(cookies_prompt).isDisplayed();
		          System.out.println("Cookies Promt displayed = " + promtURL);
		          
		          driver.close();
		          driver.switchTo().window(handlesList3.get(0));
		 		
		 		 assertEquals(PrivacyURL, EXP_Privacy_Url_dev);
		 }
	 
	 public void Our_products_section1 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element3 = driver.findElement(Our_products_image1);
		 js.executeScript("arguments[0].scrollIntoView();", Element3);
			
		WebDriverWait wait1 = new WebDriverWait(driver,30);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
        
		WebElement Element = driver.findElement(Our_products_image1);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		// click on 1st image 
		driver.findElement(Our_products_image1).click();
		Thread.sleep(5000);
		
		String Image_URL = driver.getCurrentUrl();
		System.out.println("URL from image 1 click = " + Image_URL);
		
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		WebElement Element1 = driver.findElement(Our_products_image1);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		
	// click on 1st context
		Thread.sleep(3000);
		driver.findElement(Our_products_content1).click();
		Thread.sleep(5000);
				
		String Content_URL = driver.getCurrentUrl();
		System.out.println("URL from Content 1 click = " + Content_URL);
				
		driver.findElement(logo).click();
				
        Thread.sleep(5000);
		
		WebElement Element2 = driver.findElement(Our_products_image1);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
				
		
	// click on 1st context
		Thread.sleep(3000);
	   driver.findElement(Our_products_LearnMore1).click();
	   Thread.sleep(5000);
					
	   String LearnMore_URL = driver.getCurrentUrl();
	   System.out.println("URL from Lear More 1 click = " + Content_URL);
					
	   driver.findElement(logo).click();
					
	   Thread.sleep(5000);
		
	   
	   
	   assertEquals(Image_URL, Exp_URL1);
	   assertEquals(Content_URL, Exp_URL1);
	   assertEquals(LearnMore_URL, Exp_URL1);
		
	}
	
     public void Our_products_section2 () throws InterruptedException {
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
         
 		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(Our_products_image2);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		// click on 1st image 
		driver.findElement(Our_products_image2).click();
		Thread.sleep(5000);
		
		String Image_URL = driver.getCurrentUrl();
		System.out.println("URL from image 2 click = " + Image_URL);
		
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		WebElement Element1 = driver.findElement(Our_products_image2);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
		
	// click on 1st context
		Thread.sleep(3000);
		driver.findElement(Our_products_content2).click();
		Thread.sleep(5000);
				
		String Content_URL = driver.getCurrentUrl();
		System.out.println("URL from Content 2 click = " + Content_URL);
				
		driver.findElement(logo).click();
				
        Thread.sleep(5000);
		
		WebElement Element2 = driver.findElement(Our_products_image2);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
				
		Thread.sleep(3000);
	// click on 1st context
		
	   driver.findElement(Our_products_LearnMore2).click();
	   Thread.sleep(5000);
					
	   String LearnMore_URL = driver.getCurrentUrl();
	   System.out.println("URL from Lear More 2 click = " + Content_URL);
					
	   driver.findElement(logo).click();
					
	   Thread.sleep(5000);
		
	   
	   
	   assertEquals(Image_URL, Exp_URL2);
	   assertEquals(Content_URL, Exp_URL2);
	   assertEquals(LearnMore_URL, Exp_URL2);
		
	}

     public void Our_products_section3 () throws InterruptedException {
 		
 		WebDriverWait wait1 = new WebDriverWait(driver,30);
  		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
          
  		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(Our_products_image3);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		// click on 1st image 
 		driver.findElement(Our_products_image3).click();
 		Thread.sleep(5000);
 		
 		String Image_URL = driver.getCurrentUrl();
 		System.out.println("URL from image 3 click = " + Image_URL);
 		
 		driver.findElement(logo).click();
 		
 		Thread.sleep(5000);
 		
 		WebElement Element1 = driver.findElement(Our_products_image3);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 		Thread.sleep(3000);
 	// click on 1st context
 	
 		driver.findElement(Our_products_content3).click();
 		Thread.sleep(5000);
 				
 		String Content_URL = driver.getCurrentUrl();
 		System.out.println("URL from Content 3 click = " + Content_URL);
 				
 		driver.findElement(logo).click();
 				
         Thread.sleep(5000);
 		
 		WebElement Element2 = driver.findElement(Our_products_image3);
 		js.executeScript("arguments[0].scrollIntoView();", Element2);
 				
 		Thread.sleep(3000);
 	// click on 1st context
 		
 	   driver.findElement(Our_products_LearnMore3).click();
 	   Thread.sleep(5000);
 					
 	   String LearnMore_URL = driver.getCurrentUrl();
 	   System.out.println("URL from Lear More 3 click = " + Content_URL);
 					
 	   driver.findElement(logo).click();
 					
 	   Thread.sleep(5000);
 		
 	   
 	   
 	   assertEquals(Image_URL, Exp_URL3);
 	   assertEquals(Content_URL, Exp_URL3);
 	   assertEquals(LearnMore_URL, Exp_URL3);
 		
 	}

     public void Our_products_section4 () throws InterruptedException {
 		
 		WebDriverWait wait1 = new WebDriverWait(driver,30);
  		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
          
  		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(Our_products_image4);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		// click on 1st image 
 		driver.findElement(Our_products_image4).click();
 		Thread.sleep(5000);
 		
 		String Image_URL = driver.getCurrentUrl();
 		System.out.println("URL from image 4 click = " + Image_URL);
 		
 		driver.findElement(logo).click();
 		
 		Thread.sleep(5000);
 		
 		WebElement Element1 = driver.findElement(Our_products_image4);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 		Thread.sleep(3000);
 	// click on 1st context
 	
 		driver.findElement(Our_products_content4).click();
 		Thread.sleep(5000);
 				
 		String Content_URL = driver.getCurrentUrl();
 		System.out.println("URL from Content 4 click = " + Content_URL);
 				
 		driver.findElement(logo).click();
 				
         Thread.sleep(5000);
 		
 		WebElement Element2 = driver.findElement(Our_products_image4);
 		js.executeScript("arguments[0].scrollIntoView();", Element2);
 				
 		Thread.sleep(3000);
 	// click on 1st context
 		
 	   driver.findElement(Our_products_LearnMore4).click();
 	   Thread.sleep(5000);
 					
 	   String LearnMore_URL = driver.getCurrentUrl();
 	   System.out.println("URL from Lear More 4 click = " + Content_URL);
 					
 	   driver.findElement(logo).click();
 					
 	   Thread.sleep(5000);
 		
 	   
 	   
 	   assertEquals(Image_URL, Exp_URL4);
 	   assertEquals(Content_URL, Exp_URL4);
 	   assertEquals(LearnMore_URL, Exp_URL4);
 		
 	}

     public void Our_products_section5 () throws InterruptedException {
 		
 		WebDriverWait wait1 = new WebDriverWait(driver,30);
  		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
          
  		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(Our_products_image5);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		// click on 1st image 
 		driver.findElement(Our_products_image5).click();
 		Thread.sleep(5000);
 		
 		String Image_URL = driver.getCurrentUrl();
 		System.out.println("URL from image 5 click = " + Image_URL);
 		
 		driver.findElement(logo).click();
 		
 		Thread.sleep(5000);
 		
 		WebElement Element1 = driver.findElement(Our_products_image5);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 		Thread.sleep(3000);
 	// click on 1st context
 	
 		driver.findElement(Our_products_content5).click();
 		Thread.sleep(5000);
 				
 		String Content_URL = driver.getCurrentUrl();
 		System.out.println("URL from Content 5 click = " + Content_URL);
 				
 		driver.findElement(logo).click();
 				
         Thread.sleep(5000);
 		
 		WebElement Element2 = driver.findElement(Our_products_image5);
 		js.executeScript("arguments[0].scrollIntoView();", Element2);
 				
 		
 	// click on 1st context
 		Thread.sleep(3000);
 	   driver.findElement(Our_products_LearnMore5).click();
 	   Thread.sleep(5000);
 					
 	   String LearnMore_URL = driver.getCurrentUrl();
 	   System.out.println("URL from Lear More 5 click = " + Content_URL);
 					
 	   driver.findElement(logo).click();
 					
 	   Thread.sleep(5000);
 		
 	   
 	   
 	   assertEquals(Image_URL, Exp_URL5);
 	   assertEquals(Content_URL, Exp_URL5);
 	   assertEquals(LearnMore_URL, Exp_URL5);
 		
 	}
     
     public void Our_products_section6 () throws InterruptedException {
 		
 		WebDriverWait wait1 = new WebDriverWait(driver,30);
  		wait1.until(ExpectedConditions.visibilityOfElementLocated(logo));
          
  		JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element = driver.findElement(Our_products_image6);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		// click on 1st image 
 		driver.findElement(Our_products_image6).click();
 		Thread.sleep(5000);
 		
 		String Image_URL = driver.getCurrentUrl();
 		System.out.println("URL from image 6 click = " + Image_URL);
 		
 		driver.findElement(logo).click();
 		
 		Thread.sleep(5000);
 		
 		WebElement Element1 = driver.findElement(Our_products_image6);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 		Thread.sleep(3000);
 	// click on 1st context
 	
 		driver.findElement(Our_products_content6).click();
 		Thread.sleep(5000);
 				
 		String Content_URL = driver.getCurrentUrl();
 		System.out.println("URL from Content 6 click = " + Content_URL);
 				
 		driver.findElement(logo).click();
 				
         Thread.sleep(5000);
 		
 		WebElement Element2 = driver.findElement(Our_products_image6);
 		js.executeScript("arguments[0].scrollIntoView();", Element2);
 		Thread.sleep(3000);
 		
 	// click on 1st context
 		
 	   driver.findElement(Our_products_LearnMore6).click();
 	   Thread.sleep(5000);
 					
 	   String LearnMore_URL = driver.getCurrentUrl();
 	   System.out.println("URL from Lear More 6 click = " + Content_URL);
 					
 	   driver.findElement(logo).click();
 					
 	   Thread.sleep(5000);
 		
 	   
 	   
 	   assertEquals(Image_URL, Exp_URL6);
 	   assertEquals(Content_URL, Exp_URL6);
 	   assertEquals(LearnMore_URL, Exp_URL6);
 		
 	}

     public void sudHeading () throws InterruptedException {
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
  		WebElement Element = driver.findElement(Our_products_image6);
  		js.executeScript("arguments[0].scrollIntoView();", Element);
  		
  		String subheading1 = driver.findElement(subheading).getText();
  		System.out.println("Sud heading = "+subheading1);
    	 
    	 
     }
     
     public void Our_partners () throws InterruptedException {
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		WebElement Element = driver.findElement(Our_products_image6);
   		js.executeScript("arguments[0].scrollIntoView();", Element);
   		
   		boolean Partner1 = driver.findElement(partner1).isDisplayed();
   		boolean Partner2 = driver.findElement(partner2).isDisplayed();
   		boolean Partner3 = driver.findElement(partner3).isDisplayed();
   		boolean Partner4 = driver.findElement(partner4).isDisplayed();
   		boolean Partner5 = driver.findElement(partner5).isDisplayed();
   		boolean Partner6 = driver.findElement(partner6).isDisplayed();
    	 
   		System.out.println("Partner 1 display = " + Partner1);
   		System.out.println("Partner 2 display = " + Partner2);
   		System.out.println("Partner 3 display = " + Partner3);
   		System.out.println("Partner 4 display = " + Partner4);
   		System.out.println("Partner 5 display = " + Partner5);
   		System.out.println("Partner 6 display = " + Partner6);
   		
     }




}
