package AFL_Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class What_we_offer {
	
	WebDriver driver;
	
	By WhatWeOffer = By.xpath("(//*[@class='MuiButton-label'])[1]");
	
	By Tab_one_heading = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[1]/div/div[1]/div[1] ");
	
	By Tab1 = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[1]/div/div[2]/div/div/div/div/a[1]/li");
	By Tab2 = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[1]/div/div[2]/div/div/div/div/a[2]/li");
	By Tab3 = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[1]/div/div[2]/div/div/div/div/a[3]/li");
	By Load_text1 = By.xpath("//*[@id='contentBlock0']/h2");
	
	By Tab_two_heading = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[2]");
	By tab_two_expansion = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[2]/div/div[1]/div[2]");
	By tab_two_tab1 = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[2]/div/div[2]/div/div/div/div/a/li"); 
	By Tab_2_section1 = By.xpath("//*[@id='desktop-menu']/div[2]/div/div/ul/div[2]/div/div[2]/div/div/div/div/a/li");
	
	By Tab_pageText = By.xpath("//*[@id='__next']/div[2]/div/div/div/div/div[2]/h1");
	
	By MoreOffer_heading1 = By.xpath("//*[@id='__next']/main/div[3]/div/div[1]/a/div/div/div/p");
	By MoreOffer_heading2 = By.xpath("//*[@id='__next']/main/div[3]/div/div[2]/a/div/div/div/p");
	By MoreOffer1_image  = By.xpath("//*[@id='__next']/main/div[3]/div/div[1]/a/div/img");
	By MoreOffer2_image  = By.xpath("//*[@id='__next']/main/div[3]/div/div[2]/a/div/img");
 	By Learn_more1 = By.xpath("(//*[text()='Learn More'])[1]");
 	By Learn_more2 = By.xpath("(//*[text()='Learn More'])[2]");
	
	public What_we_offer (WebDriver driver){
		this.driver=driver;
	}

	public void Heading_one_Tab1_OutsideUS () throws InterruptedException {
		Home_page h = new Home_page(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element);
			
		Thread.sleep(2000);
		
		driver.findElement(WhatWeOffer).click();
		
		Thread.sleep(2000);
		
	// Tab 1 clicked and verified texting
		
		String TabOneHeading = driver.findElement(Tab_one_heading).getText();
		
		System.out.println("Tab One Heading = " + TabOneHeading);
		
        String Tab_1 = driver.findElement(Tab1).getText();
		
		System.out.println("Tab one Header = " + Tab_1);
		
		driver.findElement(Tab1).click();
		
		Thread.sleep(3000);
		h.Header();
        String Tab_Text = driver.findElement(Tab_pageText).getText();
		
		System.out.println("Tab page text one = " + Tab_Text);
		
		WebElement element1 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		
		Thread.sleep(5000);
		
		boolean text_load = driver.findElement(Load_text1).isDisplayed();
		
		System.out.println("Text Load completely"+text_load);
		
	// More offer section - 
		
		WebElement Element1 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
			
		Thread.sleep(2000);
		
	    String More_heading1 = driver.findElement(MoreOffer_heading1).getText();
	    
	    System.out.println("More_heading1 = " + More_heading1);
	    
	// Click on Heading
	    
	    driver.findElement(MoreOffer_heading1).click();
	    
	    Thread.sleep(3000);
	    h.Header();
        String Moreheading1_pageText = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading one = " + Moreheading1_pageText);
	    
		Assert.assertTrue(Moreheading1_pageText.contains(More_heading1),"Failure message") ;
		
	//  click on Image
		
	    WebElement Element2 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab1).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element3 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element3);
			
		Thread.sleep(2000);
		
	    driver.findElement(MoreOffer1_image).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_ImagepageText = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading from image = " + Moreheading1_ImagepageText);
        
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement element2 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element2);
		
		Thread.sleep(5000);
		
		boolean text_load1 = driver.findElement(Load_text1).isDisplayed();
		
		System.out.println("Text Load completely"+text_load1);
		
	//	assertEquals(, More_heading1);
		
		Assert.assertTrue(Moreheading1_ImagepageText.contains(More_heading1),"Failure message") ;
	    
   // Click on Learn more
		
	    WebElement Element4 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element4);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab1).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element5 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element5);
			
		Thread.sleep(2000);
		
	    driver.findElement(Learn_more1).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_LearnMore_Text = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading from LearnMore = " + Moreheading1_LearnMore_Text);
	    
		WebElement element3 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element3);
		
		Thread.sleep(5000);
		
		boolean text_load2 = driver.findElement(Load_text1).isDisplayed();
		
		System.out.println("Text Load completely"+text_load2);
		
		Assert.assertTrue(Moreheading1_LearnMore_Text.contains(More_heading1),"Failure message") ;
		
