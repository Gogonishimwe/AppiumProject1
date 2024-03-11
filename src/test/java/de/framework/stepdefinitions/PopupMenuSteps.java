package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import de.framework.pages.PopupMenuPage;
import io.cucumber.java.en.*;


public class PopupMenuSteps {
	ApiDemo apiDemo = new ApiDemo();
	PopupMenuPage popup;
	
	@When("a user taps views link")
    public void the_user_taps_view_link() {
    apiDemo.navigateToViews();
	}

	@When("scroll down to popup Menu link")
	public void scroll_down_to_popup_menu_link() {
	    apiDemo.scrollToPopupMenu();
	}

	@When("taps on popup menu link")
	public void taps_on_popup_menu_link() {
	   apiDemo.navigateToPopupMenu();
	}

	@When("tap on Make a popup link")
	public void tap_on_make_a_popup_link() {
		apiDemo. makePopup();  
	}

	@When("taps on Search link")
	public void taps_on_search_link() {
	    apiDemo.navigateToSearch();
	}
  @Then("clicked popup item menu search message should be displayed")
  public void clicked_popup_item_menu_search_message_should_be_displayed(String string) {
  apiDemo.thepopupMessage(string);
}

  
}
