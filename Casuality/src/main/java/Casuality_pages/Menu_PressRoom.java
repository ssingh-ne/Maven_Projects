package Casuality_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Menu_PressRoom {
	
	WebDriver driver;
	
	By Press_menu = By.xpath("//*[text()='Press Room']");
	By LoadMore = By.xpath("//*[text()='Load More']");
	
	By afterLoad = By.xpath("//*[@id='app']/main/div/div/div[2]/div[4]/div/div[2]/h4/a/span");
	String Exp_url = "press-room";
	By t1 = By.xpath("//*[@id='app']/main/div/div/h3");
	By text1 = By.xpath("//*[@id='app']/main/div/div/div[2]/div[1]/div/div[2]/h4/a/span");
	By text_page1 = By.xpath("//*[@id='app']/div/main/div[2]/div[1]/h1");
			
	By t2 =By.xpath("//*[@id='app']/main/div/div/div[2]/div[4]/div/div[1]/p/span[1]");
	By text2 = By.xpath("//*[@id='app']/main/div/div/div[2]/div[4]/div/div[2]/h4/a/span");
	//By text_page1 = By.xpath("//*[@id='app']/div/main/div[2]/div[1]/h1");
	
   public Menu_PressRoom (WebDriver driver){
		this.driver=driver;
	}

   public void PressRoom_click ()throws InterruptedException{
		
		Thread.sleep(3000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Press_menu);
		 js.executeScript("arguments[0].scrollIntoView();", Element);

			driver.findElement(Press_menu).click();
		
	}
	
   public void URL_Match ()throws InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   String URL = driver.getCurrentUrl();
	   
	   Assert.assertTrue(URL.contains(Exp_url),"Failure message");   
   }
	
   public void LoadMOre ()throws InterruptedException {
	   
	     Thread.sleep(3000);
   	
	   	 JavascriptExecutor js = (JavascriptExecutor) driver;
	   	 WebElement Element = driver.findElement(LoadMore);
	   	 js.executeScript("arguments[0].scrollIntoView();", Element);
	   		
	   driver.findElement(LoadMore).click();
	   
	   Thread.sleep(3000);
	   
	  String AfterLoad =  driver.findElement(afterLoad).getText();
	   
	   System.out.println("Load More works = " + AfterLoad);
   }
	
   public void text_1() throws InterruptedException {
		
		
	   Thread.sleep(3000);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(t1);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   	
	   String text = driver.findElement(text1).getText();
	   
	   driver.findElement(text1).click();
	   
	   Thread.sleep(5000);
	   
	   
        String text_2 = driver.findElement(text_page1).getText();
	   
	   driver.findElement(text_page1).click();
		 driver.navigate().back();
		 Thread.sleep(5000);

		 System.out.println("Press room heading = "+text);
		 System.out.println("Page room heading = "+text_2);
		 Assert.assertEquals(text, text_2);
	}
   
   public void text_2() throws InterruptedException {
		
		
	   Thread.sleep(3000);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement Element = driver.findElement(t2);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   	
	   String text = driver.findElement(text2).getText();
	   
	   driver.findElement(text2).click();
	   
	   Thread.sleep(5000);
	   
	   
        String text_2 = driver.findElement(text_page1).getText();
	   
	   driver.findElement(text_page1).click();
		 driver.navigate().back();
		 Thread.sleep(5000);
		 

		 System.out.println("Press room heading = "+text);
		 System.out.println("Page room heading = "+text_2);
		 Assert.assertEquals(text, text_2);
	}
   
   
}
