package MTL_Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class More_Offers {
	
	
	WebDriver driver;

	public More_Offers (WebDriver driver){
		this.driver=driver;
	}

	
	By More_offers = By.xpath("//*[text() = 'More Offers']");
	
	By learn_more1 = By.xpath("(//*[text() = 'Learn More'])[1]");
	By logo = By.xpath("//*[@alt='Applied More to Love']");
	
	By learn_more2 = By.xpath("(//*[text() = 'Learn More'])[2]");
	By whatWeoffer = By.xpath("//*[text()='WHAT WE OFFER']");
	By Worker_cmpensation_Header = By.xpath("(//li[@role='menuitem'])[1]");
	
	By MoreOffer_Heading1 = By.xpath("//*[@id='__next']/div[5]/section/div/div[1]/a/div/div/div/p[1]");
	By MoreOffer_Heading2 = By.xpath("//*[@id='__next']/div[5]/section/div/div[2]/a/div/div/div/p[1]");
	
	By LearnMore_page1 = By.xpath("//*[@id='__next']/div[2]/div/div/div/div/div[1]"); 
	By LearnMore_page2 = By.xpath("//*[@id='__next']/div[2]/div/div/div/div/div[1]");
	
	public void More_offer () throws InterruptedException{
		
        Thread.sleep(3000);
		
		driver.findElement(whatWeoffer).click();
		
        driver.findElement(Worker_cmpensation_Header).click();
		
		Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(MoreOffer_Heading1);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(4000);
		
		String LM1 =driver.findElement(MoreOffer_Heading1).getText();
		
		String LearnMoreText1 = LM1.toLowerCase();
		
		System.out.println("LearnMoreText1 = "+ LearnMoreText1);
		
		Thread.sleep(3000);
		
       String LM2 =driver.findElement(MoreOffer_Heading2).getText();
        
        String LearnMoreText2 = LM2.toLowerCase();
		
		System.out.println("LearnMoreText2 = "+ LearnMoreText2);
		Thread.sleep(3000);
		driver.findElement(learn_more1).click();
		
	   Thread.sleep(3000);
	   
	   String LH1 = driver.findElement(LearnMore_page1).getText();
	   
	   String LearnMore_openpage_heading1 = LH1.toLowerCase();
	   
	   System.out.println("LearnMore_openpage_heading1 = " + LearnMore_openpage_heading1);
	   Actions actions = new Actions(driver);
	   actions.sendKeys(Keys.PAGE_UP).build().perform();
	   
	   driver.findElement(logo).click();
       
	   driver.findElement(learn_more1).click();
		
	   Thread.sleep(3000);
	   
	   WebElement Element1 = driver.findElement(learn_more2);
	   js.executeScript("arguments[0].scrollIntoView();", Element1);
	   
	   Thread.sleep(3000);
	   
	   String LM3 = driver.findElement(LearnMore_page2).getText();
	   
	   String LearnMore_openpage_heading2 = LM2.toLowerCase();
	   
	   System.out.println("LearnMore_openpage_heading2 = " + LearnMore_openpage_heading2);
	
	   assertEquals(LearnMoreText1, LearnMore_openpage_heading1);
	   
	   assertEquals(LearnMoreText2, LearnMore_openpage_heading2);
		
	}
	
	
	
}
