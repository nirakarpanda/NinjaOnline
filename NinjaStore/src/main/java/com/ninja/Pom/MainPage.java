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



public class MainPage {
	WebDriver driver;
	@FindBy(className="caret")
	//@FindBy(css="input#usernameField")
	WebElement myAccountBtn;
	@FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul//li/a")
	WebElement links;
	@FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
 WebElement LaptopLink;
	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']//li[2]//div[1]//a")
	WebElement LaptopAllLink;
	
	public void LaptopAnd(){
		
		Actions action = new Actions(driver);
		
		
		action.moveToElement(LaptopLink).perform();
		System.out.println("before list");
		 List<WebElement> links =driver.findElements(By.xpath("//div[@class='collapse navbar-collapse navbar-ex1-collapse']//li[2]//div[1]//a"));
	System.out.println(links);
		 int count = links.size();
		 System.out.println("count="+count);
		 System.out.println("after list");
		 for(int i=0;i<count;i++){
	    	  String s=links.get(i).getText();
	    	//String s=  name.getAttribute("innerHTML");
	    	
	    	 System.out.println("names are "+s);
	    	 
	    	 if(s.equalsIgnoreCase("Show All Laptops & Notebooks")){
	    		 System.out.println("before click");
	    	links.get(i).click();
	    		 System.out.println("after click");
	    		 break; 
	    	 }}
		
		
		
	}

public void ClickMyAccount( ){
	myAccountBtn.click();
	
	Actions action = new Actions(driver);    
	//WebElement optionsList = driver.findElement(By.xpath("//span[contains(@class, 'k-dropdown-wrap')]"));
	action.moveToElement(myAccountBtn).perform();
System.out.println("perform");
	
List<WebElement> options = driver.findElements(By.xpath("//*[@id='top-links']/ul/li[2]/ul//li/a"));
for(WebElement option : options) {
    if (option.getText().equals("Register")) {
        option.click();
        break;
    }
}
System.out.println("bb");
	
}

  
public MainPage(WebDriver Idriver){

    this.driver = Idriver;

    //This initElements method will create all WebElements

    PageFactory.initElements(driver,this);
   // System.out.println("pom page object="+driver);

}

}