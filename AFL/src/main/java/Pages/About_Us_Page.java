package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About_Us_Page {
	
	WebDriver driver;
	
	
	By Meetteam = By.xpath("//*[@id='app']/main/div[2]/div/div/div/h2");
	By MeetTeam_Tabs = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[1]/div[1]/p");
	By About_button = By.xpath("//a[text()='About Us']");
	By AFL_Logo = By.xpath("//*[@href='/']");
	By Meet_1st_Btn = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[1]/div[1]/p");
	By Meet_2nd_btn = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[1]/div[2]/p");
	By Meet_3rd_btn = By.xpath("//*[@id='app']/main/div[2]/div/div/div/div/div[1]/div[3]/p");
	By AboutUS_learnMore = By.xpath("//*[@id='contentBlock1']/a");
	
	
	String Meetteam_text = "Meet The Team";
	String Header_About_US =  "https://afl.auw.com/about-us";
	String FirstBtn_text = "Europe"; 
	String Second_Btn_text = "United States";
	String Third_Btn_text = "Partners and Affiliates";
	String AboutUS_URL = "https://afl.auw.com/about-us";
	String Header_About_US_dev = "https://develop--applied-financial-lines.netlify.app/about-us";
	String AboutUS_URL_dev = "https://develop--applied-financial-lines.netlify.app/about-us";
	
	public About_Us_Page (WebDriver driver){
		this.driver=driver;
	}
	
   public void	About_US_header_Dev() throws InterruptedException {
    	
    	// click on ABout us from header
		 
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement Element = driver.findElement(About_button);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
		 
	  driver.findElement(About_button).click();
		 
	  Thread.sleep(3000);
		 
	  String URL = driver.getCurrentUrl();
	  System.out.println("About Us URL = " + URL);
		 
	  assertEquals(URL,Header_About_US_dev );
	 }
   
    public void	About_US_header() throws InterruptedException {
    	
    	// click on ABout us from header
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(About_button);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 driver.findElement(About_button).click();
		 
		 Thread.sleep(3000);
		 
		 String URL = driver.getCurrentUrl();
		 System.out.println("About Us URL = " + URL);
		 
		 assertEquals(URL,Header_About_US );
	 }
	public void MeatTeam_Outside_US  () throws InterruptedException {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Element = driver.findElement(Meetteam);
	js.executeScript("arguments[0].scrollIntoView();", Element);
		      
	Thread.sleep(2000);
		  
	String MeetTeam = driver.findElement(Meetteam).getText();
	System.out.println("Meet Team Text = " + MeetTeam);
	
	String MeetTeam_1stbtn = driver.findElement(Meet_1st_Btn).getText();
	System.out.println("Meet Team Text selected 1st button = " + MeetTeam_1stbtn);
	
	String MeetTeam_2ndbtn = driver.findElement(Meet_2nd_btn).getText();
	System.out.println("Meet Team Text selected 2nd button = " + MeetTeam_2ndbtn);
	
	String MeetTeam_3rdbtn = driver.findElement(Meet_3rd_btn).getText();
	System.out.println("Meet Team Text selected 3rd button = " + MeetTeam_3rdbtn);
	
	 driver.findElement(AFL_Logo).click();
	
	assertEquals(MeetTeam_1stbtn, FirstBtn_text);	  
	assertEquals(MeetTeam_2ndbtn, Second_Btn_text);	 
	assertEquals(MeetTeam_3rdbtn, Third_Btn_text);	 
	assertEquals(MeetTeam, Meetteam_text);
		
	}

    public void About_US_homePage () throws InterruptedException {
    	
    	// click on ABout us from home  page
    	Home_page h = new Home_page(driver);
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(AboutUS_learnMore);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 driver.findElement(AboutUS_learnMore).click();
		 Thread.sleep(3000);
		 
		 h.Header();
		 String About_URL = driver.getCurrentUrl();
		 System.out.println("About us URL from home page = " + About_URL);
		 
		 driver.findElement(AFL_Logo).click();
		 
		 assertEquals(About_URL, AboutUS_URL);
    }


    public void About_US_homePage_dev () throws InterruptedException {
    	
    	// click on ABout us from home  page
    	Home_page h = new Home_page(driver);
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1000)");
		 WebElement Element = driver.findElement(AboutUS_learnMore);
		 js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 driver.findElement(AboutUS_learnMore).click();
		 Thread.sleep(3000);
		 
		 h.Header();
		 String About_URL = driver.getCurrentUrl();
		 System.out.println("About us URL from home page = " + About_URL);
		 
		 driver.findElement(AFL_Logo).click();
		 
		 assertEquals(About_URL, AboutUS_URL_dev);
    }


}
