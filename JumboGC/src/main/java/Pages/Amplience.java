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
    By Production = By.xpath("(//button[@ng-repeat-start='link in ::$ctrl.links track by link.sref'])[3]");
    
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
    
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    By footer_text = By.xpath("//*[text()=' footer ']");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
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
    
    
    public void Jumbo_slotEdit_one () throws InterruptedException{
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_name));
 		Thread.sleep(6000);
 		/*WebElement Element = driver.findElement(Jumbo_slot_name);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	*/ 
 		
    	driver.findElement(Jumbo_slot_name).click();
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
      	 WebElement Element1 = driver.findElement(footer_text);
   	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
    	
    	Thread.sleep(5000);
 		
 		driver.findElement(By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[1]")).click();
 		
 		Thread.sleep(2000);
 		
 		driver.findElement(By.xpath("(//*[@aria-label='Edit content'])[4]")).click();
 		
 		Thread.sleep(4000);
    	WebDriverWait wait1 = new WebDriverWait(driver,60);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_one));
 		
 		driver.findElement(By.xpath("(//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)'])[1]")).click();
 		
 		driver.findElement(jumboslot_edit_one).click();
 		
 		WebDriverWait wait3 = new WebDriverWait(driver,60);
 		wait3.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_one));
 		
 		Thread.sleep(5000);
 		/*driver.findElement(Jumbo_slot_one).click();
 		
 		driver.findElement(jumboslot_textEdit).click();
 		
 		Thread.sleep(3000);*/
 		driver.findElement(slot_editTab).click();
 		Thread.sleep(3000);
 		
 		
    	
    }
    
 public void Jumbo_slotEdit_two () throws InterruptedException{
	 
	    driver.switchTo().parentFrame();
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	driver.findElement(prompt).click();
    	WebDriverWait wait6 = new WebDriverWait(driver,60);
 		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_name));
 		
    	driver.findElement(Jumbo_slot_name).click();
    	
    	JavascriptExecutor js1 = (JavascriptExecutor) driver;
     	WebElement Element1 = driver.findElement(footer_text);
  	 	js1.executeScript("arguments[0].scrollIntoView();", Element1);
   	
   	    Thread.sleep(5000);
		
 		driver.findElement(Jumbo_slot_Two).click();
 		
 		Thread.sleep(2000);
 		
 		driver.findElement(jumboslot_edit_Two).click();
 		
 		Thread.sleep(5000);
 		
 		driver.findElement(Jumbo_slot_one).click();
 		
 		WebDriverWait wait4 = new WebDriverWait(driver,60);
 		wait4.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_one));
 		
 		driver.findElement(Jumbo_slot_one).click();
 		
        Thread.sleep(2000);
 		
 		driver.findElement(Jumbo_edit).click();
 		Thread.sleep(3000);
 		
 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(By.xpath("//*[@id='/textContent/values/0/value']/div/div[1]/am-collapsible-section-header/div/span"));
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(3000);

}
 
    public void Jumbo_slotEdit_three () throws InterruptedException{
	 
	    driver.switchTo().parentFrame();
 	
 	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
 	driver.findElement(Production).click();
 	
 	//driver.findElement(prompt).click();
 	
 	WebDriverWait wait6 = new WebDriverWait(driver,60);
	wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	
 	  driver.findElement(Production).click();
 	
 	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_name));
		
 	  driver.findElement(Jumbo_slot_name).click();
 	  
 	JavascriptExecutor js1 = (JavascriptExecutor) driver;
  	WebElement Element1 = driver.findElement(footer_text);
	js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	Thread.sleep(5000);
		
	driver.findElement(Jumbo_slot_Three).click();
		
	Thread.sleep(1000);
		
	driver.findElement( jumboslot_edit_Three).click();
		
	Thread.sleep(3000);
	WebDriverWait wait4 = new WebDriverWait(driver,60);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(Jumbo_slot_one));
		
	driver.findElement(Jumbo_slot_one).click();
	Thread.sleep(3000);
	driver.findElement(jumboslot_textEdit).click();
	Thread.sleep(3000);
	driver.findElement(slot_editTab).click();
	Thread.sleep(3000);

}
 
}




