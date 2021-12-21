package AUW_Pages;

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
import org.testng.asserts.SoftAssert;

public class About_Us {
	
WebDriver driver;
	
	public About_Us (WebDriver driver){
		this.driver =driver;
	}

	
     String Exp_tab1 = "Applied Underwriters";
     String Exp_tab2 = "News and Press";
     String Exp_tab2_Heading = "News and Press";
	By Applied_underwriters = By.xpath("//*[text()='Applied Underwriters']");
	By NewsandPress = By.xpath("//a[text()='News and Press']");
	By NewHeading = By.xpath("//h2[text()='News and Press']");
	By New_LearnMore1 = By.xpath("(//*[text()='Learn More'])[1]");
	By New_LearnMore2 = By.xpath("(//*[text()='Learn More'])[2]");
	By New_LearnMore3 = By.xpath("(//*[text()='Learn More'])[3]");
	By New_LearnMore4 = By.xpath("(//*[text()='Learn More'])[4]");
	By New_LearnMore5 = By.xpath("(//*[text()='Learn More'])[5]");
	By New_LearnMore6 = By.xpath("(//*[text()='Learn More'])[6]");
	By Learmore_back = By.xpath("//*[text()='Back']");
	By LearnMore_BacktoAboutUS = By.xpath("//*[text()='Back to About Us']");
	// By Learmore_heading1 = By.xpath("(//*[@class='jss106'])[1]");
	By Learmore_heading1 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[1]");
	//By Learmore_heading2 = By.xpath("//*[@class='jss212 jss209']");
	By Learmore_heading2 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[3]");
	By Learmore_heading3 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[5]");
	
	By Learmore_heading4 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[7]"); 
	By Learmore_heading5 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[9]");
	By Learmore_heading6 = By.xpath("(//a[contains(@href, '/about-us/news/article/')])[11]");
	
	By HeadingMain_page = By.xpath("//*[@id='__next']/main/div/div[1]/h1");
	
	By ViewAll_releases = By.xpath("//*[@href='/about-us/news']");
	By View_All_Heading = By.xpath("//*[@id='app']/main/div[1]/div/h2");
	
	By covid_text = By.xpath("//*[text()='COVID-19 Service Alert']");
	By Covid_click = By.xpath("//*[text()='click here']");
	
	
	By ContactUs = By.xpath("(//*[text()='Contact Us'])[1]");
	By contactUs_Heading = By.xpath("(//*[text()='Contact Us'])[2]");
	
	By AboutUs_header = By.xpath("//*[@id='app']/div/div[2]/div/div/div/p");
	
	
	
	public void  Header () throws InterruptedException {
		
		 Thread.sleep(5000);
		 
		 String Header = driver.findElement(AboutUs_header).getText();
			System.out.println("Header = " + Header);
		boolean h = driver.findElement(AboutUs_header).isDisplayed();
		System.out.println("Header is visible = "+ h);

	}
	
	public void  LeftTab_one () throws InterruptedException {
		 Thread.sleep(5000);
		   // Click on applied underwriters
			String tab1 = driver.findElement(Applied_underwriters).getText();
			System.out.println("Tab1 name = " + tab1);
			driver.findElement(Applied_underwriters).click();
			//Thread.sleep(2000);
			assertEquals(tab1, Exp_tab1);
		 
	 }
	
    public void  LeftTab_two () throws InterruptedException {
		 
		      // Click on News and press
		 Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 		wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		
			   String tab2 = driver.findElement(NewsandPress).getText();
			   System.out.println("Tab2 name = " + tab2);
			   Thread.sleep(2000);
			   driver.findElement(NewsandPress).click();
			   
			   assertEquals(tab2, Exp_tab2);

				String NewsHeading = driver.findElement(NewHeading).getText(); // Get heading text of New and press
				
				System.out.println("NewsHeading = "+ NewsHeading);
				
				assertEquals(NewsHeading, Exp_tab2_Heading);
				
				Thread.sleep(2000);
		 
	 }
	 
