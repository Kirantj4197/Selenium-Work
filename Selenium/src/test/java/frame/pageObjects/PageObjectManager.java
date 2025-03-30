package frame.pageObjects;

import org.openqa.selenium.WebDriver;

import frame.TestBase.BaseClass;

public class PageObjectManager {
	
	public LoginPageObject lp;
	public WebDriver driver;
	public CheckoutPageObject cpo;
	public CartPagePageObject cpp;
	public ProductCataloguePageObject pcp;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public LoginPageObject returnLoginPage()
	{
		
		if(lp==null)
		{
		lp=new LoginPageObject(driver);
		}
		return lp;
	}
	
	
	public CheckoutPageObject  returnCheckoutPage()
	{
		
		if(cpo==null)
		{
		cpo=new CheckoutPageObject(driver);
		}
		return cpo;
	}
	
	public CartPagePageObject  returnCartPage()
	
	{
		
		if(cpp==null)
		{
		cpp=new CartPagePageObject(driver);
		}
		return cpp;
	}

	
	public ProductCataloguePageObject  returnProductCatalogue()
	
	{
		
		if(pcp==null)
		{
		pcp=new ProductCataloguePageObject(driver);
		}
		return pcp;
	}


}
