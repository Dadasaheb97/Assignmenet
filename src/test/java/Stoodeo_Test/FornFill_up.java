package Stoodeo_Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Stoodeo.BaseClass.Base_Class;
import Stoodeo.PageObject.Contact_FormFillup;
import Stoodeo.PageObject.Contact_Page;

public class FornFill_up extends Base_Class {
	@Test
	public void test() throws InterruptedException {
		Contact_Page cp = new Contact_Page();
		cp.Clickbtn();
		
		Contact_FormFillup CF=new Contact_FormFillup();
		
		CF.Name("Dadasaheb");
		CF.Organization("TechM");
		CF.Goals("HigherPosition");
		Thread.sleep(3000);
		CF.Duration("1-3 Months");
		Thread.sleep(3000);
		CF.Budget("$4,750");
		CF.Email("dadachavan@gmail.com");
		CF.Phone_No("7709050214");
		CF.Sendbtn();
		
		String text=driver.findElement(By.xpath("//p[@class=\"success\"]")).getText();
		String text1=driver.getTitle();
		System.out.println(text1);
		System.out.println(text);
		if(text.startsWith("Your inquiry has been received.")) {
			System.out.println("success");
		}else {
			System.out.println("not open");
		}
	}
	
}
