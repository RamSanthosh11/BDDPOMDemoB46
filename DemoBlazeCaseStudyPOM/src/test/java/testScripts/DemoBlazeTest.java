package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class DemoBlazeTest {
	WebDriver driver;
	 LoginPage loginPage;
	 ProductListPage ListPage;
	 CartPage cartpage;
	 CheckOutPage checkOutPage;
	 
	  public DemoBlazeTest() {
	        TestBase.initDriver();
	        driver = TestBase.getDriver();
	        loginPage = new LoginPage(driver);
	        ListPage = new ProductListPage(driver);
	        cartpage = new CartPage(driver);
	        checkOutPage = new CheckOutPage(driver);

	    }
	  
	  @BeforeTest
	    public void setup() {
	        TestBase.openUrl("https://www.demoblaze.com/");
	    }
	  @Test(priority =1)
	    public void loginTest() throws InterruptedException {
		    Thread.sleep(1000);
	        loginPage.validLogin("ramu33177@gmail.com", "@Ramu4342");
	        loginPage.userlogin();
	        
	    }
	  @Test(priority =2)
	  public void addItemTest() throws InterruptedException {
		    Thread.sleep(1000);
	    	boolean isOnProductsPage = ListPage.isOnProducts();
	    	Assert.assertTrue(isOnProductsPage);
	    	ListPage.addToCart();
		    Thread.sleep(1000);
	    	//ListPage.confirmbyalert();
	    	Assert.assertEquals(ListPage.confirmbyalert(), "Product added.");
	    }
	  @Test(priority = 3)
	    public void checkoutTest() throws InterruptedException {
		  Thread.sleep(1000);
		  cartpage.checkoutItems();
		  boolean isOnProductsPage = cartpage.isItemAdded();
	      Assert.assertTrue(isOnProductsPage);
	      checkOutPage.checkoutInfo("Ram","India", "Hyderabad", "522066", "06","1999");
	      checkOutPage.checkoutOrder();
	      Assert.assertEquals(checkOutPage.Succeessmsg(), "Thank you for your purchase!");
	    	
        }
}
