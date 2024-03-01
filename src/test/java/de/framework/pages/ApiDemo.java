package de.framework.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumBy;

public class ApiDemo extends Basepage{
	  By viewsLinkBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceBy=AppiumBy.accessibilityId("Preference");
    By preferencedePendenciesBy=AppiumBy.accessibilityId("3. Preference dependencies");
    By ChecktheRadionGroup = AppiumBy.accessibilityId("Radio Group");
		By CheckingRadionButton = AppiumBy.accessibilityId("Dinner");
    By clearingTheSelectedItem = AppiumBy.accessibilityId("Clear");
		By galleryBY= AppiumBy.accessibilityId("Gallery");
		By photosBy=AppiumBy.accessibilityId("1. Photos");
		By firstImageBy=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]");
    By secondImageBy=AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[2]");


    
    
    public void navigateToViews() {
    	getElement(viewsLinkBy).click();
		
    }
    
    public DragAndDropPage dragAndDrop() {
     getElement(dragAndDropBy).click();
	return new DragAndDropPage();	
    }
	public ApiDemo navigateToPreference() {
		getElement(preferenceBy).click();
		return this;
	}
	public ApiDemo dependencies() {
		getElement(preferencedePendenciesBy).click();
		return this;
		
	}
	public void scrllDwn() {
		scrollDownElement("TextClock");
	
	}
	public void scrllUp(){
		scrollDownElement("Animation");
	}
	public void navigateToRadionLink(){
    scrollDownElement("Radio Group");
   
    getElement(ChecktheRadionGroup).click();
    }
		public void navigateToViewRadioButton(){
			getElement(CheckingRadionButton).click();
			
	}

	public void clearingTheSelectedItem (){
			getElement(clearingTheSelectedItem).click();
	}
	public void navigateGallery(){
		getElement(galleryBY).click();
	}
	public void navigatePhoto(){
		getElement(photosBy).click();
	}
	public void swipeImageRight(){
		swipe(firstImageBy, "Right");
		swipe(secondImageBy,"Right");
		  
	}
	public void imagesSwiped() {
        String firstImageFocusable = getElement(firstImageBy).getAttribute("focusable");
        String secondImageFocusable = getElement(secondImageBy).getAttribute("focusable");
        assertEquals(firstImageFocusable, "false");
        assertEquals(secondImageFocusable, "true");
    }

	
	}

	
	
  
    
}
