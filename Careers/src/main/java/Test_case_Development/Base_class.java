package Test_case_Development;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_class {
	
	WebDriver driver;
    
	@Parameters ("browser")
	 @BeforeMethod
	 
	/* public void setupApplication()
		{
			
		Reporter.log("=====firefox Browser Session Started=====", true);
		 // System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sweta\\Desktop\\Demo\\New folder\\Firefox\\geckodriver.exe");
               driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://develop--applied-careers.netlify.app/");
			
			Reporter.log("=====Application Started=====", true);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	*/ 
	 
	/*public void setupApplication()
		{
			
			Reporter.log("=====Chrome Browser Session Started=====", true);
			  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
			
	                driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://develop--applied-careers.netlify.app/");
			
			Reporter.log("=====Application Started=====", true);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}*/
	
		public void setupApplication (String browser)
		{
		if(browser.equalsIgnoreCase("firefox")) {
			Reporter.log("=====firefox Browser Session Started=====", true);
			  System.setProperty("webdriver.gecko.driver", ".\\Drivers\\Firefox\\geckodriver.exe");
    //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sweta\\Desktop\\Demo\\New folder\\Firefox\\geckodriver.exe");
	                driver=new FirefoxDriver();
			
			}
		
		
		else if (browser.equalsIgnoreCase("chrome")) {
			
			Reporter.log("=====Chrome Browser Session Started=====", true);
			 System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sweta\\Desktop\\Demo\\New folder\\Chrome\\chromedriver.exe");
	                driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		
		driver.get("https://develop--applied-careers.netlify.app/");
		
		Reporter.log("=====Application Started=====", true);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
