package AUW_Global_Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnMore_page {
	
WebDriver driver;
	

	By more_btn = By.xpath("(//*[text()='more'])[1]");
	
//	By Side_Heading = By.xpath("(//p[contains(@class , 'AUWGlobalSection')])[1]");
	By Side_Heading = By.xpath("//*[@id='partners']/div[1]/p");
	
	
	public LearnMore_page (WebDriver driver){
		this.driver=driver;
	}

	public void Morebutton() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Side_Heading));
		
	  String headingText1 = driver.findElement(Side_Heading).getText();
	    
	  String headingText = headingText1.toLowerCase(); 
	  
	    System.out.println( "Heading text = " + headingText);
	    
	    Thread.sleep(5000);
	
	    driver.findElement(more_btn).click();
	    
	    Thread.sleep(5000);
	    
	   String CurrentURL =  driver.getCurrentUrl();
	   
	   System.out.println("URL open when click on more on first heading -> "+ CurrentURL);
	    
	   assertTrue(CurrentURL.contains(headingText));
		
	}
}
