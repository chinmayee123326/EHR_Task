package com.EHR.StepDefinations;

import com.EHR.Utility.base;
import com.EHR.pages.WebElementRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homepagesteps extends base {
	WebElementRepo Element;
	@Given("^User opens browser$")
	public void user_opens_browser()  {
		base.intialization();
	    
	}

	@Then("^User is on login logged with Valid credentials$")
	public void user_is_on_login_logged_with_Valid_credentials() {
		Element = new WebElementRepo();
		Element.login_inTo_EHR();

	}

	@Then("^Navigate to the patient chart$")
	public void navigate_to_the_patient_chart() throws InterruptedException {
		Element = new WebElementRepo();
		Element.Navigate_To_patient_chart();
		

	}
	
	@Then("^Click on Edit botton$")
	public void click_on_Edit_botton()  {
		Element.Click_Edit();
	   
	}
	
	@Then("^Edit History$")
	public void edit_History() {
		Element.Edit_History();
	}
	
}
