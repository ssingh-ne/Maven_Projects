package New;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel_test {
	@Test
	public void setupApplication(){
		
		WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        
		driver.manage().window().maximize();
		
		driver.get("https://afl.auw.com/?lang=en-us");
		
		System.out.println("Page title - " + driver.getTitle());
		
	
	
}

}
