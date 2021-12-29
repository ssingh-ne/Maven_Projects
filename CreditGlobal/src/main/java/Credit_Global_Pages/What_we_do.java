package Credit_Global_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class What_we_do {
	
	WebDriver driver;
	
   public What_we_do (WebDriver driver){
		
		this.driver=driver;
	}
	
   
   By side_heading1 = By.xpath("//*[@id='sticky-nav']/ul/li[1]/div/a");
   By side_heading2 = By.xpath("//*[@id='sticky-nav']/ul/li[2]/div/a");
   By side_heading3 = By.xpath("//*[@id='sticky-nav']/ul/li[3]/div/a");
   By side_heading4 = By.xpath("//*[@id='sticky-nav']/ul/li[4]/div/a");
   
   
   By SideHeading_TextHeading1 = By.xpath("(//*[@id='contentBlock0']/h3)[1]");
   By SideHeading_TextHeading2 = By.xpath("(//*[@id='contentBlock0']/h3)[2]");
   By SideHeading_TextHeading3 = By.xpath("(//*[@id='contentBlock0']/h3)[3]");
   By SideHeading_TextHeading4 = By.xpath("(//*[@id='contentBlock0']/h3)[4]");
   
   public void SideHeadin_1 () throws InterruptedException{
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
	   WebElement Element = driver.findElement(side_heading1);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(side_heading1));
		
	   String SideHeading_name = driver.findElement(side_heading1).getText();
	   System.out.println("SideHeading_name 1= " + SideHeading_name);
		
	   Thread.sleep(5000);
		
	   String SideHeading_text = driver.findElement(SideHeading_TextHeading1).getText();
	   
	   System.out.println("SideHeading_text 1= " + SideHeading_text);
	   
	   assertEquals(SideHeading_name,SideHeading_text );
		
   }
	
	
    public void SideHeadin_2 () throws InterruptedException{
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
	   WebElement Element = driver.findElement(side_heading1);
	   js.executeScript("arguments[0].scrollIntoView();", Element);
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(side_heading2));
		
	   String SideHeading_name = driver.findElement(side_heading2).getText();
	   System.out.println("SideHeading_name 2= " + SideHeading_name);
		
	   driver.findElement(side_heading2).click();
	   Thread.sleep(5000);
		
	   String SideHeading_text = driver.findElement(SideHeading_TextHeading2).getText();
	   
	   System.out.println("SideHeading_text 2= " + SideHeading_text);
	   assertEquals(SideHeading_name,SideHeading_text );
   }
    
    public void SideHeadin_3 () throws InterruptedException{
 	   
 	   JavascriptExecutor js = (JavascriptExecutor) driver;
 		//js.executeScript("window.scrollBy(0,1000)");
 	   WebElement Element = driver.findElement(side_heading1);
 	   js.executeScript("arguments[0].scrollIntoView();", Element);
 	   
 	   WebDriverWait wait = new WebDriverWait(driver,30);
 	   wait.until(ExpectedConditions.visibilityOfElementLocated(side_heading3));
 		
 	   String SideHeading_name = driver.findElement(side_heading3).getText();
 	   System.out.println("SideHeading_name 3 = " + SideHeading_name);
 		
 	  driver.findElement(side_heading3).click();
 	   Thread.sleep(5000);
 		
 	   String SideHeading_text = driver.findElement(SideHeading_TextHeading3).getText();
 	   
 	   System.out.println("SideHeading_text 3= " + SideHeading_text);
 	  assertEquals(SideHeading_name,SideHeading_text );
 		
    }

    public void SideHeadin_4 () throws InterruptedException{
  	   
  	   JavascriptExecutor js = (JavascriptExecutor) driver;
  		//js.executeScript("window.scrollBy(0,1000)");
  	   WebElement Element = driver.findElement(side_heading1);
  	   js.executeScript("arguments[0].scrollIntoView();", Element);
  	   
  	   WebDriverWait wait = new WebDriverWait(driver,30);
  	   wait.until(ExpectedConditions.visibilityOfElementLocated(side_heading4));
  		
  	   String SideHeading_name = driver.findElement(side_heading4).getText();
  	   System.out.println("SideHeading_name 4 = " + SideHeading_name);
  	   
  	 driver.findElement(side_heading4).click();
  		
  	   Thread.sleep(5000);
  		
  	   String SideHeading_text = driver.findElement(SideHeading_TextHeading4).getText();
  	   
  	   System.out.println("SideHeading_text 4= " + SideHeading_text);
  	 assertEquals(SideHeading_name,SideHeading_text );
  		
     }
}
