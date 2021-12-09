package AUW_Test_Case_dev;

import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AUW_Pages.AUW_ppp;
import AUW_Pages.Home_page;

public class AUW_PPP extends Base_class {
	
	
	@Test
	public void main() throws InterruptedException{
	
		Home_page home = new Home_page(driver);
		
		AUW_ppp pp = new AUW_ppp(driver);
		
		pp.Update_URL();
		pp.Header_();
		home.Cookies();
		
		pp.Resources_section();
		
	}

}
