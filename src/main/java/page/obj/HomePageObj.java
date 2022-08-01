package page.obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObj extends Base{
	
	public HomePageObj () {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebSite;
	public String retailWebSite() {
		String WebSite = retailWebSite.getText();
		return WebSite;
	}
	@FindBy (xpath = "//span[@class='hidden-xs hidden-sm hidden-md']")
	private WebElement ClickOnCurrency;
	public void ClickOnCurrency() {
		ClickOnCurrency.click();
	}
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement ClickOnEuro;
	public void ClickOnEuro() {
		ClickOnEuro.click();
	}
	@FindBy (xpath = "//button[@name='EUR']")
	private WebElement SeeTheEuro;
	public void SeeTheEuro() {
		SeeTheEuro.isDisplayed();
		Utils.takeScreenshotForStep();
	}
	@FindBy (id = "cart-total")
	private WebElement ClickOnShoopingCart;
	public void ClickOnShoopingCart() {
		ClickOnShoopingCart.click();
	}
	@FindBy (xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement SeeEmptyShoopingCart;
	public String SeeEmptyShoopingCart() {
		String ShoopingCartEmpty = SeeEmptyShoopingCart.getText();
		return ShoopingCartEmpty;
	}
		

}
