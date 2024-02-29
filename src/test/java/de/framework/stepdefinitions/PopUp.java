package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import de.framework.pages.PreferenceDependenciesPage;
import io.cucumber.java.en.*;

public class PopUp {
	ApiDemo apiDemo = new ApiDemo();
	PreferenceDependenciesPage dependencies = new PreferenceDependenciesPage();
	
	@When("a user taps on Preference link")
	public void a_user_tap_on_preference_link() {
	    apiDemo.navigateToPreference();
	}

	@When("taps on Preference dependencies link")
	public void taps_on_preference_dependencies_link() {
	apiDemo.dependencies();   
	}

	@When("tick on Wifi checkbox")
	public void tick_on_checkbox() {
	  dependencies.clickonWifiCheckbox(); 
	}

	@When("taps on WIFI settings")
	public void taps_on_wifi_settings() {
	    dependencies.clickonWifiSetting();
	}

	@When("add text as {string} on popup window")
	public void add_text_on_popup_window(String string) {
	  dependencies.sendKeysToPopup(string);  
	}

	@When("click OK")
	public void click_OK() {
	    dependencies.oKBtn();
	}

	@Then("the user should see added text on popup window")
	public void the_user_should_see_added_text_on_popup_window() {
	    dependencies.clickonWifiSetting();
	    dependencies.addWifisetting(toString());
	}

  
}