// -----------------------------------
 // Click on Heading 2 in More offers 
		    WebElement Element6 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element6);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab1).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element7 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element7);
				
			Thread.sleep(2000);

		    String More_heading2 = driver.findElement(MoreOffer_heading2).getText();
		    
		    System.out.println("More_heading2 = " + More_heading2);
		    
		    driver.findElement(MoreOffer_heading2).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_headingText = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from image = " + Moreheading2_headingText);
		
	//  click on Image
			
		    WebElement Element8 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element8);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab1).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element9 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element9);
				
			Thread.sleep(2000);
			
		    driver.findElement(MoreOffer2_image).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_ImagepageText = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from image = " + Moreheading2_ImagepageText);
		
	// Click on Learn more
			
		    WebElement Element10 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element10);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab1).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element11 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element11);
				
			Thread.sleep(2000);
			
		    driver.findElement(Learn_more2).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_LearnMore_Text = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from LearnMore = " + Moreheading2_LearnMore_Text);
		    
			Assert.assertTrue(Moreheading2_LearnMore_Text.contains(More_heading2),"Failure message") ;
			                  
	}
	
	public void Heading_one_Tab2_OutsideUS () throws InterruptedException {
		Home_page h = new Home_page(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element);
			
		Thread.sleep(2000);
		
		driver.findElement(WhatWeOffer).click();
		
		Thread.sleep(2000);
		
	// Tab 1 clicked and verified text
		
		String TabOneHeading = driver.findElement(Tab_one_heading).getText();
		
		System.out.println("Tab One Heading = " + TabOneHeading);
		
        String Tab_1 = driver.findElement(Tab2).getText();
		
		System.out.println("Tab one Header = " + Tab_1);
		
		driver.findElement(Tab2).click();
		
		Thread.sleep(3000);
		h.Header();
        String Tab_Text = driver.findElement(Tab_pageText).getText();
		

		WebElement element1 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element1);
		
		Thread.sleep(5000);
		
		boolean text_load = driver.findElement(Load_text1).isDisplayed();
        
		System.out.println("Tab page text one = " + text_load);
		
	// More offer section - 
		
		WebElement Element1 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
			
		Thread.sleep(2000);
		
	    String More_heading1 = driver.findElement(MoreOffer_heading1).getText();
	    
	    System.out.println("More_heading1 = " + More_heading1);
	    
	// Click on Heading
	    
	    driver.findElement(MoreOffer_heading1).click();
	    
	    Thread.sleep(3000);
	    h.Header();
        String Moreheading1_pageText = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading one = " + Moreheading1_pageText);
		
		WebElement element2 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element2);
		
		Thread.sleep(5000);
		
		boolean text_load2 = driver.findElement(Load_text1).isDisplayed();
        
		System.out.println("Tab page text one = " + text_load2);
	    
		Assert.assertTrue(Moreheading1_pageText.contains(More_heading1),"Failure message") ;
		
	//  click on Image
		
	    WebElement Element2 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab2).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element3 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element3);
			
		Thread.sleep(2000);
		
	    driver.findElement(MoreOffer1_image).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_ImagepageText = driver.findElement(Tab_pageText).getText();

		WebElement element3 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element3);
		
		Thread.sleep(5000);
		
		boolean text_load1 = driver.findElement(Load_text1).isDisplayed();
		System.out.println("Text load completely = " + text_load1);
		
		System.out.println("More offer heading from image = " + Moreheading1_ImagepageText);
	    
	//	assertEquals(, More_heading1);
		
		Assert.assertTrue(Moreheading1_ImagepageText.contains(More_heading1),"Failure message") ;
	    
   // Click on Learn more
		
	    WebElement Element4 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element4);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab2).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element5 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element5);
			
		Thread.sleep(2000);
		
	    driver.findElement(Learn_more1).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_LearnMore_Text = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading from LearnMore = " + Moreheading1_LearnMore_Text);
	    
		WebElement element4 = driver.findElement(Load_text1);
		js.executeScript("arguments[0].scrollIntoView();", element4);
		
		Thread.sleep(5000);
		
		boolean text_load3 = driver.findElement(Load_text1).isDisplayed();
		System.out.println("Text load completely = " + text_load3);
		
		Assert.assertTrue(Moreheading1_LearnMore_Text.contains(More_heading1),"Failure message") ;
		
