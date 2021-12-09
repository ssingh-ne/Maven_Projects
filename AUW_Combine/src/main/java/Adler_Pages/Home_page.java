package Adler_Pages;

import org.openqa.selenium.*;

import Adler_TestCases_Development.Base_class;

import static org.testng.Assert.assertEquals;

 public class Home_page  {
	
	WebDriver driver;
	
	By NewURL = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[1]/div/a");
	By News_Image = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[1]/div/a/div/img");
	By News_heading = By.xpath("(//*[text()='News'])[1]");
	By News_text = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[1]/div/a/div/div/div/p[2]");
	
	By NewURL2 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[1]/div/a");
	By News_Image2 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[1]/div/a/div/img");
	By News_heading2 = By.xpath("(//*[text()='News'])[2]");
	By News_text2 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[1]/div/a/div/div/div/p[2]");
	
	By Load_More = By.xpath("//*[text()='More News']");
	By NewURL3 = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[2]/div/a");
	By News_Image3 = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[2]/div/a/div/img");
	By News_heading3 = By.xpath("(//*[text()='News'])[3]");
	By News_text3 = By.xpath("(//*[contains(@class,'fadeAltClass-1')])[2]/div/a/div/div/div/p[2]");
	
	By NewURL4 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[2]/div/a");
	By News_Image4 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[2]/div/a/div/img");
	By News_heading4 = By.xpath("(//*[text()='News'])[4]");
	By News_text4 = By.xpath("(//*[contains(@class,'fadeAltClass-2')])[2]/div/a/div/div/div/p[2]");
	
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

   public void News1 () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(News_heading);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
		  
	   Thread.sleep(3000);
	   
	   String URL = driver.findElement(NewURL).getAttribute("href");
	   
	   System.out.println("Main URL 1 = " + URL);
	   
	// Image 1
	   
	   driver.findElement(News_Image).click();
	   
	   String URL_image =  driver.getCurrentUrl();
	   
	   System.out.println("URL Image 1 =" + URL_image);
	   
	   driver.navigate().back();
	 
	// Heading  1
	  
	   Thread.sleep(6000);
	   
	   WebElement Element1 = driver.findElement(News_Image);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_heading).click();
	   
	   String URL_heading =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 1=" + URL_heading);
	   
	   driver.navigate().back();
	   
   // Text  1

	   Thread.sleep(3000);
	   
	   WebElement Element2 = driver.findElement(News_Image);
	   js.executeScript("arguments[0].scrollIntoView();", Element2);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_text).click();
	   
	   String URL_Text =  driver.getCurrentUrl();
	   
	   System.out.println("Heading text 1=" + URL_Text);
	   
	   driver.navigate().back();
	   
	   assertEquals(URL_image, URL);
	   assertEquals(URL_heading, URL);
	   assertEquals(URL_Text, URL);
   }
   
   public void News2 () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(News_Image2);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
		  
	   Thread.sleep(3000);
	   
	   String URL = driver.findElement(NewURL2).getAttribute("href");
	   
	   System.out.println("Main URL 2= " + URL);
	   
	// Image 
	   
	   driver.findElement(News_Image2).click();
	   
	   String URL_image =  driver.getCurrentUrl();
	   
	   System.out.println("URL Image 2=" + URL_image);
	   
	   driver.navigate().back();
	 
	// Heading  
	  
	   Thread.sleep(6000);
	   
	   WebElement Element1 = driver.findElement(News_Image2);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_heading2).click();
	   
	   String URL_heading =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 2=" + URL_heading);
	   
	   driver.navigate().back();
	   
   // Text  

	   Thread.sleep(3000);
	   
	   WebElement Element2 = driver.findElement(News_Image2);
	   js.executeScript("arguments[0].scrollIntoView();", Element2);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_text2).click();
	   
	   String URL_Text =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 2=" + URL_Text);
	   
	   driver.navigate().back();
	   
	   
	   assertEquals(URL_image, URL);
	   assertEquals(URL_heading, URL);
	   assertEquals(URL_Text, URL);
   }

   public void News3 () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(Load_More);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
		  
	   Thread.sleep(3000);
	   
	   driver.findElement(Load_More).click();
	   
	   Thread.sleep(2000);
	   
	   WebElement Element5 = driver.findElement(News_heading3);
	   js.executeScript("arguments[0].scrollIntoView();", Element5);
		
	   Thread.sleep(3000);
	   
	   String URL = driver.findElement(NewURL3).getAttribute("href");
	   
	   System.out.println("Main URL = " + URL);
	   
	// Image 
	   
	   driver.findElement(News_Image3).click();
	   
	   String URL_image =  driver.getCurrentUrl();
	   
	   System.out.println("URL Image3 =" + URL_image);
	   
	   driver.navigate().back();
	 
	   Thread.sleep(2000);
	   
	/*   WebElement Element2 = driver.findElement(Load_More);
	   js.executeScript("arguments[0].scrollIntoView();", Element2);
	   
	   driver.findElement(Load_More).click();
	   */
	// Heading  
	  
	   Thread.sleep(6000);
	   
	   WebElement Element1 = driver.findElement(News_heading3);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_heading3).click();
	   
	   String URL_heading =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 3=" + URL_heading);
	   
	   driver.navigate().back();
	   
      Thread.sleep(2000);
	   
	/*   WebElement Element3 = driver.findElement(Load_More);
	   js.executeScript("arguments[0].scrollIntoView();", Element3);
	  
	   driver.findElement(Load_More).click();
	*/    
   // Text  

	   Thread.sleep(3000);
	   
	   WebElement Element4 = driver.findElement(News_heading);
	   js.executeScript("arguments[0].scrollIntoView();", Element4);
	   
	   Thread.sleep(3000);
	   
	   WebElement Element6 = driver.findElement(News_heading3);
	   js.executeScript("arguments[0].scrollIntoView();", Element6);
	   
	   Thread.sleep(3000);
	   
	   
       driver.findElement(News_text3).click();
	   
	   String URL_Text =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Text 3=" + URL_Text);
	   
	   driver.navigate().back();
	   
	   
	   assertEquals(URL_image, URL);
	   assertEquals(URL_heading, URL);
	   assertEquals(URL_Text, URL);
   }
   
   public void News4 () throws InterruptedException {
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	   Thread.sleep(2000);
	   
	   WebElement Element5 = driver.findElement(News_heading2);
	   js.executeScript("arguments[0].scrollIntoView();", Element5);
		
	   Thread.sleep(3000);
	   
	   WebElement Element6 = driver.findElement(News_heading4);
	   js.executeScript("arguments[0].scrollIntoView();", Element6);
	   
	   Thread.sleep(3000);
	   
	   String URL = driver.findElement(NewURL4).getAttribute("href");
	   
	   System.out.println("Main URL = " + URL);
	   
	// Image 
	   
	   driver.findElement(News_Image4).click();
	   
	   String URL_image =  driver.getCurrentUrl();
	   
	   System.out.println("URL Image4 =" + URL_image);
	   
	   driver.navigate().back();
	 
	   Thread.sleep(2000);
	   
	/*   WebElement Element2 = driver.findElement(Load_More);
	   js.executeScript("arguments[0].scrollIntoView();", Element2);
	   
	   driver.findElement(Load_More).click();
	   */
	// Heading  
	  
	   Thread.sleep(6000);
	   
	   WebElement Element1 = driver.findElement(News_heading4);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
       driver.findElement(News_heading4).click();
	   
	   String URL_heading =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 4=" + URL_heading);
	   
	   driver.navigate().back();
	   
      Thread.sleep(2000);
	   
	/*   WebElement Element4 = driver.findElement(Load_More);
	   js.executeScript("arguments[0].scrollIntoView();", Element4);
	  
	   driver.findElement(Load_More).click();
	*/    
   // Text  

	   Thread.sleep(3000);
	   
	   WebElement Element7 = driver.findElement(News_heading2);
	   js.executeScript("arguments[0].scrollIntoView();", Element7);
	   
	   Thread.sleep(3000);
	   
	   WebElement Element4 = driver.findElement(News_heading4);
	   js.executeScript("arguments[0].scrollIntoView();", Element4);
	   
	   Thread.sleep(4000);
	   
       driver.findElement(News_text4).click();
	   
	   String URL_Text =  driver.getCurrentUrl();
	   
	   System.out.println("Heading Image 4=" + URL_Text);
	   
	   driver.navigate().back();
	   
	   
	   assertEquals(URL_image, URL);
	   assertEquals(URL_heading, URL);
	   assertEquals(URL_Text, URL);
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
