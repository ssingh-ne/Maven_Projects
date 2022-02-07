package Casuality_pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Menu_Carriers {
	

	WebDriver driver;
	
	
	
	By Menu_carriers = By.xpath("//a[text()='Our Carriers']");
	
	By Url = By.xpath("//*[@target='_blank']");
	String s = "https://www.ambest.com/home/default.aspx";
	
	
	public Menu_Carriers (WebDriver driver){
		this.driver=driver;
	}
	
    public void MenuCarrier () throws InterruptedException {
    	
    	Thread.sleep(2000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Menu_carriers);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			// Twitter
		 Thread.sleep(2000);
		 
		 driver.findElement(Menu_carriers).click();
		 
		 Thread.sleep(2000);
    }

    public void Ambest () throws InterruptedException {
    	
    	Thread.sleep(5000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Url);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			
		 Thread.sleep(2000);
    	
		 driver.findElement(Url).click();

		 Thread.sleep(5000);
    	
		 Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String TwitterURL =  driver.getCurrentUrl();
        System.out.println("Ambest URL = " + TwitterURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         
        Assert.assertEquals(TwitterURL, s);
    	
    }
	
	
	
	
}
