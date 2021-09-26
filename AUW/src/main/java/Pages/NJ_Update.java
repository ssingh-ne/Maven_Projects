package Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NJ_Update {
	
WebDriver driver;
	
	public NJ_Update (WebDriver driver){
		this.driver =driver;
	}

	By Facts_section = By.xpath("");
	By Facts_Download = By.xpath("(//*[text()='DOWNLOAD'])[1]");
	By FactsDownload_1 = By.xpath("(//*[@rel='noopener noreferrer'])[2]");
	By Facts_View = By.xpath("(//*[text()='VIEW'])[1]");
	By FactsView_1 = By.xpath("//*[@id='app']/main/div[2]/div/div[1]/div[4]/a");
	By Logo = By.xpath("//*[@alt='Applied Underwriters']");
    By header = By.xpath("//*[@id='app']/div[2]/div/div/div[2]/p");
	
	
	
	
	public void  Header_() throws InterruptedException {
		
		 Thread.sleep(5000);
		 
		String Header = driver.findElement(header).getText();
		System.out.println("Header = " + Header);
		boolean h = driver.findElement(header).isDisplayed();
		System.out.println("Header is visible = "+ h);

	}
	
	
	
	public void  Update_URL () throws InterruptedException {
		String url = driver.getCurrentUrl();
		String newurl = url+"njupdate";
		driver.get(newurl);
	}
	
	
	
	public void  Reload_Update_URL () throws InterruptedException {
		
		driver.findElement(Logo).click();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		String newurl = url+"njupdate";
		driver.get(newurl);
	}
	
	public void  Facts_View () throws InterruptedException {

		 JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Facts_View);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
				
		   WebDriverWait wait = new WebDriverWait(driver,30);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Facts_View));
			 Thread.sleep(5000);
			String Exp_url = driver.findElement(FactsView_1).getAttribute("href");
			
			System.out.println(Exp_url);
			
			driver.findElement(Facts_View).click();
			
			Thread.sleep(5000);
			
			String View_URL  = driver.getCurrentUrl();
			
			System.out.println("View_URL = "+View_URL);
			
			assertEquals(View_URL, Exp_url);

			 
		 }
	 
	 
	 public void  Facts_Download () throws InterruptedException {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(Facts_Download);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
			
	     WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(Facts_Download));
		    Thread.sleep(5000);
	        String Exp_url = driver.findElement(FactsDownload_1).getAttribute("href");
			
			System.out.println("href link = "+Exp_url);
			
			driver.findElement(Facts_Download).click();
			
			Thread.sleep(5000);
			
			String Download_URL  = driver.getCurrentUrl();
			
			System.out.println("Download_URL = "+Download_URL);
			
			Set<String> handlesSet3 = driver.getWindowHandles();
	        List<String> handlesList3 = new ArrayList<String>(handlesSet3);
	        System.out.println("size = "+handlesList3.size());
	        driver.switchTo().window(handlesList3.get(1));
	        String PDF  =  driver.getCurrentUrl();
	        System.out.println("New URL = "+ PDF);
	        driver.close();
	        driver.switchTo().window(handlesList3.get(0));
			
			assertEquals(Exp_url, PDF);
		    
		    
		    
	 }
	
	
	
	

}
