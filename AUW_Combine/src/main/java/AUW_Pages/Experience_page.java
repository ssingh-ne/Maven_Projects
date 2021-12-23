package AUW_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Experience_page {
	
	
WebDriver driver;
	
	public Experience_page (WebDriver driver){
		this.driver =driver;
	}
	
	String DevURL = "https://develop--auw.netlify.app/experience";
	String ProdURL = "https://www.auw.com/experience";
	
	By Explore_one = By.xpath("(//*[text()='Explore'])[1]");
	By Explore_Two = By.xpath("(//*[text()='Explore'])[2]");
	By Explore_Three = By.xpath("(//*[text()='Explore'])[3]");
	By Explore_Four = By.xpath("(//*[text()='Explore'])[4]");
	By Explore_five = By.xpath("(//*[text()='Explore'])[5]");
	
	By Close_btn = By.xpath("//*[@class='MuiIconButton-label']");
	By Header = By.xpath("//*[@id='desktop-menu']");
	
	By EXp_card_1 = By.xpath("(//*[contains(@class, 'blog-image')])[1]");
	
	By EXp_card_2 = By.xpath("(//*[contains(@class, 'blog-image')])[2]");
	
	By Exp_card_1_text = By.xpath("((//*[contains(@class, 'MuiGrid-root ')])[4]/div/a/div/div/div/p)[1]");
	By Exp_card_2_text = By.xpath("((//*[contains(@class, 'MuiGrid-root ')])[5]/div/a/div/div/div/p)[1]");
	
	By Exp_cardText = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div/p/span");
	
	
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
     
     
     public void ExploreONE () throws InterruptedException {
    	 
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Explore_one);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		 
		 driver.findElement(Explore_one).click();
		 
		 Thread.sleep(5000);
	}
     
     
     public void close_btn_visible()throws InterruptedException {
 		
 		 Thread.sleep(3000);
 		
    	boolean s =  driver.findElement(Close_btn).isDisplayed();
    	
    	System.out.println("Close button is visible. Means page open in Modal  = " + s);
    	 
     }
     
     public void close_btn_close()throws InterruptedException {
  		
 		 Thread.sleep(3000);
 		
        driver.findElement(Close_btn).click();
    	 
     }
	
     public void ExploreTwo ()throws InterruptedException {
 		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Explore_Two);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		 
		 driver.findElement(Explore_Two).click();
		 
		 Thread.sleep(5000);
     }
	
     public void ExploreThree ()throws InterruptedException {
  		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Explore_Three);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		 
		 driver.findElement(Explore_Three).click();
		 
		 Thread.sleep(5000);
     }
     
     public void ExploreFour ()throws InterruptedException {
   		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Explore_Four);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		 
		 driver.findElement(Explore_Four).click();
		 
		 Thread.sleep(5000);
     }
	
     public void ExploreFive ()throws InterruptedException {
    		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Explore_five);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
		 
		 driver.findElement(Explore_five).click();
		 
		 Thread.sleep(5000);
     }


     public void Exp_card1() throws InterruptedException {
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(EXp_card_1);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
	 
	 Thread.sleep(3000);
	 
	 String ExpCard_Text = driver.findElement(Exp_card_1_text).getText();
	 
	 System.out.println("ExpCard_Text 1 = "+ExpCard_Text);
	 
	 driver.findElement(Exp_card_1_text).click();
	 
	 Thread.sleep(7000);
	 
	String Exp_Card_Text1 = driver.findElement(Exp_cardText).getText();
	
	System.out.println("Exp_Card_Text = " + Exp_Card_Text1);
	Thread.sleep(5000);
	//assertEquals(Exp_Card_Text1, ExpCard_Text);
	
	Assert.assertTrue(Exp_Card_Text1.contains(ExpCard_Text),"Failure message") ;
	 
  }

     public void Exp_card2() throws InterruptedException {
    		
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 WebElement Element = driver.findElement(EXp_card_2);
    	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	 
    	 Thread.sleep(5000);
    	 
    	 String ExpCard_Text = driver.findElement(Exp_card_2_text).getText();
    	 
    	 System.out.println("ExpCard_Text2 = "+ExpCard_Text);
    	 
    	 driver.findElement(Exp_card_2_text).click();
    	 
    	 Thread.sleep(3000);
    	 
    	String Exp_Card_Text2 = driver.findElement(Exp_cardText).getText();
    	
    	System.out.println("Exp_Card_Text = " + Exp_Card_Text2);
    	
    	//assertEquals(Exp_Card_Text2, ExpCard_Text);
    	//Assert.assertTrue(Exp_Card_Text2.contains(ExpCard_Text),"Failure message") ;
    	Assert.assertTrue(ExpCard_Text.contains(Exp_Card_Text2),"Failure message") ;
    	 
    }



}
