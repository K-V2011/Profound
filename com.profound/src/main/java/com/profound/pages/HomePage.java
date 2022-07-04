package com.profound.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	Actions act;
	
	Select select;
	
	@FindBy(xpath="//a[text()='Courses ']")
	private WebElement Courses;
	
	@FindBy(xpath="//a[text()='Selenium WebDriver']")
	private WebElement SeleniumLink;
	
	@FindBy(id="txt_name")
	private WebElement name;
	
	@FindBy(id="txt_qualification")
	private WebElement qualification;
	
	
	@FindBy(id="txt_contact")
	private WebElement Mobile ;
	
	
	@FindBy(id="txt_email")
	private WebElement email;
	
	
	@FindBy(id="txt_course")
	private WebElement course ;
	
	
	@FindBy(id="txt_city")
	private WebElement city ;
	
	@FindBy(name="cityList")
	private WebElement branch ;
	
	@FindBy(xpath="//textarea[@name='txt_message']")
	private WebElement  message  ;
	
	
	@FindBy(id="btn_submit")
	
	private WebElement  Enquiry; 
	
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickOnCources(WebDriver driver) {
		
		 act=new Actions(driver);
		
		act.moveToElement(Courses).click().build().perform();
		
		act.moveToElement(SeleniumLink).click().build().perform();
		
	}
	
	
	
	public void setName(String Name) {
		
		name.sendKeys(Name);
		
	}
	
   public void setQualification(String qualificationName) {
	   
	  select=new Select(qualification);
		
	select.selectByVisibleText(qualificationName);
		
	}


    public void setContact(String contact) {
	
	Mobile.sendKeys(contact);
		
	}

    

    public void setemail(String Email) {
	
    	email.sendKeys(Email);
		
	}
    
    
    
    public void setCourse(String Course) {
    	
    	select=new Select(course);
    	select.selectByVisibleText(Course);
		
	}
    
    
    public void setCity(String City) {
    	
    	select=new Select(city);
    	select.selectByVisibleText(City);
    	
		
	}
    
    
 public void setBranch(String Branch) {
	 
	 select=new Select(branch);
 	select.selectByVisibleText(Branch);
    	
    	
		
	}
 public void WriteMessage(String Msg) {
	 
	 message.sendKeys(Msg);
	 
	 
 }
 
 public void clickOnEnquiry() {
	 
	 Enquiry.click();
	 
 }




	
	
	
	
}
