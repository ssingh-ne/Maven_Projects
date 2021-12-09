package AUW_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Intelligence_page {
	
	
WebDriver driver;
	
	public Intelligence_page (WebDriver driver){
		this.driver =driver;
	}
	
	String DevURL = "https://develop--auw.netlify.app/intelligence";
	String ProdURL = "https://www.auw.com/intelligence";
	
	By Image1 = By.xpath("//*[@id='app']/main/div/div/div[2]/div/div/div[1]/div/a/div/img");
	By Image2 = By.xpath("//*[@id='app']/main/div/div/div[2]/div/div/div[2]/div/a/div/img");
	By Image3 = By.xpath("//*[@id='app']/main/div/div/div[2]/div/div/div[3]/div/a/div/img");
	
	By Text1 = By.xpath("((//*[contains(@class, 'MuiGrid-root ')])[8]/div/a/div/div/div/p)[1]");
	By Text2 = By.xpath("((//*[contains(@class, 'MuiGrid-root ')])[9]/div/a/div/div/div/p)[1]");
	By Text3 = By.xpath("((//*[contains(@class, 'MuiGrid-root ')])[10]/div/a/div/div/div/p)[1]");
	
	By Back_btn = By.xpath("//*[text()='Back to Applied Intelligence']");
	

public void URL_Dev() throws InterruptedException {
		
		Thread.sleep(5000);
		
		String CurrentURL = driver.getCurrentUrl();
		
		System.out.println("Current URL Dev  = " + CurrentURL);
		
		assertEquals(CurrentURL, DevURL);
		
	}

	
     public void URL_Prod () throws InterruptedException {
		
		Thread.sleep(5000);
		
		String CurrentURL = driver.getCurrentUrl();
		
		System.out.println("Current URL Prod = " + CurrentURL);
		
		assertEquals(CurrentURL, ProdURL);
		
	}

 
 public void Back_to_Applied() throws InterruptedException {
		
		 Thread.sleep(3000);
	 		
	    	boolean s =  driver.findElement(Back_btn).isDisplayed();
	    	
	    	System.out.println("Back to Applied Intelligence page = " + s);		
	    	
	    	driver.findElement(Back_btn).click();
	    	
	}
	
 public void Img_one () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Image1);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Image1).click();
	 
	 Thread.sleep(3000);
	 
	 
}

 public void Img_two () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Image2);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Image2).click();
	 
	 Thread.sleep(3000);
	 
	 
}
 
public void Img_three () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Image3);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Image3).click();
	 
	 Thread.sleep(3000);
	 
	 
}

public void Text_one () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Text1);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Text1).click();
	 
	 Thread.sleep(3000);
	 
	 
}

public void Text_two () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Text2);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Text2).click();
	 
	 Thread.sleep(3000);
	 
	 
}

public void Text_Three () throws InterruptedException {
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Text3);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	 
	 driver.findElement(Text3).click();
	 
	 Thread.sleep(3000);
	 
	 
}





}
