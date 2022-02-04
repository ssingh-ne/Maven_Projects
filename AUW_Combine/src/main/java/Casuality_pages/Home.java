package Casuality_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Home {
	
	WebDriver driver;
	
	By Menu = By.xpath("//*[@class='topBar ']");
	By About_us_heading = By.xpath("//*[text()='About Us']");
	By About_us_Para_text = By.xpath("//*[@id='app']/div[2]/div/div/div[1]/div/div/div[1]/p");
	By About_us_btn = By.xpath("//*[text()='Learn More']");
	By AboutUs_page = By.xpath("//*[@id='our-affiliates']/section/div/div/div/div/h3");
	
	By Our_carriers_heading = By.xpath("(//*[text()='Our Carriers'])[2]");
	By Our_carriers_Para_text = By.xpath("//*[@id='app']/div[2]/div/div/div[2]/div/div/div[1]/p");
	By Our_carriers_btn = By.xpath("//*[text()='Carriers']");
	By Carrer_page = By.xpath("//*[@id='nav-clear']/div/div/div/div/div[2]/p");
	By CarrerPage_heading =  By.xpath("//*[text()='OUR CARRIERS']");
	
	By Logo = By.xpath("//*[@alt='NAC Logo Blue']");
	By Privacy_policy = By.xpath("//*[text()='Privacy Policy']");
			
	String Expected_Privacy_policy = "privacy-policy";
	
	public Home (WebDriver driver){
		this.driver=driver;
	}
	
    
	
	public void Menu_click () throws InterruptedException {
		
		Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Menu);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 driver.findElement(Menu).click();
		
	}
	
	public void About_US() throws InterruptedException {
		
		 Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(About_us_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 boolean heading = driver.findElement(About_us_heading).isDisplayed();
		String para = driver.findElement(About_us_Para_text).getText();
		 
		 driver.findElement(About_us_btn).click();
		 Thread.sleep(5000);
		 
		 WebElement Element2 = driver.findElement(About_us_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		 boolean AboutUS_pageText = driver.findElement(About_us_heading).isDisplayed();
		 String AboutPage = driver.findElement(AboutUs_page).getText();
		 
		 System.out.println("About Us Heading = " + heading);
		 System.out.println("About Us Paragraph = " + para);
		 System.out.println("About Us Page text = " + AboutUS_pageText);
		 System.out.println("About Us page page = " + AboutPage);
		 
		 
	}
	
	public void Carrer() throws InterruptedException {
		
		 Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Our_carriers_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 boolean heading = driver.findElement(Our_carriers_heading).isDisplayed();
   		 String para = driver.findElement(Our_carriers_Para_text).getText();
		 
		 driver.findElement(Our_carriers_btn).click();
		 Thread.sleep(5000);
		 
		 WebElement Element2 = driver.findElement(CarrerPage_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		 boolean carrer_pageText = driver.findElement(CarrerPage_heading).isDisplayed();
		 String CarrerPage = driver.findElement(Carrer_page).getText();
		 
		 System.out.println("Carrer Heading = "+heading);
		 System.out.println("Carrer page Paragraph = " + para);
		 System.out.println("Carrer Page Headingh = " + carrer_pageText);
		 System.out.println("Carrer Page text = " + CarrerPage);
		
		 
	}
	
	public void Privacy_policy () throws InterruptedException {
		
		 Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Privacy_policy);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		
		 driver.findElement(Privacy_policy).click();
		
		 Thread.sleep(5000);
		 
		 String Actual_URL_Privacy = driver.getCurrentUrl();	
		 
         driver.findElement(Logo).click();
		 
		 Thread.sleep(5000);
		 
		 Assert.assertTrue(Actual_URL_Privacy.contains(Expected_Privacy_policy),"Failure message") ;
		 
	}
	

}