    public void NEWSandPress_Heading_one () throws InterruptedException {
		 Home_page h = new Home_page(driver);
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 	 wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
		 
		 String Learmore_headingONE = driver.findElement(Learmore_heading1).getAttribute("href");
		 
		/*	String s = Learmore_headingONE.replaceAll("[-+^]*", " ");  
			String g = s.replaceAll("\\s", ""); 
			//System.out.println(g); */
			
			System.out.println("Learn more Heading 1 =" + Learmore_headingONE);
			
			driver.findElement(New_LearnMore1).click();
		
			Thread.sleep(5000);
			h.Header();
			String Main_heading = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading);
			
			Assert.assertTrue(Main_heading.contains(Learmore_headingONE),"Failure message") ;
				
			driver.findElement(Learmore_back).click();
			Thread.sleep(5000);
			h.Header();
			driver.findElement(LearnMore_BacktoAboutUS).click();
			Thread.sleep(3000);
			h.Header();
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);
	 }
	
    /* public void NEWSandPress_Heading_two () throws InterruptedException {
		 
    	
    	 driver.navigate().refresh();
	 		
	     	 WebDriverWait wait1 = new WebDriverWait(driver,30);
	 		wait1.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		
	 		 JavascriptExecutor js = (JavascriptExecutor) driver;
	 		//js.executeScript("window.scrollBy(0,1000)");
	 	 WebElement Element = driver.findElement(Learmore_heading2);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		    String Learmore_headingTwo = driver.findElement(Learmore_heading2).getAttribute("href");
			
			System.out.println("Learn more Heading 2 =" + Learmore_headingTwo);
			
			driver.findElement(New_LearnMore2).click();
		//	driver.findElement(Learmore_heading1).click();
			Thread.sleep(5000);
			String Main_heading2 = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading2);
			
			Assert.assertTrue(Main_heading2.contains(Learmore_headingTwo),"Failure message") ;
			
			driver.findElement(Learmore_back).click();
			
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
			
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);
	    }
		 
   public void NEWSandPress_Heading_three () throws InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 		wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		
	 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 		//js.executeScript("window.scrollBy(0,1000)");
		 	 WebElement Element = driver.findElement(Learmore_heading3);
		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
		  		
		   String Learmore_headingThree = driver.findElement(Learmore_heading3).getAttribute("href");
			
			System.out.println("Learn more Heading 3 =" + Learmore_headingThree);
			
			driver.findElement(New_LearnMore3).click();
		//	driver.findElement(Learmore_heading1).click();
			Thread.sleep(5000);
			String Main_heading3 = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading3);
			  Assert.assertTrue(Main_heading3.contains(Learmore_headingThree),"Failure message") ;
			driver.findElement(Learmore_back).click();
			
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
			
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);
	 }

   
   public void NEWSandPress_Heading_four () throws InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 		wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		
	 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 		//js.executeScript("window.scrollBy(0,1000)");
		 	 WebElement Element = driver.findElement(Learmore_heading4);
		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
		 	 
		 String Learmore_headingFour = driver.findElement(Learmore_heading4).getAttribute("href");
			
			System.out.println("Learn more Heading 4 =" + Learmore_headingFour);
			
			driver.findElement(New_LearnMore4).click();
		//	driver.findElement(Learmore_heading1).click();
			Thread.sleep(5000);
			String Main_heading4 = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading4);
			  Assert.assertTrue(Main_heading4.contains(Learmore_headingFour),"Failure message") ;
			driver.findElement(Learmore_back).click();
			
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
			
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);
	 }

   public void NEWSandPress_Heading_five () throws InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 		wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		

	 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 		//js.executeScript("window.scrollBy(0,1000)");
		 	 WebElement Element = driver.findElement(Learmore_heading5);
		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 String Learmore_headingFive = driver.findElement(Learmore_heading5).getAttribute("href");
			
			System.out.println("Learn more Heading 5 =" + Learmore_headingFive);
			
			driver.findElement(New_LearnMore5).click();
		//	driver.findElement(Learmore_heading1).click();
			Thread.sleep(5000);
			String Main_heading5 = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading5);
			  Assert.assertTrue(Main_heading5.contains(Learmore_headingFive),"Failure message") ;
			driver.findElement(Learmore_back).click();
			
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
			
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);
	 }
   
   public void NEWSandPress_Heading_Six () throws InterruptedException {
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
	 		wait.until(ExpectedConditions.visibilityOfElementLocated(NewsandPress));
	 		

	 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 		//js.executeScript("window.scrollBy(0,1000)");
		 	 WebElement Element = driver.findElement(Learmore_heading6);
		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 String Learmore_headingSix = driver.findElement(Learmore_heading6).getAttribute("href");
			
			System.out.println("Learn more Heading 6 =" + Learmore_headingSix);
			
			driver.findElement(New_LearnMore6).click();
		//	driver.findElement(Learmore_heading1).click();
			Thread.sleep(2000);
			String Main_heading6 = driver.getCurrentUrl();
			
			System.out.println("Main heading = " + Main_heading6);
			  Assert.assertTrue(Main_heading6.contains(Learmore_headingSix),"Failure message") ;
			driver.findElement(Learmore_back).click();
			
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
			
	        driver.findElement(NewsandPress).click();
			
			String NewsHeading1 = driver.findElement(NewHeading).getText(); // Get heading text of New and press
			
			System.out.println("NewsHeading = "+ NewsHeading1);

	 }*/
   
   public void View_All_Releases() throws InterruptedException {
	   Home_page h = new Home_page(driver);
	   Thread.sleep(5000);
	   
	   WebDriverWait wait = new WebDriverWait(driver,130);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ViewAll_releases));
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	 		
	 	 WebElement Element = driver.findElement(ViewAll_releases);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
	 	 
		driver.findElement(ViewAll_releases).click();
		
		 WebDriverWait wait1 = new WebDriverWait(driver,30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(View_All_Heading));
			h.Header();
			String ViewallHeading = driver.findElement(View_All_Heading).getText();
			
			System.out.println("View all redirection on News and Press = " + ViewallHeading);
			Thread.sleep(3000);
			driver.findElement(LearnMore_BacktoAboutUS).click();
			
   }
   
   public void Contact_Us () throws InterruptedException {
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContactUs));
		
		WebElement element = driver.findElement(ContactUs);
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		driver.findElement(ContactUs).click();
		
		Thread.sleep(3000);
		
		String ContactUs = driver.findElement(contactUs_Heading).getText();
		
		System.out.println("Contact US heading = " + ContactUs);
		
		
		
		
   }
   
   public void Covid_alert () throws InterruptedException {
	   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Element = driver.findElement(covid_text);
	js.executeScript("arguments[0].scrollIntoView();", Element);

	Thread.sleep(5000);
	 
	Boolean text = driver.findElement(covid_text).isDisplayed();
	 
	System.out.println("Covid Text is displayed = " + text);
	 
	String Expected_URL = driver.findElement(Covid_click).getAttribute("href");
	
	System.out.println("Expected Covid URL = "+ Expected_URL);
	
	driver.findElement(Covid_click).click();

	Thread.sleep(5000);
	
	  Set<String> handlesSet1 = driver.getWindowHandles();
      List<String> handlesList1 = new ArrayList<String>(handlesSet1);
      driver.switchTo().window(handlesList1.get(1));
      String Actual_URL =  driver.getCurrentUrl();
      System.out.println("handlesSet1= " +handlesSet1);
      
      driver.close();

  	System.out.println("Actual Covid URL = "+ Actual_URL);
  	
  	assertEquals(Actual_URL, Expected_URL);
  	
	
	   
   }
}
