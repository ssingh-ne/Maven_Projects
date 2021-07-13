package Pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	
WebDriver driver;
	
	public Home (WebDriver driver){
		this.driver=driver;
	}

	
	By Language_change_English = By.xpath("//*[text()='English']");
	
	By Language_change_Spanish = By.xpath("//*[text()='Spanish']");
	
	By Login = By.xpath("//*[text()='Login']");
	By Twitter = By.xpath("//*[@alt='twitter']");
	By facebook = By.xpath("//*[@alt='facebook']");
	By linkedin = By.xpath("//*[@alt='linkedin']");
	
	By Instagram = By.xpath("//*[@alt='instagram']");
	By PrivacyPolicy = By.xpath("//*[text()='Privacy Policy']");
	By CA_Privacy = By.xpath("//*[text()='CA Privacy Notice']");
	
	String exp_lang_spanish = "Spanish";	
	String exp_lang_Eng ="English";
	String EXP_CA_PrivacyURL = "https://www.auw.com/ca-privacy-notice";
	String EXP_PrivacyPolicyURL = "https://www.auw.com/privacy-policy";
	String EXP_InstagramURL = "https://www.instagram.com";
	String EXP_linkedinURL1_text = "https://www.linkedin.com";
	//String EXP_linkedinURL2_text = "applied-underwriters";
	// String EXP_facebookURL    =	"https://www.facebook.com/AppliedUW/";
	String EXP_facebookURL    =	"https://www.facebook.com";
	String EXP_Twitter_Url = "https://twitter.com";
	String EXP_Login_Url   = "https://www.appliedunderwriters.com/LoginWUO.aspx";
	
	
	By side_heading_1 = By.xpath("(//*[@id='sticky-nav']/ul/li)[1]");
	By side_heading_2 = By.xpath("(//*[@id='sticky-nav']/ul/li)[2]");
	// By side_heading_3 = By.xpath("(//*[@id='sticky-nav']/ul/li)[3]");
	
	By side_heading_3 = By.xpath("//*[@id='sticky-nav']/ul/li[3]/div/a");
	By side_heading_4 = By.xpath("(//*[@id='sticky-nav']/ul/li)[4]"); 	
	By side_heading_5 = By.xpath("//*[@id='sticky-nav']/ul/li[5]/div/a");
	By side_heading_6 = By.xpath("//*[text()='FAQs']");
	By pharmacy = By.xpath("//a[text()='Pharmacy Finder']");
	
	By Plus_sign_1 = By.xpath("(//*[@class='MuiSvgIcon-root'])[1]");
	By Plus_sign_2 = By.xpath("(//*[@class='MuiSvgIcon-root'])[2]");
	By Plus_sign_3 = By.xpath("(//*[@class='MuiSvgIcon-root'])[3]");
	By Plus_sign_4 = By.xpath("(//*[@class='MuiSvgIcon-root'])[4]");
	By Plus_sign_5 = By.xpath("(//*[@class='MuiSvgIcon-root'])[5]");
	By Plus_sign_6 = By.xpath("(//*[@class='MuiSvgIcon-root'])[6]");
	
	
	
	public void Login () throws InterruptedException {
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Login));
		
		driver.findElement(Login).click();
		
		Thread.sleep(5000);
		
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<String>(handlesSet);
        driver.switchTo().window(handlesList.get(1));
       String LoginURL =  driver.getCurrentUrl();
       System.out.println("Twitter URl = " + LoginURL);
        driver.close();
        driver.switchTo().window(handlesList.get(0));
       
        assertTrue(LoginURL.contains(EXP_Login_Url));
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
	         
	      // assertEquals(TwitterURL, EXP_Twitter_Url);
	       
	       assertTrue(TwitterURL.contains(EXP_Twitter_Url));
			
		}
		
	public void Facebook () throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(facebook));
			
			driver.findElement(facebook).click();
			
			 Thread.sleep(5000);
				
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	         String facebookURL =  driver.getCurrentUrl();
	         System.out.println("facebook URL = " + facebookURL);
	         driver.close();
	         driver.switchTo().window(handlesList.get(0));
	         
	       //  assertEquals(facebookURL, EXP_facebookURL);
	         
	         assertTrue(facebookURL.contains(EXP_facebookURL));
			
		}
		
	public void Instagram () throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(Instagram));
			
			driver.findElement(Instagram).click();
			
			 Thread.sleep(5000);
				
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	        String InstagramURL =  driver.getCurrentUrl();
	        System.out.println("Instagram URL = " + InstagramURL);
	         driver.close();
	         driver.switchTo().window(handlesList.get(0));
	         
	    //   assertEquals(InstagramURL, EXP_InstagramURL);
	       assertTrue(InstagramURL.contains(EXP_InstagramURL));
			
		}

	public void LinkedIN () throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(linkedin));
			
			driver.findElement(linkedin).click();
			
			 Thread.sleep(5000);
				
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	        String linkedinURL =  driver.getCurrentUrl();
	        System.out.println("linkedin URL = " + linkedinURL);
	         driver.close();
	         driver.switchTo().window(handlesList.get(0));
	         
	        // assertEquals(linkedinURL, EXP_linkedinURL);
	        assertTrue(linkedinURL.contains(EXP_linkedinURL1_text));
	       // assertTrue(linkedinURL.contains(EXP_linkedinURL2_text));
			
		}


	public void Privacy_Policy () throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(PrivacyPolicy));
			
			driver.findElement(PrivacyPolicy).click(); 
			
			 Thread.sleep(5000);
				
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	        String PrivacyPolicyURL =  driver.getCurrentUrl();
	        System.out.println("PrivacyPolicy URL = " + PrivacyPolicyURL);
	        
	        driver.close();
	        driver.switchTo().window(handlesList.get(0));
	        
	      //  driver.navigate().back();
	        
	        Thread.sleep(3000);
	        assertEquals(PrivacyPolicyURL, EXP_PrivacyPolicyURL);
	        
		}


	public void CA_Privacy_Policy () throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(CA_Privacy));
			
			driver.findElement(CA_Privacy).click();
			
			 Thread.sleep(5000);
				
	         Set<String> handlesSet = driver.getWindowHandles();
	         List<String> handlesList = new ArrayList<String>(handlesSet);
	         driver.switchTo().window(handlesList.get(1));
	        
			 String CA_PrivacyURL =  driver.getCurrentUrl();
	         System.out.println("CA_Privacy URL = " + CA_PrivacyURL);
	         driver.close();
		     driver.switchTo().window(handlesList.get(0));
		       
	         
             //driver.navigate().back();
	        
	        Thread.sleep(3000);
	
	        assertEquals(CA_PrivacyURL, EXP_CA_PrivacyURL);
			
		     }
	
	   public void Side_Heading_one () throws InterruptedException {
		
		Thread.sleep(5000);
		
      	String sideHeading = driver.findElement(side_heading_1).getText();
      	
      	System.out.println( "sideHeading = "+ sideHeading);
		
      	driver.findElement(side_heading_1).click();
	
	       }
	
       public void Side_Heading_two () throws InterruptedException {
		
		Thread.sleep(5000);
		
	    String sideHeading2 = driver.findElement(side_heading_2).getText();
	    
	    System.out.println("sideHeading 2 =" + sideHeading2);
		
	     driver.findElement(side_heading_2).click();
	
         	}
	
        public void Side_Heading_three () throws InterruptedException {
	
	      Thread.sleep(5000);
	      String sideHeading3 = driver.findElement(side_heading_3).getText();
           
           System.out.println("sideHeading 3 =" + sideHeading3);
           
           driver.findElement(side_heading_3).click();
           Thread.sleep(3000);
           
            }

        public void Side_Heading_four () throws InterruptedException {
        	
  	      Thread.sleep(5000);
  	
             driver.findElement(side_heading_4).click();
             Thread.sleep(3000);

           String sideHeading4 = driver.findElement(side_heading_4).getText();
             
             System.out.println("sideHeading 4 =" + sideHeading4);
             
              }

        public void Side_Heading_five () throws InterruptedException {
        	
    	      Thread.sleep(5000);
    	
               driver.findElement(side_heading_5).click();
               
               Thread.sleep(5000);

             String sideHeading5 = driver.findElement(side_heading_5).getText();
               
               System.out.println("sideHeading 5 =" + sideHeading5);
               
                }

        public void FAQ_Answer_1 () throws InterruptedException {
        	
        	Thread.sleep(3000);
        	driver.findElement(side_heading_6).click();
        	
        	Thread.sleep(3000);
        	 driver.findElement(Plus_sign_1).click();
        	  }

       public void FAQ_Answer_2 () throws InterruptedException {
        	
        	/*Thread.sleep(3000);
        	driver.findElement(side_heading_6).click();
        	*/
        	Thread.sleep(3000);
        	 driver.findElement(Plus_sign_2).click();
        	  }

       public void FAQ_Answer_3 () throws InterruptedException {
       	
       	/*Thread.sleep(3000);
       	driver.findElement(side_heading_6).click();
       	*/
       	Thread.sleep(3000);
       	 driver.findElement(Plus_sign_3).click();
       	  }
        
        
       public void FAQ_Answer_4 () throws InterruptedException {
       	
       	/*Thread.sleep(3000);
       	driver.findElement(side_heading_6).click();
       	*/
       	Thread.sleep(3000);
       	 driver.findElement(Plus_sign_4).click();
       	  }
       public void FAQ_Answer_5 () throws InterruptedException {
       	
       	/*Thread.sleep(3000);
       	driver.findElement(side_heading_6).click();
       	*/
       	Thread.sleep(3000);
       	 driver.findElement(Plus_sign_5).click();
       	  }
       public void FAQ_Answer_6 () throws InterruptedException {
       	
       	/*Thread.sleep(3000);
       	driver.findElement(side_heading_6).click();
       	*/
       	Thread.sleep(3000);
       	 driver.findElement(Plus_sign_6).click();
       	  }

        
}
