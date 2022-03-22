package Aerospace_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class News_page {
	
	
	WebDriver driver;
	
	
	By Heading_top = By.xpath("(//*[@id='contentBlock0'])[1]");
    
	By Image1 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[1]/div/div[1]/a/div/img");
    By Heading1 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[1]/div/div[1]/a/div/div/div/p[2]");
    
    By Image2 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[1]/div/div[2]/a/div/img");
    By Heading2 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[1]/div/div[2]/a/div/div/div/p[2]");
    
    By Image3 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/a/div/img");
    By Heading3 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[1]/a/div/div/div/p[2]");
    
    By Image4 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[2]/a/div/img");
    By Heading4 = By.xpath("//*[@id='__next']/div/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[2]/a/div/div/div/p[2]");
    
    By Page_heading = By.xpath("//*[@id='foreground']/div/div[1]/h1");

	public News_page (WebDriver driver){
		this.driver=driver;
	}

	public void Top_heading () {
		
		boolean Heading1 = driver.findElement(Heading_top).isDisplayed();
		
		String Heading = driver.findElement(Heading_top).getText();
		
		System.out.println("Top heading of News page = " + Heading );
		
		System.out.println("Heading is visible = " + Heading1);
		
	}
	
	public void News_image1 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	    WebElement Element = driver.findElement(Image1);
   	    js.executeScript("arguments[0].scrollIntoView();", Element);
	  
   	    Thread.sleep(3000);
   	    
		driver.findElement(Image1).click();
		
		Thread.sleep(5000);
		
		String Page_heading1 = driver.findElement(Page_heading).getText();
		
		System.out.println("Image 1 redirection Heading = " + Page_heading1);
		
		String URL1 = driver.getCurrentUrl();
		System.out.println("Image 1 redirection URL = " + URL1);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
   	    WebElement Element1 = driver.findElement(Heading1);
   	    js.executeScript("arguments[0].scrollIntoView();", Element1);
		
   	    Thread.sleep(3000);
	    
		driver.findElement(Heading1).click();
		
		Thread.sleep(5000);
		
		String Page_heading2 = driver.findElement(Page_heading).getText();
		
		System.out.println("Heading 1 redirection Heading = " + Page_heading2);
		
		String URL2 = driver.getCurrentUrl();
		System.out.println("Heading 1 redirection URL = " + URL2);
		
        driver.navigate().back();
		
		Thread.sleep(5000);
		
		Assert.assertEquals(Page_heading1, Page_heading2, "Image 1 redirection is different");
		Assert.assertEquals(URL1, URL2, "Heading 1 redirection is different");
	}
	
    public void News_image2 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/* WebElement Element = driver.findElement(Image2);
   	    js.executeScript("arguments[0].scrollIntoView();", Element);
	  
   	    Thread.sleep(5000);*/
   	    
		driver.findElement(Image2).click();
		
		Thread.sleep(5000);
		
		String Page_heading1 = driver.findElement(Page_heading).getText();
		
		System.out.println("Image 2 redirection Heading = " + Page_heading1);
		
		String URL1 = driver.getCurrentUrl();
		System.out.println("Image 2 redirection URL = " + URL1);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
   	    WebElement Element2 = driver.findElement(Heading2);
   	    js.executeScript("arguments[0].scrollIntoView();", Element2);
		
   	    Thread.sleep(3000);
	    
		driver.findElement(Heading2).click();
		
		Thread.sleep(5000);
		
		String Page_heading2 = driver.findElement(Page_heading).getText();
		
		System.out.println("Heading 2 redirection Heading = " + Page_heading2);
		
		String URL2 = driver.getCurrentUrl();
		System.out.println("Heading 2 redirection URL = " + URL2);
		
        driver.navigate().back();
		
		Thread.sleep(5000);
		

		Assert.assertEquals(Page_heading1, Page_heading2, "Image 2 redirection is different");
		Assert.assertEquals(URL1, URL2, "Heading 2 redirection is different");
		
	}

    public void News_image3 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	    WebElement Element = driver.findElement(Image3);
   	    js.executeScript("arguments[0].scrollIntoView();", Element);
	  
   	    Thread.sleep(3000);
   	    
		driver.findElement(Image3).click();
		
		Thread.sleep(5000);
		
		String Page_heading1 = driver.findElement(Page_heading).getText();
		
		System.out.println("Image 3 redirection Heading = " + Page_heading1);
		
		String URL1 = driver.getCurrentUrl();
		System.out.println("Image 3 redirection URL = " + URL1);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
   	    WebElement Element2 = driver.findElement(Heading3);
   	    js.executeScript("arguments[0].scrollIntoView();", Element2);
		
   	    Thread.sleep(3000);
	    
		driver.findElement(Heading3).click();
		
		Thread.sleep(5000);
		
		String Page_heading2 = driver.findElement(Page_heading).getText();
		
		System.out.println("Heading 3 redirection Heading = " + Page_heading2);
		
		String URL2 = driver.getCurrentUrl();
		System.out.println("Heading 3 redirection URL = " + URL2);
		
        driver.navigate().back();
		
		Thread.sleep(5000);

		Assert.assertEquals(Page_heading1, Page_heading2, "Image 3 redirection is different");
		Assert.assertEquals(URL1, URL2, "Heading 3 redirection is different");
	}

    public void News_image4 () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
   	   /* WebElement Element = driver.findElement(Image4);
   	    js.executeScript("arguments[0].scrollIntoView();", Element);
	  
   	    Thread.sleep(3000);*/
   	    
		driver.findElement(Image4).click();
		
		Thread.sleep(5000);
		
		String Page_heading1 = driver.findElement(Page_heading).getText();
		
		System.out.println("Image 4 redirection Heading = " + Page_heading1);
		
		String URL1 = driver.getCurrentUrl();
		System.out.println("Image 4 redirection URL = " + URL1);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
   	    WebElement Element2 = driver.findElement(Heading4);
   	    js.executeScript("arguments[0].scrollIntoView();", Element2);
		
   	    Thread.sleep(3000);
	    
		driver.findElement(Heading4).click();
		
		Thread.sleep(5000);
		
		String Page_heading2 = driver.findElement(Page_heading).getText();
		
		System.out.println("Heading 4 redirection Heading = " + Page_heading2);
		
		String URL2 = driver.getCurrentUrl();
		System.out.println("Heading 4 redirection URL = " + URL2);
		
        driver.navigate().back();
		
		Thread.sleep(5000);

		Assert.assertEquals(Page_heading1, Page_heading2, "Image 4 redirection is different");
		Assert.assertEquals(URL1, URL2, "Heading 4 redirection is different");
		
	}


	
}
