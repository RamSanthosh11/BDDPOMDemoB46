package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class OrderStepDef {
	
	WebDriver driver =TestBase.getDriver();
    LoginPage loginPage;
    ProductListPage ListPage;
    CartPage cartpage;
    CheckOutPage checkOutPage;

    
    public OrderStepDef() {
        loginPage = new LoginPage(driver);
        ListPage = new ProductListPage(driver);
        cartpage = new CartPage(driver);
        checkOutPage = new CheckOutPage(driver);
    }
	
	@Given("User is on login Page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://www.saucedemo.com/");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String struser, String strpwd) {
		loginPage.validLogin(struser, strpwd);
		
	    
	}
	@Then("User should be on Home page")
	public void user_should_be_on_home_page() {
		Assert.assertTrue(ListPage.isOnProducts());
	  
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		ListPage.addToCart();
	   
	}
	@Then("Item must be added")
	public void item_must_be_added() {
		ListPage.viewCart();
		Assert.assertTrue(cartpage.isItemAdded());
	   
	}
	
	@Given("User is on cart page")
	public void user_is_on_cart_page() 
	{
		ListPage.viewCart();
	    
	}
	@When("User do checkout")
	public void user_do_checkout() {
		cartpage.checkoutItems();
	    
	}
	@Then("Should navigate to Checkout page")
	public void should_navigate_to_checkout_page() {
		checkOutPage.checkoutInfo("Ram", "Santhosh", "522006");
    	checkOutPage.checkoutOrder();
    	Assert.assertEquals(checkOutPage.Succeessmsg(), "Thank you for your order!");
    	System.out.println("Testx on last page"+checkOutPage.Succeessmsg());
	}

}
