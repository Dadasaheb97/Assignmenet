package Stoodeo.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stoodeo.BaseClass.Base_Class;

public class Contact_Page extends Base_Class {
	
public Contact_Page() {
	
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='Contact']")
public WebElement ContactBtn;

public void Clickbtn() {
	  ContactBtn.click();

}
}