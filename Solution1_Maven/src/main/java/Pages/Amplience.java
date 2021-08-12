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
    
 //   By Production = By.xpath("(//button[@ng-repeat-start='link in $ctrl.links track by link.sref'])[3]");
    By Production = By.xpath("(//button[@ng-repeat-start='link in ::$ctrl.links track by link.sref'])[3]");
    
    By solution_slots = By.xpath("//*[text()='SolutionOne Slots']");
    
    By solution_slot_name = By.xpath("//span[text()='Solution One Homepage']");
    By Solution_slot_one = By.xpath("//*[text()='1']");
    By Solution_slot_Two = By.xpath("//*[text()='2']");
    By Solution_slot_Three = By.xpath("//*[text()='3']");
    By Solution_slot_Four = By.xpath("//*[text()='4']");
    By Solution_slot_Five = By.xpath("//*[text()='5']");
    By Solution_slot_Six = By.xpath("//*[text()='6']");
    By Solution_slot_one_new= By.xpath("//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)']");
    
    By Solution_edit_one = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[3]");
    By Solution_edit = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    By Solutionslot_edit_Two = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[4]");
    By Solutionslot_edit_Three = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[5]");
    By Solutionslot_edit_Three_1 = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    By Solutionslot_edit_Four = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[6]");
    By Solutionslot_edit_Five = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[7]");
    By Solutionslot_edit_Six = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[8]");
    
    By solutionslot_textEdit = By.xpath("//*[@aria-label='Edit content']");
    By slot_editTab = By.xpath("(//*[text()='Edit'])[1]");
    By slot_heading_name = By.xpath("//*[@id='tinymce']/h2");
    By text_section = By.xpath("//*[@id='/textContent/values/0/value']/div/div[1]/am-collapsible-section-header/div/span");
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    
    By logout = By.xpath("//*[@id='Layer_1_copy']");
    
    By footer_text = By.xpath("//*[text()=' sections']");
    
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

    public void solution_slot() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,160);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(solution_slots));
 		 WebElement Element = driver.findElement(solution_slots);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
    	driver.findElement(solution_slots).click();
    	
    }
    
    
    public void solution_slotEdit_one() throws InterruptedException{
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_slot_name));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(solution_slot_name).getText();
 		System.out.println("text = " + s);
    	driver.findElement(solution_slot_name).click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	 WebElement Element = driver.findElement(footer_text);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	
    	/*WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));*/
 		Thread.sleep(6000);
 		driver.findElement(Solution_slot_one).click();
 		
 		Thread.sleep(1000);
    	
 		driver.findElement(Solution_edit_one).click();
 		
 		WebDriverWait wait3 = new WebDriverWait(driver,60);
 		wait3.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
 		
 		Thread.sleep(5000);
 	    driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		
 		Thread.sleep(3000);
 		driver.findElement(slot_editTab).click();
 		Thread.sleep(5000);
 		
 	
 	 }
    
     public void Solution_slotEdit_two () throws InterruptedException{
	 
	    driver.switchTo().parentFrame();
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	// driver.findElement(prompt).click();
    	WebDriverWait wait6 = new WebDriverWait(driver,60);
 		wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(solution_slot_name)); 
 		
    	driver.findElement(solution_slot_name).click();
    	Thread.sleep(5000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
      	 WebElement Element = driver.findElement(footer_text);
   	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
   	 	 
    	WebDriverWait wait5 = new WebDriverWait(driver,60);
 		wait5.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Two));
 		
 		driver.findElement(Solution_slot_Two).click();
 		

    	WebDriverWait wait1 = new WebDriverWait(driver,60);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Two));
 		
 		driver.findElement(Solutionslot_edit_Two).click();
 		
 		Thread.sleep(5000);
 		
 		driver.findElement(Solution_slot_one).click();
 		
 		WebDriverWait wait4 = new WebDriverWait(driver,60);
 		wait4.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
 		
 		driver.findElement(Solution_slot_one).click();
 		
 		Thread.sleep(4000);
 		
 		driver.findElement(Solution_edit).click();
 		Thread.sleep(3000);
 		
 		// JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		// WebElement Element1 = driver.findElement(By.xpath("//*[@id='/bannerButton']/div/div[1]/am-collapsible-section-header/div/span"));
 		WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
 		/*driver.findElement(solutionslot_textEdit).click();
 		driver.findElement(slot_editTab).click();
 		
 		Thread.sleep(3000);
*/
}
 
    public void Solution_slotEdit_three () throws InterruptedException{
	 
	     driver.switchTo().parentFrame();
 	
 	     WebDriverWait wait2 = new WebDriverWait(driver,60);
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
 	      driver.findElement(Production).click();
 	
 	  //  driver.findElement(prompt).click();
 	
 	     WebDriverWait wait6 = new WebDriverWait(driver,60);
	   wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	
 	   driver.findElement(Production).click();
 	
 	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(solution_slot_name));
		
 	    driver.findElement(solution_slot_name).click();
 	    
 	    Thread.sleep(5000);
 	    
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 	   	 WebElement Element = driver.findElement(footer_text);
 		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
 	
 	    WebDriverWait wait_slot = new WebDriverWait(driver,60);
		wait_slot.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Three));
		Thread.sleep(3000);
		driver.findElement(Solution_slot_Three).click();
 	    
 	    
 	    WebDriverWait wait5 = new WebDriverWait(driver,160);
	    wait5.until(ExpectedConditions.visibilityOfElementLocated(Solutionslot_edit_Three));
		
		driver.findElement(Solutionslot_edit_Three).click();
		
		Thread.sleep(15000);

        WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
		
		driver.findElement( Solution_slot_one).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver,60);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
		
		driver.findElement(Solution_slot_one).click();
		
	/*	driver.findElement(solutionslot_textEdit).click();
		Thread.sleep(9000);
		driver.findElement(slot_editTab).click();
		Thread.sleep(3000);
    */
		
		
 		Thread.sleep(2000);
 		
 		driver.findElement(Solution_edit).click();
 		Thread.sleep(3000);
 		
 		// JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		// WebElement Element1 = driver.findElement(By.xpath("//*[@id='/bannerButton']/div/div[1]/am-collapsible-section-header/div/span"));
 		WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
}
    
    
    public void Solution_slotEdit_four () throws InterruptedException{
   	 
	    driver.switchTo().parentFrame();
 	
 	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
 	driver.findElement(Production).click();
 	
  //driver.findElement(prompt).click();
 	
 	WebDriverWait wait6 = new WebDriverWait(driver,60);
	wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	
 	  driver.findElement(Production).click();
 	
 	WebDriverWait wait = new WebDriverWait(driver,60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(solution_slot_name));
		
 	  driver.findElement(solution_slot_name).click();
    Thread.sleep(5000);
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
  	 WebElement Element = driver.findElement(footer_text);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
 	 WebDriverWait wait5 = new WebDriverWait(driver,160);
 	wait5.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Four));
 		
 		driver.findElement(Solution_slot_Four).click();
 		

  	WebDriverWait wait1 = new WebDriverWait(driver,60);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Four));
 		
 		driver.findElement( Solutionslot_edit_Four).click();
 			
 		Thread.sleep(5000);
 		
 		WebDriverWait wait4 = new WebDriverWait(driver,60);
 		wait4.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
 		
 		driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		driver.findElement(slot_editTab).click();
 		Thread.sleep(3000);
 		
       /*  Thread.sleep(2000);
 		
 		driver.findElement(Solution_edit).click();
 		Thread.sleep(3000);
 		
 		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(By.xpath("//*[@id='/bannerButton']/div/div[1]/am-collapsible-section-header/div/span"));
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(3000);*/
    
    }
    
    public void Solution_slotEdit_five () throws InterruptedException{
   	 
	    driver.switchTo().parentFrame();
 	
 	    WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
 	    driver.findElement(Production).click();
 	
 	//   driver.findElement(prompt).click();
 	
 	    WebDriverWait wait6 = new WebDriverWait(driver,60);
	    wait6.until(ExpectedConditions.visibilityOfElementLocated(Production));
	
 	    driver.findElement(Production).click();
 	
 	    WebDriverWait wait = new WebDriverWait(driver,60);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(solution_slot_name));
		
 	    driver.findElement(solution_slot_name).click();
 	    
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 	   	 WebElement Element = driver.findElement(footer_text);
 		 	 js.executeScript("arguments[0].scrollIntoView();", Element);
 	  
 	    WebDriverWait wait5 = new WebDriverWait(driver,160);
  	    wait5.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Five));
  		
  		driver.findElement(Solution_slot_Five).click();
  		

     	WebDriverWait wait1 = new WebDriverWait(driver,160);
  		wait1.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_Five));
  		
  		driver.findElement( Solutionslot_edit_Five).click();
  		
  		Thread.sleep(5000);
  		
  		WebDriverWait wait3 = new WebDriverWait(driver,60);
  		wait3.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
  		
  		driver.findElement(Solution_slot_one).click();
  		
  		WebDriverWait wait4 = new WebDriverWait(driver,60);
  		wait4.until(ExpectedConditions.visibilityOfElementLocated(Solution_slot_one));
  		
  		driver.findElement(Solution_slot_one).click();
  		
  		/*driver.findElement(solutionslot_textEdit).click();
  		driver.findElement(slot_editTab).click();
  		Thread.sleep(3000);*/
  		
         Thread.sleep(2000);
 		
 		driver.findElement(Solution_edit).click();
 		Thread.sleep(3000);
 		
 		// JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		// WebElement Element1 = driver.findElement(By.xpath("//*[@id='/bannerButton']/div/div[1]/am-collapsible-section-header/div/span"));
 		WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
 	
    }
    
  
}




