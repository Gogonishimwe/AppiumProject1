package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;

import io.cucumber.java.en.*;

public class SwipeBottomSteps {
  ApiDemo apiDemo = new ApiDemo();
  
  @When("a user click on views link")
public void a_user_click_on_views_link() {
  apiDemo.navigateToViews();
  
}

@When("swipe to bottom")
public void swipe_to_bottom() {
  apiDemo.swipeToBottom();
    
}

@When("swipe to top")
public void swipe_to_top() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the element should be swipped")
public void the_element_should_be_swipped() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

  
}
