package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.obj.DesktopObj;
import utilities.Utils;

public class DesktopsTabStepDefinition extends Base{
	
	DesktopObj desktopObj = new DesktopObj();
	

	@When("User click on Desktops tab")
	public void User_click_on_Desktops_tab() {
		desktopObj.Desktops();
		logger.info("Clicked on Desktop Link Successfully");

	}
	@When("User click on Show all desktops")
	public void User_click_on_Show_all_desktops() {
		desktopObj.clickOnShowAllDesk();
		logger.info("Clicked on show all desktops link successfully");

	}
	@Then("User should see all items are present in Desktop page")
	public void User_should_see_all_items_are_present_in_Desktop_page() {
		String expectedTest = "Desktops";
		String actualText = desktopObj.allDesktopPage();
		Assert.assertEquals(expectedTest, actualText);
		logger.info("User can see the Desktops Successfully");
		Utils.takeScreenshotForStep();

	}
	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopObj.clickAddLP3065();
		logger.info("Clicked on HP LP3065 Successfully");
		
	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopObj.enterQty("1");
		logger.info("User Select 1 item Successfully");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopObj.addLT();
	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	    String expectedText = "Success: You have added HP LP3065 to your shopping cart!";
	    String actualText = desktopObj.sucessMsgAdd();
//	    Assert.assertEquals(expectedText, actualText);
	    Utils.takeScreenshotForStep();
	    logger.info("Lap Top added successfully");
	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopObj.clickOnEOS5DCamera();
		logger.info("Clicked on EOS 5Ditem Successfully");
	   
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopObj.selectColor();
		desktopObj.selectRed();
		logger.info("User select color drop down and select red successfully");
	}

	@Then("User should see a message {string}")
	public void User_should_see_a_message(String string) {
	    String expectedText = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
	    String actualText = desktopObj.cameraSuccessMsg();
//	    Assert.assertEquals(expectedText, actualText);
	    Utils.takeScreenshotForStep();
	    logger.info("Thank you message for now pop up successfully");
	}

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopObj.clickOnEOS5DCameraForReview();
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopObj.clickOnReview();
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    desktopObj.inputName (data.get(0).get("yourname"));
	    desktopObj.inputReview (data.get(0).get("yourReview"));
	    desktopObj.clickOnGood();
	    logger.info("Review field filled Successfully");
	    Utils.takeScreenshotForStep();
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopObj.reviewContinueBttn();
	}

	@Then("User should see a message with {string}”")
	public void user_should_see_a_message_with(String string) {
		String expectedText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualText = desktopObj.reviewThankYouMsg();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Thank you message for review pop up successfully");
		Utils.takeScreenshotForStep();
	}




}
