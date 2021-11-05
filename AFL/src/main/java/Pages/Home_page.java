package Pages;

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
import org.testng.Assert;

public class Home_page {
	
	WebDriver driver;
	

	By About_button = By.xpath("//a[text()='About Us']");
	By ContactUs_btn_header = By.xpath("//a[text()='Contact Us']");
	By ContactUs_btn = By.xpath("(//*[text()='Contact Us'])[2]");
	By WhatWeOffer = By.xpath("(//*[@class='MuiButton-label'])[1]");
	
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By CA_Privacy_Note = By.xpath("//*[text()='CA Privacy Notice']");
	By Legal_Notice = By.xpath("//*[text()='Legal Notice']");
	By Complaints_Procedure = By.xpath("//*[text()='Complaints Procedure']");
	
	
	By AFL_Logo = By.xpath("//*[@href='/']");
	By Cookies_Agree_button = By.xpath("//*[text()='I Agree']");
	By Language = By.xpath("(//*[@class='MuiButton-label'])[2]");
	By Francis = By.xpath("//*[text()='Français']");
	By Deutsch = By.xpath("//*[text()='Deutsch']");
	By English = By.xpath("//*[text()='English']");
	By Quote = By.xpath("//*[@id='contentBlock1']/h2");
	By Quote_author = By.xpath( "//*[@id='contentBlock1']/h6");
	
	By MoreOffer_heading1 = By.xpath("//*[@id='app']/main/div[5]/div/div[1]/a/div/div/div/p");
	By MoreOffer_heading2 = By.xpath("//*[@id='app']/main/div[5]/div/div[2]/a/div/div/div/p");
	By MoreOffer_heading3 = By.xpath("//*[@id='app']/main/div[5]/div/div[3]/a/div/div/div/p");
	By Tab_pageText       = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h1");
	By MoreOffer1_image   = By.xpath("//*[@id='app']/main/div[5]/div/div[1]/a/div/img");
	By MoreOffer2_image   = By.xpath("//*[@id='app']/main/div[5]/div/div[2]/a/div/img");
	By MoreOffer3_image   = By.xpath("//*[@id='app']/main/div[5]/div/div[3]/a/div/img");
 	By Learn_more1 = By.xpath("(//*[text()='Learn More'])[2]");
 	By Learn_more2 = By.xpath("(//*[text()='Learn More'])[3]");
 	By Learn_more3 = By.xpath("(//*[text()='Learn More'])[4]");
 	By content_load= By.xpath("(//*[@id='contentBlock0']/h4)[1]");
 	
    String Header_About_US =  "https://afl.auw.com/about-us";
    String Header_About_US_dev =  "https://develop--applied-financial-lines.netlify.app/about-us";
    String Header_Contact_US =  "https://afl.auw.com/contact-us";
    String Header_Contact_US_dev =  "https://develop--applied-financial-lines.netlify.app/contact-us";
    String EXP_Legal_Notice = "https://afl.auw.com/legal-notice";
    String EXP_Legal_Notice_dev = "https://develop--applied-financial-lines.netlify.app/legal-notice";
    String EXP_ComplaintsProcedure = "https://afl.auw.com/complaints-procedure";
    String EXP_ComplaintsProcedure_dev = "https://develop--applied-financial-lines.netlify.app/complaints-procedure";
	String EXP_Privacy_Url = "https://afl.auw.com/privacy-policy";
	String EXP_Privacy_Url_dev = "https://develop--applied-financial-lines.netlify.app/privacy-policy";
	String EXP_CA_Privacy_Url = "https://afl.auw.com/ca-privacy-notice";
	String EXP_CA_Privacy_Url_dev = "https://develop--applied-financial-lines.netlify.app/ca-privacy-notice";
	//String EXP_Privacy_Url_dev = "https://develop--auw.netlify.app/privacy-policy";
	//String EXP_CA_Privacy_Url_dev = "https://develop--auw.netlify.app/ca-privacy-notice";
	String Eng_url = "https://afl.auw.com/?lang=en-us";
	String Eng_url_dev = "https://develop--applied-financial-lines.netlify.app/?lang=en-us";
	String Fr_url = "https://afl.auw.com/?lang=fr-fr";
	String Fr_url_dev = "https://develop--applied-financial-lines.netlify.app/?lang=fr-fr";
	String Du_url = "https://afl.auw.com/?lang=de-de";
	String Du_url_dev = "https://develop--applied-financial-lines.netlify.app/?lang=de-de";
	String Quote_text = "Applied Financial Lines is bringing a powerful proposition to the European and Mideast Financial Lines markets—much-needed, first-rate capacity combined with a stellar team of underwriters.";
	String Quote_author_text = "JEROEN CLAESEN – PRESIDENT & CUO, APPLIED FINANCIAL LINES";
	
	
	public Home_page (WebDriver driver){
		this.driver=driver;
	}
	
