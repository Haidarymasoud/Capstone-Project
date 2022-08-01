package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.obj.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retailobj = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualtext = retailobj.Retailwebsite();
		Assert.assertEquals(expectedText, actualtext);
		logger.info("I can see the Test Environment Message");

	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailobj.clickonMyAccount();
		logger.info("Clicked on the My Account Butten Successfully");
		
		Utils.hardwait();

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailobj.clickonLogin();
		logger.info("Clicked on Login Successfully");
		
		Utils.hardwait();

	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retailobj.enterusername("qandqand@yahoo.com");
		retailobj.enterpassword("jan123");
		logger.info("Username and password entered successfully");

	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailobj.clickonLoginbutton();
		logger.info("Login Successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailobj.MyAccountdashboard();
		logger.info("Now can see the My Account DashBoard");

	}

	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailobj.ClickOnAffiliateAccount();
		logger.info("Clicked on Affliation link successfully");
		
		Utils.hardwait();
		

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable){
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailobj.enterCompanyName(data.get(0).get("company"));
		retailobj.enterWebSiteName(data.get(0).get("website"));
		retailobj.enterTaxId(data.get(0).get("taxID"));
		retailobj.clickPaymentMethod();
		Utils.takeScreenshotForStep();
		logger.info("Fill out the form step completed");
		Utils.hardwait();
		

	}

	@When("User enter the cheque number")
	public void user_enter_the_cheque_number() {
		retailobj.enterChequeNumber("14445255");
		logger.info("cheque number entered successfully");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailobj.clickOnAboutUsCheckBox();
		logger.info("Box check successfully");
		
		Utils.hardwait();

	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailobj.clickOnContinueBttn();
		logger.info("Clicked continue button successfully");
	
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailobj.showSuccessMsg();
		logger.info("We go Success message");
		Utils.hardwait();
	
	}
	@When("User click on Edit your affiliate informationlink link")
	public void user_click_on_edit_your_affiliate_informationlink_link() {
		retailobj.clickOnEditAffiliateLink();
		logger.info("The Affiliate Edit link Clicked Successfully");

	}
	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailobj.clickOnRadioButton();
		logger.info("Bank Transfer Option Clicked Successfully");
	
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map< String, String>> data = dataTable.asMaps(String.class, String.class);
		retailobj.enterBankName(data.get(0).get("bankName"));
		retailobj.enterAbaNumber(data.get(0).get("abaNumber"));
		retailobj.enterSwiftCode(data.get(0).get("swiftCode"));
		retailobj.enterBankAcctName(data.get(0).get("accountName"));
		retailobj.enterBankAcctNumber(data.get(0).get("accountNumber"));
		Utils.takeScreenshotForStep();
		logger.info("All the required fields filled");
		Utils.hardwait();
	}
	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retailobj.clickOnEditAcctInfo();
		logger.info("User clicked on Edit link successfully");

	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailobj.editFirstName(data.get(0).get("firstname"));
		retailobj.editLastName(data.get(0).get("lastName"));
		retailobj.editEmail(data.get(0).get("email"));
		retailobj.editTelephoneNum(data.get(0).get("telephone"));
		Utils.takeScreenshotForStep();
		logger.info("Edit happend to all fields Successfully");
		Utils.hardwait();

	}
	@When("User click on edit continue button")
	public void user_click_on_edit_continue_button() {
		retailobj.ClickOnContinueEditBttn();
		logger.info("Clicked on Continue button successfully");
	}
	@Then("User should see a message {string}: Your account has been successfully updated.")
	public void user_should_see_a_message_your_account_has_been_successfully_updated(String string) {
		retailobj.editSuccessMsg();
		logger.info("Edit happened Successfully");

	}



}
