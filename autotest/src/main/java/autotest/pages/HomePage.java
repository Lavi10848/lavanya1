package autotest.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import autotest.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory - OR
	
@FindBy(xpath="//*[@id=\'homefeatured\']/li[1]/div/div[1]/div/a[1]/img")
	WebElement item1;
	
	@FindBy(xpath="//*[@id=\'columns\']/div[1]/a[1]/i")
	WebElement Homebutton;
	
	@FindBy(xpath="//*[@id=\'homefeatured\']/li[2]/div/div[1]/div/a[1]/img")
	WebElement item2;
	
	@FindBy(xpath="//*[@id=\'homefeatured\']/li[3]/div/div[1]/div/a[1]/img")
	WebElement item3;
	
	@FindBy(xpath="//*[@id=\'homefeatured\']/li[5]/div/div[1]/div/a[1]/img")
	WebElement item4;
	
	@FindBy(xpath="//*[@id=\"homefeatured\"]/li[7]/div/div[1]/div/a[1]/img")
	WebElement item5;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addtocartbutn;
	
	@FindBy(xpath="//*[@id=\'header\']/div[3]/div/div/div[3]/div/a")
	String itemsincart;

	@FindBy(xpath="//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/span")
	WebElement closebtn;
	

	@FindBy(xpath="//*[@id=\'header\']/div[3]/div/div/div[3]/div/a")
	WebElement cartvalue;
	
	//search items
	
	@FindBy(name="search_query")
	WebElement searchbar;
	
	@FindBy(name="submit_search")
	WebElement searchbtn;
	
	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	WebElement searchprod1;
	
	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	WebElement searchprod2;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	WebElement searchprod3;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
	WebElement searchprod4;
	
	@FindBy(css="#center_column > ul > li > div > div.left-block > div > a.product_img_link > img")
	WebElement searchprod5;
	
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedbtn;
	
	@FindBy(id="email_create")
	WebElement email;
	
	@FindBy(name="SubmitCreate")
	WebElement createacc;
	
	@FindBy(id="id_gender2")
	WebElement title;
	
	@FindBy(name="customer_firstname")
	WebElement firname;
	
	@FindBy(name="customer_lastname")
	WebElement lasname;
	
	@FindBy(id="passwd")
	WebElement password;
	
	
	@FindBy(name="firstname")
	WebElement addfirname;
	
	@FindBy(name="lastname")
	WebElement addlasname;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(name="postcode")
	WebElement zipcode;
	
	@FindBy(name="id_country")
	WebElement country;
	
	@FindBy(name="phone_mobile")
	WebElement phone;
	
	@FindBy(name="alias")
	WebElement myadd;
	
	@FindBy(name="submitAccount")
	WebElement regisbtn;
	
	@FindBy(name="processAddress")
	WebElement checkbtn;
	
	@FindBy(id="cgv")
	WebElement termscheck;
	

	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement Bankpay;
	

	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
	WebElement checkpay;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement proceedbtn1;
	
	public HomePage() {
	
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
		
		
			

		 public void item1select() throws InterruptedException {
			 item1.click();
			
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			
			 
		
		 }
		 public void item2select() throws InterruptedException {
			 item2.click();
			
							 Thread.sleep(2000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
		 }
		 public void item3select() throws InterruptedException {
			 item3.click();
		
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			
		    	js.executeScript("arguments[0].click()",addtocartbutn);
		    	 closebtn.click();
			
			 Homebutton.click();
		 }
		 public void item4select() throws InterruptedException {
			 item4.click();
			 Thread.sleep(3000);
			
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
		 }
		 public void item5select() throws InterruptedException {
			 item5.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
		 }
		 
		

		
	//search items actions	 		 
		 
		 public void searchprod1() throws InterruptedException {
			 searchbar.sendKeys(prop.getProperty("searchitem1"));
			 searchbtn.click();
			 searchprod1.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			 

		 }	 
		 
		  
		 
		 public void searchprod2() throws InterruptedException {
			 searchbar.sendKeys(prop.getProperty("searchitem2"));
			 searchbtn.click();
			 searchprod2.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			 

		 }	 
		 public void searchprod3() throws InterruptedException {
			 searchbar.sendKeys(prop.getProperty("searchitem3"));
			 searchbtn.click();
			 searchprod3.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			 

		 }	 
		 public void searchprod4() throws InterruptedException {
			 searchbar.sendKeys(prop.getProperty("searchitem4"));
			 searchbtn.click();
			 searchprod4.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			 
			 

		 }	
		 
		 public void searchprod5() throws InterruptedException {
			 searchbar.sendKeys(prop.getProperty("searchitem5"));
			 searchbtn.click();
			 searchprod5.click();
			 Thread.sleep(3000);
			 addtocartbutn.click();
			 closebtn.click();
			 Homebutton.click();
			 

		 }	
		 public String cartvalueupdated() { 
			 
			 
			 
			 String cartvalueupda = cartvalue.getText();
			 
			 cartvalue.click();
			 proceedbtn.click();
			 email.sendKeys(prop.getProperty("email"));
			 createacc.click();
			 
			 return cartvalueupda;
			 
		 }
 
		 public void createaccount() throws InterruptedException { 
			 
			 title.click();
			 firname.sendKeys(prop.getProperty("firstname"));
			 lasname.sendKeys(prop.getProperty("lastname"));
			 password.sendKeys(prop.getProperty("password"));
			 addfirname.sendKeys(prop.getProperty("firstname"));
			 addlasname.sendKeys(prop.getProperty("lastname"));
			 address.sendKeys(prop.getProperty("Address"));
			 city.sendKeys(prop.getProperty("city"));
			 Select drpstate = new Select(state);
				drpstate.selectByVisibleText(prop.getProperty("state"));
				zipcode.sendKeys(prop.getProperty("zipcode"));
				Select drpCountry = new Select(country);
				drpCountry.selectByVisibleText(prop.getProperty("country"));
				phone.sendKeys(prop.getProperty("phoneno"));
				myadd.sendKeys(prop.getProperty("myaddress"));
				regisbtn.click();
				checkbtn.click();
				termscheck.click();
				JavascriptExecutor js = (JavascriptExecutor) driver;

		        // This  will scroll down the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,500)");
		        proceedbtn1.click();
			 
		 }
		 
		 public String paymentoptions() {
			 String pay1 = Bankpay.getText();
			
			 return(pay1); 
			 
					 
		 } 
		 public String paymentoptions1() {
			 String pay2 = checkpay.getText();
			
			 return(pay2); 
			 
					 
		 }  
		}		 
		 


