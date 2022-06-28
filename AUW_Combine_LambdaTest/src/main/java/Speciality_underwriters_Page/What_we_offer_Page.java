package Speciality_underwriters_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class What_we_offer_Page {
	
WebDriver driver;
	
	public What_we_offer_Page (WebDriver driver){
		this.driver=driver;
	}

	By what_we_offer_heading1 = By.xpath("//*[@id='eb440db3-fd5f-4482-b468-ab73211b6ffd3']/div/div/div[1]/a/div/div/p[1]");
	By what_we_offer_ReadMore1 = By.xpath("(//span[text()='Read More'])[1]");
	By what_we_offer_PageHeading1 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div/div[3]/h5");
	
	By what_we_offer_heading2 = By.xpath("//*[@id='eb440db3-fd5f-4482-b468-ab73211b6ffd3']/div/div/div[2]/a/div/div/p[1]");
	By what_we_offer_ReadMore2 = By.xpath("(//span[text()='Read More'])[2]");
	By what_we_offer_PageHeading2 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div/div[3]/h5");
	
	By what_we_offer_heading3 = By.xpath("//*[@id='eb440db3-fd5f-4482-b468-ab73211b6ffd3']/div/div/div[3]/a/div/div/p[1]");
	By what_we_offer_ReadMore3 = By.xpath("(//span[text()='Read More'])[3]");
	By what_we_offer_PageHeading3 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div/div[3]/h5");
	
	
	By Logo = By.xpath("//*[@alt='Applied Specialty Underwriters']");
	
	
	public void What_we_offer1 () throws InterruptedException {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(what_we_offer_heading1);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
		
		String Heading1 = driver.findElement(what_we_offer_heading1).getText();
		
		System.out.println("Heading1 = "+ Heading1 );
		
		driver.findElement(what_we_offer_ReadMore1).click();
		
		Thread.sleep(3000);
		
		String Heading_page = driver.findElement(what_we_offer_PageHeading1).getText();
		
		System.out.println("Heading2 = "+ Heading_page);
		
		
		Assert.assertTrue(Heading1.contains(Heading_page),"Failure message") ;
		
		
	}
	
  public void What_we_offer2 () throws InterruptedException {
		
		driver.findElement(Logo).click();
		Thread.sleep(3000); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(what_we_offer_heading2);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
		
		String Heading2 = driver.findElement(what_we_offer_heading2).getText();
		
		System.out.println("Heading2 = "+ Heading2 );
		
		driver.findElement(what_we_offer_ReadMore2).click();
		
		Thread.sleep(3000);
		
		String Heading_page = driver.findElement(what_we_offer_PageHeading2).getText();
		
		System.out.println("Heading2 = "+ Heading_page);
		
		
		Assert.assertTrue(Heading2.contains(Heading_page),"Failure message") ;
		
		
	}
	
  public void What_we_offer3 () throws InterruptedException {
		
	  driver.findElement(Logo).click();
		Thread.sleep(3000); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(what_we_offer_heading3);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
		
		String Heading3 = driver.findElement(what_we_offer_heading3).getText();
		
		System.out.println("Heading2 = "+ Heading3 );
		
		driver.findElement(what_we_offer_ReadMore3).click();
		
		Thread.sleep(3000);
		
		String Heading_page = driver.findElement(what_we_offer_PageHeading3).getText();
		
		System.out.println("Heading2 = "+ Heading_page);
		
		
		Assert.assertTrue(Heading3.contains(Heading_page),"Failure message") ;
		
		
	}
	
	
}
