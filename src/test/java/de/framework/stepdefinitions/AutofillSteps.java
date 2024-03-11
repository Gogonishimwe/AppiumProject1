package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutofillSteps {
ApiDemo apiDemo = new ApiDemo();

@When("a user tapp on views link")
  public void the_user_tapp_on_view_link() {
  apiDemo.navigateToViews();
  }

  @When("taps on auto complete link")
public void taps_on_auto_complete_link() {
  apiDemo.navigateToAutoComplete();
}

@When("taps  on screen top link")
public void taps_on_screen_top_link() {
    apiDemo.navigateToScreenTop();
}
@When("tap on country input field")
 public void tap_on_country_input_field() {
    apiDemo.countryField();
}
@When("tap a text {string}")
public void tap_a_text(String string) {
    apiDemo.countryInputField(string);
}
@Then("the countries that start with {string} should be displayed")
public void the_countries_that_start_with_should_be_displayed(String string) {
   apiDemo.selectedCountry();
}
  
}
