package page.obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopObj extends Base{
	
	public DesktopObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsite;
	@FindBy (xpath = "//a[text()='Desktops']")
	private WebElement Desktops;
	@FindBy (xpath = "//a[text()='Show All Desktops']")
	private WebElement clickOnShowAllDesk;
	@FindBy (xpath = "//h2[text()='Desktops']")
	private WebElement allDesktopPage;
	@FindBy (xpath = "//a[text()='HP LP3065']")
	private WebElement clickAddLP3065;
	@FindBy (id = "input-quantity")
	private WebElement laptopQty;
	@FindBy (id = "button-cart")
	private WebElement addLT;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sucessMsgAdd;
	@FindBy (xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement clickOnEOS5DCamera;
	@FindBy (id = "input-option226")
	private WebElement selectColor;
	@FindBy (xpath = "//select//option[@value='15']")
	private WebElement selectRed;
	@FindBy (id = "input-quantity")
	private WebElement cameraQTY;
	@FindBy (id = "button-cart")
	private WebElement addCamera;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement cameraSuccessMsg;
	@FindBy (xpath ="//a[text()='Canon EOS 5D Camera']")
	private WebElement clickOnEOS5DCameraForReview;
	@FindBy (xpath = "//a[text()='0 reviews']")
	private WebElement clickOnReview;
	@FindBy (id = "input-name")
	private WebElement inputName;
	@FindBy (id = "input-review")
	private WebElement inputReview;
	@FindBy (xpath = "(//input[@type ='radio'])[5]")
	private WebElement clickOnGood;
	@FindBy (xpath = "//div//button[@id='button-review']")
	private WebElement reviewContinueBttn;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewThankYouMsg;


	public String retailWebsite() {
		String retailW = retailWebsite.getText();
		return retailW;
	}
	public void Desktops() {
		Desktops.click();
	}
	public void clickOnShowAllDesk() {
		clickOnShowAllDesk.click();
	}
	public String allDesktopPage() {
		String allDeskPage = allDesktopPage.getText();
		return allDeskPage;
	}
	public void clickAddLP3065() {
		clickAddLP3065.click();
	}
	public void enterQty (String LTQty) {
		laptopQty.clear();
		laptopQty.sendKeys(LTQty);
	}
	public void addLT() {
		addLT.click();
	}
	public String sucessMsgAdd () {
		String SucessMsg = sucessMsgAdd.getText();
		return SucessMsg;
	}
	public void clickOnEOS5DCamera () {
		clickOnEOS5DCamera.click();
	}
	public void selectColor() {
		selectColor.click();
	}
	public void selectRed() {
		selectRed.click();
	}
	public void cameraQTY (String CQTY) {
		cameraQTY.clear();
		cameraQTY.sendKeys(CQTY);
	}
	public void addCamera() {
		addCamera.click();
	}
	public String cameraSuccessMsg() {
		String cameraThankYou = cameraSuccessMsg.getText();
		return cameraThankYou;
	}
	public void clickOnEOS5DCameraForReview() {
		clickOnEOS5DCameraForReview.click();
	}
	public void clickOnReview() {
		clickOnReview.click();
	}
	public void inputName (String yourname) {
		inputName.sendKeys(yourname);
	}
	public void inputReview (String yourReview) {
		inputReview.sendKeys(yourReview);
	}
	public void clickOnGood () {
		clickOnGood.click();
	}
	public void reviewContinueBttn() {
		reviewContinueBttn.click();
	}
	public String reviewThankYouMsg () {
		String ThankYouMsg = reviewThankYouMsg.getText();
		return ThankYouMsg;
	}
}