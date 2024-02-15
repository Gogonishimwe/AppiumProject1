package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemo extends Basepage{
	By viewsLinkBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    By preferenceBy=AppiumBy.accessibilityId("Preference");
    By preferencedePendenciesBy=AppiumBy.accessibilityId("3. Preference dependencies");

    
    
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
  
    
}
