package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import io.cucumber.java.en.*;


public class LongclickStep {
 ApiDemo apiDemo = new ApiDemo();
  @When("a user clicks on views link")
public void a_user_clicks_on_views_link() {
    apiDemo.navigateToViews();
}
@When("clicks on expandable List link")
public void clicks_on_expandable_list_link() {
   apiDemo.expandableLists();
}
@When("taps on Custom Adapter link")
public void taps_on_custom_adapter_link() {
   apiDemo.custom();
}
@When("long click on people Name link")
public void long_click_on_people_name_link() {
   apiDemo.longClickGesture();
}
@Then("popup window should be displayed")
public void popup_window_should_be_displayed() {
   
}
  
}
