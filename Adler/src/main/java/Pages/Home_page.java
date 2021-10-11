package Pages;

import org.openqa.selenium.*;

import TestCases_Development.Base_class;

import static org.testng.Assert.assertEquals;

public class Home_page  {
	
	WebDriver driver;
	
	By NewURL = By.xpath("(//div[contains(@class, 'MuiContainer-root')]/div/div/div/div/div)[2]/a");
	By News_Image = By.xpath("//*[@alt='Adler Industrial Solutions Acquires Shorts Tool & Mfg.']");
	By News_heading = By.xpath("//*[text()='News']");
	By News_text = By.xpath("//*[text()='Adler Industrial Solutions Acquires Shorts Tool & Mfg.']");
	By ContactUs = By.xpath("//*[text()='CONTACT US']");
	By AboutUs = By.xpath("//*[text()='About Adler']");
	
	By privacy_policy = By.xpath("//*[text()='Privacy Policy']");
	By privacy_url = By.xpath("(//*[@target='_self'])[3]");
	

	public Home_page (WebDriver driver){
		this.driver=driver;
	}


   public void PrivacyPolicy () throws InterruptedException {
	   
      JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement Element = driver.findElement(privacy_policy);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  
	  Thread.sleep(3000);
	  
	 String URL = driver.findElement(privacy_url).getAttribute("href");
	 System.out.println("URL before click = " + URL);
	 
	 driver.findElement(privacy_policy).click();
	 
	 Thread.sleep(4000);
	 
	 String URL1  = driver.getCurrentUrl();
	 
	 System.out.println("Url after click = " + URL1);
	 
	 driver.navigate().back();
	 
	 
	 assertEquals(URL, URL1);
	 
	  
	   
   }

   public void News () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(News_Image);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
		  
	   Thread.sleep(3000);
	   
	   String URL = driver.findElement(NewURL).getAttribute("href");
	   
	   System.out.println("Main URL = " + URL);
	   
	// Image
	   
	   driver.findElement(News_Image).click();
	   
	   String URL_image =  driver.getCurrentUrl();
	   
	   System.out.println("URL Image =" + URL_image);
	   
	   driver.navigate().back();
	 
	// Heading  
	  
	   Thread.sleep(6000);
	   
	   WebElement Element1 = driver.findElement(News_Image);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_heading).click();
	   
	   String URL_heading =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image =" + URL_heading);
	   
	   driver.navigate().back();
	   
   // Text  

	   Thread.sleep(3000);
	   
	   WebElement Element2 = driver.findElement(News_Image);
	   js.executeScript("arguments[0].scrollIntoView();", Element2);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_text).click();
	   
	   String URL_Text =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image =" + URL_Text);
	   
	   driver.navigate().back();
	   
	   
	   
	   
   }

   
   public void Contact_Us () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(ContactUs);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   
	   Thread.sleep(5000);
	   
	  boolean contact =  driver.findElement(ContactUs).isDisplayed();
	  
	  System.out.println("contact us Is visible = " + contact);
	   
   }
   
 public void About_Us () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(AboutUs);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   
	   Thread.sleep(5000);
	   
	  boolean contact =  driver.findElement(AboutUs).isDisplayed();
	  
	  System.out.println("About us Is visible = " + contact);
	   
   }

}
