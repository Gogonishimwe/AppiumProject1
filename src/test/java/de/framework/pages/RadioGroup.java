package de.framework.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class RadioGroup extends Basepage{
  By CheckingRadionButton = AppiumBy.accessibilityId("Dinner");
  By clearingTheSelectedItem = AppiumBy.accessibilityId("Clear");


  
 
    public void navigateToViewRadioButton(){
        getElement(CheckingRadionButton).click();
        
    }
 
    public void clearingTheSelectedItem (){
        getElement(clearingTheSelectedItem).click();
    }
  }
