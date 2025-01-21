package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	@FindBy(xpath= "//a[@class='navbar-brand']")
	WebElement productsTittle;
	

	@FindBy(linkText = "Samsung galaxy s6")
	WebElement itemOne;
	
	@FindBy(xpath= "//a[@class='btn btn-success btn-lg']")
	WebElement addcartbtn;


	private WebDriver driver;
	
	
	public ProductListPage(WebDriver driver) {
		
		 this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void addToCart() {
		itemOne.click();
		addcartbtn.click();
		
		
	}
	public voild confirmbyalert() {
 
        alert.accept();
  
        
    }
	/*
	public void viewCart() {
		
		cartIcon.click();
		
		
	}
	*/
	public boolean isOnProducts() {
		return productsTittle.isDisplayed();
	}
	
	
	
	

}
