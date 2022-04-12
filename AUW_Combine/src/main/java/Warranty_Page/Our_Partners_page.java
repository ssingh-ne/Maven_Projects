package Warranty_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class Our_Partners_page {

	WebDriver driver;
	
	
	By Partner_header = By.xpath("(//*[text()='Our Products'])[1]");
	By Partner1 = By.xpath("(//*[text()='Service Contracts & Extended Warranties'])[1]");
	By Partner2 = By.xpath("(//*[text()='Portable Electronics Insurance'])[1]");
	By Partner3 = By.xpath("(//*[text()='Travel Insurance'])[1]");
	By Partner4 = By.xpath("(//*[text()='Event Ticket Protection'])[1]");
	By Partner5 = By.xpath("(//*[text()='OEM and Distributor Programs'])[1]");
	By Partner6 = By.xpath("(//*[text()='Auto Dealership Program'])[1]");
	
	By Card1_Image = By.xpath("(//*[contains(@class,'blog-image')])[1]");
	By Card1_Text = By.xpath("(//*[contains(@class,'MuiGrid-root')]/div/a/div/div/div/p)[1]");
	By Card1_LearnMore = By.xpath("(//*[text()='Learn More'])[1]");
	
	By Card2_Image = By.xpath("(//*[contains(@class,'blog-image')])[2]");
	By Card2_Text = By.xpath("(//*[contains(@class,'MuiGrid-root')]/div/a/div/div/div/p)[3]");
	By Card2_LearnMore = By.xpath("(//*[text()='Learn More'])[2]");
	
	
	By PartnerTextPage = By.xpath("//*[@id='app']/div[2]/div/div/div[2]/h1");
	By PartnerTextPage_dev = By.xpath("//*[@id='__next']/div[2]/div/div/div[2]/h1");
	By More_products = By.xpath("//*[text()='More Products']");
	
	public Our_Partners_page (WebDriver driver){
		this.driver=driver;
	}
	
	public void PartnerHeader () throws InterruptedException {
		 Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner_header);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		
		 Thread.sleep(5000);
 		 driver.findElement(Partner_header).click();
		
		
	}
	
	public void Partner1 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner1);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner1).getText();
		 System.out.println("Partner 1 name = " + s);
		 driver.findElement(Partner1).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		//assertEquals(s, s2);
		// Assert.assertTrue(s2.contains(s),"Failure message") ; 
		
	}
	
	public void Partner1_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner1);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner1).getText();
		 System.out.println("Partner 1 name = " + s);
		 driver.findElement(Partner1).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		//assertEquals(s, s2);
		// Assert.assertTrue(s2.contains(s),"Failure message") ; 
		
	}
	
	public void Partner2 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner2);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);

		 String s = driver.findElement(Partner2).getText();
		 System.out.println("Partner 2 name = " + s);
		 driver.findElement(Partner2).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
		
	}
	
    public void Partner2_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner2);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);

		 String s = driver.findElement(Partner2).getText();
		 System.out.println("Partner 2 name = " + s);
		 driver.findElement(Partner2).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
		
	}
	
	public void Partner3 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner3);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		
		 String s = driver.findElement(Partner3).getText();
		 System.out.println("Partner 3 name = " + s);
		 driver.findElement(Partner3).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
		
	}
	
	public void Partner3_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner3);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		
		 String s = driver.findElement(Partner3).getText();
		 System.out.println("Partner 3 name = " + s);
		 driver.findElement(Partner3).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
		
	}
	
	public void Partner4 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner4);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(4000);
		 
		 String s = driver.findElement(Partner4).getText();
		 System.out.println("Partner 4 name = " + s);
		 driver.findElement(Partner4).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
	}
	
	public void Partner4_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner4);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(4000);
		 
		 String s = driver.findElement(Partner4).getText();
		 System.out.println("Partner 4 name = " + s);
		 driver.findElement(Partner4).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
	}
	
    public void Partner5 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner5);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner5).getText();
		 System.out.println("Partner 5 name = " + s);
		 driver.findElement(Partner5).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		//assertEquals(s, s2);

	    Assert.assertTrue(s2.contains(s),"Failure message") ; 
	}
	
    public void Partner5_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner5);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner5).getText();
		 System.out.println("Partner 5 name = " + s);
		 driver.findElement(Partner5).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		//assertEquals(s, s2);

	    Assert.assertTrue(s2.contains(s),"Failure message") ; 
	}
	
    public void Partner6 () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner6);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner6).getText();
		 System.out.println("Partner 6 name = " + s);
		 driver.findElement(Partner6).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
	}

    public void Partner6_dev () throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Partner6);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 Thread.sleep(2000);
		 
		 String s = driver.findElement(Partner6).getText();
		 System.out.println("Partner 6 name = " + s);
		 driver.findElement(Partner6).click();
		 
		 Thread.sleep(3000);
		String s2 = driver.findElement(PartnerTextPage_dev).getText();
		
		System.out.println("Partner name from page = " + s2);
		
		assertEquals(s, s2);
	}
    
	public  void card1 () throws InterruptedException {
		
		//click on image 
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Card1_Image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(2000);
		
		 driver.findElement(Card1_Image).click();
		 
		 Thread.sleep(3000);
		 
		 String IMG_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 1 URL from Image Click = " + IMG_URL );
		 
		 driver.navigate().back();
		
		 // click on text 
		 
		 WebElement Element1 = driver.findElement(Card1_Text);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 
		 Thread.sleep(2000);
			
		 driver.findElement(Card1_Text).click();
		 
		 Thread.sleep(3000);
		 
		 String Text_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 1 URL from Text Click = " + Text_URL );
		 
		 driver.navigate().back();
		 
		 // Click on learn more
		 Thread.sleep(3000);
		 WebElement Element2 = driver.findElement(Card1_LearnMore);
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		 
		 Thread.sleep(2000);
			
		 driver.findElement(Card1_LearnMore).click();
		 
		 Thread.sleep(3000);
		 
		 String LearnMore_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 1 URL from Learn More Click = " + LearnMore_URL );
		 
		 driver.navigate().back();
		 
		 assertEquals(IMG_URL, Text_URL);
		 assertEquals(IMG_URL, LearnMore_URL);
	}

    public  void card2 () throws InterruptedException {
		
		//click on image 
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement Element = driver.findElement(Card2_Image);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 Thread.sleep(2000);
		
		 driver.findElement(Card2_Image).click();
		 
		 Thread.sleep(3000);
		 
		 String IMG_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 2 URL from Image Click = " + IMG_URL );
		 
		 driver.navigate().back();
		
		 // click on text 
		 Thread.sleep(3000);
		 WebElement Element1 = driver.findElement(More_products);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 
		 Thread.sleep(5000);
			
		 driver.findElement(Card2_Text).click();
		 
		 Thread.sleep(3000);
		 
		 String Text_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 2 URL from Text Click = " + Text_URL );
		 
		 driver.navigate().back();
		 
		 // Click on learn more
		 Thread.sleep(3000);
		 WebElement Element2 = driver.findElement(More_products);
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		 
		 Thread.sleep(2000);
			
		 driver.findElement(Card2_LearnMore).click();
		 
		 Thread.sleep(3000);
		 
		 String LearnMore_URL = driver.getCurrentUrl();
		 
		 System.out.println("Card 2 URL from Learn More Click = " + LearnMore_URL );
		 
		 driver.navigate().back();
		 
		 assertEquals(IMG_URL, Text_URL);
		 assertEquals(IMG_URL, LearnMore_URL);
		
	}

}
