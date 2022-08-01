package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.obj.LapTopNoteBookPageObj;
import utilities.Utils;

public class LapTopNoteBookSteps extends Base{
	
	LapTopNoteBookPageObj LPNBobj = new LapTopNoteBookPageObj();


@When("User click on Laptop and NoteBook tab")
public void user_click_on_laptop_and_note_book_tab() {
	LPNBobj.ClickOnLapTopNoteBooks();
	logger.info("Clicked on LapTop and Note Books Successfully");
}

@When("User click on Show all Laptop and NoteBook option")
public void user_click_on_show_all_laptop_and_note_book_option() {
	LPNBobj.ClickOnShowAllLapNoteBooks();
	logger.info("Clicked On Show All LapTop an NoteBook Successfully");
}

@When("User click on MacBook item")
public void user_click_on_mac_book_item() {
	LPNBobj.ClickOnMacBook();
	logger.info("Clicked on MacBook Successfully");
}

@Then("User should see {int} tem\\(s){double} showed to the cart")
public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	LPNBobj.ShowCartItems();
	logger.info("See the Item in the Cart Successfully");
	Utils.takeScreenshotForStep();
}

@Then("User click on cart option")
public void user_click_on_cart_option() {
	LPNBobj.ClickOnCartItems();
	logger.info("Clicked on Item Cart Successfully");
}

@Then("user click on red X button to remove the item from cart")
public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	LPNBobj.ClickOnXBttn();
	logger.info("Clicked on the X Bttn Successfully");
}

@Then("item should be removed and cart should show {int} item\\(s)")
public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	LPNBobj.ShowEmptyCartItems();
	Utils.takeScreenshotForStep();
	logger.info("See No Item In The Cart Successfully");
}
@When("User click on product comparison icon on {string}")
public void user_click_on_product_comparison_icon_on(String string) {
	LPNBobj.ClickOnMacBookComparison();
	logger.info("User Clicked on MacBook Successfully");
}
@When("User click on second product comparison icon on {string}")
public void user_click_on_second_product_comparison_icon_on(String string) {
	Utils.hardwait();
	LPNBobj.ClickOnMacBookAirComparison();
	logger.info("User abled to Cliced on MacPro Comparison successfully");
}

@Then("User click on Product comparison link")
public void user_click_on_product_comparison_link() {
	Utils.hardwait();
	LPNBobj.ClickOnComparisonBttn();
	logger.info("Clicked on Comparison link");

}
@Then("User should see Product Comparison Chart")
public void user_should_see_product_comparison_chart() {
	LPNBobj.SeeTheComparisonChart();
	logger.info("User See the Comparison Chart Successfully");
	Utils.takeScreenshotForStep();
}
@When("User click on heart icon to add {string} laptop to wish list")
public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	LPNBobj.ClickOnHeart();
	logger.info("User Clicked on Hear Successfully");

}
@Then("User should get a message {string}")
public void user_should_get_a_message(String string) {
	LPNBobj.SeeLoginCASonyVaioWishList();
	logger.info("User receved the message successfully");
	Utils.takeScreenshotForStep();
}
@When("User click on {string} item")
public void user_click_on_item(String string) {
	LPNBobj.ClickOnMacPro();
	logger.info("User is able to see MacPro Successfully");
}
@Then("User should see {string} price tag is present on UI.")
public void user_should_see_price_tag_is_present_on_ui(String string) {
	LPNBobj.SeeThe2000Mack();
	logger.info("User abled to see the 2000 price Successfully");
	Utils.takeScreenshotForStep();

}












}

