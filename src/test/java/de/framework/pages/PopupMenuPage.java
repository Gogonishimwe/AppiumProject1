package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PopupMenuPage extends Basepage{
  By makeaPopupBy=AppiumBy.accessibilityId("Make a Popup!");
  By searchBy=AppiumBy.xpath("hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView\r\n" + //
        "");


  public void makePopup(){
    getElement(makeaPopupBy).click();
    
  }
  public void navigateToSearch(){
    getElement(searchBy).click();
  }
  
}
