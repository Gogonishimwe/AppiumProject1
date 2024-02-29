package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemo extends Basepage{
	  By viewsLinkBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceBy=AppiumBy.accessibilityId("Preference");
    By preferencedePendenciesBy=AppiumBy.accessibilityId("3. Preference dependencies");
    By radioButtonBy=AppiumBy.accessibilityId("Radio Group");

    
    
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
	public void RadioButtons(){
		getElement(radioButtonBy).click();
	}
	public void  scrllDwnRadio(){
		scrollDownElement("Radio Group");
	}
	
  
    
}
