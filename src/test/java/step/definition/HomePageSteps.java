package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.obj.HomePageObj;
import utilities.Utils;

public class HomePageSteps extends Base{
	
	HomePageObj HPObj = new HomePageObj ();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		HPObj.ClickOnCurrency();
		logger.info("Clicked On Currency Icon Successfully");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		HPObj.ClickOnEuro();
		logger.info("Clicked On Euro Successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		HPObj.SeeTheEuro();
		logger.info("Can see the Euro On Screen Successfully");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		HPObj.ClickOnShoopingCart();
		logger.info("Clicked On The Shooping Cart Successfully");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	    String expectedText = "Your shopping cart is empty!";
	    String actualText = HPObj.SeeEmptyShoopingCart();
	    Assert.assertEquals(expectedText, actualText);
	    Utils.takeScreenshotForStep();
	    logger.info("User can see the Shooping Cart is Empty Successfully");
	}

}
