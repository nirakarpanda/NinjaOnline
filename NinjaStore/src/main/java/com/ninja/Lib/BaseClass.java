package com.ninja.Lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	

	public WebDriver driver;

		@BeforeClass
		public void OpenBrowser()
		//public void OpenBrowser()
		{
			
				 System.out.println("loading");
				  // If the browser is Firefox, then do this
				
				 
					//System.setProperty("webdriver.gecko.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\geckodriver.exe");        
					     
						//WebDriver driver = new FirefoxDriver();
					
					 // driver = new FirefoxDriver();
					  System.out.println("after firefox");
					 //driver.get("https://login.naukri.com/nLogin/Login.php");
				 
				  
				 
				
				 
					  // Here I am setting up the path for my IEDriver
				 
					 System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");      
						
						
						
				               driver=new ChromeDriver();
						//driver = new FirefoxDriver();
				           	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
				              driver.get("http://tutorialsninja.com/demo/");
				              
		     String title= driver.getTitle();
		     System.out.println(title);
	   
	   
	   	System.out.println("helloprint.......................................................................");
	       //Create Login Page object
				//  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	      		driver.manage().window().maximize();
	      		

	              
	              
			
		
		}
		
		
		@AfterClass
		public void closeApplication()
		{
				if(driver!=null){
			//driver.quit();
			}
			Reporter.log("=====Browser Session End=====", true);
			
		}

	}



