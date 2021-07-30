package Test_Case;

import org.testng.annotations.Test;

import Pages.Home;
import Test_Case.Base_class;

public class Change_language extends Base_class {
	
@Test
	
	public void Change_Language() throws InterruptedException{
	
	Home h = new Home(driver);
	
	h.Language_Change_Spanish();	
	h.Language_Change_English();
}

}
