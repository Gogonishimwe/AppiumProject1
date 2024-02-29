package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import io.cucumber.java.en.*;

public class ScrollSteps {
	ApiDemo apiDemo = new ApiDemo();

    @When("a user taps on views link")
    public void the_user_taps_on_view_link() {
    apiDemo.navigateToViews();
    }
    @Then("the user scroll down to TextClock link")
    public void the_user_scroll_down() {
       //System.out.println("ScrollDown");
       apiDemo.scrllDwn();
    }
    @Then ("the user scroll up to Animation link")
    public void scroll_up_to_Animation_link(){
        apiDemo.scrllUp();
    }


  
}
