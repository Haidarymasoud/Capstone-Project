package page.obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement Retailwebsite;
	@FindBy(xpath = "//ul//li//a[@title='My Account']")
	private WebElement clickonMyAccount;
	@FindBy(xpath = "//ul//li//a[text()='Login']")
	private WebElement clickonLogin;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement enterusername;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement enterpassword;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement clickonLoginbutton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement MyAccountdashboard;
	@FindBy (xpath = "//a[text()='Register for an affiliate account']")
	private WebElement ClickOnAffiliateAccount;
	@FindBy (xpath = "//input[@name='company']")
	private WebElement enterCompanyName;
	@FindBy (xpath = "//input[@name='website']")
	private WebElement enterWebSiteName;
	@FindBy (xpath = "//input[@name='tax']")
	private WebElement enterTaxId;
	@FindBy (xpath = "//input[@name='payment' and @value='cheque']")
	private WebElement clickPaymentMethod;
	@FindBy (xpath = "//input[@name='cheque' and @id='input-cheque']")
	private WebElement enterChequeNumber;
	@FindBy (xpath = "//input[@name='agree' and @value='1']")
	private WebElement clickOnAboutUsCheckBox;
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement clickOnContinueBttn;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']//i[@class='fa fa-check-circle']")
	private WebElement showSuccessMsg;
	@FindBy (xpath = "//a[text()='Edit your affiliate information']")
	private WebElement clickOnEditAffiliateLink;
	@FindBy (xpath = "//input[@name='payment' and @value='bank']")
	private WebElement clickOnRadioButton;
	@FindBy (xpath = "//input[@name='bank_name']")
	private WebElement enterBankName;
	@FindBy (xpath = "//input[@name='bank_branch_number']")
	private WebElement enterAbaNumber;
	@FindBy (xpath = "//input[@name='bank_swift_code']")
	private WebElement enterSwiftCode;
	@FindBy (xpath = "//input[@name='bank_account_name']")
	private WebElement enterBankAcctName; 
	@FindBy (xpath = "//input[@name='bank_account_number']")
	private WebElement enterBankAcctNumber; 
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement clickOnContinuebutton; 
	@FindBy (xpath = "//a[text()='Edit your account information']")
	private WebElement clickOnEditAcctInfo;
	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement editFirstName;
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement editLastName;
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement editEmail;
	@FindBy (xpath = "//input[@id='input-telephone']")
	private WebElement editTelephoneNum;
	@FindBy (xpath = "//input[@class='btn btn-primary']")
	private WebElement ClickOnContinueEditBttn;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editSuccessMsg;

	public String Retailwebsite() {
		String retailWeb = Retailwebsite.getText();
		return retailWeb;
	}
	public void clickonMyAccount() {
		clickonMyAccount.click();
	}
	public void clickonLogin() {
		clickonLogin.click();
	}
	public void enterusername(String email) {
		enterusername.sendKeys(email);
	}
	public void enterpassword(String password) {
		enterpassword.sendKeys(password);
	}
	public void clickonLoginbutton() {
		clickonLoginbutton.click();
	}
	public String MyAccountdashboard() {
		String MyAccountdash = MyAccountdashboard.getText();
		return MyAccountdash;
	}
	public void ClickOnAffiliateAccount() {
		ClickOnAffiliateAccount.click();
	}
	public void enterCompanyName(String company) {
		enterCompanyName.sendKeys(company);
	}
	public void enterWebSiteName (String website) {
		enterWebSiteName.sendKeys(website);
	}
	public void enterTaxId(String taxID) {
		enterTaxId.sendKeys(taxID);
	}
	public void clickPaymentMethod() {
		clickPaymentMethod.click();
	}
	public void enterChequeNumber(String cheque) {
		enterChequeNumber.sendKeys(cheque);
	}
	public void clickOnAboutUsCheckBox() {
		clickOnAboutUsCheckBox.click();
	}
	public void clickOnContinueBttn() {
		clickOnContinueBttn.click();
	}
	public String showSuccessMsg() {
		String success = showSuccessMsg.getText();
		return success;
	}
	public void clickOnEditAffiliateLink() {
		clickOnEditAffiliateLink.click();
	}
	public void clickOnRadioButton() {
		clickOnRadioButton.click();
	}
	public void enterBankName(String bankName) {
		enterBankName.sendKeys(bankName);
	}
	public void enterAbaNumber(String abaNumber) {
		enterAbaNumber.sendKeys(abaNumber);
	}
	public void enterSwiftCode(String swiftCode) {
		enterSwiftCode.sendKeys(swiftCode);
	}
	public void enterBankAcctName(String accountName) {
		enterBankAcctName.sendKeys(accountName);
	}
	public void enterBankAcctNumber(String accountNumber) {
		enterBankAcctNumber.sendKeys(accountNumber);
	}
	public void clickOnContinuebutton() {
		clickOnContinuebutton.click();
	}
	public void clickOnEditAcctInfo() {
		clickOnEditAcctInfo.click();
	}
	public void editFirstName(String firstname) {
		editFirstName.clear();
		editFirstName.sendKeys(firstname);
	}
	public void editLastName(String lastName) {
		editLastName.clear();
		editLastName.sendKeys(lastName);
	}
	public void editEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}
	public void editTelephoneNum(String telephone) {
		editTelephoneNum.clear();
		editTelephoneNum.sendKeys(telephone);
	}
	public void ClickOnContinueEditBttn() {
		ClickOnContinueEditBttn.click();
	}
	public String editSuccessMsg() {
		String successmessage = editSuccessMsg.getText();
		return successmessage; 
	}
	
}