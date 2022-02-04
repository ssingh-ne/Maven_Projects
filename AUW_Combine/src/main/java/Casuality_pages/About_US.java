package Casuality_pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class About_US {
	
	WebDriver driver;
	
	By Abuout_us_Menu = By.xpath("//*[text()='About Us']");
	
	By Side_heading1  = By.xpath("//*[@id='sticky-nav']/ul/li[1]/div/a");
	By side_heading1_text = By.xpath("//*[@id='our-affiliates']/section/div/div/div/div/h3");
	By AUW = By.xpath("//*[text()='auw.com']");
	
	By Side_heading2 = By.xpath("//*[@id='sticky-nav']/ul/li[2]/div/a");
	By side_heading2_text = By.xpath("//*[@id='contentBlock0']/h3");
	
	By Side_heading3 = By.xpath("//*[@id='sticky-nav']/ul/li[3]/div/a");
	By side_heading3_text = By.xpath("//*[@id='our-values']/section/div/div/div/div/div/div/div[2]/div/div/div/h3");
	
	By Side_heading4 =  By.xpath("//*[@id='sticky-nav']/ul/li[4]/div/a");
	By side_heading4_text = By.xpath("//*[@id='our-carriers']/section/div/div/div/div/h4");
	By LearnMore = By.xpath("//*[text()='Learn More →']");
	
	String Exp_SideHeading_text1 = "Together with Applied and United";
	String Exp_url = "our-carriers";
	
	
	
	public About_US (WebDriver driver){
		this.driver=driver;
	}
	
	public void About_click ()throws InterruptedException{
		
		Thread.sleep(3000);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Abuout_us_Menu);
		 js.executeScript("arguments[0].scrollIntoView();", Element);

			driver.findElement(Abuout_us_Menu).click();
		
		
		
	}
	
    public void sideHeading_1 () throws InterruptedException{
	
	Thread.sleep(3000);
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Side_heading1);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	
	String heading_text = driver.findElement(Side_heading1).getText();
	System.out.println("Side Heading 1 = " + heading_text);
	
	driver.findElement(Side_heading1).click();
	
	String heading_text1 = driver.findElement(side_heading1_text).getText();
	System.out.println("Side Heading text = " + heading_text1);
	
	// click on AUW.com
	 driver.findElement(AUW).click();
	 
	 Set<String> handlesSet = driver.getWindowHandles();
     List<String> handlesList = new ArrayList<String>(handlesSet);
     driver.switchTo().window(handlesList.get(1));
    String TwitterURL =  driver.getCurrentUrl();
    System.out.println("AUW.com  = " + TwitterURL);
     driver.close();
     driver.switchTo().window(handlesList.get(0));
    
	
	Assert.assertEquals(heading_text1, Exp_SideHeading_text1);
	
}
	
    public void sideHeading_2 () throws InterruptedException{
    	
	Thread.sleep(3000);
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement Element = driver.findElement(Side_heading2);
	 js.executeScript("arguments[0].scrollIntoView();", Element);
		
	 Thread.sleep(2000);
	
	String heading_text = driver.findElement(Side_heading2).getText();
	System.out.println("Side Heading 2 = " + heading_text);
	
	driver.findElement(Side_heading2).click();
	
	String heading_text2 = driver.findElement(side_heading2_text).getText();
	System.out.println("Side Heading text = " + heading_text2);
	
	Assert.assertEquals(heading_text, heading_text2);
	
}
    public void sideHeading_3 () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 WebElement Element = driver.findElement(Side_heading3);
    	 js.executeScript("arguments[0].scrollIntoView();", Element);
    		
    	 Thread.sleep(2000);
    	
    	String heading_text = driver.findElement(Side_heading3).getText();
    	System.out.println("Side Heading 3 = " + heading_text);
    	
    	driver.findElement(Side_heading3).click();
    	
    	String heading_text3 = driver.findElement(side_heading3_text).getText();
    	System.out.println("Side Heading text = " + heading_text3);
    	
    	Assert.assertEquals(heading_text, heading_text3);
    	
    }
    
    public void sideHeading_4 () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 WebElement Element = driver.findElement(Side_heading4);
    	 js.executeScript("arguments[0].scrollIntoView();", Element);
    		
    	 Thread.sleep(2000);
    	
    	String heading_text = driver.findElement(Side_heading4).getText();
    	System.out.println("Side Heading 4 = " + heading_text);
    	
    	driver.findElement(Side_heading4).click();
    	
    	String heading_text4 = driver.findElement(side_heading4_text).getText();
    	System.out.println("Side Heading text 4= " + heading_text4);
    	
    	Assert.assertEquals(heading_text, heading_text4);
    	
    }
    	
    public void Learn_more () throws InterruptedException{
    	
    	Thread.sleep(3000);
    	
   	 JavascriptExecutor js = (JavascriptExecutor) driver;
   	 WebElement Element = driver.findElement(LearnMore);
   	 js.executeScript("arguments[0].scrollIntoView();", Element);
   		
   	 Thread.sleep(2000);
   	 
   	 driver.findElement(LearnMore).click();
   	Thread.sleep(3000);
   	 String URL =driver.getCurrentUrl();
   	 System.out.println("Learn More = " + URL);
   	 
   	Assert.assertTrue(URL.contains(Exp_url),"Failure message") ;
    	
    }
}
