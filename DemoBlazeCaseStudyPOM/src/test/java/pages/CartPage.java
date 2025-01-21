package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage {
	
	@FindBy(xpath = "//li[@class='nav-item active']//following-sibling::li[3]")
	WebElement cartbtn;
	
	@FindBy(id="tbodyid")
	WebElement cartList;
	
	
	
	
	
public CartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
public boolean isItemAdded() {
	
	return cartList.isDisplayed();
}

public void checkoutItems() {
	cartbtn.click();
	
}

}
