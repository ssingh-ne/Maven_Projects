package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Home_Page {
	
	
	
	WebDriver driver;
	
	By AboutUs_URL = By.xpath("//*[@id='treadwell-desktop-menu']/div/a");
	By aboutUs_header = By.xpath("(//*[text()='About Us'])[1]");
	By Privacypolicy_URL = By.xpath("//*[@id='app']/div[8]/div/div[2]/div/a[1]");
	By Privacypolicy = By.xpath("//*[text()='Privacy Policy']");
	By CA_Privacypolicy_URL = By.xpath("//*[@id='app']/div[8]/div/div[2]/div/a[2]");
	By CA_Privacypolicy = By.xpath("//*[text()='CA Privacy Notice']");
	By About_US_subheader = By.xpath("//*[text()='ABOUT US']");
	
	By Comprehensive = By.xpath("//h1[text()='Comprehensive protection']");
	By comprehensive_tab1 = By.xpath("//*[@id='app']/div[6]/div/div[1]/div[1]/p");
	By comprehensive_tab2 = By.xpath("//*[@id='app']/div[6]/div/div[1]/div[2]/p");
	By comprehensive_tab3 = By.xpath("//*[@id='app']/div[6]/div/div[1]/div[3]/p");
	By comprehensive_tab4 = By.xpath("//*[@id='app']/div[6]/div/div[1]/div[4]/p");
	By comprehensive_tab5 = By.xpath("//*[@id='app']/div[6]/div/div[1]/div[5]/p");
	
	
	
	
	
	public Home_Page (WebDriver driver){
		this.driver=driver;
	}

	
	public void  About_US () throws InterruptedException {
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(aboutUs_header);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		  
		  String About_URL = driver.findElement(AboutUs_URL).getAttribute("href");
		  
		  System.out.println("Expected About us URL = "+ About_URL);
		  
		  driver.findElement(aboutUs_header).click();
		  
		  Thread.sleep(5000);
		  
		  String Actualabout_URL = driver.getCurrentUrl();
		  
		  System.out.println("Actual About us URL = "+ Actualabout_URL);
		  
		  boolean about_subheader =  driver.findElement(About_US_subheader).isDisplayed();
		  
		  System.out.println("About us Subheader = "+ about_subheader);
		  
		  Assert.assertEquals(Actualabout_URL, About_URL);
		  
		  driver.navigate().back();
		  
		  
	}

	
	public void privacy_policy () throws InterruptedException {
		

		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(Privacypolicy);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		
		  Thread.sleep(3000);
		  
          String Privacy_URL = driver.findElement(Privacypolicy_URL).getAttribute("href");
		  
		  System.out.println("Expected Privacy policy URL = "+ Privacy_URL);
		  
		  driver.findElement(Privacypolicy).click();
		  
		  Thread.sleep(8000);
		  
		  Set<String> handlesSet1 = driver.getWindowHandles();
	         List<String> handlesList1 = new ArrayList<String>(handlesSet1);
	         driver.switchTo().window(handlesList1.get(1));
	         String FBURL =  driver.getCurrentUrl();
	         System.out.println("handlesSet1= " +handlesSet1);
	         System.out.println("Actual Privacy policy URL  = " +FBURL);
	         driver.close();
	         driver.switchTo().window(handlesList1.get(0));
	         
	         Assert.assertEquals(FBURL, Privacy_URL);
		
	}
	
	public void CA_privacy_policy () throws InterruptedException {
		

		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement Element = driver.findElement(CA_Privacypolicy);
		  js.executeScript("arguments[0].scrollIntoView();", Element);
		
		  Thread.sleep(3000);
		  
        String CAPrivacy_URL = driver.findElement(CA_Privacypolicy_URL).getAttribute("href");
		  
		  System.out.println("Expected CA Privacy policy URL = "+ CAPrivacy_URL);
		  
		  Thread.sleep(5000);
		  driver.findElement(CA_Privacypolicy).click();
		  Thread.sleep(5000);
		  
		  Set<String> handlesSet1 = driver.getWindowHandles();
	         List<String> handlesList1 = new ArrayList<String>(handlesSet1);
	         driver.switchTo().window(handlesList1.get(1));
	         String FBURL =  driver.getCurrentUrl();
	         System.out.println("handlesSet1= " +handlesSet1);
	         System.out.println("Actual CA Privacy policy URL  = " +FBURL);
	         driver.close();
	         driver.switchTo().window(handlesList1.get(0));
	         
	         Assert.assertEquals(FBURL, CAPrivacy_URL);
	         
		
	}

	public void Comprehensive_tab2 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(comprehensive_tab1);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(3000);
		
		driver.findElement(comprehensive_tab2).click();
	}
	
    public void Comprehensive_tab3 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(comprehensive_tab1);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(3000);
		
		driver.findElement(comprehensive_tab3).click();
		
   }
		
    public void Comprehensive_tab4 () throws InterruptedException {
		
 		JavascriptExecutor js = (JavascriptExecutor) driver;
 	    WebElement Element = driver.findElement(comprehensive_tab1);
 		js.executeScript("arguments[0].scrollIntoView();", Element);
 		
 		Thread.sleep(3000);
		
		driver.findElement(comprehensive_tab4).click();
		
		
   }
		
    public void Comprehensive_tab5 () throws InterruptedException {
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    WebElement Element = driver.findElement(comprehensive_tab1);
				js.executeScript("arguments[0].scrollIntoView();", Element);
				
				Thread.sleep(3000);
		
		driver.findElement(comprehensive_tab5).click();
		
		  }
		  
    public void Comprehensive_tab1 () throws InterruptedException {
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    WebElement Element = driver.findElement(comprehensive_tab1);
				js.executeScript("arguments[0].scrollIntoView();", Element);
				
				Thread.sleep(3000);
	
				driver.findElement(comprehensive_tab1).click();
	        
				Thread.sleep(2000);
		
		
		
		
	}
	
}
