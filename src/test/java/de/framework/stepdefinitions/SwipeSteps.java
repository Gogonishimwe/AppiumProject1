package de.framework.stepdefinitions;

import de.framework.pages.ApiDemo;
import io.cucumber.java.en.*;

public class SwipeSteps {
  ApiDemo apiDemo = new ApiDemo();

	@When("a user tap on views link")
	public void a_user_tap_on_views_link() {
	    apiDemo.navigateToViews();
	}

	@When("taps Gallery link")
	public void taps_gallery_link() {
	    apiDemo.navigateGallery();
	}

	@When("taps on Photos link")
	public void taps_on_photos_link() {
	   apiDemo.navigatePhoto();
	}

	@When("swipe two images right and left")
	public void swipe_two_images_right_and_left() {
	    apiDemo.swipeImageRight();
	}

	@Then("two images should be in focus")
	public void two_images_should_be_in_focus() {
	    apiDemo.imagesSwiped();
	}

}
