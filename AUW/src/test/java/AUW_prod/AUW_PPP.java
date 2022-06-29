package AUW_prod;

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

public class AUW_PPP extends Base_Class {
	
	
	@Test
	public void main() throws InterruptedException{
	
		
		AUW_ppp pp = new AUW_ppp(driver);
		
		pp.Update_URL();
		pp.Header_();
		pp.Resources_section();
		
	}

}
