package AUW_Pages;

import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUW_ppp {
	
 WebDriver driver;
	
	public AUW_ppp (WebDriver driver){
		this.driver =driver;
	}

	
	By Resource_Heading1 = By.xpath("(//*[@target='_blank'])[1]");
	By Resource_download1 = By.xpath("(//*[@target='_blank'])[2]");
	By header = By.xpath("//*[@id='app']/div[2]/div/div/div/p");
	
	
	public void  Header_() throws InterruptedException {
		
		 Thread.sleep(5000);
		 
		String Header = driver.findElement(header).getText();
		System.out.println("Header = " + Header);
		boolean h = driver.findElement(header).isDisplayed();
		System.out.println("Header is visible = "+ h);

	}
	
	
	public void  Update_URL () throws InterruptedException {
	String url = driver.getCurrentUrl();
	String newurl = url+"ppp";
	driver.get(newurl);
	}
	
	 public void  Resources_section () throws InterruptedException {
		 
		 
		 String newurl = driver.getCurrentUrl();
		
	
		/* WebElement element = driver.findElement(Resource_download1);
	 		Actions actions = new Actions(driver);
	 		actions.moveToElement(element);
	 		actions.perform();*/
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1200)");
		 
			
			 WebDriverWait wait = new WebDriverWait(driver,30);
		 	 wait.until(ExpectedConditions.visibilityOfElementLocated(Resource_Heading1));
			
		 		String s = driver.findElement(Resource_Heading1).getText();
			
			System.out.println("Heading = "+s);
			Thread.sleep(5000);
			driver.findElement(Resource_download1).click();
			Thread.sleep(5000);
			Set<String> handlesSet3 = driver.getWindowHandles();
	        List<String> handlesList3 = new ArrayList<String>(handlesSet3);
	        driver.switchTo().window(handlesList3.get(1));
	        String PDF  =  driver.getCurrentUrl();
	        System.out.println("New URL = "+ PDF);
	        driver.close();
	        driver.switchTo().window(handlesList3.get(0));
	        
	        assertNotEquals(PDF, newurl);
		 
	 }

}
