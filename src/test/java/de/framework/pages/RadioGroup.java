package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RadioGroup extends Basepage{
  By dinnerBy=AppiumBy.accessibilityId	("Dinner");
  By clearBtnBy=AppiumBy.accessibilityId("Clear");


  public void dinnerRadio(){
    getElement(dinnerBy).click();
  }
  public void clear(){
    getElement(clearBtnBy).click();
  }
  
}
