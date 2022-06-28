package AUW_Pages;

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

public class Practices_ForagentsAndBrokers {
	
WebDriver driver;
	
	public Practices_ForagentsAndBrokers (WebDriver driver){
		this.driver =driver;
	}

	By Practices_link = By.xpath("//*[text()='Practices']");
	By AgentsandBrokers = By.xpath("//*[text()='For Agents & Brokers']");
	By Prompt_continue_btn = By.xpath("//*[text()='Continue']");
	
	By AgentBroker_content = By.xpath("//*[text()='Welcome Agents & Brokers']");
	
	By Column1_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[1]");
	By Column2_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[2]");
	By Column3_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[3]");
	By Column4_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[4]");
	By Column5_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[5]");
	By Column6_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[6]");
	By Column7_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[7]");
	By Column8_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[8]");
	By Column9_Heading  = By.xpath("(//*[@rel='noopener noreferrer'])[9]");
	By Column10_Heading = By.xpath("(//*[@rel='noopener noreferrer'])[10]");
	By Column11_Heading = By.xpath("(//*[@rel='noopener noreferrer'])[11]");
	By Column12_Heading = By.xpath("(//*[@rel='noopener noreferrer'])[12]");
	By Contact_US       = By.xpath("(//*[@rel='noopener noreferrer'])[13]");
	
	String Exp_Coumn1_URL  = "https://www.moretolove.auw.com/what-we-offer/workers-compensation"; 
	String Exp_Coumn2_URL  = "https://www.moretolove.auw.com/what-we-offer/transportation-liability"; 
	String Exp_Coumn3_URL  = "https://www.moretolove.auw.com/what-we-offer/construction-p-e"; 
	String Exp_Coumn4_URL  = "https://www.moretolove.auw.com/what-we-offer/homeowners-wildfire"; 
	String Exp_Coumn5_URL  = "https://www.moretolove.auw.com/what-we-offer/fine-art-collections"; 
	String Exp_Coumn6_URL  = "https://www.moretolove.auw.com/what-we-offer/aerospace";
	String Exp_Coumn7_URL  = "https://www.moretolove.auw.com/what-we-offer/enviro-pollution"; 
	String Exp_Coumn8_URL  = "https://www.moretolove.auw.com/what-we-offer/financial-lines"; 
	String Exp_Coumn9_URL  = "https://www.moretolove.auw.com/what-we-offer/structured-insurance"; 
	String Exp_Coumn10_URL  = "https://www.moretolove.auw.com/what-we-offer/property"; 
	String Exp_Coumn11_URL = "https://www.moretolove.auw.com/what-we-offer/fronting-programs"; 
	String Exp_Coumn12_URL = "https://www.moretolove.auw.com/what-we-offer/reinsurance"; 
	String Exp_contactUs   = "https://www.bigdoghq.com/";
	
