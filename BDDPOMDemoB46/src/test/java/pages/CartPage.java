package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage {
	
	@FindBy(css = "div.cart_item")
	WebElement cartList;
	
	@FindAll(value = @FindBy(css = "div.cart_item"))
	List<WebElement> items;
	

	@FindBy(id = "div.remove-sauce-labs-backpack")
	WebElement rmvBtn;
	
	@FindBy(id = "continue-shopping")
	WebElement contBtn;
	
	@FindBy(id = "checkout")
	WebElement chkoutBtn;
	
	
	
	
	
public CartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		/* PageFactory.initElements(driver, this): 
		This line initializes the web elements defined with the @FindBy annotations using the provided WebDriver instance.*/
		
	}
public boolean isItemAdded() {
	
	return cartList.isDisplayed();
}

public void checkoutItems() {
	chkoutBtn.click();
	
}

}
