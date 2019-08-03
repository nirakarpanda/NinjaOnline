package com.ninja.Script;

import org.testng.annotations.Test;

import com.ninja.Lib.BaseClass;
import com.ninja.Pom.AddCartPage;
import com.ninja.Pom.MainPage;
import com.ninja.Pom.RegisterClass;


public class MainlPageCall extends BaseClass  {
	MainPage mainPage;
	RegisterClass registerclass;
	AddCartPage addcartpage;
	@Test(priority=0)
	public void study(){
		 mainPage = new MainPage(driver);
		 mainPage.ClickMyAccount();
		 		System.out.println("study hard");
	}
	
	@Test(priority=1)
	public void RegisterUser(){
		registerclass = new RegisterClass(driver);
		 registerclass.setEmail("nirakr2@gmail.com");
		 registerclass.setfirstName("Nirakar");
		 registerclass.setLastName("Panda");
		 registerclass.setPhone("81783982348");
		 registerclass.setPassword("Nirakar12");
		 registerclass.setConfirm("Nirakar12");
		 registerclass.selectPolicy();
		// registerclass.ClickRegistert();
		 		System.out.println("register page");
		 		
	}
	
	@Test(priority=2)
	public void LaptopLink(){
		mainPage.LaptopAnd();
		System.out.println("end of laprio link method");
	}
	@Test(priority=3)
	public void AddToCart(){
		System.out.println("start of addtokart link method");
		addcartpage.clicklAddTocartBtn();
		System.out.println("end of addtokart link method");
	}
	@Test(priority=3)
	public void AddToCartduolicate(){
		System.out.println("start of addtokart link method");
		addcartpage.clicklAddTocartBtn();
		System.out.println("end of addtokart link method");
	}
}