// -----------------------------------
 // Click on Heading 2 in More offers 
		    WebElement Element6 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element6);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab2).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element7 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element7);
				
			Thread.sleep(2000);

		    String More_heading2 = driver.findElement(MoreOffer_heading1).getText();
		    
		    System.out.println("More_heading1 = " + More_heading2);
		    
		    driver.findElement(MoreOffer_heading2).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_headingText = driver.findElement(Tab_pageText).getText();
	        
	        WebElement element5 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element5);
			
			Thread.sleep(5000);
			
			boolean text_load4 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load4);	
			
			System.out.println("More offer heading 2 from image = " + Moreheading2_headingText);
		
	//  click on Image
			
		    WebElement Element8 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element8);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab2).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element9 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element9);
				
			Thread.sleep(2000);
			
		    driver.findElement(MoreOffer2_image).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_ImagepageText = driver.findElement(Tab_pageText).getText();
	        
	        WebElement element6 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element6);
			
			Thread.sleep(5000);
			
			boolean text_load5 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load5);
			
			System.out.println("More offer heading 2 from image = " + Moreheading2_ImagepageText);
		
	// Click on Learn more
			
		    WebElement Element10 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element10);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab2).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element11 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element11);
				
			Thread.sleep(2000);
			
		    driver.findElement(Learn_more2).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_LearnMore_Text = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from LearnMore = " + Moreheading2_LearnMore_Text);
			
			WebElement element7 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element7);
			
			Thread.sleep(5000);
			
			boolean text_load7 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load7);
		    
			Assert.assertTrue(Moreheading2_LearnMore_Text.contains(More_heading2),"Failure message") ;
		
	}
	
    public void Heading_one_Tab3_OutsideUS () throws InterruptedException {
		
		Home_page h = new Home_page(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element);
			
		Thread.sleep(2000);
		
		driver.findElement(WhatWeOffer).click();
		
		Thread.sleep(2000);
		
	// Tab 1 clicked and verified texting
		
		String TabOneHeading = driver.findElement(Tab_one_heading).getText();
		
		System.out.println("Tab One Heading = " + TabOneHeading);
		
        String Tab_1 = driver.findElement(Tab3).getText();
		
		System.out.println("Tab one Header = " + Tab_1);
		
		driver.findElement(Tab3).click();
		
		Thread.sleep(3000);
		h.Header();
        String Tab_Text = driver.findElement(Tab_pageText).getText();
		
		System.out.println("Tab page text one = " + Tab_Text);
		
	// More offer section - 
		
		WebElement Element1 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element1);
			
		Thread.sleep(2000);
		
	    String More_heading1 = driver.findElement(MoreOffer_heading1).getText();
	    
	    System.out.println("More_heading1 = " + More_heading1);
	    
	// Click on Heading
	    
	    driver.findElement(MoreOffer_heading1).click();
	    
	    Thread.sleep(3000);
	    h.Header();
        String Moreheading1_pageText = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading one = " + Moreheading1_pageText);

WebElement element1 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element1);
			
			Thread.sleep(5000);
			
			boolean text_load1 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load1);

	    
		Assert.assertTrue(Moreheading1_pageText.contains(More_heading1),"Failure message") ;
		
	//  click on Image
		
	    WebElement Element2 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab3).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element3 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element3);
			
		Thread.sleep(2000);
		
	    driver.findElement(MoreOffer1_image).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_ImagepageText = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading from image = " + Moreheading1_ImagepageText);

