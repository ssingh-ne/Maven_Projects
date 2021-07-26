package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Home_page {
	
	WebDriver driver;
	

//	By more_btn = By.xpath("//button[@class='AUWGlobalLetter-toggle_button-10']");
	By more_btn = By.xpath("//*[text()='more']");
//	By logo = By.xpath("//img[contains(@class, 'makeStyles-logo')]");	
	By logo = By.xpath("//*[@href='/']");
	By Cookies_Agree_button = By.xpath("//*[@id='__next']/div[3]/div/div[2]/button");
	
//	By LearnMore = By.xpath("//a[@class='makeStyles-learnMore-6']");
//	By LegalDisclaimer = By.xpath("//a[@class='makeStyles-disclaimer-18']");
	By more_btn_content = By.xpath("((//*[@class='letter_expanded']/div)[1]/p)[1]");
	By LearnMore = By.xpath("//*[text()='Learn More']");
    By LegalDisclaimer = By.xpath("//*[text()='Legal Disclaimer']");
    
    By home_logo = By.xpath("//*[@href='/']");
    By learnMore_logo = By.xpath("//*[@href='/']");
    By Article_logo = By.xpath("//*[@href='/about']");
    By disclaimer_logo = By.xpath("");
    By Article_section = By.xpath("//*[text()='LATEST NEWS']");
    By Article_1st = By.xpath("//*[@id='press']/div[2]/div[2]/div[1]/a");
    
    
	
	public Home_page (WebDriver driver){
		this.driver=driver;
	}

	
    public void Article_logo () throws InterruptedException {
    	
    	Thread.sleep(5000);
	
	     String Home_URL = driver.getCurrentUrl();
	     System.out.println("Home page URL = " + Home_URL);
	     
	     // click on learn more
	     
	     driver.findElement(LearnMore).click();
	      
	     Thread.sleep(5000);
	     String LearnMore_URL = driver.getCurrentUrl();
	     System.out.println("Learn More URL = " + LearnMore_URL);
	     
	     // click on Article 
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Article_section);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		String Article_one  =  driver.findElement(Article_1st).getText();
		System.out.println("Article_one = " + Article_one);
		
		driver.findElement(Article_1st).click();
		
		Thread.sleep(5000);
		
		String ArticlePage_URL = driver.getCurrentUrl();
	     System.out.println("Article Page URL = " + ArticlePage_URL);
	     
	     // Click on logo on article page
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(Article_logo).click();
	     
	     Thread.sleep(3000);
	     
	     String LearnMore_URL_return = driver.getCurrentUrl();
	     System.out.println("Learn More URL _return = " + LearnMore_URL_return);
	     
	  // Click on logo on Learn more page
         Thread.sleep(3000);
	     
	     driver.findElement(learnMore_logo).click();
	     
	     Thread.sleep(3000);
	     
	     String LearnMore_logo_to_home = driver.getCurrentUrl();
	     System.out.println("LearnMore_logo_to_home = " + LearnMore_logo_to_home);
	     
	     assertEquals(LearnMore_logo_to_home, Home_URL);
	     assertEquals(LearnMore_URL_return, LearnMore_URL);
	
    }
	
	
	
	
 public void  Cookies () throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Cookies_Agree_button);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(Cookies_Agree_button).click();
		 
	 }
	 
	 
	 public void More_messageFounder () {
		 
			// Click on Login button
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(more_btn));
				
			    driver.findElement(more_btn).click();
			    
				}
	
	 public void Logo_redirection () {
		 
			// Click on Login button
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
				
			    driver.findElement(logo).click();
				}
	 public void Logo_redirection_about () {
		 
			// Click on Login button
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(Article_logo));
				
			    driver.findElement(Article_logo).click();
				}
	 public void Learn_more () {
		 
		// Click on Login button
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(LearnMore));
			
		    driver.findElement(LearnMore).click();
			}
			 
	 
	 public void Legal_disclaimer () {
		 
			// Click on Login button
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(LegalDisclaimer));
				
			    driver.findElement(LegalDisclaimer).click();
				}
		

	 public void more_content (){
		 
		 WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(more_btn_content));
			
		   String More_content = driver.findElement(more_btn_content).getText();
		   
		   System.out.println("Content on click of more button = " + More_content);
		    
		 
	 }
	 
}
