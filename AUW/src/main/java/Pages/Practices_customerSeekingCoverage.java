package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practices_customerSeekingCoverage {

WebDriver driver;
	
	public Practices_customerSeekingCoverage (WebDriver driver){
		this.driver =driver;
	}

	By Practices_link = By.xpath("//*[text()='Practices']");
	By CustomerSeekingCoverage = By.xpath("//*[text()='For Customers Seeking Coverage']");
	
	By Image1 =By.xpath("//*[@id='app']/main/div[2]/div[1]/a/div/img");
	By Text1 =By.xpath("//*[@id='app']/main/div[2]/div[1]/a/div/div/div/p");
	By LearnMore1 =By.xpath("(//*[text()='Learn More'])[1]");
	
	
	By Image2 =By.xpath("(//*[@alt='Transportation'])");
	By Text2 =By.xpath("(//*[text()='Transportation'])");
	By LearnMore2 =By.xpath("(//*[text()='Learn More'])[2]");
	
	By Image3 =By.xpath("(//*[@alt='Homeowners Wildfire'])");
	By Text3 =By.xpath("(//*[text()='Homeowners Including'])");
	By LearnMore3 =By.xpath("(//*[text()='Learn More'])[3]");
	
	By Image4 =By.xpath("(//*[@alt='Fine Arts & Collections'])");
	By Text4 =By.xpath("(//*[text()='Fine Art & Collections'])");
	By LearnMore4 =By.xpath("(//*[text()='Learn More'])[4]");
	
	By Image5 =By.xpath("(//*[@alt='Financial Lines'])");
	By Text5 =By.xpath("(//*[text()='Financial Lines'])");
	By LearnMore5 =By.xpath("(//*[text()='Learn More'])[5]");
	
	By Image6 =By.xpath("(//*[@alt='Environmental & Pollution'])");
	By Text6 =By.xpath("(//*[text()='Environmental & Pollution'])");
	By LearnMore6 =By.xpath("(//*[text()='Learn More'])[6]");
	
	By Image7 =By.xpath("//*[@alt='Shared & Layered Property']");
	By Text7 =By.xpath("//*[text()='Shared & Layered Property']");
	By LearnMore7 =By.xpath("//*[text()='Learn more']");
	
	String Exp_URL1 = "https://develop--auw.netlify.app/practices/customers/workers-compensation";
	String Exp_URL2 = "https://develop--auw.netlify.app/practices/customers/transportation";
	String Exp_URL3 = "https://develop--auw.netlify.app/practices/customers/homeowners-wildfire";
	String Exp_URL4 = "https://develop--auw.netlify.app/practices/customers/art-collections";
	String Exp_URL5 = "https://develop--auw.netlify.app/practices/customers/financial-lines";
	String Exp_URL6 = "https://develop--auw.netlify.app/practices/customers/environmental-pollution";
	String Exp_URL7 = "https://develop--auw.netlify.app/practices/customers/property";
	
	
    public void  Practices_link_CustomerSeekingCoverage () throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,60);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(Practices_link));
	 		
	 	driver.findElement(Practices_link).click(); 
	 	Thread.sleep(1000);
	 	driver.findElement(CustomerSeekingCoverage).click(); 
	 	
	}
	
	// Heading 1
   
	public void CustomerSeekingCoverage_Heading1 () throws InterruptedException {
		
		// Click on Image 
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			
		 WebElement Element = driver.findElement(Image1);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 WebDriverWait wait = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Image1));
		 
		 driver.findElement(Image1).click();
		  Thread.sleep(3000);
		 String Image_URL = driver.getCurrentUrl();
		 System.out.println("Image 1 URL =" + Image_URL);
		 
		 
		 driver.navigate().back();
		 
		 // Click on Text
		 
		 Thread.sleep(5000);
		 WebElement Element1 = driver.findElement(Text1);
		 js.executeScript("arguments[0].scrollIntoView();", Element1);
		 
		 WebDriverWait wait1 = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Image1));
		 
		 driver.findElement(Text1).click();
		  Thread.sleep(3000);
		 String Text_URL = driver.getCurrentUrl();
		 System.out.println("Text 1 URL =" + Text_URL);
		 
		 
		 driver.navigate().back();
    // Click on learn more
		 Thread.sleep(5000);
		 
		 WebElement Element2 = driver.findElement(LearnMore1);
		 js.executeScript("arguments[0].scrollIntoView();", Element2);
		 
		 WebDriverWait wait2 = new WebDriverWait(driver,60);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(Image1));
		 
		 driver.findElement(LearnMore1).click();
		  Thread.sleep(3000);
		 String LearnMore_URL = driver.getCurrentUrl();
		 System.out.println("Learn_More 1 URL =" + LearnMore_URL);
		 
		 
		 driver.navigate().back();
		 
		 Assert.assertEquals(Image_URL, Exp_URL1);
		 Assert.assertEquals(Text_URL, Exp_URL1);
		 Assert.assertEquals(LearnMore_URL, Exp_URL1);
		 
		 
	}

	// heading 2
	
	public void CustomerSeekingCoverage_Heading2 () throws InterruptedException {
		
	     // Click on Image 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				
			 WebElement Element = driver.findElement(Image2);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
			 WebDriverWait wait = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image2));
			 
			 driver.findElement(Image2).click();
			  Thread.sleep(3000);
			 String Image_URL = driver.getCurrentUrl();
			 System.out.println("Image 2 URL =" + Image_URL);
			 
			 
			 driver.navigate().back();
			 
		// Click on Text
			 
			 Thread.sleep(5000);
			 WebElement Element1 = driver.findElement(Text2);
			 js.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image2));
			 
			 driver.findElement(Text2).click();
			  Thread.sleep(3000);
			 String Text_URL = driver.getCurrentUrl();
			 System.out.println("Text 2 URL =" + Text_URL);
			 
			 
			 driver.navigate().back();
			
	    // Click on learn more
			 Thread.sleep(5000);
			 
			 WebElement Element2 = driver.findElement(LearnMore2);
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 WebDriverWait wait2 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(LearnMore2));
			 Thread.sleep(5000);
			 driver.findElement(LearnMore2).click();
			  Thread.sleep(3000);
			 String LearnMore_URL = driver.getCurrentUrl();
			 System.out.println("Learn_More 2 URL =" + LearnMore_URL);
			 
			 
			 driver.navigate().back();
			 
			 Assert.assertEquals(Image_URL, Exp_URL2);
			 Assert.assertEquals(Text_URL, Exp_URL2);
			 Assert.assertEquals(LearnMore_URL, Exp_URL2);
			 
			 
		}

   // Heading 3 
	
	public void CustomerSeekingCoverage_Heading3 () throws InterruptedException {
		
	     // Click on Image 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				
			 WebElement Element = driver.findElement(Image3);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
			 WebDriverWait wait = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image3));
			 
			 driver.findElement(Image3).click();
			  Thread.sleep(3000);
			 String Image_URL = driver.getCurrentUrl();
			 System.out.println("Image 3 URL =" + Image_URL);
			 
			 driver.navigate().back();
			 
		// Click on Text
			 
			 Thread.sleep(5000);
			 WebElement Element1 = driver.findElement(Text3);
			 js.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image3));
			 
			 driver.findElement(Text3).click();
			  Thread.sleep(3000);
			 String Text_URL = driver.getCurrentUrl();
			 System.out.println("Text 3 URL =" + Text_URL);
			 
			 
			 driver.navigate().back();
			
	    // Click on learn more
			 Thread.sleep(10000);
			 
			 WebElement Element2 = driver.findElement(Image3);
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 WebDriverWait wait2 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(LearnMore3));
			 Thread.sleep(3000);
			 driver.findElement(LearnMore3).click();
			  Thread.sleep(3000);
			 String LearnMore_URL = driver.getCurrentUrl();
			 System.out.println("Learn_More 3 URL =" + LearnMore_URL);
			 
			 
			 driver.navigate().back();
			 
			 Assert.assertEquals(Image_URL, Exp_URL3);
			 Assert.assertEquals(Text_URL, Exp_URL3);
			 Assert.assertEquals(LearnMore_URL, Exp_URL3);
			 
			 
		}


   // Heading 4
	
	public void CustomerSeekingCoverage_Heading4 () throws InterruptedException {
		
	     // Click on Image 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				
			 WebElement Element = driver.findElement(Image4);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
			 WebDriverWait wait = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image4));
			 
			 driver.findElement(Image4).click();
			  Thread.sleep(3000);
			 String Image_URL = driver.getCurrentUrl();
			 System.out.println("Image 4 URL =" + Image_URL);
			 
			 driver.navigate().back();
			 
		// Click on Text
			 
			 Thread.sleep(5000);
			 WebElement Element1 = driver.findElement(Text4);
			 js.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image4));
			 
			 driver.findElement(Text4).click();
			  Thread.sleep(3000);
			 String Text_URL = driver.getCurrentUrl();
			 System.out.println("Text 4 URL =" + Text_URL);
			 
			 driver.navigate().back();
			 
	    // Click on learn more
			 Thread.sleep(10000);
			 
			 WebElement Element2 = driver.findElement(LearnMore4);
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 WebDriverWait wait2 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image4));
			 Thread.sleep(3000);
			 driver.findElement(LearnMore4).click();
			  Thread.sleep(3000);
			 String LearnMore_URL = driver.getCurrentUrl();
			 System.out.println("Learn_More 4 URL =" + LearnMore_URL);
			 
			 driver.navigate().back();
			 
			 Assert.assertEquals(Image_URL, Exp_URL4);
			 Assert.assertEquals(Text_URL, Exp_URL4);
			 Assert.assertEquals(LearnMore_URL, Exp_URL4);
			 
			 
		}
	
   // Heading 5
	
	public void CustomerSeekingCoverage_Heading5 () throws InterruptedException {
		
	     // Click on Image 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				
			 WebElement Element = driver.findElement(Image5);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
			 WebDriverWait wait = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image5));
			 
			 driver.findElement(Image5).click();
			  Thread.sleep(3000);
			 String Image_URL = driver.getCurrentUrl();
			 System.out.println("Image 5 URL =" + Image_URL);
			 
			 driver.navigate().back();
			 
		// Click on Text
			 
			 Thread.sleep(5000);
			 WebElement Element1 = driver.findElement(Text5);
			 js.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image5));
			 
			 driver.findElement(Text5).click();
			  Thread.sleep(3000);
			 String Text_URL = driver.getCurrentUrl();
			 System.out.println("Text 5 URL =" + Text_URL);
			 
			 driver.navigate().back();
			 
	    // Click on learn more
			 Thread.sleep(10000);
			 
			 WebElement Element2 = driver.findElement(LearnMore5);
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 WebDriverWait wait2 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image5));
			 Thread.sleep(3000);
			 driver.findElement(LearnMore5).click();
			  Thread.sleep(3000);
			 String LearnMore_URL = driver.getCurrentUrl();
			 System.out.println("Learn_More 5 URL =" + LearnMore_URL);
			 
			 driver.navigate().back();
			 
			 Assert.assertEquals(Image_URL, Exp_URL5);
			 Assert.assertEquals(Text_URL, Exp_URL5);
			 Assert.assertEquals(LearnMore_URL, Exp_URL5);
			 
		}

	
   // Heading 6

	public void CustomerSeekingCoverage_Heading6 () throws InterruptedException {
		
	     // Click on Image 
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
				
			 WebElement Element = driver.findElement(Image6);
			 js.executeScript("arguments[0].scrollIntoView();", Element);
			 
			 WebDriverWait wait = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image6));
			 
			 driver.findElement(Image6).click();
			  Thread.sleep(3000);
			 String Image_URL = driver.getCurrentUrl();
			 System.out.println("Image 6 URL =" + Image_URL);
			 
			 driver.navigate().back();
			 
		// Click on Text
			 
			 Thread.sleep(5000);
			 WebElement Element1 = driver.findElement(Text6);
			 js.executeScript("arguments[0].scrollIntoView();", Element1);
			 
			 WebDriverWait wait1 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image6));
			 
			 driver.findElement(Text6).click();
			  Thread.sleep(3000);
			 String Text_URL = driver.getCurrentUrl();
			 System.out.println("Text 6 URL =" + Text_URL);
			 
			 driver.navigate().back();
			
	    // Click on learn more
			 Thread.sleep(10000);
			 
			 WebElement Element2 = driver.findElement(LearnMore6);
			 js.executeScript("arguments[0].scrollIntoView();", Element2);
			 
			 WebDriverWait wait2 = new WebDriverWait(driver,60);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(Image6));
			 
			 Thread.sleep(3000);
			 
			 driver.findElement(LearnMore6).click();
			  Thread.sleep(3000);
			 String LearnMore_URL = driver.getCurrentUrl();
			 System.out.println("Learn_More 6 URL =" + LearnMore_URL);
			 
			 driver.navigate().back();
			 
			 Assert.assertEquals(Image_URL, Exp_URL6);
			 Assert.assertEquals(Text_URL, Exp_URL6);
			 Assert.assertEquals(LearnMore_URL, Exp_URL6);
			 
			 
		}

	// Heading 7

		public void CustomerSeekingCoverage_Heading7 () throws InterruptedException {
			
		     // Click on Image 
				
				 JavascriptExecutor js = (JavascriptExecutor) driver;
					
				 WebElement Element = driver.findElement(Image7);
				 js.executeScript("arguments[0].scrollIntoView();", Element);
				 
				 WebDriverWait wait = new WebDriverWait(driver,60);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(Image7));
				 
				 driver.findElement(Image7).click();
				  Thread.sleep(3000);
				 String Image_URL = driver.getCurrentUrl();
				 System.out.println("Image 7 URL =" + Image_URL);
				 
				 driver.navigate().back();
				 
			// Click on Text
				 
				 Thread.sleep(5000);
				 WebElement Element1 = driver.findElement(Text7);
				 js.executeScript("arguments[0].scrollIntoView();", Element1);
				 
				 WebDriverWait wait1 = new WebDriverWait(driver,60);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(Image7));
				 
				 driver.findElement(Text7).click();
				  Thread.sleep(3000);
				 String Text_URL = driver.getCurrentUrl();
				 System.out.println("Text 7 URL =" + Text_URL);
				 
				 driver.navigate().back();
				
		    // Click on learn more
				 Thread.sleep(10000);
				 
				 WebElement Element2 = driver.findElement(LearnMore7);
				 js.executeScript("arguments[0].scrollIntoView();", Element2);
				 
				 WebDriverWait wait2 = new WebDriverWait(driver,60);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(Image7));
				 
				 Thread.sleep(3000);
				 
				 driver.findElement(LearnMore7).click();
				  Thread.sleep(3000);
				 String LearnMore_URL = driver.getCurrentUrl();
				 System.out.println("Learn_More 7 URL =" + LearnMore_URL);
				 
				 driver.navigate().back();
				 
				 Assert.assertEquals(Image_URL, Exp_URL7);
				 Assert.assertEquals(Text_URL, Exp_URL7);
				 Assert.assertEquals(LearnMore_URL, Exp_URL7);
				 
				 
			}


}
