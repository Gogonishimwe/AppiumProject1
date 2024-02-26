package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import io.cucumber.java.en.*;

public class ScrollSteps {
	ApiDemo apiDemo = new ApiDemo();

@When("the clicks on views link")
public void the_clicks_on_views_link() {
    apiDemo.navigateToViews();
}

@When("scroll down to TextClock")
public void scroll_down_to_text_clock() {
    apiDemo.scrllDwn();
}

@When("scroll up to Animation")
public void scroll_up_to_animation() {
    // Write code here that turns the phrase above into concrete actions
    apiDemo.scrllUp();
}

@Then("the user should be able to scroll down and up")
public void the_user_should_be_able_to_scroll_down_and_up() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
  
}
