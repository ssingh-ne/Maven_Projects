package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WhatWeOffer_page {
	
	WebDriver driver;
	
	public WhatWeOffer_page (WebDriver driver){
		this.driver=driver;
	}

	By whatWeoffer = By.xpath("//*[text()='WHAT WE OFFER']");
	//By logo = By.xpath("//*[@alt='applied-more-to-love']");
	By logo = By.xpath("//*[@alt='Applied More to Love']");
	By contact_US_Dropdown = By.xpath("//*[@id='mui-component-select-help']");
	By Submit_contact = By.xpath("//*[text() = 'Submit']");
	
	
	By Worker_cmpensation_page = By.xpath("(//*[text()='Learn More'])[1]");
	By Worker_cmpensation_page_text = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[2]/h2");
	By Worker_cmpensation_page_text1 = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[1]");
	By Worker_cmpensation_Header = By.xpath("(//li[@role='menuitem'])[1]");
	By Worker_cmpensation_Header_text1 = By.xpath("");
	By Worker_cmpensation_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	
	By TRANSPORTATION_LIABILITY_page = By.xpath("(//*[text()='Learn More'])[2]");
	By TRANSPORTATION_LIABILITY_page_text1 = By.xpath("//*[@id='app']/main/div[3]/div/div/div/div/div[1]");
	By TRANSPORTATION_LIABILITY_page_text2 = By.xpath("");
	By TRANSPORTATION_LIABILITY_Header = By.xpath("(//li[@role='menuitem'])[2]");
	By TRANSPORTATION_LIABILITY_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By TRANSPORTATION_LIABILITY_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	By Contact_US = By.xpath("//*[text()='Contact Us']"); // New contact us section - text capturing
	String ContactUS_text = "Contact Us";
	
	By CONSTRUCTION_P_E_page = By.xpath("(//*[text()='Learn More'])[3]");
	By CONSTRUCTION_P_E_page_text1 = By.xpath("//*[@id='app']/main/div[4]/div/div/div/div/div[1]");
	By CONSTRUCTION_P_E_Header = By.xpath("(//li[@role='menuitem'])[3]");
	By CONSTRUCTION_P_E_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By CONSTRUCTION_P_E_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By HOMEOWNERS_INCLUDING_page = By.xpath("(//*[text()='Learn More'])[4]");
	By HOMEOWNERS_INCLUDING_page_text1 = By.xpath("//*[@id='app']/main/div[5]/div/div/div/div/div[1]");
	By HOMEOWNERS_INCLUDING_page_text2 = By.xpath("//*[@id='app']/main/div[5]/div/div/div/div/div[2]/h2");
	By HOMEOWNERS_INCLUDING_Header = By.xpath("(//li[@role='menuitem'])[4]");
	By HOMEOWNERS_INCLUDING_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By HOMEOWNERS_INCLUDING_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By FINE_ART_COLLECTIBLES_page = By.xpath("(//*[text()='Learn More'])[5]");
	By FINE_ART_COLLECTIBLES_page_text1 = By.xpath("//*[@id='app']/main/div[6]/div/div/div/div/div[1]");
	By FINE_ART_COLLECTIBLES_page_text2 = By.xpath("//*[@id='app']/main/div[6]/div/div/div/div/div[2]/h2");
	By FINE_ART_COLLECTIBLES_Header = By.xpath("(//li[@role='menuitem'])[5]");
	By FINE_ART_COLLECTIBLES_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By FINE_ART_COLLECTIBLES_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By STRUCTURED_INSURANCE_page = By.xpath("(//*[text()='Learn More'])[6]");
	By STRUCTURED_INSURANCE_page_text1 = By.xpath("//*[@id='app']/main/div[7]/div/div/div/div/div[1]");
	By STRUCTURED_INSURANCE_page_text2 = By.xpath("//*[@id='app']/main/div[7]/div/div/div/div/div[2]/h2");
	By STRUCTURED_INSURANCE_Header = By.xpath("(//li[@role='menuitem'])[6]");
	By STRUCTURED_INSURANCE_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By STRUCTURED_INSURANCE_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By FINANCIAL_LINES_page = By.xpath("(//*[text()='Learn More'])[7]");
	By FINANCIAL_LINES_page_text1 = By.xpath("//*[@id='app']/main/div[8]/div/div/div/div/div[1]");
	By FINANCIAL_LINES_page_text2 = By.xpath("//*[@id='app']/main/div[8]/div/div/div/div/div[2]/h2");
	By FINANCIAL_LINES_Header = By.xpath("(//li[@role='menuitem'])[7]");
	By FINANCIAL_LINES_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By FINANCIAL_LINES_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By ENVIRONMENTAL_POLLUTION_page = By.xpath("(//*[text()='Learn More'])[8]");
	By ENVIRONMENTAL_POLLUTION_page_text1 = By.xpath("//*[@id='app']/main/div[9]/div/div/div/div/div[1]");
	By ENVIRONMENTAL_POLLUTION_page_text2 = By.xpath("//*[@id='app']/main/div[9]/div/div/div/div/div[2]/h2");
	By ENVIRONMENTAL_POLLUTION_Header = By.xpath("(//li[@role='menuitem'])[8]");
	By ENVIRONMENTAL_POLLUTION_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By ENVIRONMENTAL_POLLUTION_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By SHARED_LAYERED_PROPERTY_page = By.xpath("(//*[text()='Learn More'])[9]");
	By SHARED_LAYERED_PROPERTY_page_text1 = By.xpath("//*[@id='app']/main/div[10]/div/div/div/div/div[1]");
	By SHARED_LAYERED_PROPERTY_page_text2 = By.xpath("//*[@id='app']/main/div[10]/div/div/div/div/div[2]/h2");
	By SHARED_LAYERED_PROPERTY_Header = By.xpath("(//li[@role='menuitem'])[9]");
	By SHARED_LAYERED_PROPERTY_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By SHARED_LAYERED_PROPERTY_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By FRONTING_PROGRAM_BUSINESS_page = By.xpath("(//*[text()='Learn More'])[10]");
	By FRONTING_PROGRAM_BUSINESS_page_text1 = By.xpath("//*[@id='app']/main/div[11]/div/div/div/div/div[1]");
	By FRONTING_PROGRAM_BUSINESS_page_text2 = By.xpath("//*[@id='app']/main/div[11]/div/div/div/div/div[2]/h2");
	By FRONTING_PROGRAM_BUSINESS_Header = By.xpath("(//li[@role='menuitem'])[10]");
	By FRONTING_PROGRAM_BUSINESS_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By FRONTING_PROGRAM_BUSINESS_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	
	By REINSURANCE_page = By.xpath("(//*[text()='Learn More'])[11]");
	By REINSURANCE_page_text1 = By.xpath("//*[@id='app']/main/div[12]/div/div/div/div/div[1]");
	By REINSURANCE_page_text2 = By.xpath("//*[@id='app']/main/div[12]/div/div/div/div/div[2]/h2");
	//By REINSURANCE_LINES_Header = By.xpath("(//li[@role='menuitem'])[11]");
	By REINSURANCE_LINES_Header = By.xpath("//li[text()='REINSURANCE']");
	By REINSURANCE_LINES_Header_text1 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[1]");
	By REINSURANCE_LINES_Header_text2 = By.xpath("//*[@id='app']/div[2]/div/div/div/div/div[2]/h2");
	By Solution_one_URL = By.xpath("//*[@id='contentBlock2']/p/strong/a");
	By Jumbo_GC_URL = By.xpath("//*[@id='contentBlock4']/p/strong/a");
	By Promesa_URL = By.xpath("//*[@id='contentBlock6']/p/strong/a");
	By Applied_underriters = By.xpath("//*[@id='contentBlock2']/p/a");
	
	By applied_heading = By.xpath("//*[@id='contentBlock0']/h4[2]");
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	 
	 
	public void Heading_one_URL() throws InterruptedException {
		
       Thread.sleep(3000);
		String current_URL = driver.getCurrentUrl();
		driver.findElement(whatWeoffer).click();
	
		// Verify solution 1 URL 
		
		String compensation_header_text = driver.findElement(Worker_cmpensation_Header).getText();
		
		System.out.println("compensation_header_text = " + compensation_header_text);
		
		driver.findElement(Worker_cmpensation_Header).click();
		
		Thread.sleep(5000);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		/*WebElement element = driver.findElement(Solution_one_URL);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();

*/	
		 // Promesa URL
		
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Solution_one_URL);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		  //js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(5000);
			String Promesa_URL1 = driver.findElement(Promesa_URL).getText();
			
			// Convert string in lower case
			String promesa_URL2 = Promesa_URL1.toLowerCase();
			System.out.println("Promesa_URL = " + promesa_URL2);
		
			// capture only promesa from the string
			Thread.sleep(5000);
			String promesa_URL = promesa_URL2.substring(0, 7);
					 
					 
			System.out.println("Promesa_URL = " + promesa_URL);
			
			driver.findElement(Promesa_URL).click();
			Thread.sleep(3000);
			
	        Set<String> handlesSet2 = driver.getWindowHandles();
	        List<String> handlesList2 = new ArrayList<String>(handlesSet2);
	        driver.switchTo().window(handlesList2.get(1));
	        String PromesaURL  =  driver.getCurrentUrl();
	        System.out.println("Promesa URL = " + PromesaURL);
	        driver.close();
	        driver.switchTo().window(handlesList2.get(0));
			
	//	----------------------------------
		
		Thread.sleep(5000);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Solution_one_URL);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		*/ 
		
		String solution_URL1 = driver.findElement(Solution_one_URL).getText();
		
		String solution_URL = solution_URL1.toLowerCase();
		
		System.out.println("solution_URL = " + solution_URL);
		Thread.sleep(5000);
		driver.findElement(Solution_one_URL).click();
		Thread.sleep(3000);
		
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
       String Sol1URL  =  driver.getCurrentUrl();
       System.out.println("Solution1 URL = " + Sol1URL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
		
        Thread.sleep(3000);
        
        // Jumbo GC URL
        
       /* WebElement element1 = driver.findElement(Jumbo_GC_URL);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element1);
		actions1.perform();*/
		        
		 WebElement Element1 = driver.findElement(Jumbo_GC_URL);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		
		String jumbo_URL1 = driver.findElement(Jumbo_GC_URL).getText();
		
		String jumbo_URL = jumbo_URL1.toLowerCase();
		
		System.out.println("jumbo_URL = " + jumbo_URL);
		
		driver.findElement(Jumbo_GC_URL).click();
		Thread.sleep(3000);
		
        Set<String> handlesSet1 = driver.getWindowHandles();
        List<String> handlesList1 = new ArrayList<String>(handlesSet1);
        driver.switchTo().window(handlesList1.get(1));
        String jumboURL  =  driver.getCurrentUrl();
        System.out.println("Jumbo URL = " + jumboURL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
		
        Thread.sleep(3000);
        
       
        
        /*WebElement element2 = driver.findElement(Promesa_URL);
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(element2);
		actions2.perform();
		*/

      /*  js.executeScript("arguments[0].scrollIntoView();", Element);
		
		String Promesa_URL1 = driver.findElement(Promesa_URL).getText();
		
		// Convert string in lower case
		String promesa_URL2 = Promesa_URL1.toLowerCase();
		System.out.println("Promesa_URL = " + promesa_URL2);
	
		// capture only promesa from the string
		
		String promesa_URL = promesa_URL2.substring(0, 7);
				 
				 
		System.out.println("Promesa_URL = " + promesa_URL);
		
		driver.findElement(Promesa_URL).click();
		Thread.sleep(3000);
		
        Set<String> handlesSet2 = driver.getWindowHandles();
        List<String> handlesList2 = new ArrayList<String>(handlesSet2);
        driver.switchTo().window(handlesList2.get(1));
        String PromesaURL  =  driver.getCurrentUrl();
        System.out.println("Promesa URL = " + PromesaURL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
		
        Thread.sleep(3000);*/
        
       /* Actions  actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_UP).build().perform();*/
      /*  WebElement Element2 = driver.findElement(logo);
        js.executeScript("arguments[0].scrollIntoView();", Element2);
        
		driver.findElement(logo).click();*/
        
        driver.get(current_URL);
        
        
        assertTrue(Sol1URL.contains(solution_URL));
        assertTrue(jumboURL.contains(jumbo_URL));
        assertTrue(PromesaURL.contains(promesa_URL));
    
	}
	
     public void Heading_Three_URL () throws InterruptedException {
	
    	 Thread.sleep(3000);
    	 /*
    	 WebElement element = driver.findElement(whatWeoffer);
 		Actions actions = new Actions(driver);
 		actions.moveToElement(element);
 		actions.perform();*/
    	 
    	/* WebElement Element = driver.findElement(whatWeoffer);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		*/
 		
 		driver.findElement(whatWeoffer).click();
 		
         String Header_heading_Text = driver.findElement(CONSTRUCTION_P_E_Header).getText(); 
 		
 		System.out.println("Header Heading text = " + Header_heading_Text);
 		
 	    driver.findElement(CONSTRUCTION_P_E_Header).click();
 		
 	    Thread.sleep(5000);
 		
        String Heading_header_text = driver.findElement(CONSTRUCTION_P_E_Header_text1).getText();
 		
 		System.out.println("compensation_header_text2 = " + Heading_header_text);
 		
 		String compensation_header_URL = driver.getCurrentUrl();
 		
 		System.out.println("compensation_header_URL = " + compensation_header_URL);
 		
 		Thread.sleep(6000);
 		
 		/*WebElement element1 = driver.findElement(Applied_underriters);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element1);
		actions1.perform();*/
 		
 		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(applied_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		 Thread.sleep(5000);
		String solution_URL1 = driver.findElement(Applied_underriters).getText();
		
		String solution_URL2 = solution_URL1.toLowerCase();
		System.out.println("solution_URL2 = " + solution_URL2);
		String solution_URL = solution_URL2.substring(8, 17);
		 
		
		System.out.println("solution_URL = " + solution_URL);
		
		driver.findElement(Applied_underriters).click();
		Thread.sleep(3000);
		
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
       String Applied_underritersURL  =  driver.getCurrentUrl();
       System.out.println("Applied_underriters URL = " + Applied_underritersURL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
		
        Thread.sleep(3000);
        
        assertTrue(Applied_underritersURL.contains(solution_URL));
     }
	
	
    	public void  Heading_one () throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
		String compensation_header_text = driver.findElement(Worker_cmpensation_Header).getText();
		
		System.out.println("compensation_header_text = " + compensation_header_text);
		
		driver.findElement(Worker_cmpensation_Header).click();
		
		Thread.sleep(5000);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
			 Actions  actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_UP).build().perform();
			
			Thread.sleep(3000);
			driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(Worker_cmpensation_page_text1).getText();
		
		driver.findElement(Worker_cmpensation_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, compensation_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
		assertEquals(Contactus_text, "Contact Us");
		
		 
	}
	
	
   public void  Heading_two () throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
		String Header_heading_Text = driver.findElement(TRANSPORTATION_LIABILITY_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(TRANSPORTATION_LIABILITY_Header).click();
		
		Thread.sleep(5000);
		
        String Heading_header_text = driver.findElement(TRANSPORTATION_LIABILITY_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
				
		Thread.sleep(5000);
				
		String Contactus_text = driver.findElement(Contact_US).getText();
				
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		Actions  actions = new Actions(driver);
				
		actions.sendKeys(Keys.PAGE_UP).build().perform();
				
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(TRANSPORTATION_LIABILITY_page_text1).getText();
		
		System.out.println("TRANSPORTATION_LIABILITY Page = " + WorkerCompensation_page);
		
		driver.findElement(TRANSPORTATION_LIABILITY_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		//assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, ContactUS_text);
		assertEquals(Contactus_text, "Contact Us"); 
	}
	
   public void  Heading_three () throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
        String Header_heading_Text = driver.findElement(CONSTRUCTION_P_E_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
	    driver.findElement(CONSTRUCTION_P_E_Header).click();
		
	    Thread.sleep(5000);
		
       String Heading_header_text = driver.findElement(CONSTRUCTION_P_E_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(CONSTRUCTION_P_E_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(CONSTRUCTION_P_E_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		//assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
		//assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
   }

   public void  Heading_four () throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
       String Header_heading_Text = driver.findElement(HOMEOWNERS_INCLUDING_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(HOMEOWNERS_INCLUDING_Header).click();
		
		Thread.sleep(5000);
		
        String Heading_header_text = driver.findElement(HOMEOWNERS_INCLUDING_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(HOMEOWNERS_INCLUDING_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(HOMEOWNERS_INCLUDING_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
		//assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
	
  }

   public void  Heading_five () throws InterruptedException {
	   
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
	   String Header_heading_Text = driver.findElement(FINE_ART_COLLECTIBLES_Header).getText(); 
			
	   System.out.println("Header Heading text = " + Header_heading_Text);
			
		driver.findElement( FINE_ART_COLLECTIBLES_Header).click();
		
		Thread.sleep(5000);
		
        String Heading_header_text = driver.findElement(FINE_ART_COLLECTIBLES_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				 
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(FINE_ART_COLLECTIBLES_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(FINE_ART_COLLECTIBLES_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
		}

   public void  Heading_six () throws InterruptedException {
	   
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
		String Header_heading_Text = driver.findElement(STRUCTURED_INSURANCE_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
			
		driver.findElement(STRUCTURED_INSURANCE_Header).click();
		
		Thread.sleep(5000);
		
       String Heading_header_text = driver.findElement(STRUCTURED_INSURANCE_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(STRUCTURED_INSURANCE_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(STRUCTURED_INSURANCE_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
		
		}

   public void  Heading_seven () throws InterruptedException {
	   
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
       
		String Header_heading_Text = driver.findElement(FINANCIAL_LINES_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(FINANCIAL_LINES_Header).click();
		
		Thread.sleep(5000);
		
      String Heading_header_text = driver.findElement(FINANCIAL_LINES_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(FINANCIAL_LINES_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(FINANCIAL_LINES_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
		
}


   public void  Heading_eight () throws InterruptedException {
	   
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
        String Header_heading_Text = driver.findElement(ENVIRONMENTAL_POLLUTION_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(ENVIRONMENTAL_POLLUTION_Header).click();
		
		Thread.sleep(5000);
		
        String Heading_header_text = driver.findElement(ENVIRONMENTAL_POLLUTION_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(ENVIRONMENTAL_POLLUTION_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(ENVIRONMENTAL_POLLUTION_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
		//assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
		
}

   public void  Heading_nine () throws InterruptedException {
	  
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
        String Header_heading_Text = driver.findElement(SHARED_LAYERED_PROPERTY_Header).getText(); 
		
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		
		driver.findElement(SHARED_LAYERED_PROPERTY_Header).click();
		
		Thread.sleep(5000);
		
       String Heading_header_text = driver.findElement(SHARED_LAYERED_PROPERTY_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(SHARED_LAYERED_PROPERTY_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(SHARED_LAYERED_PROPERTY_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
}

   public void  Heading_ten () throws InterruptedException {
		  
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
		 String Header_heading_Text = driver.findElement(FRONTING_PROGRAM_BUSINESS_Header).getText(); 
			
			System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(FRONTING_PROGRAM_BUSINESS_Header).click();
		
		Thread.sleep(5000);
		
       String Heading_header_text = driver.findElement(FRONTING_PROGRAM_BUSINESS_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(FRONTING_PROGRAM_BUSINESS_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(FRONTING_PROGRAM_BUSINESS_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
	//	assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
}

   public void  Heading_eleven () throws InterruptedException {
		  
	   Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		  Thread.sleep(10000);

		String Header_heading_Text = driver.findElement(REINSURANCE_LINES_Header).getText(); 
			
		System.out.println("Header Heading text = " + Header_heading_Text);
		
		driver.findElement(REINSURANCE_LINES_Header).click();
		
		Thread.sleep(10000);
		
        String Heading_header_text = driver.findElement(REINSURANCE_LINES_Header_text1).getText();
		
		System.out.println("compensation_header_text2 = " + Heading_header_text);
		
		String compensation_header_URL = driver.getCurrentUrl();
		
		System.out.println("compensation_header_URL = " + compensation_header_URL);
		
		Thread.sleep(3000);
		
		// Contact Us drop down 
		
		/*WebElement element = driver.findElement(Submit_contact);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(Contact_US);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		
		Thread.sleep(5000);
		String Contactus_text = driver.findElement(Contact_US).getText();
		
		System.out.println("ContactUS_text = " + Contactus_text);
				
		Thread.sleep(3000);
				
		// go back to the home page 
		 Actions  actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(logo).click();
		
		Thread.sleep(5000);
		
		String WorkerCompensation_page = driver.findElement(REINSURANCE_page_text1).getText();
		
		System.out.println("Heading_from_page = " + WorkerCompensation_page);
		
		driver.findElement(REINSURANCE_page).click();
		
		Thread.sleep(5000);
		
		String compensation_Page_URL = driver.getCurrentUrl();
		System.out.println("compensation_Page_URL = " + compensation_Page_URL);
		
		assertEquals(WorkerCompensation_page, Heading_header_text);
		assertEquals(compensation_header_URL, compensation_Page_URL);
		//assertEquals(Contactus_text, Header_heading_Text);
		assertEquals(Contactus_text, "Contact Us");
		
}


}
