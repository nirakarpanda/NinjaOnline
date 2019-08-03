package com.ninja.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='input-lastname']")
	WebElement LastName;
	
	@FindBy(xpath="//*[@id='input-email']")
	WebElement email;
	

	@FindBy(xpath="//*[@id='input-telephone']")
	WebElement telePhone;
	
	@FindBy(xpath="//*[@id='input-password']")
	WebElement passWord;
	
	@FindBy(xpath="//*[@id='input-confirm']")
	WebElement confirmPass;
	
	@FindBy(xpath="//*[@id='content']/form/div/div/input[1]")
	WebElement privacyPolicy;
	@FindBy(xpath="//*[@id='content']/form/div/div/input[2]")
	WebElement registerButton;
	
	
	
	public void setfirstName(String firstname) {

		firstName.sendKeys(firstname);

	}
	
	public void setLastName(String lastname) {

		LastName.sendKeys(lastname);

	}
	public void setPhone(String tlephone) {

		telePhone.sendKeys(tlephone);

	}
	
	public void setPassword(String PassWord) {

		passWord.sendKeys(PassWord);

	}
	
	
	public void setEmail(String emailId) {

		email.sendKeys(emailId);

	}
	
	public void setConfirm(String repassword) {

		confirmPass.sendKeys(repassword);

	}
	
	public void ClickRegistert( ){
		registerButton.click();
	}
	
	public void selectPolicy( ){
		privacyPolicy.click();
	}
	
	public RegisterClass(WebDriver Idriver){
		
		this.driver = Idriver;

	    //This initElements method will create all WebElements

	    PageFactory.initElements(driver,this);
	}
	

}
