package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import de.framework.pages.RadioGroup;
import io.cucumber.java.en.*;

public class RadioButtonStep {
  ApiDemo apiDemo = new ApiDemo();
  RadioGroup radio;

@When("a user tapson views link")
public void a_user_tapson_views_link() {
  apiDemo.navigateToViews();
}
@When("the user scrollDown to RadionGroup link")
public void the_user_scroll_down_to_radion_group_link() {
  apiDemo.navigateToRadionLink();
}
@When("the user chooses dinner with RadionButtons from Views-RadionButtons")
public void the_user_chooses_dinner_with_radion_buttons_from_views_radion_buttons() {
    apiDemo.navigateToViewRadioButton();
  }
@And("the user taps on clear")
public void the_user_taps_on_clear() {
   apiDemo.clearingTheSelectedItem();
}
@Then("the selected item should be disappear.")
public void the_selected_item_should_be_disappear() { 
    throw new io.cucumber.java.PendingException();
}

}
