package com.autotest.test.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autotest.base.TestBase;
import autotest.pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	HomePage item1;
	HomePage item2;
	HomePage item3;
	HomePage item4;
	HomePage item5;
	HomePage updatedcartvalue;
	HomePage prod1;
	HomePage prod2;
	HomePage prod3;
	HomePage prod4;
	HomePage prod5;
	HomePage createaccount;
	HomePage capturepay1;
	HomePage capturepay2;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		               initialization();
		homePage = new HomePage();	
		item1    = new HomePage();
		item2    = new HomePage();
		item3    = new HomePage();
		item4    = new HomePage();
		item5    = new HomePage();
		updatedcartvalue = new HomePage();
		prod1   = new HomePage();
		prod2   = new HomePage();
		prod3   = new HomePage();
		prod4   = new HomePage();
		prod5   = new HomePage();				
	createaccount = new HomePage();
	capturepay1 = new HomePage();
	capturepay2 = new HomePage();
	}
	@Test(priority=1)
	public void HomePageTitleTest(){
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "My Store");	
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void shopping() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
	
				item1.item1select();
				 js.executeScript("window.scrollBy(0,1000)");
				item2.item2select();
				js.executeScript("window.scrollBy(0,1000)");
				item3.item3select();
				js.executeScript("window.scrollBy(0,1500)");
				item4.item4select();
				js.executeScript("window.scrollBy(0,1500)");
				item5.item5select();
			//search prods	
				js.executeScript("window.scrollBy(0,1000)");
		        prod1.searchprod1();
		        js.executeScript("window.scrollBy(0,1000)");
		        prod2.searchprod2();
		        js.executeScript("window.scrollBy(0,1000)");
		        prod3.searchprod3();
		        js.executeScript("window.scrollBy(0,1000)");
		        prod4.searchprod4();
		        js.executeScript("window.scrollBy(0,1000)");
		        prod5.searchprod5();
		        
		        //create acco
		        
		        updatedcartvalue.cartvalueupdated();
		        
		        createaccount.createaccount();
		        
		        System.out.print(capturepay1.paymentoptions());		
		        System.out.print(capturepay2.paymentoptions1());	
	}
	

	
			
	
		
	@AfterMethod
	
	public void shutDown(){
		driver.quit();
	}
	
	}
	
	

