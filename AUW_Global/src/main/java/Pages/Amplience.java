package Pages;

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
    
   // By Production = By.xpath("(//button[@ng-repeat-start='link in $ctrl.links track by link.sref'])[3]");
    By Production = By.xpath("(//button[@ng-repeat-start='link in ::$ctrl.links track by link.sref'])[3]");
    
    By global_slots = By.xpath("//*[text()='Applied Global Slots']");
    
    By Global_slot_name = By.xpath("//span[text()='AUW Global Homepage']");
    By Global_slot_one = By.xpath("//*[text()='1']");
    
    By Global_edit_one = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[2]");
   
    
    By Globalslot_textEdit = By.xpath("//*[@aria-label='Edit content']");
    By Global_editTab = By.xpath("(//*[text()='Edit'])[3]");
    
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    
    By logout = By.xpath("//*[@id='Layer_1_copy']");
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    public void Amplience_url (){
        driver.get(Amp_URL);
    }
    
    public void Amplience_Logout () throws InterruptedException {
    	
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

    public void Global_slot() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,160);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(global_slots));
 		 WebElement Element = driver.findElement(global_slots);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
    	driver.findElement(global_slots).click();
    	
    }
    
    
    public void Global_slotEdit_one() throws InterruptedException{
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Global_slot_name));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(Global_slot_name).getText();
 		System.out.println("text = " + s);
    	driver.findElement(Global_slot_name).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Global_slot_one));
 		Thread.sleep(3000);
 		driver.findElement(Global_slot_one).click();
 		
 		Thread.sleep(3000);
    	WebDriverWait wait1 = new WebDriverWait(driver,60);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(Global_slot_one));
 		
 		driver.findElement(Global_edit_one).click();
 		
 		/*WebDriverWait wait3 = new WebDriverWait(driver,60);
 		wait3.until(ExpectedConditions.visibilityOfElementLocated(Global_slot_one));
 		
 		Thread.sleep(5000);
 	    driver.findElement(Global_slot_one).click();
 		
 		
 		Thread.sleep(5000);
 		driver.findElement(Globalslot_textEdit).click();
 		*/
 		Thread.sleep(3000);
 		driver.findElement(Global_editTab).click();
 		Thread.sleep(3000);
 		
 	
 	 }
     
}




