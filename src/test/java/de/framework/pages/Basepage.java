package de.framework.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.google.common.collect.ImmutableMap;

import de.framework.utils.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Basepage {
  protected  AppiumDriver driver;
  private  WebDriverWait wait;
   

  public Basepage(){
     this.driver = DriverManager.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver,  Duration.ofSeconds(40));// time to wait

  }
 public WebElement getElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }
  
  
  public void dragAndDrop(int startX,int startY,int endX,int endY){
   ((JavascriptExecutor) driver).executeScript("mobile:dragGesture", ImmutableMap.of( 
  "startX",startX,
  "startY",startY,
  "endX", endX,
  "endY", endY
));
  }
  public void checkSimilarityOfText(String text1, String text2) {
    Assert.assertEquals(text1, text2);
}
  public void sendTextToField(By locator, String text) {
      getElement(locator).sendKeys(text);
  }
  public void scrollDown(int startX,int startY,int endX,int endY){
	   ((JavascriptExecutor) driver).executeScript("mobile:scrollGesture", ImmutableMap.of( 
	  "startX",startX,
	  "startY",startY,
	 "endX", endX,
	  "endY", endY
	));
	  }
  
    
//  public void scrollDown(RemoteWebDriver driver, RemoteWebElement element,int endX,int endY) {
//	((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//			    "elementId", ((RemoteWebElement) element).getId(),
//			    "endX", 188,
//			    "endY", 292
//		 ));
//  }
  
  public void scrollDownElement(String elementText) {
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
		        "new UiSelector().textContains(\"" + elementText + "\"))"));
  }
  public void swipe(By locator, String direction) {
        WebElement element = getElement(locator);
        String swipeDirection;
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction",direction,
                "percent", 0.20));
   }
    public void longClick(By locator) {
      WebElement element = getElement(locator);
      ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
              "elementId", ((RemoteWebElement) element).getId(), "duration", 1000));

  }
}


