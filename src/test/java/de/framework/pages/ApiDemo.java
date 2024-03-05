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
    By animationBy=AppiumBy.accessibilityId("Animation");
		By expandableBy=AppiumBy.accessibilityId("Expandable Lists");	
		By customAdapterBy=AppiumBy.accessibilityId("1. Custom Adapter");	
		By poepleNameBy=AppiumBy.xpath("hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]\r\n" + //
						"");	


    
    
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
		swipe(firstImageBy, "right");
		//swipe(secondImageBy,"right");
		  
	}
	
	public void swipeImageLeft(){
		swipe(firstImageBy, "left");
		//swipe(secondImageBy,"left");
	}

	public void imagesSwiped() {
        String firstImageSelected = getElement(firstImageBy).getAttribute("selected");
        String secondImageSelected = getElement(secondImageBy).getAttribute("selected");
        assertEquals(firstImageSelected, "false");
        assertEquals(secondImageSelected, "true");
    }
	public void swipeToBottom(){
		swipe(animationBy,"bottom");

	}
	public void expandableLists(){
		getElement(expandableBy).click();
	}
	public void custom(){
		getElement(customAdapterBy).click();
	}
	public void longClickGesture(){
		longClick(poepleNameBy);
	}

	}

	
	

	
	
  
    

