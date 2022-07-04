package AFL_Test_Case_Prod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class {
	
	//protected WebDriver driver;
    
	// Below code is to execute scripts on Desktop 
		/*	WebDriver driver;
		    
			@Parameters ("browser")
			 @BeforeMethod

		 public void setupApplication(){
				
				Reporter.log("=====Browser Session Started=====", true);
				
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
				
			    driver=new ChromeDriver();
				
			    System.setProperty("webdriver.gecko.driver", ".\\Drivers\\Firefox\\geckodriver.exe");
		               
				driver=new FirefoxDriver();
	        
				driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS) ;
		                
				driver.manage().window().maximize();
				
				driver.get("https://afl.auw.com/?lang=en-us");
				
				Reporter.log("=====Application Started=====", true);
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			} */

		 // Below code is to execute on lambdatest
		    public String username = "shweta.singhnewelevation";
		    public String accesskey = "yFLOWUnkXVGPtVEtVXDINVR5cgrpIJ7f1mOxWxTfR32Bc8YJup";
		    public static RemoteWebDriver driver = null;
		    public String gridURL = "@hub.lambdatest.com/wd/hub";
		    boolean status = false;

		 //   @org.testng.annotations.Parameters ({"browser", "version", "platform", "build", "name"})

		    @BeforeMethod
		    @org.testng.annotations.Parameters ({"browser", "version", "platform", "build", "name"})

		 public void setupApplication(String browser, String version, String platform, String build, String name)  throws Exception {
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
	             capabilities.setCapability("browserName", browser);
	             capabilities.setCapability("version", version);
	             capabilities.setCapability("platform", platform);// If this cap isn't specified, it will just get the any available one
	             capabilities.setCapability("build", build);
	             capabilities.setCapability("name", name);
	             capabilities.setCapability("network", true); // To enable network logs
	             capabilities.setCapability("visual", true); // To enable step by step screenshot
	             capabilities.setCapability("video", true); // To enable video recording
	             capabilities.setCapability("console", true); // To capture console logs

	              try {
	             driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);

	              } catch (MalformedURLException e) {
	  
	            	  System.out.println("Invalid grid URL");

	              } catch (Exception e) {
	  
	            	  System.out.println(e.getMessage());
	        }

	             driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;

	             driver.get("https://afl.auw.com/?lang=en-us");

	            Thread.sleep(3000);
			
		}
			
			@AfterMethod
				public void tearDown(ITestResult result)
				{
				 
				// Here will compare if test is failing then only it will enter into if condition
				if(ITestResult.FAILURE==result.getStatus())
				{
				try 
				{
				// Create refernce of TakesScreenshot
				TakesScreenshot ts=(TakesScreenshot)driver;
				 
				// Call method to capture screenshot
				File source=ts.getScreenshotAs(OutputType.FILE);
				 
				// Copy files to specific location here it will save all screenshot in our project home directory and
				// result.getName() will return name of test case so that screenshot name will be same
				FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
				 
				System.out.println("Screenshot taken");
				} 
				catch (Exception e)
				{
				 
				System.out.println("Exception while taking screenshot "+e.getMessage());
				} 
				 
				 
				 
				}
				driver.quit();
				Reporter.log("=====Browser Session End=====", true);
				
			} 
		
	}



