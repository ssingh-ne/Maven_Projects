package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WhatsNewPage {
	
	WebDriver driver;
	
	//div[contains(@class, 'fadeAltClass-1')]/div/a
	
	By Image1 = By.xpath("(//*[@alt='News Article Image Text'])[1]");
	By Image1_URL = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div[1]/div/div/div[1]/div/a");
	By Image2 = By.xpath("(//*[@alt='News Article Image Text'])[2]");
	By Image2_URL = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div[1]/div/div/div[2]/div/a");
	By Image3 = By.xpath("(//*[@alt='News Article Image Text'])[3]");
	By Image3_URL = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/a");
	By Image4 = By.xpath("(//*[@alt='News Article Image Text'])[4]");
	By Image4_URL = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div/div[2]/div/div[2]/div/a");
	By LoadMore	= By.xpath("//*[text()='LOAD MORE NEWS']");
	
	By Text1 = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div[1]/div/div/div[1]/div/a/div/div/div/p[2]");
	By Text2 = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div[1]/div/div/div[2]/div/a/div/div/div/p[2]");
	By Text3 = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div/div[2]/div/div[1]/div/a/div/div/div/p[2]");
	By Text4 = By.xpath("//*[@id='__next']/div[2]/div[5]/div/div/div/div/div[2]/div/div[2]/div/a/div/div/div/p[2]");
	
	
	public WhatsNewPage (WebDriver driver){
		this.driver=driver;
	}

	public void Twonewsvisible () throws InterruptedException {
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(LoadMore);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(3000);
		   
		     boolean Image_three = driver.findElement(Image3).isDisplayed();
		   
		   System.out.println("Image 3 is visible = " + Image_three);
		   

		   boolean Image_four = driver.findElement(Image4).isDisplayed();
		   
		   System.out.println("Image 3 is visible = " + Image_four);
		   

		   WebElement Element1 = driver.findElement(LoadMore);
		   js.executeScript("arguments[0].scrollIntoView();", Element1);
		   Thread.sleep(3000);

		   boolean LoadMoreBtn = driver.findElement(LoadMore).isDisplayed();
		   
		   System.out.println("Load more Button is visible = " + LoadMoreBtn);
		
	}
	
	public void News1 () throws InterruptedException {
		   
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(Image1);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(5000);
		   
		   String s = driver.findElement(Image1_URL).getAttribute("href");
		   
		   System.out.println("Image 1 URL = " + s);
	// Image click	   
		   driver.findElement(Image1).click();
		   Thread.sleep(3000);
		   
		   String currentImgURL1 = driver.getCurrentUrl();
		   System.out.println("Image Url = " + currentImgURL1);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(3000);
		   
	// click on text 1
		   driver.findElement(Text1).click();
		   Thread.sleep(3000);
		   
		   String currentTextURL1 = driver.getCurrentUrl();
		   System.out.println("Image Url = " + currentTextURL1);
		   
		   driver.navigate().back();
 		   
		   WebElement Element11 = driver.findElement(Image2);
		   js.executeScript("arguments[0].scrollIntoView();", Element11);
		   
           Thread.sleep(3000);
	// Image 2 click	   
		   String s1 = driver.findElement(Image2_URL).getAttribute("href");
		   
		   System.out.println("Image 2 URL = " + s1);
		   
		   driver.findElement(Image2).click();
		   Thread.sleep(3000);
		   
		   String currentImgURL2 = driver.getCurrentUrl();
		   System.out.println("After Click Image Url 2 = " + currentImgURL2);
		   
		   driver.navigate().back();
		   
		// click on text 1
		   driver.findElement(Text2).click();
		   Thread.sleep(3000);
		   
		   String currentTextURL2 = driver.getCurrentUrl();
		   System.out.println("Text Url 2 = " + currentTextURL2);
		   
		   driver.navigate().back();
 		   
		   Assert.assertEquals(currentImgURL1, s);
		   Assert.assertEquals(currentTextURL1, s);
		   
		   Assert.assertEquals(currentImgURL2, s1);
		   Assert.assertEquals(currentTextURL2, s);
	   }
	
	public void LoadMore () throws InterruptedException {
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement Element = driver.findElement(Image2);
		   js.executeScript("arguments[0].scrollIntoView();", Element);
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(LoadMore).click();
		   
		   Thread.sleep(2000);
		   
 String s = driver.findElement(Image3_URL).getAttribute("href");
		   
		   System.out.println("Image 3 URL = " + s);
		   
	// Image click	3   
		   driver.findElement(Image3).click();
		   Thread.sleep(3000);
		   
		   String currentImgURL3 = driver.getCurrentUrl();
		   System.out.println("After Click Image Url 3 = " + currentImgURL3);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(3000);
		   
	// click on text 1
		   WebElement Element1 = driver.findElement(Image2);
		   js.executeScript("arguments[0].scrollIntoView();", Element1);
		   
          driver.findElement(LoadMore).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(Text3).click();
		   Thread.sleep(3000);
		   
		   String currentTextURL3 = driver.getCurrentUrl();
		   System.out.println("Text Url 3 = " + currentTextURL3);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(2000);
		   WebElement Element2 = driver.findElement(Image2);
		   js.executeScript("arguments[0].scrollIntoView();", Element2);
		   
		   Thread.sleep(2000);
           driver.findElement(LoadMore).click();
		   
		   Thread.sleep(2000);
		  
		   
 // Click on Image 4 
		   WebElement Element11 = driver.findElement(Image4);
		   js.executeScript("arguments[0].scrollIntoView();", Element11);
		   
           Thread.sleep(3000);
		   
		   String s1 = driver.findElement(Image4_URL).getAttribute("href");
		   
		   System.out.println("Image 4 URL = " + s1);
		   
		   driver.findElement(Image4).click();
		   Thread.sleep(3000);
		   
		   String currentImgURL4 = driver.getCurrentUrl();
		   System.out.println("After Click Image Url 4 = " + currentImgURL4);
		   
		   driver.navigate().back();
		   
		   Thread.sleep(2000);
		   
		   WebElement Element3 = driver.findElement(Image2);
		   js.executeScript("arguments[0].scrollIntoView();", Element3);
		   
		   Thread.sleep(2000);
		   
           driver.findElement(LoadMore).click();
		   
		   Thread.sleep(2000);
		   
		// click on text 4
		   driver.findElement(Text4).click();
		   Thread.sleep(3000);
		   
		   String currentTextURL4 = driver.getCurrentUrl();
		   System.out.println("Text Url 4 = " + currentTextURL4);
		   
		   driver.navigate().back();
 		   
		   Assert.assertEquals(currentImgURL3, s);
		   Assert.assertEquals(currentTextURL3, s);
		   
		   Assert.assertEquals(currentImgURL4, s1);
		   Assert.assertEquals(currentTextURL4, s);
		
		
		
	}
	
	
}
