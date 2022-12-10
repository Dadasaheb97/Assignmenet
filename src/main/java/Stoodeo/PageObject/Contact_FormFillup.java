package Stoodeo.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Stoodeo.BaseClass.Base_Class;

public class Contact_FormFillup  extends Base_Class {
	
	public Contact_FormFillup() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name=\"name\"]")
	public WebElement name;
	
	@FindBy(xpath="//input[@name=\"organization\"]")
	public WebElement organization;
	
	@FindBy(xpath="//input[@name=\"goals\"]")
	public WebElement goals;
	
	@FindBy(xpath="//select[@name=\"completion\"]")
	public WebElement completion;
	
	@FindBy(xpath="//select[@name=\"budget\"]")
	public WebElement budget;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	public WebElement phone;
	
	@FindBy(xpath="//span[text()=\"Send It!\"]")
	public WebElement Send;
	
	public void Name(String Name) {
		name.sendKeys(Name);
	}
	
	public void Organization(String Organization_Name) {
		organization.sendKeys(Organization_Name);
	}
	
	public void Goals(String GoalsName) {
		goals.sendKeys(GoalsName);
	}
	
	public void Duration(String duration) {
		//completion.click();
		Select select = new Select(completion);
		select.selectByVisibleText(duration);
	}
	
	public void Budget(String budgetvalue) {
		//budget.click();
		Select select = new Select(budget);
		select.selectByVisibleText(budgetvalue);
		//budget.sendKeys(budgetvalue);
	}
	
	public void Email(String mailid) {
		email.sendKeys(mailid);
	}
	
	public void Phone_No(String Number) {
		phone.sendKeys(Number);
	}
	
	public void Sendbtn() {
		Send.click();
	}
	
	
	
	
	
	
	
	

}
