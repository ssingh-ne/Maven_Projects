package Promesa_Test_Case_Prod;

import org.testng.annotations.Test;

import Promesa_Pages.Home;
import Promesa_Test_Case_Prod.Base_class;

public class Change_language extends Base_class {
	
@Test
	
	public void Change_Language() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Language_Change_Spanish();	
	h.Language_Change_English();
}

}
