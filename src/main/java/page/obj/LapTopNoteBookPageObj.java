package page.obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LapTopNoteBookPageObj extends Base{
	
	public LapTopNoteBookPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebSite;
	public String retailWebSite() {
		String WebSite = retailWebSite.getText();
		return WebSite;
	}
	@FindBy (xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement ClickOnLapTopNoteBooks;
	public void ClickOnLapTopNoteBooks () {
		ClickOnLapTopNoteBooks.click();
	}
	@FindBy (xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement ClickOnShowAllLapNoteBooks;
	public void ClickOnShowAllLapNoteBooks () {
		ClickOnShowAllLapNoteBooks.click();
	}
	@FindBy (xpath = "//a[text()='MacBook']")
	private WebElement ClickOnMacBook;
	public void ClickOnMacBook () {
		ClickOnMacBook.click();
	}
	@FindBy (id="button-cart")
	private WebElement ClickOnAddToCart;
	public void ClickOnAddToCart () {
		ClickOnAddToCart.click();
	}
	@FindBy (xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMsgMacBook;
	public String SuccessMsgMacBook () {
		String SuccessMacBook = SuccessMsgMacBook.getText();
		return SuccessMacBook;
	}
	@FindBy (id = "cart-total")
	private WebElement ShowCartItems;
	public String ShowCartItems () {
		String ItemsInCart = ShowCartItems.getText();
		return ItemsInCart;
	}
	@FindBy (id = "cart-total")
	private WebElement ClickOnCartItems;
	public void ClickOnCartItems () {
		ClickOnCartItems.click();
	}
	@FindBy (xpath = "//i[@class='fa fa-times']")
	private WebElement ClickOnXBttn;
	public void ClickOnXBttn () {
		ClickOnXBttn.click();
	}
	@FindBy (id = "cart-total")
	private WebElement ShowEmptyCartItems;
	public String ShowEmptyCartItems () {
		String EmptyItemsInCart = ShowCartItems.getText();
		return EmptyItemsInCart;
	}
	@FindBy (xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement ClickOnMacBookComparison;
	public void ClickOnMacBookComparison () {
		ClickOnMacBookComparison.click();
	}
	@FindBy (xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement ClickOnMacBookAirComparison;
	public void ClickOnMacBookAirComparison () {
		ClickOnMacBookAirComparison.click();
	}
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMsgMacBookAirComparison;
	public String SuccessMsgMacBookAirComparison () {
		String MacBookComparison = SuccessMsgMacBookAirComparison.getText();
		return MacBookComparison;
	}
	@FindBy (xpath = "//a[text()='product comparison']")
	private WebElement ClickOnComparisonBttn;
	public void ClickOnComparisonBttn() {
		ClickOnComparisonBttn.click();
	}
	@FindBy (xpath = "//h1[text()='Product Comparison']")
	private WebElement SeeTheComparisonChart;
	public String SeeTheComparisonChart() {
		String chartCompare = SeeTheComparisonChart.getText();
		return chartCompare;
	}
	@FindBy (xpath = "(//div//button//i[@class='fa fa-heart'])[5]")
	private WebElement ClickOnHeart;
	public void ClickOnHeart() {
		ClickOnHeart.click();
	}
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SeeLoginCASonyVaioWishList;
	public String SeeLoginCASonyVaioWishList() {
		String WishListLogin = SeeLoginCASonyVaioWishList.getText();
		return WishListLogin;
	}
	@FindBy (xpath = "//a[text()='MacBook Pro']")
	private WebElement ClickOnMacPro;
	public void ClickOnMacPro() {
		ClickOnMacPro.click();
	}
	@FindBy (xpath = "//ul//li//h2")
	private WebElement SeeThe2000Mack;
	public String SeeThe2000Mack() {
		String MacPro2000 = SeeThe2000Mack.getText();
		return MacPro2000;
	}
	
	
	
	
	}
	
	
