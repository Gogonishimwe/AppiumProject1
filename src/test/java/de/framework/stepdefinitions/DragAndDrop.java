package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import de.framework.pages.Basepage;
import de.framework.pages.DragAndDropPage;
import io.cucumber.java.en.*;

public class DragAndDrop extends Basepage{
 ApiDemo apidemo = new ApiDemo();
 DragAndDropPage drag;
 
	@When("the user taps on views link")
	public void the_user_taps_on_views_link() {
		apidemo.navigateToViews();  
	}

	@When("taps on Drag and Drop link")
	public void taps_on_drag_and_drop_link() {
	 DragAndDrop = drag.dragAndDrop();
	}

	@When("long clicks on untexted red cicle")
	public void long_clicks_on_untexted_red_cicle() {
	   
	}

	@Then("{string} message should be displayed")
	public void message_should_be_displayed(String string) {
	    
	}



}
