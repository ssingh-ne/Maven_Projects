package Careers_Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amplience {
	
WebDriver driver;
	
	public Amplience (WebDriver driver){
		this.driver=driver;
	}

	
    
    String Amp_URL = "https://content.amplience.net/#!/login";

	By login_page = By.xpath("");
	By username = By.xpath("//*[@name='email']");
    By Password = By.xpath("//*[@name='password']");
    By Login = By.xpath("//*[@type='submit']"); 
    
  //  By Production = By.xpath("(//button[@ng-repeat-start='link in $ctrl.links track by link.sref'])[3]");
    By Production = By.xpath("//button[@am-id='am-masthead-menu__content-button']");
    
    By carrerslot_textEdit = By.xpath("//*[@aria-label='Edit content']");
    By slot_editTab = By.xpath("(//*[text()='Edit'])[1]");
    By slot_heading_name = By.xpath("//*[@id='tinymce']/h2");
    
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    
    By logout = By.xpath("//*[@id='Layer_1_copy']");
    
    By footer_text = By.xpath("//*[@id='/body']/div/div[1]/am-collapsible-section-header/span/span");
    
    By Carrer_content = By.xpath("(//*[text()='Careers Content'])[2]");
    By Carrer_slot1 = By.xpath("//*[text()=' Careers - Homepage - Text - Part of Our Future Section - Body Copy ']");
    By Carrer_slot2 = By.xpath("//*[text()=' Careers - Homepage - Text - Our Campus Section - Body Copy ']");
    By Carrer_slot3 = By.xpath("//*[text()=' Careers - Homepage - Text - Benefits Section - Body Copy ']");
    By Carrer_slot4 = By.xpath("//*[text()=' Careers - Homepage - Fading Slide Card - Industry Recognition Section - Body Copy & Award Logo ']");
    
    By Slot4_Content = By.xpath("//*[text()='Text Banner Content']");
    
    public void Amplience_url (){
        driver.get(Amp_URL);
    }
    
    public void Amplience_Logout () throws InterruptedException {
    	
    	Thread.sleep(2000);
    	driver.switchTo().parentFrame();
    	Thread.sleep(2000);
    	
    	driver.findElement(logout).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(prompt).click();
        Thread.sleep(2000);
    	
    	driver.findElement(logout).click();
    	
    	
    	
    }

    public void Amplience_Login (){
    
    	driver.findElement(username).click();
    	driver.findElement(username).sendKeys("shweta.singh@newelevation.com");
    	driver.findElement(Password).click();
    	driver.findElement(Password).sendKeys("Tyson@123");
    	driver.findElement(Login).click();
    }

    
    public void Carrer_Content () throws InterruptedException {
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
   	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
   	driver.findElement(Production).click();
   	
   	WebDriverWait wait1 = new WebDriverWait(driver,160);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(Carrer_content));
		 WebElement Element = driver.findElement(Carrer_content);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(5000);
   	driver.findElement(Carrer_content).click();
   	
   }
    
    
    
    public void carrer_slotEdit_one () throws InterruptedException{
    	
    	
    	driver.findElement(Carrer_slot1).click();
    	 
    	Thread.sleep(3000);
    	
    	driver.findElement(slot_editTab).click();
 		Thread.sleep(3000);
    	
    }
    
    public void Carrer_slotEdit_two () throws InterruptedException{
	 
	    driver.switchTo().parentFrame();
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	//driver.findElement(prompt).click();
    	WebDriverWait wait6 = new WebDriverWait(driver,60);
 		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
    	driver.findElement(Production).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(Carrer_slot2).click();
   	 
    	Thread.sleep(3000);
    	
    	driver.findElement(slot_editTab).click();
 		Thread.sleep(3000);
    }
 
    public void Carrer_slotEdit_three () throws InterruptedException{
	 
    	 driver.switchTo().parentFrame();
     	
     	WebDriverWait wait2 = new WebDriverWait(driver,60);
  		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
  		
     	driver.findElement(Production).click();
     	
     	driver.findElement(prompt).click();
     	WebDriverWait wait6 = new WebDriverWait(driver,60);
  		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
     	driver.findElement(Production).click();
     	Thread.sleep(3000);
     	
     	driver.findElement(Carrer_slot3).click();
    	 
     	Thread.sleep(3000);
     	
     	driver.findElement(slot_editTab).click();
  		Thread.sleep(3000);
     	

}
    
    
    public void Carrer_slotEdit_four () throws InterruptedException{
   	 
    	driver.switchTo().parentFrame();
       	
       	WebDriverWait wait2 = new WebDriverWait(driver,60);
    	wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
    		
       	driver.findElement(Production).click();
       	
       	driver.findElement(prompt).click();
       	WebDriverWait wait6 = new WebDriverWait(driver,60);
    		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
       	driver.findElement(Production).click();
       	Thread.sleep(3000);
       	
       	driver.findElement(Carrer_slot4).click();
      	 
       	Thread.sleep(3000);
       	
        JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Slot4_Content);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
    	
    }
  
    
}




