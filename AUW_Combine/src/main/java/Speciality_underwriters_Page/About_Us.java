package Speciality_underwriters_Page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About_Us {

	WebDriver driver;
	
	public About_Us (WebDriver driver){
		this.driver=driver;
	}

	By AboutUS_LearnMore_btn = By.xpath("(//a[@target='_self'])[1]");
	
	By AboutUS_Heading = By.xpath("//*[@id='eb440db3-fd5f-4482-b468-ab73211b6ffd2']/div/div/div/h5");
	
	String About_US_URL  = "https://develop--specialty.netlify.app/about-us";
	String About_US_URL_prod  = "https://specialty.auw.com/about-us";
	
	public void About_US () throws InterruptedException {
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(AboutUS_Heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
				
		 driver.findElement(AboutUS_LearnMore_btn).click();
		 
		 Thread.sleep(3000);
		 
		 String Current_URL = driver.getCurrentUrl();
		 
		 System.out.println("Current_URL = " + Current_URL);
		 
		 assertEquals(Current_URL, About_US_URL);
		 
		 
	}
	
	
	public void About_US_prod () throws InterruptedException {
		
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(AboutUS_Heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		Thread.sleep(5000); 
				
		 driver.findElement(AboutUS_LearnMore_btn).click();
		 
		 Thread.sleep(3000);
		 
		 String Current_URL = driver.getCurrentUrl();
		 
		 System.out.println("Current_URL = " + Current_URL);
		 
		 assertEquals(Current_URL, About_US_URL_prod);
		 
		 
	}
	
	
}
