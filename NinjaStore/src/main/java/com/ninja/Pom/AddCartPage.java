package com.ninja.Pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class AddCartPage {
	WebDriver driver;


	@FindBy(xpath="//*[@id='content']/div[4]/div[1]/div/div[2]/div[2]/button[1]")
	
	WebElement addTocart;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addTocartNext;
	
	public void clicklAddTocartBtn(){
		System.out.println("addTocart");
addTocart.click();

addTocartNext.click();
}
  
public AddCartPage(WebDriver Idriver){

    this.driver = Idriver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver,this);
   // System.out.println("pom page object="+driver);

}

}