WebElement element2 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element2);
			
			Thread.sleep(5000);
			
			boolean text_load2 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load2);

	    
	//	assertEquals(, More_heading1);
		
		Assert.assertTrue(Moreheading1_ImagepageText.contains(More_heading1),"Failure message") ;
	    
   // Click on Learn more
		
	    WebElement Element4 = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element4);
		driver.findElement(WhatWeOffer).click();
		driver.findElement(Tab3).click();
		Thread.sleep(2000);
		h.Header();
		WebElement Element5 = driver.findElement(MoreOffer_heading1);
		js.executeScript("arguments[0].scrollIntoView();", Element5);
			
		Thread.sleep(2000);
		
	    driver.findElement(Learn_more1).click();
	    Thread.sleep(2000);
	    h.Header();
        String Moreheading1_LearnMore_Text = driver.findElement(Tab_pageText).getText();
		
		System.out.println("More offer heading from LearnMore = " + Moreheading1_LearnMore_Text);
	 
WebElement element3 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element3);
			
			Thread.sleep(5000);
			
			boolean text_load3 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load3);
   
	
	Assert.assertTrue(Moreheading1_LearnMore_Text.contains(More_heading1),"Failure message") ;
		
// -----------------------------------
 // Click on Heading 2 in More offers 
		    WebElement Element6 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element6);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab3).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element7 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element7);
				
			Thread.sleep(2000);

		    String More_heading2 = driver.findElement(MoreOffer_heading1).getText();
		    
		    System.out.println("More_heading1 = " + More_heading2);
		    
		    driver.findElement(MoreOffer_heading2).click();
		    Thread.sleep(2000);
		    
	        String Moreheading2_headingText = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from image = " + Moreheading2_headingText);
		
	//  click on Image
			
		    WebElement Element8 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element8);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab3).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element9 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element9);
				
			Thread.sleep(2000);
			
		    driver.findElement(MoreOffer2_image).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_ImagepageText = driver.findElement(Tab_pageText).getText();

            WebElement element4 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element4);
			
			Thread.sleep(5000);
			
			boolean text_load4 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load4);

			
			System.out.println("More offer heading 2 from image = " + Moreheading2_ImagepageText);
		
	// Click on Learn more
			
		    WebElement Element10 = driver.findElement(WhatWeOffer);
			js.executeScript("arguments[0].scrollIntoView();", Element10);
			driver.findElement(WhatWeOffer).click();
			driver.findElement(Tab3).click();
			Thread.sleep(2000);
			h.Header();
			WebElement Element11 = driver.findElement(MoreOffer_heading2);
			js.executeScript("arguments[0].scrollIntoView();", Element11);
				
			Thread.sleep(2000);
			
		    driver.findElement(Learn_more2).click();
		    Thread.sleep(2000);
		    h.Header();
	        String Moreheading2_LearnMore_Text = driver.findElement(Tab_pageText).getText();
			
			System.out.println("More offer heading 2 from LearnMore = " + Moreheading2_LearnMore_Text);
			
			WebElement element5 = driver.findElement(Load_text1);
			js.executeScript("arguments[0].scrollIntoView();", element5);
			
			Thread.sleep(5000);
			
			boolean text_load5 = driver.findElement(Load_text1).isDisplayed();
			System.out.println("Text load completely = " + text_load5);

		    
			Assert.assertTrue(Moreheading2_LearnMore_Text.contains(More_heading2),"Failure message") ;

		
	}
	
	public void Heading_Two_OutsideUS () throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(WhatWeOffer);
		js.executeScript("arguments[0].scrollIntoView();", Element);
			
		Thread.sleep(2000);
		
		driver.findElement(WhatWeOffer).click();
		
		// Tab 1 clicked and verified texting
		
		String TabTwoHeading = driver.findElement(Tab_two_heading).getText();
				
		System.out.println("Tab Two Heading = " + TabTwoHeading);
		
		driver.findElement(tab_two_expansion).click();
				
		String Tab_2 = driver.findElement(Tab2).getText();
				
		System.out.println("Tab One Heading = " + Tab_2);
				
		Thread.sleep(3000);
		
		driver.findElement(Tab_2_section1).click();
		
		Thread.sleep(3000);
		
		String Tab_Text = driver.findElement(Tab_pageText).getText();
				
		System.out.println("Tab page text one = " + Tab_Text);
		
		
	}
	
	//public void 
	
}
