package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class URL {
	
	
	WebDriver driver;
	
	public URL (WebDriver driver){
		this.driver =driver;
	}


	public static void DevURL() throws InterruptedException{
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sweta\\Desktop\\Demo\\New folder\\Chrome\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
	}


}
