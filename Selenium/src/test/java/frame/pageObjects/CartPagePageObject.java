package frame.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import frame.abstarctComponents.AbstractComponents;

public class CartPagePageObject extends AbstractComponents {
	
	public WebDriver driver;
	
	public CartPagePageObject(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	WebElement porulInCart;
	
	@FindBy(xpath="//div[@class='cartSection']/h3")
	List<WebElement> prosInCart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkout;
	
	public Boolean cartPageValidations(String product)
	{
		getWaitLogic(porulInCart);
		return prosInCart.stream().anyMatch(s->s.getText().contains(product));

	
		
	}
	
	
	public void checkoutClick()
	{
		checkout.click();
	}
	
	
	
	

	
	

	
	
}
