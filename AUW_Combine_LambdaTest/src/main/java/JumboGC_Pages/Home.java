package JumboGC_Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	WebDriver driver;
	
	public Home (WebDriver driver){
		this.driver=driver;
	}

	By Logo = By.xpath("//*[@alt='JumboGC']");
	
	By Login = By.xpath("//*[text()='Login']");
	By Twitter = By.xpath("//*[@alt='twitter']");
	By facebook = By.xpath("//*[@alt='facebook']");
	By linkedin = By.xpath("//*[@alt='linkedin']");
	
	By Instagram = By.xpath("//*[@alt='instagram']");
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By CA_Privacy = By.xpath("//*[text()='CA Privacy Notice']");
	
	
	 
	By SideHeading_one = By.xpath("(//li[@class='MuiListItem-root MuiListItem-gutters'])[1]");
	By SideHeading_two = By.xpath("//*[@id='sticky-nav']/ul/li[2]/div/a"); 
	// By SideHeading_three = By.xpath("//*[@id='guaranteed-cost-program']/section/div/div/div/div/h3[1]");
	By SideHeading_three = By.xpath("//*[@id='sticky-nav']/ul/li[3]/div/a");
	By SideHeading_four = By.xpath("//*[@id='sticky-nav']/ul/li[4]/div/a");
	By sideHeading_Text_four = By.xpath("//*[@id='contentBlock0']/h5");
	
	
	String JUMBO_URL = "http://jumbogc.auw.com/";
	String JUMBO_URL_dev = "https://develop--jumbogc.netlify.app/";
	
	String EXP_Twitter_Url = "https://twitter.com/AppliedUW";
	String Login_Url = "https://www.appliedunderwriters.com/Login.aspx";
	String EXP_FB_Url = "https://www.facebook.com/AppliedUW/";
	String  EXP_linkedin_Url= "https://www.linkedin.com/";
	String EXP_insta_Url = "https://www.instagram.com";

    public void Jumbo_url_dev (){
    	
        driver.get(JUMBO_URL_dev);
    }
	
   public void Jumbo_url (){
    	
        driver.get(JUMBO_URL);
    }
	
    
    public void SideHeadingONE(){
		WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(SideHeading_one));
 		
 		String Heading_one = driver.findElement(SideHeading_one).getText();
 		
 		System.out.println("Heading_one = "+Heading_one);
 		
 		driver.findElement(SideHeading_one).click();
 		
 		
	}
	
	public void SideHeadingTWO() throws InterruptedException{
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(SideHeading_two));

 		String Heading_two = driver.findElement(SideHeading_two).getText();
 		
 		System.out.println("Heading_two = "+ Heading_two);
 		
 		driver.findElement(SideHeading_two).click();
 		Thread.sleep(3000);
 		
	}
	
	public void SideHeadingTHREE() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(SideHeading_three));

 		String Heading_three = driver.findElement(SideHeading_three).getText();
 		
 		System.out.println("Heading_three = "+ Heading_three);

 		driver.findElement(SideHeading_three).click();
 		Thread.sleep(3000);
	}
	
	public void SideHeadingFour() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(SideHeading_four));
 		
 		driver.findElement(SideHeading_four).click();
 		
        String Heading_four = driver.findElement(SideHeading_four).getText();
 		
 		System.out.println("Heading_Four = "+ Heading_four);
 		
 		Thread.sleep(3000);
 		
    //  driver.findElement(sideHeading_Text_four).click();
 		
       
 		
	}
	
	public void Logo(){
		WebDriverWait wait = new WebDriverWait(driver,60);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(Logo));
 		
		driver.findElement(Logo).click();
		
	}
	
	
public void Login() throws InterruptedException{
	
	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		
		driver.findElement(Login).click();
		Thread.sleep(5000);
		 Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String LoginURL =  driver.getCurrentUrl();
        System.out.println("Login URL = " + LoginURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         assertEquals(LoginURL, Login_Url);
	}
	
public void Twitter() throws InterruptedException{
	
	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Twitter));
		
		driver.findElement(Twitter).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String TwitterURL =  driver.getCurrentUrl();
        System.out.println("Twitter URl = " + TwitterURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         assertEquals(TwitterURL, EXP_Twitter_Url);
		
	}
	
public void Facebook () throws InterruptedException{
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(facebook);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(facebook));
		Thread.sleep(5000);
		driver.findElement(facebook).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String facebookURL =  driver.getCurrentUrl();
        System.out.println("facebook URL = " + facebookURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         assertEquals(facebookURL, EXP_FB_Url);
		
	}
	
public void Instagram () throws InterruptedException{
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(facebook);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(facebook));
		Thread.sleep(5000);	driver.findElement(Instagram).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String InstagramURL =  driver.getCurrentUrl();
        System.out.println("Instagram URL = " + InstagramURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         //assertEquals(InstagramURL, EXP_insta_Url);
         assertTrue(InstagramURL.contains(EXP_insta_Url));
		
	}

public void LinkedIN () throws InterruptedException{
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(facebook);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(facebook));
		Thread.sleep(5000);
		
		driver.findElement(linkedin).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String linkedinURL =  driver.getCurrentUrl();
        System.out.println("linkedin URL = " + linkedinURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
        // assertEquals(linkedinURL, EXP_linkedin_Url);
         assertTrue(linkedinURL.contains(EXP_linkedin_Url));
		
	}


public void Privacy_Policy () throws InterruptedException{
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(PrivacyPolicy);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	    WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(PrivacyPolicy));
		Thread.sleep(5000);
		
		driver.findElement(PrivacyPolicy).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String PrivacyPolicyURL =  driver.getCurrentUrl();
        System.out.println("PrivacyPolicy URL = " + PrivacyPolicyURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         //assertEquals(TwitterURL, EXP_Twitter_Url);
		
	}


public void CA_Privacy_Policy () throws InterruptedException{
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 WebElement Element1 = driver.findElement(CA_Privacy);
	 	 js1.executeScript("arguments[0].scrollIntoView();", Element1);
	
	    WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CA_Privacy));
		Thread.sleep(5000);
		
		driver.findElement(CA_Privacy).click();
		
		 Thread.sleep(5000);
			
         Set<String> handlesSet = driver.getWindowHandles();
         List<String> handlesList = new ArrayList<String>(handlesSet);
         driver.switchTo().window(handlesList.get(1));
        String CA_PrivacyURL =  driver.getCurrentUrl();
        System.out.println("CA_Privacy URL = " + CA_PrivacyURL);
         driver.close();
         driver.switchTo().window(handlesList.get(0));
         
         //assertEquals(TwitterURL, EXP_Twitter_Url);
		
	}

}
