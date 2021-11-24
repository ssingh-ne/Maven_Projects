package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    
   // By Production = By.xpath("(//button[@ng-repeat-start='link in $ctrl.links track by link.sref'])[3]");
    By Production = By.xpath("//button[@am-id='am-masthead-menu__content-button']");
    
    By Jumbo_slots = By.xpath("//*[text()='JumboGC Slots']");
    
    By Jumbo_slot_name = By.xpath("//span[text()='JumboGC Homepage']");
    By Jumbo_slot_one = By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[1]");
    By Jumbo_slot_Two = By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[2]");
    By Jumbo_slot_Three = By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[3]");
    By Jumbo_slot_Four = By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[4]");
    By Jumbo_slot_one_new= By.xpath("//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)']");
    By Jumbo_edit = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    
    By jumboslot_edit_one = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    By jumboslot_edit_Two = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[3]");
    By jumboslot_edit_Three = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[4]");
    By jumboslot_edit_Four = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[5]");
    
    
    By jumboslot_textEdit = By.xpath("//*[@aria-label='Edit content']");
    By slot_editTab = By.xpath("(//*[text()='Edit'])[1]");
    By slot_heading_name = By.xpath("//*[@id='tinymce']/h2");
    By Jumbo_content = By.xpath("(//*[text()='JumboGC Content'])[2]");
    By content_One = By.xpath("//*[text()=' JumboGC - Homepage - Text - Multi-State Coverage ']");
    By content_Two = By.xpath("//*[text()=' JumboGC - Homepage - Section - Claim Services ']");
    By content_Three = By.xpath("//*[text()=' JumboGC - Homepage - Text - Guaranteed Cost Program ']");
    By content_Four = By.xpath("//*[text()=' JumboGC - Homepage - Section - Contact Us ']");
    		
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    By footer_text = By.xpath("//*[text()=' footer ']");
   
    
    
    public void Amplience_url (){
        driver.get(Amp_URL);
    }

    public void Amplience_Login (){
    
    	driver.findElement(username).click();
    	driver.findElement(username).sendKeys("shweta.singh@newelevation.com");
    	driver.findElement(Password).click();
    	driver.findElement(Password).sendKeys("Tyson@123");
    	driver.findElement(Login).click();
    }

    public void Jumbo_Slots () throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,160);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slots));
 		
 		 WebElement Element = driver.findElement(Jumbo_slots);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
    	driver.findElement(Jumbo_slots).click();
    	
    }
    
    public void Jumbo_Content () throws InterruptedException {

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
   	    driver.findElement(Production).click();
   	
     	WebDriverWait wait1 = new WebDriverWait(driver,160);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_content));
		
		 WebElement Element = driver.findElement(Jumbo_content);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(5000);
   	     driver.findElement(Jumbo_content).click();
   	
   }
    
    public void content1() throws InterruptedException {
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
     	 WebElement Element1 = driver.findElement(content_One);
  	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
  	 	 
  	 	 driver.findElement(content_One).click();
  	 	 
  	 	 Thread.sleep(5000);
  	 	 
  	 	driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
  	  Thread.sleep(2000);
    	
    }
    
    public void content2() throws InterruptedException {
    	
	 driver.switchTo().parentFrame();
	 
 	WebDriverWait wait2 = new WebDriverWait(driver,60);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
 	driver.findElement(Production).click();
 	Thread.sleep(2000);
 	driver.findElement(prompt).click();
 	WebDriverWait wait6 = new WebDriverWait(driver,60);
	wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
 	driver.findElement(Production).click();
 	
 	Thread.sleep(5000);
 	
 	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(content_Two);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
 	
 	driver.findElement(content_Two).click();
 	
 	Thread.sleep(5000);
 	
	 WebElement Element2 = driver.findElement(By.xpath("//*[@ng-click='$ctrl.toggleSelection()']"));
	 js1.executeScript("arguments[0].scrollIntoView();", Element2);
	 
	 driver.findElement(By.xpath("//*[@ng-click='$ctrl.toggleSelection()']")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@aria-label='Edit Content']")).click();
	 
	 Thread.sleep(5000);
	 
	// driver.findElement(By.xpath("//*[@id='/content']/div/div[2]/am-collapsible-section-body/div/div[2]/ul/li[1]/div/am-container-card/div[1]/div/button[1]/md-icon")).click();
	 
	 
      	
    }
    
   public void content3() throws InterruptedException {
	
	 driver.switchTo().parentFrame();
	
	WebDriverWait wait2 = new WebDriverWait(driver,60);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
	driver.findElement(Production).click();
	
	WebDriverWait wait6 = new WebDriverWait(driver,60);
	wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	driver.findElement(Production).click();
	
	Thread.sleep(5000);
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(content_Three);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	driver.findElement(content_Three).click();
	
	Thread.sleep(5000);
	 
     	
   }
    
   public void content4() throws InterruptedException {
   	
		 driver.switchTo().parentFrame();
	 	
	 	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
			
	 	driver.findElement(Production).click();
	 	
	 	WebDriverWait wait6 = new WebDriverWait(driver,60);
		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	 	driver.findElement(Production).click();
	 	
	 	Thread.sleep(5000);
	 	
	 	JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 WebElement Element1 = driver.findElement(content_Four);
		 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	 	
	 	driver.findElement(content_Four).click();
	 	
	 	Thread.sleep(5000);
	 	
		 WebElement Element2 = driver.findElement(By.xpath("//*[@ng-click='$ctrl.toggleSelection()']"));
		 js1.executeScript("arguments[0].scrollIntoView();", Element2);
		 
		 driver.findElement(By.xpath("//*[@ng-click='$ctrl.toggleSelection()']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@aria-label='Edit Content']")).click();
		 
		 Thread.sleep(5000);
	      	
	    }
 
}




