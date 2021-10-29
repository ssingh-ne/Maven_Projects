package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    
    By global_content = By.xpath("(//*[text()='Applied Treadwell Content'])[2]");
   
    
    By Tab1 = By.xpath("//*[text()=' Home - Tab Interface Section - Works of Art ']");
    By Tab2 = By.xpath("//*[text()=' Home - Tab Interface Section - Jewelry & Watches ']");
    By Tab3 = By.xpath("//*[text()=' Home - Tab Interface Section - Automobiles ']");
    By Tab4 = By.xpath("//*[text()=' Home - Tab Interface Section - Wine & Spirits ']");
    By Tab5 = By.xpath("//*[text()=' Home - Tab Interface Section - Collectibles ']");
    
    By Tab_edit_scroll = By.xpath("//*[@id='/stat']/div/div[1]/am-collapsible-section-header/div");
    
    By Tab_edit = By.xpath("//*[@id='root']/div/div/div/div/div/div[1]/button[1]");
     
    
    By prompt = By.xpath("//*[@ng-click='$ctrl.discard()']");
    
    By logout = By.xpath("//*[@id='Layer_1_copy']");
    
    
    
    
    public void Amplience_url (){
    	
    	/*System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
    	
    	driver=new ChromeDriver();
    	
    	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        
		driver.manage().window().maximize();*/
    	
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

    public void Tradewel_content() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Production));
 		
    	driver.findElement(Production).click();
    	
    	WebDriverWait wait1 = new WebDriverWait(driver,160);
 		wait1.until(ExpectedConditions.visibilityOfElementLocated(global_content));
 		 WebElement Element = driver.findElement(global_content);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 	 Thread.sleep(3000);
    	driver.findElement(global_content).click();
    	
    }
    
    public void Tradewel_Tab_one() throws InterruptedException{
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Tab1));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(Tab1).getText();
 		System.out.println("text = " + s);
    	driver.findElement(Tab1).click();
    	
    	Thread.sleep(3000);
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
 		 WebElement Element = driver.findElement(Tab_edit_scroll);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	
 		Thread.sleep(3000);
 		
    }
    
    public void Tradewel_Tab_Two() throws InterruptedException{
    	
    	driver.findElement(Production).click();
    	
    	Thread.sleep(3000);
    	
    	WebDriverWait wait2 = new WebDriverWait(driver,60);
 		wait2.until(ExpectedConditions.visibilityOfElementLocated(Tab2));
 		Thread.sleep(6000);
 		
 		String s = driver.findElement(Tab2).getText();
 		System.out.println("text = " + s);
    	driver.findElement(Tab2).click();
    	
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
 		 WebElement Element = driver.findElement(Tab_edit_scroll);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	
 		Thread.sleep(3000);
    
 	 }
   
    public void Tradewel_Tab_Three() throws InterruptedException{

    	driver.findElement(Production).click();
    	
    	Thread.sleep(3000);
    	
   	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Tab3));
		Thread.sleep(6000);
		
		String s = driver.findElement(Tab3).getText();
		System.out.println("text = " + s);
   	driver.findElement(Tab3).click();
   	
   	
   	JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Tab_edit_scroll);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
   	
		Thread.sleep(3000);
		 }
    
    public void Tradewel_Tab_Four() throws InterruptedException{

   	driver.findElement(Production).click();
   	
   	Thread.sleep(3000);
   	   
   	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Tab4));
		Thread.sleep(6000);
		
		String s = driver.findElement(Tab4).getText();
		System.out.println("text = " + s);
   	driver.findElement(Tab4).click();
   	
   	
   	JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Tab_edit_scroll);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
   	
		Thread.sleep(3000);
		
   }
    
    public void Tradewel_Tab_Five() throws InterruptedException{

   	driver.findElement(Production).click();
   	
   	Thread.sleep(3000);
   	
   	WebDriverWait wait2 = new WebDriverWait(driver,60);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(Tab5));
		Thread.sleep(6000);
		
		String s = driver.findElement(Tab5).getText();
		System.out.println("text = " + s);
   	driver.findElement(Tab5).click();
   	
   	
   	JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Tab_edit_scroll);
	 	 js.executeScript("arguments[0].scrollIntoView();", Element);
   	
		Thread.sleep(3000);
		
   }
    
     
}




