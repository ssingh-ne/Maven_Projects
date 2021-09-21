package Page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About_us_page {
	
	
	
	WebDriver driver;
	
	
	By AboutUS_header = By.xpath("(//*[text()='About Us'])[1]");
	By AboutUS_sub = By.xpath("(//*[text()='About Us'])[2]");
	By MeetTeam = By.xpath("//*[text()='Meet The Team']");
	By OurTeam = By.xpath("//*[text()='Our Team']");
	By affillates = By.xpath("//*[text()='Affiliates']");
	By AUW_LINK = By.xpath("(//a[@target='_blank'])[1]");
	By cookies_prompt = By.xpath("//*[text()='I Agree']");

	 public About_us_page (WebDriver driver){
		this.driver=driver;
	}
	
	 public void About_US_header () throws InterruptedException {
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(AboutUS_header).click();
		 
	 }

	 public void About_US_Subheader () throws InterruptedException {
		 
		 Thread.sleep(3000);
		 
		 boolean AboutUS_suheader = driver.findElement(AboutUS_sub).isDisplayed();
		 
		 System.out.println("AboutUS_suheader = " + AboutUS_suheader);
		 
	 }
	
	 public void meet () throws InterruptedException {
		 
		    Thread.sleep(2000);
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(MeetTeam);
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			Thread.sleep(2000);
			
			boolean Meet_Team = driver.findElement(MeetTeam).isDisplayed();
			
			System.out.println("MeetTeam =" + Meet_Team);
			
	}
	 
	 public void Our_Team () throws InterruptedException {
		 
		    Thread.sleep(2000);
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(OurTeam);
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			Thread.sleep(2000);
			
			boolean Our_Team = driver.findElement(OurTeam).isDisplayed();
			
			System.out.println("Our_Team =" + Our_Team);
			
	}
	 
	 public void Affiliates () throws InterruptedException {
		 
		    Thread.sleep(5000);
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(affillates);
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			Thread.sleep(2000);
			
			boolean Affiliates = driver.findElement(affillates).isDisplayed();
			
			System.out.println("Affiliates is visible =" + Affiliates);
			
			driver.findElement(affillates).click();
			
			Thread.sleep(5000);
			
			WebElement Element1 = driver.findElement(AUW_LINK);
			js.executeScript("arguments[0].scrollIntoView();", Element1);
			
			Thread.sleep(5000);
			
			/*driver.findElement(AUW_LINK).click();
			
			 Set<String> handlesSet3 = driver.getWindowHandles();
	          List<String> handlesList3 = new ArrayList<String>(handlesSet3);
	          driver.switchTo().window(handlesList3.get(1));
	          String PrivacyURL =  driver.getCurrentUrl();
	          System.out.println("Privacy URl = " +PrivacyURL);
	          
	          boolean promtURL= driver.findElement(cookies_prompt).isDisplayed();
	          System.out.println("Cookies Promt displayed = " + promtURL);
	          
	          driver.close();*/
			
			
	}

}
