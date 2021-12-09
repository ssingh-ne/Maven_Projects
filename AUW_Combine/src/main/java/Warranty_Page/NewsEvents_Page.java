package Warranty_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.assertEquals;

public class NewsEvents_Page {
	
	WebDriver driver;
	
	By NewandEvents = By.xpath("(//*[text()='News & Events'])[1]");
	
	By Image1 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[1]/a");
	By Text1 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[1]/a/div/h4");
	
	By Logo = By.xpath("//*[@alt='Applied Warranty Logo']");
			
	
	By Image2 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a");
	By Text2 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a/div/h4");
	
	By Image3 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[2]/div/div[2]/div/a");
	By Text3 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[2]/div/div[2]/div/a/div/h3");
	
	By Image4 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[3]/a/img");
	By Text4 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[3]/a/div/p");
	
	By Image5 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[4]/a/img");
	By Text5 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[4]/a/div/h4");
	
	By Image6 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[4]/a/img");
	By Text6 = By.xpath("//*[@id='app']/main/div[1]/div/div/div[2]/div[4]/a/div/p");
	
	
	By More = By.xpath("//*[text()='More']");
	
	public NewsEvents_Page (WebDriver driver){
		this.driver=driver;
	}
	
	
	public void News () throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(NewandEvents);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		driver.findElement(NewandEvents).click();
		Thread.sleep(3000);
		
	}
	
	
	public void Image1() throws InterruptedException {
		
	// 	Click on image 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(Image1);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		driver.findElement(Image1).click();
		
		Thread.sleep(3000);
		String ImageURL = driver.getCurrentUrl();
		System.out.println("Image URL = " + ImageURL  );
		
		driver.findElement(NewandEvents).click();
		
		Thread.sleep(3000);
		
//	 	Click on Text 
		
			
			WebElement Element1= driver.findElement(Image1);
			js.executeScript("arguments[0].scrollIntoView();", Element1);
			Thread.sleep(3000);
			
			driver.findElement(Text1).click();
			
			Thread.sleep(3000);
			String TextURL = driver.getCurrentUrl();
			System.out.println("Text URL = " + TextURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
			assertEquals(ImageURL, TextURL);
			
		
	}

    public void Image2() throws InterruptedException {
		
		// 	Click on image 
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(Image2);
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			
			driver.findElement(Image2).click();
			
			Thread.sleep(3000);
			String ImageURL = driver.getCurrentUrl();
			System.out.println("Image URL2 = " + ImageURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
//		 	Click on Text 
			
				
				WebElement Element1= driver.findElement(Image2);
				js.executeScript("arguments[0].scrollIntoView();", Element1);
				
				
				driver.findElement(Text2).click();
				
				Thread.sleep(3000);
				String TextURL = driver.getCurrentUrl();
				System.out.println("Text URL2 = " + TextURL  );
				
				driver.findElement(NewandEvents).click();
				
				Thread.sleep(3000);
				
				assertEquals(ImageURL, TextURL);
				//assertEquals(TextURL, ImageURL1);
				
			
		}

	
    public void Image3() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// 	Click on image 
			
		    WebElement Element = driver.findElement(Image3);
			js.executeScript("arguments[0].scrollIntoView();", Element);
			
			
			driver.findElement(Image3).click();
			
			Thread.sleep(3000);
			String ImageURL = driver.getCurrentUrl();
			System.out.println("Image URL3 = " + ImageURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
//		 	Click on Text 
			
				
			WebElement Element1= driver.findElement(Image3);
			js.executeScript("arguments[0].scrollIntoView();", Element1);
				
			driver.findElement(Text3).click();
				
			Thread.sleep(3000);
			String TextURL = driver.getCurrentUrl();
			System.out.println("Text URL3 = " + TextURL  );
				
			driver.findElement(NewandEvents).click();
				
			Thread.sleep(3000);
				
			assertEquals(ImageURL, TextURL);
				//assertEquals(TextURL, ImageURL1);
				
			
		}

    public void Image4() throws InterruptedException {
		
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(More);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(2000);
		
		driver.findElement(More).click();
		
		Thread.sleep(4000);
    	
    	
    	// 	Click on image 
    	
			WebElement Element2 = driver.findElement(Image4);
			js.executeScript("arguments[0].scrollIntoView();", Element2);
			
			
			driver.findElement(Image4).click();
			
			Thread.sleep(3000);
			String ImageURL = driver.getCurrentUrl();
			System.out.println("Image URL4 = " + ImageURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
//		 	Click on Text 
			
			WebElement Element3= driver.findElement(More);
			js.executeScript("arguments[0].scrollIntoView();", Element3);
			
			Thread.sleep(2000);
			
			driver.findElement(More).click();
			
			Thread.sleep(4000);
				
				WebElement Element1= driver.findElement(Image4);
				js.executeScript("arguments[0].scrollIntoView();", Element1);
				
				
				driver.findElement(Text4).click();
				
				Thread.sleep(3000);
				String TextURL = driver.getCurrentUrl();
				System.out.println("Text URL4 = " + TextURL  );
				
				driver.findElement(NewandEvents).click();
				
				Thread.sleep(3000);
				
				assertEquals(ImageURL, TextURL);
				
		}

    public void Image5() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(More);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(2000);
		
		driver.findElement(More).click();
		
		Thread.sleep(4000);
		
		// 	Click on image 
		
			WebElement Element1 = driver.findElement(Image5);
			js.executeScript("arguments[0].scrollIntoView();", Element1);
			
			
			driver.findElement(Image5).click();
			
			Thread.sleep(3000);
			String ImageURL = driver.getCurrentUrl();
			System.out.println("Image URL5 = " + ImageURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
//		 	Click on Text 
			
			WebElement Element2 = driver.findElement(More);
			js.executeScript("arguments[0].scrollIntoView();", Element2);
			
			Thread.sleep(2000);
			
			driver.findElement(More).click();
			
			Thread.sleep(4000);
			
				
				WebElement Element3= driver.findElement(Image5);
				js.executeScript("arguments[0].scrollIntoView();", Element3);
				
				Thread.sleep(3000);
				driver.findElement(Text5).click();
				
				Thread.sleep(3000);
				String TextURL = driver.getCurrentUrl();
				System.out.println("Text URL5 = " + TextURL  );
				
				driver.findElement(NewandEvents).click();
				
				Thread.sleep(3000);
				
				assertEquals(ImageURL, TextURL);
				//assertEquals(TextURL, ImageURL1);
				
			
		}

    
    public void Image6() throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(More);
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(2000);
		
		driver.findElement(More).click();
		
		Thread.sleep(4000);
		
		// 	Click on image 
		
			WebElement Element1 = driver.findElement(Image6);
			js.executeScript("arguments[0].scrollIntoView();", Element1);
			
			
			driver.findElement(Image6).click();
			
			Thread.sleep(3000);
			String ImageURL = driver.getCurrentUrl();
			System.out.println("Image URL5 = " + ImageURL  );
			
			driver.findElement(NewandEvents).click();
			
			Thread.sleep(3000);
			
//		 	Click on Text 
			
			WebElement Element2 = driver.findElement(More);
			js.executeScript("arguments[0].scrollIntoView();", Element2);
			
			Thread.sleep(2000);
			
			driver.findElement(More).click();
			
			Thread.sleep(4000);
			
				
				WebElement Element3= driver.findElement(Image6);
				js.executeScript("arguments[0].scrollIntoView();", Element3);
				
				Thread.sleep(3000);
				driver.findElement(Text6).click();
				
				Thread.sleep(3000);
				String TextURL = driver.getCurrentUrl();
				System.out.println("Text URL5 = " + TextURL  );
				
				driver.findElement(NewandEvents).click();
				
				Thread.sleep(3000);
				
				assertEquals(ImageURL, TextURL);
				//assertEquals(TextURL, ImageURL1);
				
			
		}


	
	

}
