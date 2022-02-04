package Casuality_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Home_Press_Room {

	
	WebDriver driver;
	

	By Press_room_heading = By.xpath("//a[text()='Press Room']");
	By Press_room_1 = By.xpath("(//*[@class='jss80'])[1]");
	By press_1_heading = By.xpath("//*[@id='app']/div[2]/div/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/div/div/a/div/p");
	By press_1page = By.xpath("");
	By Press_room_2 = By.xpath("");
	By All_news = By.xpath("");
	By Logo = By.xpath("//*[@alt='NAC Logo Blue']");
	
	
	public Home_Press_Room (WebDriver driver){
		this.driver=driver;
	}
	
    public void PressRoom () throws InterruptedException {
    	
    	Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(press_1_heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(5000);
		 
		 String Press1text = driver.findElement(press_1_heading).getText();
		 driver.findElement(Press_room_1).click();
         
		 Thread.sleep(5000);
		 
		String press_pageText =  driver.findElement(press_1page).getText();
		 
		driver.findElement(Logo).click();
		
		 Thread.sleep(5000);
		 
		 Assert.assertTrue(press_pageText.contains(Press1text),"Failure message") ;
		
        
    
    }
	
	
}
