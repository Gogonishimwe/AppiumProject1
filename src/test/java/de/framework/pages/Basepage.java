package de.framework.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.google.common.collect.ImmutableMap;

import de.framework.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Basepage {
  private  AppiumDriver driver;
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
    

  }

