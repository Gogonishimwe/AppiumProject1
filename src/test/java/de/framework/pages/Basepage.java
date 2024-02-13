package de.framework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebElement;

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
        wait = new WebDriverWait(driver,  Duration.ofSeconds(20));// time to wait

  }
 public WebElement getElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  }
  
  
  public void DragAndDrop(By locator,int startX,int startY,int endX,int endY){
    WebElement element = getElement(locator);
   ((JavascriptExecutor) driver).executeScript("mobile: DragAndDrop", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
  "StartX",113,
  "StartY",229,
  "endX", 621,
  "endY", 1105
));
  }
  
}
