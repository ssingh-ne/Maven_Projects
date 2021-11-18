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
    By Production = By.xpath("//button[@am-id='am-masthead-menu__content-button']");
    
    By solution_slots = By.xpath("(//*[text()='SolutionOne Content'])[2]");
    By solution_content_name1 = By.xpath("//*[text()=' SolutionOne - Homepage - Section - Pay As You Go Solution ']");
    By solution_content_name2 = By.xpath("//*[text()=' SolutionOne - Homepage - Section - Safety and Loss Control ']"); 
    By solution_content_name3 = By.xpath("//*[text()=' SolutionOne - Homepage - Section - Claim Services ']");
    By solution_content_name4 = By.xpath("//*[text()=' SolutionOne - Homepage - Section - Coverages & Protection ']");
    By solution_content_name5 = By.xpath("//*[text()=' SolutionOne - Homepage - Section - Contact Us ']");
    By solution_slot_name = By.xpath("//span[text()=' Solution One Homepage ']");
    By Solution_slot_one = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_Two = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_Three = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_Four = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_Five = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_Six = By.xpath("//*[@am-id='authoring__container-card--0']");
    By Solution_slot_one_new= By.xpath("//*[@ng-if='$ctrl.isIndexDefined($ctrl.index)']");
    
    //By Solution_edit_one = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[4]");
    
    By Solution_edit_one = By.xpath("(//*[@aria-label='Edit content'])[3]");
    By Solution_edit = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    By Solutionslot_edit_Two = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[5]");
    By Solutionslot_edit_Three = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[6]");
    By Solutionslot_edit_Three_1 = By.xpath("//*[@ng-if='$ctrl.editConditions()']");
    By Solutionslot_edit_Four = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[7]");
    By Solutionslot_edit_Five = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[8]");
    By Solutionslot_edit_Six = By.xpath("(//*[@ng-if='$ctrl.editConditions()'])[9]");
    
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

    public void solution_Content() throws InterruptedException {
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
   	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
		
   	driver.findElement(Production).click();
   	
   	WebDriverWait wait1 = new WebDriverWait(driver,160);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(solution_slots));
		 WebElement Element = driver.findElement(solution_slots);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
   //	driver.findElement(solution_slots).click();
	 	 
	 	 driver.findElement(solution_slots).click();
   	
   }
    
    public void solution_slotEdit_one() throws InterruptedException{
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_content_name1));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(solution_content_name1).getText();
 		System.out.println("text = " + s);
    	driver.findElement(solution_content_name1).click();
    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	    driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		
 		Thread.sleep(3000);
 		driver.findElement(slot_editTab).click();
 		Thread.sleep(5000);
 		
 	
 	 }
    
     public void Solution_slotEdit_two () throws InterruptedException{
	 	
	    WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_content_name2));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(solution_content_name2).getText();
 		System.out.println("text = " + s);
    	driver.findElement(solution_content_name2).click();
    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	    driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		
 		Thread.sleep(3000);
 	    
	    WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
 		
}
 
     public void Solution_slotEdit_three () throws InterruptedException{
	 
	     WebDriverWait wait2 = new WebDriverWait(driver,60);
	 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_content_name3));
	 		Thread.sleep(6000);
	 		
	 		String s = driver.findElement(solution_content_name3).getText();
	 		System.out.println("text = " + s);
	    	driver.findElement(solution_content_name3).click();
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	   	    driver.findElement(Solution_slot_one).click();
	 		
	 		driver.findElement(solutionslot_textEdit).click();
	 		
	 		Thread.sleep(3000);
	 		
 		WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
}
    
     public void Solution_slotEdit_four () throws InterruptedException{
   	    
	    WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_content_name4));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(solution_content_name4).getText();
 		System.out.println("text = " + s);
    	driver.findElement(solution_content_name4).click();
    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	    driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		
 		Thread.sleep(3000);
 		driver.findElement(slot_editTab).click();
 		Thread.sleep(5000);
 	
    }
    
     public void Solution_slotEdit_five () throws InterruptedException{
   	    
	    WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(solution_content_name5));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(solution_content_name5).getText();
 		System.out.println("text = " + s);
    	driver.findElement(solution_content_name5).click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	Thread.sleep(5000);
    	
   	    driver.findElement(Solution_slot_one).click();
 		
 		driver.findElement(solutionslot_textEdit).click();
 		
 		Thread.sleep(3000);
 		
 		WebElement Element1 = driver.findElement(text_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 Thread.sleep(3000);
 	
    }
    
  
}