	public void Content_load() throws InterruptedException {
    	
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(content_load);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		
   	Thread.sleep(5000);
   	
   	boolean s = driver.findElement(content_load).isDisplayed();
   	
   	System.out.println("Content load and display"+ s);
   }

	 public void  Cookies () throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Cookies_Agree_button);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(Cookies_Agree_button).click();
		 
	 }

	 public void	About_US_header() throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(About_button);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 driver.findElement(About_button).click();
		 
		 Thread.sleep(3000);
		 
		 String URL = driver.getCurrentUrl();
		 System.out.println("About Us URL = " + URL);
		 
		 driver.findElement(AFL_Logo).click();
		 
		 assertEquals(URL,Header_About_US );
	 }
	 
     public void	About_US_header_dev() throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(About_button);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 driver.findElement(About_button).click();
		 
		 Thread.sleep(3000);
		 
		 String URL = driver.getCurrentUrl();
		 System.out.println("About Us URL = " + URL);
		 
		 driver.findElement(AFL_Logo).click();
		 
		 assertEquals(URL,Header_About_US_dev );
	 }
	 
	 public void  PrivacyPolicy () throws InterruptedException {
          // Privacy policy 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(PrivacyPolicy);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
	      
		 Thread.sleep(5000);
		 
 		 driver.findElement(PrivacyPolicy).click();
 		 Thread.sleep(5000);
 		 Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
         String PrivacyURL =  driver.getCurrentUrl();
         System.out.println("Privacy Policy URL = " + PrivacyURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
 		
 		WebDriverWait wait = new WebDriverWait(driver,30);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
 		 
 		driver.findElement(AFL_Logo).click();
 		
 		assertEquals(PrivacyURL, EXP_Privacy_Url);
	 }
	 
	 public void  PrivacyPolicy_dev () throws InterruptedException {
         // Privacy policy 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(PrivacyPolicy);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
	      
		 Thread.sleep(5000);
		 
		 driver.findElement(PrivacyPolicy).click();
		 Thread.sleep(5000);
		 Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        String PrivacyURL =  driver.getCurrentUrl();
        System.out.println("Privacy Policy URL = " + PrivacyURL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
		 
		driver.findElement(AFL_Logo).click();
		
		assertEquals(PrivacyURL, EXP_Privacy_Url_dev);
	 }
	 
	 public void  CA_PrivacyPolicy_dev () throws InterruptedException {
			// CA Privacy Note 
		 		
		 		WebDriverWait wait1 = new WebDriverWait(driver,30);
		 		wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
		         
		 		 Thread.sleep(5000);
		 		JavascriptExecutor js = (JavascriptExecutor) driver;
				 //js.executeScript("window.scrollBy(0,1000)");
				 WebElement Element = driver.findElement(CA_Privacy_Note);
				 js.executeScript("arguments[0].scrollIntoView();", Element);
			      
				 Thread.sleep(5000);
				 
		 		 
		 		 driver.findElement(CA_Privacy_Note).click();
		 		 Thread.sleep(5000);
		 		 
		 		WebDriverWait wait2 = new WebDriverWait(driver,30);
		 		wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
		 		
		 		 String CA_PrivacyURL =  driver.getCurrentUrl();
		         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
		 		
		 		driver.findElement(AFL_Logo).click();
		 		
		 		assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url_dev);
		 }
	 
	 public void  CA_PrivacyPolicy () throws InterruptedException {
		// CA Privacy Note 
	 		
	 		WebDriverWait wait1 = new WebDriverWait(driver,30);
	 		wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	         
	 		 Thread.sleep(5000);
	 		JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollBy(0,1000)");
			 WebElement Element = driver.findElement(CA_Privacy_Note);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
		      
			 Thread.sleep(5000);
			 
	 		 
	 		 driver.findElement(CA_Privacy_Note).click();
	 		 Thread.sleep(5000);
	 		 
	 		WebDriverWait wait2 = new WebDriverWait(driver,30);
	 		wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	 		
	 		 String CA_PrivacyURL =  driver.getCurrentUrl();
	         System.out.println("CA Privacy Policy URL =  " + CA_PrivacyURL);
	 		
	 		driver.findElement(AFL_Logo).click();
	 		
	 		assertEquals(CA_PrivacyURL, EXP_CA_Privacy_Url);
	 }
	 
	 public void Legal_Notice_footer () throws InterruptedException {
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,30);
	 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	         
	 	 Thread.sleep(5000);
	 	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollBy(0,1000)");
	     WebElement Element = driver.findElement(Legal_Notice);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		      
		  Thread.sleep(5000);
			 
	 	 driver.findElement(Legal_Notice).click();
	 	 Thread.sleep(5000);
	 		 
	 	 WebDriverWait wait2 = new WebDriverWait(driver,30);
	 	 wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	 		
	 	 String LegalNotice_URL =  driver.getCurrentUrl();
	     System.out.println("Legal Notice URL =  " + LegalNotice_URL);
	 		
	 	driver.findElement(AFL_Logo).click();
	 	
	 	assertEquals(LegalNotice_URL, EXP_Legal_Notice);
	 	 
	 }
	 
     public void Legal_Notice_footer_dev () throws InterruptedException {
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,30);
	 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	         
	 	 Thread.sleep(5000);
	 	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollBy(0,1000)");
	     WebElement Element = driver.findElement(Legal_Notice);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		      
		  Thread.sleep(5000);
			 
	 	 driver.findElement(Legal_Notice).click();
	 	 Thread.sleep(5000);
	 		 
	 	 WebDriverWait wait2 = new WebDriverWait(driver,30);
	 	 wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	 		
	 	 String LegalNotice_URL =  driver.getCurrentUrl();
	     System.out.println("Legal Notice URL =  " + LegalNotice_URL);
	 		
	 	driver.findElement(AFL_Logo).click();
	 	
	 	assertEquals(LegalNotice_URL, EXP_Legal_Notice_dev);
	 	 
	 }

     public void Complaints_Procedure_footer () throws InterruptedException {
    	
    	 WebDriverWait wait1 = new WebDriverWait(driver,30);
	 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	         
	 	 Thread.sleep(5000);
	 	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollBy(0,1000)");
	     WebElement Element = driver.findElement(Complaints_Procedure);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		      
		  Thread.sleep(5000);
			 
	 	 driver.findElement(Complaints_Procedure).click();
	 	 Thread.sleep(5000);
	 		 
	 	 WebDriverWait wait2 = new WebDriverWait(driver,30);
	 	 wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	 		
	 	 String Compliance_URL =  driver.getCurrentUrl();
	     System.out.println("Compliance URL =  " + Compliance_URL);
	 		
	 	driver.findElement(AFL_Logo).click();
		 
    	assertEquals(Compliance_URL, EXP_ComplaintsProcedure);
		 
	 }
	 
     public void Complaints_Procedure_footer_dev () throws InterruptedException {
    	
    	 WebDriverWait wait1 = new WebDriverWait(driver,30);
	 	 wait1.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	         
	 	 Thread.sleep(5000);
	 	 JavascriptExecutor js = (JavascriptExecutor) driver;
			 //js.executeScript("window.scrollBy(0,1000)");
	     WebElement Element = driver.findElement(Complaints_Procedure);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		      
		  Thread.sleep(5000);
			 
	 	 driver.findElement(Complaints_Procedure).click();
	 	 Thread.sleep(5000);
	 		 
	 	 WebDriverWait wait2 = new WebDriverWait(driver,30);
	 	 wait2.until(ExpectedConditions.visibilityOfElementLocated(AFL_Logo));
	 		
	 	 String Compliance_URL =  driver.getCurrentUrl();
	     System.out.println("Compliance URL =  " + Compliance_URL);
	 		
	 	driver.findElement(AFL_Logo).click();
		 
    	assertEquals(Compliance_URL, EXP_ComplaintsProcedure_dev);
		 
	 }
	  
	 public void ContactUs_Header () throws InterruptedException {
		 
			// Click on Contact Us button
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs_btn_header));
				
		driver.findElement(ContactUs_btn_header).click();
			    
		Thread.sleep(3000);
				 
		String URL = driver.getCurrentUrl();
		
		System.out.println("Contact Us URL = " + URL);
				 
		driver.findElement(AFL_Logo).click();
				 
		assertEquals(URL,Header_Contact_US);
	
	 }
	
	 public void ContactUs_Header_dev () throws InterruptedException {
		 
			// Click on Contact Us button
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs_btn_header));
				
		driver.findElement(ContactUs_btn_header).click();
			    
		Thread.sleep(3000);
				 
		String URL = driver.getCurrentUrl();
		
		System.out.println("Contact Us URL = " + URL);
				 
		driver.findElement(AFL_Logo).click();
				 
		assertEquals(URL,Header_Contact_US_dev);
	
	 }
	 
	 public void ContactUs_Btn () throws InterruptedException {
		 
			// Click on Contact Us button at bottom of screen
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(ContactUs_btn);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
				
		driver.findElement(ContactUs_btn).click();
		
		Thread.sleep(3000);
		 
		String URL = driver.getCurrentUrl();
		
		System.out.println("Bottom Contact Us URL = " + URL);
				 
		driver.findElement(AFL_Logo).click();
				 
		assertEquals(URL,Header_Contact_US);
		
	 }
	 
	 public void ContactUs_Btn_dev () throws InterruptedException {
		 
			// Click on Contact Us button at bottom of screen
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(ContactUs_btn);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		
		 Thread.sleep(3000);
		driver.findElement(ContactUs_btn).click();
		
		Thread.sleep(3000);
		 
		String URL = driver.getCurrentUrl();
		
		System.out.println("Bottom Contact Us URL = " + URL);
				 
		driver.findElement(AFL_Logo).click();
				 
		assertEquals(URL,Header_Contact_US_dev);
		
	 }	  
			 
	 public void Language_DropDown () throws InterruptedException {
		 
           // Click on Language button
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(Language));
		 
			String Lag1 = driver.findElement(Language).getText();
			
			System.out.println("Default selected language is  = "+Lag1);
			
			driver.findElement(Language).click(); // Default language is English
			
			String Eng_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + Eng_URL);
			// change language to France 
			Thread.sleep(3000);
			driver.findElement(Francis).click();
			String Lag2 = driver.findElement(Francis).getText();
			System.out.println("Selected language is  = "+Lag2);
			String France_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + France_URL);
			
			// Change to Deutsch
			Thread.sleep(3000);
			driver.findElement(Language).click();
			
			driver.findElement(Deutsch).click();
			String Lag3 = driver.findElement(Deutsch).getText();
			System.out.println("Selected language is  = "+Lag3);
			String Dutch_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + Dutch_URL);
			
			Thread.sleep(3000);
			driver.findElement(Language).click();
			
			driver.findElement(English).click();
			
			Thread.sleep(3000);
			
		    assertEquals(Eng_URL, Eng_url);
		    assertEquals(France_URL, Fr_url);
		    assertEquals(Dutch_URL, Du_url);
	 }
	 
	 public void Language_DropDown_dev () throws InterruptedException {
		 
         // Click on Language button
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(Language));
		 
			String Lag1 = driver.findElement(Language).getText();
			
			System.out.println("Default selected language is  = "+Lag1);
			
			driver.findElement(Language).click(); // Default language is English
			
			String Eng_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + Eng_URL);
			// change language to France 
			Thread.sleep(3000);
			driver.findElement(Francis).click();
			String Lag2 = driver.findElement(Francis).getText();
			System.out.println("Selected language is  = "+Lag2);
			String France_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + France_URL);
			
			// Change to Deutsch
			Thread.sleep(3000);
			driver.findElement(Language).click();
			
			driver.findElement(Deutsch).click();
			String Lag3 = driver.findElement(Deutsch).getText();
			System.out.println("Selected language is  = "+Lag3);
			String Dutch_URL = driver.getCurrentUrl();
			System.out.println("URL when selected language is english = " + Dutch_URL);
			
			Thread.sleep(3000);
			driver.findElement(Language).click();
			
			driver.findElement(English).click();
			
			Thread.sleep(3000);
			
		    assertEquals(Eng_URL, Eng_url_dev);
		    assertEquals(France_URL, Fr_url_dev);
		    assertEquals(Dutch_URL, Du_url_dev);
	 }
	 
     public void Quote ()  throws InterruptedException {
    	
      JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement Element = driver.findElement(Quote);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	      
	  Thread.sleep(2000);
	  
	  String quote = driver.findElement(Quote).getText();
	  String quote_Author = driver.findElement(Quote_author).getText();
	  
	  System.out.println("Quote for outside US = " + quote);
	  System.out.println("Quote Author for out side US = " + quote_Author);
	  
	  assertEquals(quote, Quote_text);
	  assertEquals(quote_Author, Quote_author_text);
	  	  
    }

     public void Header() {
		 
 		// Click on Login button
 			
 	WebDriverWait wait = new WebDriverWait(driver,30);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(About_button));
 				
 	boolean About_Button = driver.findElement(About_button).isDisplayed();
 	boolean WhatweOffer_Button = driver.findElement(WhatWeOffer).isDisplayed();
 	boolean Contact_Button = driver.findElement(ContactUs_btn_header).isDisplayed();
 	boolean Language_Button = driver.findElement(Language).isDisplayed();
 	boolean AUW_LOGO = driver.findElement(AFL_Logo).isDisplayed();
 	
 	System.out.println("Header options visible - AboutUS = " + About_Button+", Contact_Button = " + Contact_Button + ", WhatweOffer_Button = "+ WhatweOffer_Button + ", AboutUs_Button = "+ Language_Button + ", AUW_Logo = "+ AUW_LOGO);
 	System.out.println("Header is visible");
 		 
 	 }
     
     public void Moreoffers () throws InterruptedException {
    	 
    		Home_page h = new Home_page(driver);
    	// More offer section - 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
 		WebElement Element1 = driver.findElement(MoreOffer_heading1);
 		js.executeScript("arguments[0].scrollIntoView();", Element1);
 			
 			Thread.sleep(2000);
 		
 	    String More_heading1 = driver.findElement(MoreOffer_heading1).getText();
 	    
 	    System.out.println("More_heading1 = " + More_heading1);
 	    
 	// Click on Heading
 	    
 	    driver.findElement(MoreOffer_heading1).click();
 	    
 	    Thread.sleep(3000);
 	    h.Header();
         String Moreheading1_pageText = driver.findElement(Tab_pageText).getText();
 		
 		System.out.println("More offer heading one = " + Moreheading1_pageText);
 	    
 		Assert.assertTrue(Moreheading1_pageText.contains(More_heading1),"Failure message") ;
 		
 	//  click on Image
 		
 	    WebElement Element2 = driver.findElement(WhatWeOffer);
 		js.executeScript("arguments[0].scrollIntoView();", Element2);
 		driver.findElement(AFL_Logo).click();
 		
 		Thread.sleep(2000);
 		h.Header();
 		WebElement Element3 = driver.findElement(MoreOffer_heading1);
 		js.executeScript("arguments[0].scrollIntoView();", Element3);
 			
 		Thread.sleep(2000);
 		
 	    driver.findElement(MoreOffer1_image).click();
 	    Thread.sleep(2000);
 	    h.Header();
         String Moreheading1_ImagepageText = driver.findElement(Tab_pageText).getText();
 		
 		System.out.println("More offer heading from image = " + Moreheading1_ImagepageText);
 	    
 	//	assertEquals(, More_heading1);
 		
 		Assert.assertTrue(Moreheading1_ImagepageText.contains(More_heading1),"Failure message") ;
 	    
    // Click on Learn more
 		
 	    WebElement Element4 = driver.findElement(WhatWeOffer);
 		js.executeScript("arguments[0].scrollIntoView();", Element4);
 		driver.findElement(AFL_Logo).click();
 		
 		Thread.sleep(2000);
 		
 		h.Header();
 		WebElement Element5 = driver.findElement(MoreOffer_heading1);
 		js.executeScript("arguments[0].scrollIntoView();", Element5);
 			
 		Thread.sleep(2000);
 		
 	    driver.findElement(Learn_more1).click();
 	    Thread.sleep(2000);
 	    h.Header();
         String Moreheading1_LearnMore_Text = driver.findElement(Tab_pageText).getText();
 		
 		System.out.println("More offer heading from LearnMore = " + Moreheading1_LearnMore_Text);
 	    
 		Assert.assertTrue(Moreheading1_LearnMore_Text.contains(More_heading1),"Failure message") ;
 		
 // -----------------------------------
  // Click on Heading 2 in More offers 
 		    WebElement Element6 = driver.findElement(WhatWeOffer);
 			js.executeScript("arguments[0].scrollIntoView();", Element6);
 			
 			driver.findElement(AFL_Logo).click();
 	 		
            Thread.sleep(2000);
 			h.Header();
 			WebElement Element7 = driver.findElement(MoreOffer_heading2);
 			js.executeScript("arguments[0].scrollIntoView();", Element7);
 				
 			Thread.sleep(2000);

 		    String More_heading2 = driver.findElement(MoreOffer_heading1).getText();
 		    
 		    System.out.println("More_heading1 = " + More_heading2);
 		    
 		    driver.findElement(MoreOffer_heading2).click();
 		    Thread.sleep(2000);
 		    h.Header();
 	        String Moreheading2_headingText = driver.findElement(Tab_pageText).getText();
 			
 			System.out.println("More offer heading 2 from image = " + Moreheading2_headingText);
 		
 	//  click on Image
 			
 		    WebElement Element8 = driver.findElement(WhatWeOffer);
 			js.executeScript("arguments[0].scrollIntoView();", Element8);
 			driver.findElement(AFL_Logo).click();
 			Thread.sleep(2000);
 			h.Header();
 			WebElement Element9 = driver.findElement(MoreOffer_heading2);
 			js.executeScript("arguments[0].scrollIntoView();", Element9);
 				
 			Thread.sleep(2000);
 			
 		    driver.findElement(MoreOffer2_image).click();
 		    Thread.sleep(2000);
 		    h.Header();
 	        String Moreheading2_ImagepageText = driver.findElement(Tab_pageText).getText();
 			
 			System.out.println("More offer heading 2 from image = " + Moreheading2_ImagepageText);
 		
 	// Click on Learn more
 			
 		    WebElement Element10 = driver.findElement(WhatWeOffer);
 			js.executeScript("arguments[0].scrollIntoView();", Element10);
 			
 			driver.findElement(AFL_Logo).click();
 	 		
 			Thread.sleep(2000);
 			h.Header();
 			WebElement Element11 = driver.findElement(MoreOffer_heading2);
 			js.executeScript("arguments[0].scrollIntoView();", Element11);
 				
 			Thread.sleep(2000);
 			
 		    driver.findElement(Learn_more2).click();
 		    Thread.sleep(2000);
 		    h.Header();
 	        String Moreheading2_LearnMore_Text = driver.findElement(Tab_pageText).getText();
 			
 			System.out.println("More offer heading 2 from LearnMore = " + Moreheading2_LearnMore_Text);
 		    
 			Assert.assertTrue(Moreheading2_LearnMore_Text.contains(More_heading2),"Failure message") ;
 			
 	// ------------	
 	// Click on Heading 3 in More offers 
 			
		    WebElement Element15 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element15);
			
			driver.findElement(AFL_Logo).click();
	 		
        Thread.sleep(2000);
			h.Header();
			WebElement Element12 = driver.findElement(MoreOffer_heading3);
			js.executeScript("arguments[0].scrollIntoView();", Element12);
				
			Thread.sleep(2000);

		    String More_heading3 = driver.findElement(MoreOffer_heading3).getText();
		    
		    System.out.println("More_heading3 = " + More_heading3);
		    
		    driver.findElement(MoreOffer_heading3).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading3_headingText = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 3 = " + Moreheading3_headingText);
		
	// click on Image
			
		    WebElement Element13 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element13);
			driver.findElement(AFL_Logo).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element14 = driver.findElement(MoreOffer_heading3);
			js.executeScript("arguments[0].scrollIntoView();", Element14);
				
			Thread.sleep(2000);
			
		    driver.findElement(MoreOffer3_image).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading3_ImagepageText = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 3 from image = " + Moreheading3_ImagepageText);
		
	// Click on Learn more
			
		    WebElement Element16 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element16);
			
			driver.findElement(AFL_Logo).click();
	 		
			Thread.sleep(2000);
			h.Header();
			WebElement Element17 = driver.findElement(MoreOffer_heading3);
			js.executeScript("arguments[0].scrollIntoView();", Element17);
				
			Thread.sleep(2000);
			
		    driver.findElement(Learn_more3).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading3_LearnMore_Text = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 3 from Learn More = " + Moreheading3_LearnMore_Text);
			
			Assert.assertTrue(Moreheading3_LearnMore_Text.contains(Moreheading3_headingText),"Failure message") ;

 			
    	 
     }
}
