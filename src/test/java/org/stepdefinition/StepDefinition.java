package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.Address;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given(":user launch the amazon url")
	public void user_launch_the_amazon_url() {
		launchBrowser();
		loadUrl("https://www.amazon.in/");
		maxBrowser();
		pageUrl();
	}

	@When(":user click the deliver to button")
	public void user_click_the_deliver_to_button() {
		Address ad = new Address();
		btnClick(ad.getAddress());

	}

	@When(":user send the valid pincode in the popup textbox")
	public void user_send_the_valid_pincode_in_the_popup_textbox() throws InterruptedException {
		Address ad = new Address();
		Thread.sleep(3000);
		fill(ad.getCode(), "627005");
	}

	@Then(":user click the search button and able to see the location")
	public void user_click_the_search_button_and_able_to_see_the_location() throws InterruptedException {
		Address ad = new Address();
		btnClick(ad.getButton());
		Thread.sleep(3000);
		toQuit();

	}

}