	public void  Practices_link_agentBrokers () throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,30);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(Practices_link));
	 		
	 	driver.findElement(Practices_link).click(); 
	 	Thread.sleep(1000);
	 	driver.findElement(AgentsandBrokers).click(); 
	 	Thread.sleep(3000);
		driver.findElement(Prompt_continue_btn).click();
	}
	
    public void  AgentBroker_subheader () throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,30);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(AgentBroker_content));
	 		
	 	boolean subheader = driver.findElement(AgentBroker_content).isDisplayed();
	 	
	 	System.out.println("Subheader = "+subheader);
	 	
	}
	
    public void Column1_Heading () throws InterruptedException{
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 WebElement Element = driver.findElement(Column1_Heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 WebDriverWait wait = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column1_Heading));
		
		 driver.findElement(Column1_Heading).click();

		 Thread.sleep(3000);
		 Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
         String Heading1URL =  driver.getCurrentUrl();
         System.out.println("Heading1URL = " + Heading1URL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         assertEquals(Heading1URL, Exp_Coumn1_URL);
		 	
    	
    }
    
    public void Column2_Heading () throws InterruptedException{
    	
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 WebElement Element = driver.findElement(Column2_Heading);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 WebDriverWait wait = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column2_Heading));
		 
		 driver.findElement(Column2_Heading).click();
		 Thread.sleep(3000);
		 Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
        String Heading2URL =  driver.getCurrentUrl();
        System.out.println("Heading2URL = " + Heading2URL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
        
        assertEquals(Heading2URL, Exp_Coumn2_URL);
		 	
   	
   }
    
    public void Column3_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column3_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column3_Heading));
   		 
   		 driver.findElement(Column3_Heading).click();
   		 Thread.sleep(3000);
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading3URL =  driver.getCurrentUrl();
           System.out.println("Heading3URL = " + Heading3URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading3URL, Exp_Coumn3_URL);
   		
      }

    public void Column4_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column4_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column4_Heading));
   		 
   		 driver.findElement(Column4_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading4URL =  driver.getCurrentUrl();
           System.out.println("Heading4URL = " + Heading4URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading4URL, Exp_Coumn4_URL);
   		 	
      }
    
    public void Column5_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column5_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column5_Heading));
   		 
   		 driver.findElement(Column5_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading5URL =  driver.getCurrentUrl();
           System.out.println("Heading5URL = " + Heading5URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading5URL, Exp_Coumn5_URL);
   	
      }

    public void Column6_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column6_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column6_Heading));
   		 
   		 driver.findElement(Column6_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading6URL =  driver.getCurrentUrl();
           System.out.println("Heading6URL = " + Heading6URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading6URL, Exp_Coumn6_URL);
   	
      }

    public void Column7_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column7_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column7_Heading));
   		 
   		 driver.findElement(Column7_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading7URL =  driver.getCurrentUrl();
           System.out.println("Heading7URL = " + Heading7URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading7URL, Exp_Coumn7_URL);
   	
      }
    
    public void Column8_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column8_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column8_Heading));
   		 
   		 driver.findElement(Column8_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading8URL =  driver.getCurrentUrl();
           System.out.println("Heading8URL = " + Heading8URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading8URL, Exp_Coumn8_URL);
   	
      }

    public void Column9_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column9_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column9_Heading));
   		 
   		 driver.findElement(Column9_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading9URL =  driver.getCurrentUrl();
           System.out.println("Heading9URL = " + Heading9URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading9URL, Exp_Coumn9_URL);
   	
      }

    public void Column10_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column10_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column10_Heading));
   		 
   		 driver.findElement(Column10_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading10URL =  driver.getCurrentUrl();
           System.out.println("Heading10URL = " + Heading10URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading10URL, Exp_Coumn10_URL);
   	
      }

    public void Column11_Heading () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Column11_Heading);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column11_Heading));
   		 
   		 driver.findElement(Column11_Heading).click();
   		 Thread.sleep(3000);
   		 
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Heading11URL =  driver.getCurrentUrl();
           System.out.println("Heading11URL = " + Heading11URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Heading11URL, Exp_Coumn11_URL);
   	
      }
    
    public void Column12_Heading () throws InterruptedException{
    	
     	 JavascriptExecutor js = (JavascriptExecutor) driver;
  		
  		 WebElement Element = driver.findElement(Column11_Heading);
  		 js.executeScript("arguments[0].scrollIntoView();", Element);
  		 
  		 WebDriverWait wait = new WebDriverWait(driver,60);
  		 wait.until(ExpectedConditions.visibilityOfElementLocated(Column12_Heading));
  		 
  		 driver.findElement(Column12_Heading).click();
  		 Thread.sleep(3000);
  		 
  		 Set<String> handlesSet = driver.getWindowHandles();
          List<String> handlesList = new ArrayList<String>(handlesSet);
          driver.switchTo().window(handlesList.get(1));
          String Heading11URL =  driver.getCurrentUrl();
          System.out.println("Heading12URL = " + Heading11URL);
          driver.close();
          driver.switchTo().window(handlesList.get(0));
          
          assertEquals(Heading11URL, Exp_Coumn12_URL);
  	
     }

    public void Contact_US () throws InterruptedException{
    	
      	 JavascriptExecutor js = (JavascriptExecutor) driver;
   		
   		 WebElement Element = driver.findElement(Contact_US);
   		 js.executeScript("arguments[0].scrollIntoView();", Element);
   		 
   		 WebDriverWait wait = new WebDriverWait(driver,60);
   		 wait.until(ExpectedConditions.visibilityOfElementLocated(Contact_US));
   		 
   		 driver.findElement(Contact_US).click();
   		 Thread.sleep(5000);
   		 Set<String> handlesSet = driver.getWindowHandles();
           List<String> handlesList = new ArrayList<String>(handlesSet);
           driver.switchTo().window(handlesList.get(1));
           String Contact_US_URL =  driver.getCurrentUrl();
           System.out.println("Contact_US_URL = " + Contact_US_URL);
           driver.close();
           driver.switchTo().window(handlesList.get(0));
           
           assertEquals(Contact_US_URL, Exp_contactUs);
   	
      }



}
