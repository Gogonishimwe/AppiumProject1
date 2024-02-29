package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import de.framework.pages.RadioGroup;
import io.cucumber.java.en.*;

public class RadioButtonStep {
  ApiDemo apiDemo = new ApiDemo();
  RadioGroup radio;

  // @When("a user taps on views link")
  //   public void the_user_taps_on_view_link() {
  //   apiDemo.navigateToViews();
  //   }

  @When("the user scroll down to Radio Group link")
public void the_user_scroll_down_to_radio_group_link() {
  apiDemo. scrllDwnRadio();
  apiDemo.RadioButtons();
}
@When("the user chooses dinner with Radio Buttons from Views-RadionButtons")
public void the_user_chooses_dinner_with_radiocle_buttons_from_views_radion_buttons() {
   radio.dinnerRadio();
}
@And("the user taps on clear")
public void the_user_taps_on_clear() {
    radio.clear();
}
@Then("the selected item should be disappear")
public void the_selected_item_should_be_disappear() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
  
}
