package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ApiDemo extends Basepage{
	By viewsLinkBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]");
    By dragAndDropBy = AppiumBy.accessibilityId("Drag and Drop");
    
    
    public void navigateToViews() {
    	getElement(viewsLinkBy).click();
		
    }
    public ApiDemo dragAndDrop() {
     getElement(dragAndDropBy).click();
	return dragAndDrop();	
    }
  
    
}
