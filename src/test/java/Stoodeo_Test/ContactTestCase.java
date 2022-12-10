package Stoodeo_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Stoodeo.BaseClass.Base_Class;
import Stoodeo.PageObject.Contact_Page;

public class ContactTestCase extends Base_Class {
	@Test
	public void test1() {
		Contact_Page cp = new Contact_Page();
		cp.Clickbtn();
		String text=driver.findElement(By.xpath("//h1[@class=\"entry-title first animated fadeInUp\"]")).getText();
		
		if(text.equalsIgnoreCase("Get Ready to Grow Online")) {
			Assert.assertTrue(true);
			logger.info("Contact tab open");
		}else {
			Assert.assertTrue(false);
			logger.info("Contact Tab not open");
		}
	}
	

}
