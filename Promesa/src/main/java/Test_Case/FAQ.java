package Test_Case;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Pages.Amplience;
import Pages.Home;

public class FAQ  extends Base_class {
@Test
	
	public void Siheading_2 () throws InterruptedException{
		
		By FAQ_ques_one = By.xpath("//*[@name='/accordions/0/summary']");
		By sideheading_4 = By.xpath("(//*[@class='section__content']/div/div/h3)[4]");
	 	By sideheading_5 = By.xpath("(//*[@class='section__content']/div/div/h3)[5]");
	 	
	 	By ans1= By.xpath("(//*[@role='region'])[1]");
	 	By ans2= By.xpath("(//*[@role='region'])[2]");
	 	By ans3= By.xpath("(//*[@role='region'])[3]");	
	 	By ans4= By.xpath("(//*[@role='region'])[4]");
	 	By ans5= By.xpath("(//*[@role='region'])[5]");
	 	By ans6= By.xpath("(//*[@role='region'])[6]");
	 	
		Amplience a = new Amplience(driver);
		Home h = new Home(driver);
		
		/*
		Thread.sleep(5000);
	 		driver.get("https://promesa.auw.com/");*/
	 		
	 	
		// FQA question answer
	 		
	 		h.FAQ_Answer_1();
	 		String A1 = driver.findElement(ans1).getText();
	 		System.out.println("A1 = " +A1);
	 		
 		
	 		h.FAQ_Answer_2();
	 		String A2 = driver.findElement(ans2).getText();
	 		System.out.println("A2 = " +A2);
	 		
	 		
	 		h.FAQ_Answer_3();
	 		String A3 = driver.findElement(ans3).getText();
	 		System.out.println("A3 = " +A3);
	 		

	 		h.FAQ_Answer_4();
	 		String A4 = driver.findElement(ans4).getText();
	 		System.out.println("A4 = " +A4);
	 	

	 		h.FAQ_Answer_5();
	 		String A5 = driver.findElement(ans5).getText();
	 		System.out.println("A5 = " +A5);
	 

	 		h.FAQ_Answer_6();
	 		String A6 = driver.findElement(ans6).getText();
	 		System.out.println("A6 = " +A6);
	 	

		/*a.Amplience_url();
			
			a.Amplience_Login();
			a.Promesa_Slots();
			
			a.Promesa_slotEdit_six();
			
			 // FAQ question 1
		 	    String FAQ_question_one = driver.findElement(FAQ_ques_one).getText();
				 
		 		System.out.println("FAQ question 1 = "+FAQ_question_one);
		 		
			    int size5 = driver.findElements(By.tagName("iframe")).size();
		 		System.out.println(size5);
		 		driver.switchTo().frame(0);
		 		
		 	    String FAQ_ques_ans_one = driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		 		System.out.println("Answer 1 = "+FAQ_ques_ans_one);
		 		
		 		 
		 		
		 	// FAQ question 2
		 		a.Promesa_slotEdit_six_FAQ();
		 		
		 		int size6 = driver.findElements(By.tagName("iframe")).size();
		 		System.out.println(size6);
		 		driver.switchTo().frame(1);
		 		Thread.sleep(5000);
		 	    String FAQ_ques_ans_two = driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		 		System.out.println("Answer 2 = "+FAQ_ques_ans_two);
		 		
		 	// FAQ question 3
	       a.Promesa_slotEdit_six_FAQ();
		 		
		 		int size7 = driver.findElements(By.tagName("iframe")).size();
		 		System.out.println(size7);
		 		driver.switchTo().frame(2);
		 		
		 	    String FAQ_ques_ans_three= driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		 		System.out.println("Answer 3 = "+FAQ_ques_ans_three);
		 		
		 		
		 	// FAQ question 4
		 		
	         a.Promesa_slotEdit_six_FAQ();
		 		
		 		int size8 = driver.findElements(By.tagName("iframe")).size();
		 		System.out.println(size8);
		 		driver.switchTo().frame(3);
		 		
		 	    String FAQ_ques_ans_four= driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		 		System.out.println("Answer 4 = "+FAQ_ques_ans_four);
		 		
		 	// FAQ question 5
		 		
	        a.Promesa_slotEdit_six_FAQ();
		 		
		 		int size9 = driver.findElements(By.tagName("iframe")).size();
		 		System.out.println(size9);
		 		driver.switchTo().frame(4);
		 		
		 	    String FAQ_ques_ans_five = driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
		 		System.out.println("Answer 5 = "+FAQ_ques_ans_five);
		 		
		 	// FAQ question 6
		 		
		 		 a.Promesa_slotEdit_six_FAQ();
			 		
			 		int size10 = driver.findElements(By.tagName("iframe")).size();
			 		System.out.println(size10);
			 		driver.switchTo().frame(5);
			 		
			 	    String FAQ_ques_ans_six = driver.findElement(By.xpath("//*[@id='tinymce']/p")).getText();
			 		System.out.println("Answer 6 = "+FAQ_ques_ans_six);
			 		
			 		
			 		/*assertEquals(A1, FAQ_ques_ans_one);
			 		assertEquals(A2, FAQ_ques_ans_two);
			 		assertEquals(A3, FAQ_ques_ans_three);
     		 		assertEquals(A4, FAQ_ques_ans_four);
			 		assertEquals(A5, FAQ_ques_ans_five);
			 		assertEquals(A6, FAQ_ques_ans_six);
*/}
}
